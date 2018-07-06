/***************************************************************************
                          darksidewindow.c  -  description
                             -------------------
    begin                : Fri Jul 21 2000
    copyright            : (C) 2000 by Paul Lyon
    email                : paulus@linuxstart.com
 ***************************************************************************/

/***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/

 #include <darksidewindow.h>

 void AdjustWindow(Window win)
 {
 		DarkSideWindow *new_window;
 		XWindowAttributes win_attr;
 		XSetWindowAttributes set_attr;
 		char *name;
 		XWMHints hints;
 		Window trans_window;
 		
 		XGetWindowAttributes(CoreWM.display, win, &win_attr);
  	fprintf(CoreWM.log, "\nAdjustWindow(): Got Window Attributes from argument.");
  	if (!win_attr.override_redirect)
    {
			fprintf(CoreWM.log, "\nAdjustWindow(): !win_attr.override_redirect");
      new_window = (DarkSideWindow *) malloc(sizeof(DarkSideWindow));
      fprintf(CoreWM.log, "\nAdjustWindow(): Allocated %i for new_window", sizeof(DarkSideWindow));
      new_window->Win = win;
      XSetWindowBorderWidth(CoreWM.display, win, 0);
      XGetWindowAttributes(CoreWM.display, win, &win_attr);
      fprintf(CoreWM.log, "\nAdjustWindow(): Set Window Border Width to 0 and got Window Attributes");
      XAddToSaveSet(CoreWM.display, win);
			fprintf(CoreWM.log, "\nAdjustWindow(): Added to save set.");
      XGrabServer(CoreWM.display);
			fprintf(CoreWM.log, "\nAdjustWindow(): Grabed server.");
      XUnmapWindow(CoreWM.display, win);
			fprintf(CoreWM.log, "\nAdjustWindow(): Unmapped win");
      XFetchName(CoreWM.display, win, &name);
      fprintf(CoreWM.log, "\nAdjustWindow(): XFetchName: name = %s", name);
      CheckApplicationProperty(new_window, name);
			check_properties(new_win, name);
      new_window->shape = GetShape(new_window->Win);
      fprintf(CoreWM.log, "\nAdjustWindow(): Got Window shape: %i", new_window->shape);
      new_window->Parent = AddParent(new_window, &win_attr);
      fprintf(CoreWM.log, "\nAdjustWindow(): Added Parent");
      new_window->BorderFrame = AddBorderFrame(new_window, new_window->Parent);
      fprintf(CoreWM.log, "\nAdjustWindow(): Added Border Frame");
      new_window->TitleBar = AddTitlebarWindow(new_window, new_window->Parent);
      fprintf(CoreWM.log, "\nAdjustWindow(): Added Title Bar Window");
      XStoreName(CoreWM.display, new_window->Parent, name);
      fprintf(CoreWM.log, "\nAdjustWindow(): Stored %s in name", name);
      if ((new_window->app_prop & PROP_NO_TITLE) == 0)
      {
				fprintf(CoreWM.log, "\nAdjustWindow(): No Title Property.");
				XStoreName(CoreWM.display, new_window->TitleBar, name);
				fprintf(CoreWM.log, "\nAdjustWindow(): Stored name.");
			}
      free(name);
      XGetIconName(CoreWM.display, win, &name);
			fprintf(CoreWM.log, "\nAdjustWindow(): Got icon name from win.");
      XSetIconName(CoreWM.display, new_window->Parent, name);
      fprintf(CoreWM.log, "\nAdjustWindow(): Set icon name.");
      free(name);
      fprintf(CoreWM.log, "\nAdjustWindow(): freed name");
      if (ds_win_settings.have_max_btn)
      {
      	fprintf(CoreWM.log, "\nAdjustWindow(): Maxmize Button is wanted.. Creating Max Button..");
				new_window->Max_Button = CreateButton(new_window, ds_settings.align_max_btn, ds_settings.pos_max_btn);
			}
      /*if (ds_win_settings.align_btn_max_height)
      {
				new_window->button_max_height =
	  build_button(new_win,
		       gl_epiwin.align_btn_max_height,
		       gl_epiwin.pos_btn_max_height);
      if (ds_win_setting.align_btn_max_width)
	new_win->button_max_width = build_button(new_win,
						 gl_epiwin.align_btn_max_width,
						 gl_epiwin.pos_btn_max_width);*/

      if (wm_settings.button.have_icon_btn)
      {
      	fprintf(CoreWM.log, "\nAdjustWindow(): Iconify Button is wanted.. Creating Iconify Button..");
				new_window->Iconify_Button = CreateButton(new_window, ds_win_settings.align_icon_btn, ds_win_settings.pos_icon_btn);
			}
      if (wm_settings.button.have_shade_btn)
      {
				fprintf(CoreWM.log, "\nAdjustWindow(): Shade Button is wanted.. Creating Shade Button..");
				new_window->Shade_Button = CreateButton(new_window, ds_win_settings.align_shade_btn, ds_win_settings.pos_shade_btn);
			}
      if (wm_settings.button.have_close_btn)
      {
				fprintf(CoreWM.log, "\nAdjustWindow(): Close Button is wanted.. Creating Close Button..");
				new_window->Close_Button = CreateButton(new_window, ds_win_settings.align_close_btn, ds_win_settings.pos_close_btn);
			}
      /*if (gl_epiwin.align_btn_destroy)
	new_win->button_destroy = build_button(new_win,
					       gl_epiwin.align_btn_destroy,
					       gl_epiwin.pos_btn_destroy);*/
			fprintf(CoreWM.log, "\nAdjustWindow(): adding to elt.");
      Add_elt(new_window);
      fprintf(CoreWM.log, "\nAjustWindow(): setting win_attr.event_mask = PropertyChange | ResizeRedirectMask | StructureNotifyMask | KeyPressMask | PointerMotionMask");
      win_attr.event_mask = PropertyChangeMask | ResizeRedirectMask | StructureNotifyMask | KeyPressMask | PointerMotionMask;
			fprintf(CoreWM.log, "\nAdjustWindow(): win_attr.do_not_proagate_mask = ButtonPressMask | ButtonReleaseMask");
      win_attr.do_not_propagate_mask = ButtonPressMask | ButtonReleaseMask;
			fprintf(CoreWM.log, "\nAdjustWindow(): ChangeWindowAttributes fore new_window");
      XChangeWindowAttributes(CoreWM.display, new_window->Win, CWEventMask | CWDontPropagate, &win_attr);
			fprintf(CoreWM.log, "\nAdjustWindow(): Reparenting Window.");
      XReparentWindow(CoreWM.display, win, new_window->BorderFrame, new_window->border_size, new_win->border_size);
			fprintf(CoreWM.log, "\nAdjustWindow(): GrabShortCuts for win");
      GrabShortCuts(win);
      fprintf(CoreWM.log, "\nAdjustWindow(): Getting WMHints..");
      wmhints = XGetWMHints(CoreWM.display, win);
      fprintf(CoreWM.log, "\nAdjustWindow(): Setting new_window to be inactive");
      SetWindowState(new_window, "inactive");
      if (wmhints)
			{
	  		if ((wmhints->flags & StateHint) && (wmhints->initial_state == IconicState))
				{
	    		fprintf(CoreWM.log, "\nAdjustWindow(): Window is iconified.");
	    		IconifyWindow(new_window, 1, 0);
	    	}
	  	else if (win_attr.map_state == IsViewable)
	    {
	      if ((ds_win_settings.isSmartPlacement) && (!ds_win_settings.startFirst))
				{
					fprintf(CoreWM.log, "\nAdjustWindow(): smart placement.");
					SmartPlacement(new_window);
				}
	      //window_group_map(new_win);
				fprintf(CoreWM.log, "\nAdjustWindow(): Set Window State \"inactive.\"");
	      SetWindowState(new_window, "inactive");
	      fprintf(CoreWM.log, "\nAdjustWindow(): CatchWindowMouse.");
	      CatchWindowMouse();
	    }
		}
  	else if (win_attr.map_state == IsViewable)
		{
	  	if ((ds_win_settings.isSmartPlacement) && (!ds_win_settings.startFirst))
	    	placement_smart(new_win);
	  	//window_group_map(new_win);
			fprintf(CoreWM.log, "\nAdjustWindow(): Change windowstate to inactive.");
	  	SetWinsowState(new_window, "inactive");
	  	fprintf(CoreWM.log, "\nAdjustWindow(): CatchWindowMouse.");
	  	CatchWindowMouse();
		}
  	if (XGetTransientForHint(CoreWM.display, new_window->Win, &trans_win))
		{
	  	if (trans_win != CoreWM.root)
	  	{
	  		fprintf(CoreWM.log, "\nAdjustWindow(): Requested Mapping..");
	    	MapRequest(tran_win);
	  	}
		}
			fprintf(CoreWM.log, "\nAdjustWindow(): XUngrabServer...");
    	XUngrabServer(CoreWM.display);
			fprintf(CoreWM.log, "\nAdjustWindow(): XSync Display (1).");
    	XSync(CoreWM.display, 1);
    	return(new_window);
  	}
  	else
    	return(NULL);
 }

 int GetShape(Window win)
 {
 		int		xws;
  	int		yws;
  	int		xbs;
  	int		ybs;
  	unsigned	wws;
  	unsigned	hws;
  	unsigned	wbs;
  	unsigned	hbs;
  	int		boundingShaped;
  	int		clipShaped;
		fprintf(CoreWM.log, "\nGetShape(): Shape Select Input: ShapeNotifyMask");
 		XShapeSelectInput(CoreWM.display, win, ShapeNotifyMask);
 		fprintf(CoreWM.log, "\nGetShape(): Querying Shape Extents.. returning %i", boundingShaped);
  	XShapeQueryExtents(CoreWM.display, win, &boundingShaped, &xws, &yws, &wws, &hws, &clipShaped, &xbs, &ybs, &wbs, &hbs);
		return boundingShaped;
 }

 Window AddParent(DarkSideWindow *win, XWindowAttributes *win_attr)
 {
	Window win_temp;
	XSetWindowAttributes set_attr;
	int width = 0;
	int height = 0;
	
	if(win->app_prop & NO_TITLE)
	{
		fprintf(CoreWM.log, "\nAddParent(): NO_TITLE.");
		width = win_attr->width + (win->border_size * 2);
		height = win_attr->height + (win->border_size * 2);
		fprintf(CoreWM.log, "\nAddParent(): width = %i; height = %i;", width, height);
	}
	else if ((win->app_prop & wm_settings.titlebar.position == TOP) || (win->app_prop & wm_settings.titlebarbar.position == BOTTUM))
	{
		fprintf(CoreWM.log, "\nAddParent(): wm_settings.titlebar.position == %i", wm_settings.titlebar.position);
		width = win_attr->width + (win->border_size * 2);
    height = win_attr->height +	(win->border_size * 2)+ win->titlebar_height;
    fprintf(CoreWM.log, "\nAddParent(): parent will be %i x %i.", width, height);
  }
  else if (wm_settings.titlebar.position == LEFT || wm_settings.titlebar.position == RIGHT)
  {
		fprintf(CoreWM.log, "\nAddParent(): wm_settings.titlebar.position == %i", wm_settings.titlebar.position);
    width = win_attr->width + win->titlebar_height + wg->titlebar_border * 2 + wg->border_size * 2;
    height = attrib->height +	(wg->border_size + wg->bf_border)*2;
    fprintf(CoreWM.log, "\nAddParent(): parent will be %i x %i", width, height);
  }
	fprintf(CoreWM.log, "\nAddParent(): Creating temporary window.");
  temp = XCreateSimpleWindow(CoreWM.display, CoreWM.root, win_atte->x, win_attr->y, width, height, 0, BlackPixel(CoreWM.display, CoreWM.screen_number), WhitePixel(CoreWM.display, CoreWM.screen_number));
  fprintf(CoreWM.log, "\nAddParent(): setting event mask.");
  set_attr.event_mask = /*ExposureMask | */EnterWindowMask | LeaveWindowMask | ButtonPressMask | ButtonReleaseMask | SubstructureNotifyMask | PropertyChangeMask | SubstructureRedirectMask | KeyPressMask;
  fprintf(CoreWM.log, "\nAddParent(): Changing Window Attributes.");
  XChangeWindowAttributes(CoreWM.display, temp , CWEventMask, &set_attr);
  fprintf(CoreWM.log, "\nAddParent(): Returning temp as new parent window.");
  return (temp);
 }

 void SetWindowState(DarkSideWindow *win, int activity)
 {
 		XWindowAttributes attr;
 		int expose = 1;
 		
 		if(!activity == ACTIVE)
 		{
 			if ((wm_settings.win.current) && (wm_settings.win.current != win))
			{
				fprintf(CoreWM.log, "\nSetWindowState(): wm_settings.win.current and wm_settings.win.current != win");
				SetWindowState(wm_settings.win.current, INACTIVE);
				fprintf(CoreWM.log, "\nSetWindowState(): Setting window state of current window to INACTIVE");
			} //if((wm_settings.win.current) && (wm_settings.win.current != win))
      if ((win->app_prop & NO_TITLE) == 0)
			{
#ifdef	  __Imlib__
	  	if (wm_settings.titlebar.image_active)
	  	{
	  		fprintf(CoreWM.log, "\nSetWindowState(): wm_settings.title.active_image == %i", wm_setting.title.active_image);
	  		DrawTitlebarImage(win, state);
	  	}//if (wm_settings.titlebar.image_active)
	  	else
	    {
#endif
	      if (wm_settings.titlebar.active_grad_type)
	      {
	      	fprintf(CoreWM.log, "\nSetWindowState(): wm_settings.title.active_grad_type = %i", wm_settings.titlebar.active_grad_type);
					DrawGradient(win, win->TitleBar, TITLEBAR, state);
				}//if (wm_settings.titlebar.grad_active_type)
	      else
				{
		  		XSetWindowBackground(CoreWM.display, win->TitleBar, wm_settings.titlebar.active_color.pixel);
		  		fprintf(CoreWM.log, "\nSetWindowState(): XSetWindowBackground(%l,%l, %l)", CoreWM.display, win->TitleBar, wm_settings.titlebar.active_color.pixel);
		  		XClearWindow(CoreWM.display, win->TitleBar);
		  		fprintf(CoreWM.log, "\nSetWindowState(): XCleaWindow win->TitleBar of %l", CoreWM.display);
				}//end of else
#ifdef	  __Imlib__
	     }//end of else
#endif
			}//((win->app_prop & NO_TITLE) == 0)
	
	 	XSetWindowBackground(CoreWM.display, win->BorderFrame, wm_settings.inactive_color.pixel);
	 	fprintf(CoreWM.log, "\nSetWindowState(): XSetWindowBackGround(%l, %l, %l)", CoreWM.display, win->BorderFrame, wm_settings.inactive_color.pixel);
   	XClearWindow(CoreWM.display, win->BorderFrame);
   	fprintf(CoreWM.log, "\nSetWindowState(): Ceared win->BorderFrame on display: %l", CoreWM.display);
    if (wm_settings.mouse.focus_mode == FOCUS_FOLLOW_MOUSE)
		{
			XSetInputFocus(CoreWM.display, CoreWM.root, RevertToParent, CurrentTime);
			fprintf(CoreWM.log, "\nSetWindowState(): FOCUS_FOLLOW_MOUSE->XSetInputFocus(%l, %l, %l, %l)", CoreWM.display, CoreWM.root, RevertToParent, CurrentTime);
		}//if (wm_settings.mouse.focus_mode == FOCUS_FOLLOW_MOUSE)

    win->active = 0;
		fprintf(CoreWM.log, "\nSetWindowState(): win->active == %i", win->active);
		
    if ((wm_settings.win.current) && (wm_settings.win.current == win))
		{
			wm_settings.win.current = NULL;
			fprintf(CoreWM.log, "\nSetWindowState(): wm_settings.win.current == NULL");
		}//if (wm_settings.mouse.focus_mode == FOCUS_FOLLOW_MOUSE)
   }//if(!activity == ACTIVE)

  if ((win->app_prop & NO_TITLE) == 0)
  {
  	fprintf(CoreWM.log, "\nSetWindowState(): win->app_prop == %c", win->app_prop);
   	if(wm_settings.titlebar.width_mode)
		{
			fprintf(CoreWM.log, "\nSetWindowState(): wm_settings.titlebar.width_mode == %i", wm_settings.titlebar.width_mode);
	  	if ((wm_settings.titlebar.position == TOP) || (wm_settings.titlebar.position == BOTTOM))
	   	{
	   		fprintf(CoreWM.log, "\nSetWindowState(): Title Bar Position == %i", wm_settings.titlebar.position);
	      if(wm_settings.titlebar.align_shape == ALIGN_LEFT)
				{
					fprintf(CoreWM.log, "\nSetWindowState(): wm_settings.titlebar.align_shape == ALIGN_LEFT");
					XDrawLine(CoreWM.display, win->TitleBar, gc_black, GetTitlebarWidth(win) - win->titlebar_border, 0, GetTitlebarWidth(win) - win->titlebar_border, wm_settings.titlebar.height);
				}//if(wm_settings.titlebar.align_shape == ALIGN_LEFT)
	      else
				{
		  		XGetWindowAttributes(CoreWM.display, win->Parent, &attr);
		  		fprintf(CoreWM.log, "\nSetWindowState(): XGetWindowAttributes(%l, %l, &attr)", CoreWM.log, win->Parent);
		  		XDrawLine(CoreWM.display, win->TitleBar, gc_black, attr.width - GetTitleBarWidth(win) - win->titlebar_border * 2, 0, attr.width - GetTitlebarWidth(win) - win->titlebar_border * 2, wm_settings.titlebar.height);
		  		fprintf(CoreWM.log, "\nSetWindowState(): Drawing Line: \n\t Display: %l \n\tTitleBar: %l \n\tColor (black): %l \n\t X1: %i \n\t Y1: %i \n\t X2: %i \n\t Y2: %i",
		  				CoreWM.display, win->TitleBar, attr.with - GetTitleBarWidth(win) - win->titlebar_border * 2, 0, attr.width - GetTitleBarWidth(win) - win->titlebar_border * 2, wm_settings.titlebar.height);
				}//else
	    }//if ((wm_settings.titlebar.position == TOP) || (wm_settings.titlebar.position == BOTTOM))
	  	else
	    {
	      XDrawLine(CoreWM.display, win->TitleBar, gc_black, 0, GetTitleBarWidth(win) - win->titlebar_border, wm_settings.titlebar.height, GetTitleBarWidth(win) - win->titlebar_border);
	      fprintf(CoreWM.log, "\nSetWindowState(): line(%i, %i, %i, %i) color: %l", 0, GetTitleBarWidth(win) - win->titlebar_border, wm_settings.titlebar.height, GetTitleBarWidth(win) - win->titlebar_border, gc_black);
	    }//else
		}//if(wm_settings.titlebar.width_mode)
    TitlebarButtonState(win, state);
    fprintf(CoreWM.log, "\nSetWindowState(): TitleBarButtonState(%l, %i)", win, state);
    DrawTitlebar(win, win->TitleBar, state);
    fprintf(CoreWm.log, "\nSetWindowState(): DrawTitleBar..");
  }//if((win->app_prop & NO_TITLE) == 0)
  if (ds_menu.here_task)
  {
  	fprintf(CoreWM.log, "\nSetWindowState(): wm_settings.menu.here_task = %i", ds_menu.here_task);
    DrawMenuTask();
  }//if(wm_settings.menu.here_task)
 }

 void IconifyWindow(DarkSideWindow win) //int d, d1
 {
  	if (wg_tmp->iconify_title_win == 0)
    {
    	mouse_iconify(wg_tmp);
    }
  	else
    {
    	mouse_uniconify(wg_tmp);
    }
 }

 void SmartPlacement(DarkSideWindow win)
 {
  	int			place_x;
  	int			place_y;
  	XWindowAttributes	attr;

  	fprintf(CoreWM.log, "\nSmartPlacement(): Setting Window Attributes..");
  	XGetWindowAttributes(CoreWM.display, win->Parent, &attr);
  	fprintf(CoreWM.log, "done");
  	if ((attr.x == 0) && (attr.y == 0))
  	{
  		fprintf(CoreWM.log, "\nSmartPlacement(): attr.x = %i attr.y = %i", attr.x, attr.y);
    	place_y = 0;
    	place_x = 0;
    	while (!ChoosePlace(win, &place_x, &place_y));
  		{
  			fprintf(CoreWM.log, "\nSmartPlacement(): Moving window.. \n\t place_x = %i \n\t place_y = %i",place_x, place_y);
  			XMoveWindow(CoreWM.display, win->Parent, place_x, place_y);
  		}
  	}
 }

 void MapRequest(Window win)
 {
 		DarkSideWindow *dswin;
  	XWMHints	*wmhints;

  	dswin	= search_elt(win);
  	if (ewin == 0)
    	dswin = CreateWindow(win);
  	if (dswin)
    {
    	//program listing
      	if (dswin->iconify_title_win != win && dswin->iconify_win != win)
				{
	  			wmhints = XGetWMHints(gl_dpy, win);
	  			if (wmhints)
	    			if ((wmhints->flags & StateHint) && (wmhints->initial_state == IconicState))
	      			return ;
	  				if (dswin->IconifyTitleWin)
	    			{
	      			XDestroyWindow(CoreWM.display, dswin->IconifyTitleWin);
	      			if (dswin->Iconify)
	      			{
								XUnmapWindow(gl_dpy, dswin->Iconify);
							}
	      			Iconify_rm_elt(dswin);
	    			}
	  			if ((wm_settings.win.smart_placement) && (!wm_settings.win.first_start))
	    			SmartPlacement(dswin);
	  			MapGroupWindow(dswin);
	  			XRaiseWindow(CoreWM.display, dswin->Parent);
	  			ClientSetState(dswin, NormalState);
				}
 		}
 }