/***************************************************************************
                          darksidetitlebar.c  -  description
                             -------------------
    begin                : Thu Aug 3 2000
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

void DrawGradient(DarkSideWindow *group_win, Window win, int target, int status)
{
  XRectangle		bounds;
  XWindowAttributes	attrib;
  char			type;
  struct Pixel		*pixels;

  fprintf(CoreWM.log, "\nDrawGradient(): Got Window Attributes");
  XGetWindowAttributes(CoreWM.display, win, &attrib);
  if (target == TITLE_BAR)
  {
  	fprintf(CoreWM.log, "\nDrawGradient(): for titlebar.");
  	if (group_win->app_prop & NO_TITLE)
		{
			fprintf(CoreWM.log, "\nDrawGradient(): NO_TITLE");
			return ;
		}
    if (status == ACTIVE)
		{
			fprintf(CoreWM.log, "\nDrawgradient(): status is active");
	  	//type = ds_win_settings.titlebar.grad_active_type;
	  	pixels = ds_win_settings.titlebar.pixels_active;
	}
      else
	{
	  type = ds_win_settings.titlebar.grad_inactive_type;
	  pixels = ds_win_settings.titlebar.pixels_inactive;
	}
      if ((ds_win_settings.titlebar.position == TOP)
	  || (ds_win_settings.titlebar.position == BOTTOM))
	{
	  if (ds_win_settings.titlebar.width_mode)
	    {
	      if (ds_win_settings.titlebar.align_shape == ALIGN_LEFT)
		bounds.x = 0;
	      else
		bounds.x = attrib.width - get_titlebar_width(group_win)
		  + group_win->titlebar_border;
	      bounds.y = 0;
	      bounds.width = get_titlebar_width(group_win)
		- group_win->titlebar_border;
	    }
	  else
	    {
	      bounds.width = attrib.width;
	      bounds.x = bounds.y = 0;
	    }
	  bounds.height = attrib.height;
	}
      else
	{
	  if (ds_win_settings.titlebar.width_mode)
	    {
	      if (ds_win_settings.titlebar.align_shape == ALIGN_LEFT)
		bounds.y = 0;
	      else
		bounds.y = attrib.height - get_titlebar_width(group_win)
		  + group_win->titlebar_border;
	      bounds.height = get_titlebar_width(group_win)
		- group_win->titlebar_border;
	    }
	  else
	    {
	      bounds.y = 0;
	      bounds.height = attrib.height;
	    }
	  bounds.x = 0;
	  bounds.width = attrib.width;
	}
    }
  else
    {
      pixels = ds_menu.pixels;
      type = ds_menu.grad_type;
      bounds.x = bounds.y = 0;
      bounds.width = attrib.width;
      bounds.height = attrib.height;
    }
  /*	flush_expose(win); */
  if (type == 'H')
    {
      register int i = 0, dw = bounds.width / GRAD_NB_PIXEL + 1;
      while (i < GRAD_NB_PIXEL)
	{
	  unsigned short x = i * bounds.width / GRAD_NB_PIXEL;
	  XSetForeground(CoreWM.display, ds_win_settings.gcTransmask, pixels[i++]);
	  XFillRectangle(CoreWM.display, win, ds_win_settings.gcTransmask,
			 bounds.x + x, bounds.y, dw, bounds.height);
	}
    }
  else
    {
      register int i = 0, dh = bounds.height / GRAD_NB_PIXEL + 1;
      while (i < GRAD_NB_PIXEL)
	{
	  unsigned short y = i * bounds.height / GRAD_NB_PIXEL;
	  XSetForeground(CoreWM.display, ds_win_settings.gcTransmask, pixels[i++]);
	  XFillRectangle(CoreWM.display, win, ds_win_settings.gcTransmask,
			 bounds.x, bounds.y + y, bounds.width, dh);
	}
    }
}

 void DrawTitleBarImage(DarkSideWindow *win, int state)
 {
 	unsigned int width;
  	unsigned int height;
  	Pixmap	pixmap;
  	Pixmap	mask;
  	XWindowAttributes	attrib;

  	if (win->app_prop & NO_TITLE)
    		return ;
  	if (state == ACTIVE)
    	{
      	if (!(ds_win_settings.titlebar.image =  Imlib_load_image(ds_imlib_data, ds_win_settings.titlebar.image_active)))
		{
	  		fprintf(CoreWM.log, "DrawTitleBarImage(): cannot load titlebar active image\n");
	  		exit (1);
		}
    	}
  	else
    	{
      	if (!(ds_win_settings.titlebar.image = Imlib_load_image(ds_imlib_data, ds_win_settings.titlebar.image_inactive)))
		{
	  		fprintf(CoreWM.log, "DrawTitleBarImage(): cannot load titlebar inactive image\n");
	  		exit (1);
		}
    	}
  	if (ds_win_settings.titlebar.image_max)
    	{
      	if (ds_win_settings.titlebar.width_mode)
			width = get_titlebar_width(win);
      	else
		{
	  		XGetWindowAttributes(CoreWM.display, win->TitleBar, &attrib);
	  		width = attrib.width;
		}
      	height = attrib.height;
    	}
  	else
    	{
      	width = ds_win_settings.titlebar.image->rgb_width;
      	height = ds_win_settings.titlebar.image->rgb_height;
    	}
    	
  	Imlib_render(ds_imlib_data, ds_win_settings.titlebar.image, width, height);
  	pixmap = Imlib_move_image(ds_imlib_data, ds_win_settings.titlebar.image);
  	mask = Imlib_move_mask(ds_imlib_data, ds_win_settings.titlebar.image);
  	XSetWindowBackgroundPixmap(CoreWM.display, win->TitleBar, pixmap);
  	XClearWindow(CoreWM.display, win->TitleBar);
 }

 unsigned int GetTitleBarWidth(DarkSideWindow *win)
 {
 	XWindowAttributes attrib;
 	
 	if (ds_win_settings.titlebar.width_mode)
    	{
      	if ((ds_win_settings.titlebar.width_mode == IN_PIXELS))
			return (ds_win_settings.titlebar.width);
      	if ((ds_win_settings.titlebar.position == TOP) || (ds_win_settings.titlebar.position == BOTTOM))
		{
	  		XGetWindowAttributes(CoreWM.display, win->BorderFrame, &attrib);
	  		return ((ds_win_settings.titlebar.width * (attrib.width + win->border_size * 2)) / 100);
		}
      	else
		{
	  		XGetWindowAttributes(CoreWM.display, win->BorderFrame, &attrib);
	  		return ((ds_win_settings.titlebar.width * (attrib.height + win->border_size * 2)) / 100);
		}
    	}
  	else
    	{
      	XGetWindowAttributes(CoreWM.display, win->Parent, &attrib);
      	return (attrib.width);
    	}
 }

 void TitleBarButtonState(DarkSideWindow *win, int state)
 {
  	if (gl_epiwin.align_btn_iconify)
    	{
      	set_background(win->button_iconify, state);
      	draw_button_iconify(win->button_iconify, state);
    	}
  	if (gl_epiwin.align_btn_max)
    	{
      	set_background(win->button_max, state);
      	draw_button_max(win->button_max, state);
    	}
  	if (gl_epiwin.align_btn_max_height)
    	{
      	set_background(win->button_max_height, state);
      	draw_button_max_height(win->button_max_height, state);
    	}
  	if (gl_epiwin.align_btn_max_width)
    	{
      	set_background(win->button_max_width, state);
      	draw_button_max_width(win->button_max_width, state);
    	}
  	if (gl_epiwin.align_btn_close)
    	{
      	set_background(win->button_close, state);
      	draw_button_close(win->button_close, state);
    	}
  	if (gl_epiwin.align_btn_destroy)
    	{	
      	set_background(win->button_destroy, state);
      	draw_button_destroy(win->button_destroy, state);
    	}
  	if (gl_epiwin.align_btn_shade)
    	{
      	set_background(win->button_shade, state);
      	draw_button_shade(win->button_shade, state);
    	}
 }

 	