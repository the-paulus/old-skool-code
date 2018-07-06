/***************************************************************************
                          DarkSideButtons.c  -  description
                             -------------------
    begin                : Thu Jul 27 2000
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

 #include <darksidewm.h>

 Window CreateButton(DarkSideWindow *win, char align, int pos, int type)
 {
 		DarkSideWindow d_tmp;
 		Window w_tmp;
 		XSetWindowAttributes set_attr;
 		
 		if(win->app_prop * NO_TITLE)
 		{
 			fprintf(CoreWM.log, "\nCreateButton(): NO_TITLE return(0);");
 			return(0);
 		}
 		if((wm_settings.titlebar.position == TOP) || (wm_settings.titlebar.potition == BOTTOM))
 		{
 			d_tmp.x = SetButtonPosition(win, align, pos);
 			d_tmp.y = (win->titlebar_height - ds_settings.button.button_height) / 2
 		} else {
 			d_tmp.x = (win->titlebar_height - ds_settings.button.button_width) / 2;
      d_tmp.y = SetButtonPosition(win, align, pos);
    }

    d_tmp.width = gl_epiwin.btn_width;
  	d_tmp.height = gl_epiwin.btn_height ;
  	d_tmp.bgcolor = BlackPixel(gl_dpy, gl_scr_info.screen);
  	d_tmp.fgcolor = gl_epiwin.titlebar.color_active.pixel;
  	d_tmp.parent = win->titlebar_win;
  	d_tmp.cursor = gl_epiwin.normal_cursor;
  	d_tmp.border = 0;
  	w_tmp = AddButton(&d_tmp);
  	set_attr.event_mask = ButtonPressMask | ButtonReleaseMask
    /* | ExposureMask */;
  	XChangeWindowAttributes(CoreWM.display, w_tmp, CWEventMask, &set_attr);
  	return (w_tmp);
}

int SetButtonPosition(DarkSideWindow *win, int align, int pos)
{
	XWindowAttributes	attrib;

  if ((wm_settings.titlebar.position == TOP) || (wm_settings.titlebar.position == BOTTOM))
  {
  	fprintf(CoreWM.log, "\nSetButtonPosition(): title bar position %i", wm_settings.titlebar.position);
  	if (align == LEFT)
		{
			fprintf(CoreWM.log, "\nSetButtonPosition(): align left.");
	  	if (wm_settings.titlebar.width_mode)
	    {
	    	fprintf(CoreWM.log, "\nSetButtonPosition(): width_mode = %i", wm_settings.titlebar.width_mode);
	      if (wm_settings.titlebar.align_shape == LEFT)
	      {
	      	fprintf(CoreWM.log, "\nSetButtonPosition(): align shape for title bar is left");
					fprintf(CoreWM.log, "\nSetButtonPosition(): returned %i", pos);
					return (pos);
				}
	      else
				{
		  		fprintf(CoreWM.log, "\nSetButtonPosition(): Getting window attributes for win->TitleBar");
		  		XGetWindowAttributes(CoreWM.display, win->TitleBar, &attrib);
		  		fprintf(CoreWM.log, "\nSetButtonPosition(): returned %i", (attrib.width - GetTileBarWidth(win) + win->titlebar_border + pos));
		  		return (attrib.width - GetTitleBarWidth(win) + win->titlebar_border + pos);
				}
	    }
	  	else
	  	{
	  		fprintf(CoreWM.log, "\nSetButtonPosition(): returned %i", pos);
	    	return (pos);
	    }
		}
    else if (align == RIGHT)
		{
			fprintf(CoreWM.log, "\nSetButtonPosition(): align is Right");
	  	if (wm_settings.titlebar.width_mode)
	    {
	      if (wm_settings.titlebar.align_shape == LEFT)
	      {
	      	fprintf(CoreWM.log, "\nSetButtonPosition(): returned %i", (get_titlebar_width(win)- pos -gl_epiwin.btn_width - win->titlebar_border >= 0) ? (get_titlebar_width(win) - pos -gl_epiwin.btn_width - win->titlebar_border) : 0);
					return ((get_titlebar_width(win)- pos -gl_epiwin.btn_width - win->titlebar_border >= 0) ? (get_titlebar_width(win) - pos -gl_epiwin.btn_width - win->titlebar_border) : 0);
				}
	      else
				{
					fprintf(CoreWM.log, "\nSetButtonPosition(): Got Window Attributes for win->TitleBar");
		  		XGetWindowAttributes(gl_dpy, win->TitleBar, &attrib);
		  		fprintf(CoreWM.log, "\nSetButtonPosition(): returned %i", (attrib.width - pos - wm_settings.button.button_width >= 0) ? (attrib.width - pos - gl_epiwin.btn_width) : 0);
		  		return ((attrib.width - pos - gl_epiwin.btn_width >= 0) ? (attrib.width - pos - gl_epiwin.btn_width) : 0);
				}
	    }
	  	else
	    {
	    	fprintf(CoreWM.log, "\nSetButtonPosition(): Got Window atributes.");
	      XGetWindowAttributes(gl_dpy, win->titlebar_win, &attrib);
	      fprintf(CoreWM.log, "\nSetButtonPosition(): returned %i", (attrib.width - pos - gl_epiwin.btn_width >= 0) ? (attrib.width - pos - gl_epiwin.btn_width) : 0);
	      return ((attrib.width - pos - gl_epiwin.btn_width >= 0) ? (attrib.width - pos - gl_epiwin.btn_width) : 0);
	    }
   	}
  	else
    {
      if (align == LEFT)
			{
				fprintf(CoreWM.log, "\nSetButtonPosition(): align left");
	  		if (wm_settings.titlebar.width_mode)
	    	{
	    		fprintf(CoreWM.log, "\nSetButtonPosition(): width mode = %i", wm_settings.titlebar.width_mode);
	      	if (wm_settings.titlebar.align_shape == LEFT)
					{
						fprintf(CoreWM.log, "\nSetButtonPosition(): returned %i", pos);
						return (pos);
					}
	      	else
					{
		  			fprintf(CoreWM.log, "\nSetButtonPosition(): Got Window Attributes");
		  			XGetWindowAttributes(gl_dpy, win->titlebar_win, &attrib);
		  			fprintf(CoreWM.log, "\nSetButtonPosition(): returned %i", attrib.height - get_titlebar_width(win) + win->titlebar_border * 2 + pos);
		  			return (attrib.height - get_titlebar_width(win) + win->titlebar_border * 2 + pos);
					}
	    	}
	  		else
	  		{
	  			fprintf(CoreWM.log, "\nSetButtonPosition(): returned %i", pos);
	    		return (pos);
	    	}
			}
      else if (align == RIGHT)
			{
				fprintf(CoreWM.log, "\nSetButtonPositin(): align RIGHT");
	  		if (wm_settings.titlebar.width_mode)
	    	{
	    		fprintf(CoreWM.log, "\nSetButtonPosition(): title bar width mode = %i", wm_settings.titlebar.width_mode);
	      	if (wm_settings.titlebar.align_shape == LEFT)
	      	{
	      		fprintf(CoreWM.log, "\nSetButtonPosition(): align_shape = LEFT");
						fprintf(CoreWM.log, "\nSetButtonPosition(): returned %", (get_titlebar_width(win) -pos -gl_epiwin.btn_height - win->titlebar_border >= 0) ? (get_titlebar_width(win) -pos - gl_epiwin.btn_height - win->titlebar_border) : 0);
						return ((get_titlebar_width(win) -pos -gl_epiwin.btn_height - win->titlebar_border >= 0) ? (get_titlebar_width(win) -pos - gl_epiwin.btn_height - win->titlebar_border) : 0);
					}
	      	else
					{
		  			fprintf(CoreWM.log, "\nSetButtonPosition(): Got window attributes");
		  			XGetWindowAttributes(gl_dpy, win->titlebar_win, &attrib);
		  			fprintf(CoreWM.log, "\nSetButtonPosition() returned %i", (attrib.height - pos - gl_epiwin.btn_height >= 0) ? (attrib.height - pos - gl_epiwin.btn_height) : 0);
		  			return ((attrib.height - pos - gl_epiwin.btn_height >= 0) ? (attrib.height - pos - gl_epiwin.btn_height) : 0);
					}
	    	}
	  		else
	    	{
	      	fprintf(CoreWM.log, "\nSetButtonPosition(): Got Window Attributes");
	      	XGetWindowAttributes(gl_dpy, win->titlebar_win, &attrib);
	      	fprintf(CoreWM.log, "\nSetButtonPosition(): returned %i", (attrib.height - pos - gl_epiwin.btn_height >= 0) ? (attrib.height - pos - gl_epiwin.btn_height) : 0);
	      	return ((attrib.height - pos - gl_epiwin.btn_height >= 0) ? (attrib.height - pos - gl_epiwin.btn_height) : 0);
	    	}
			}
    }
  	return (0);
}

Window AddButton(Button btn)
{
	Window	temp;

  temp = XCreateSimpleWindow(CoreWM.display,
			     btn->parent,
			     btn->x,
			     btn->y,
			     btn->width,
			     btn->height,
			     btn->border,
			     btn->bgcolor,
			     btn->fgcolor);
  if (btn->cursor)
    XDefineCursor(CoreWM.display, temp, btn->cursor);
  return (temp);
}