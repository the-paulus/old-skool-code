/***************************************************************************
                          darksidewm.h  -  description
                             -------------------
    begin                : Wed Jul 19 2000
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

 #ifndef __DARK_SIDE_WM__
 #define __DARK_SIDE_WM__

 #include <stdio.h>
 #include <string.h>
 #include <stdlib.h>
 #include <unistd.h>
 #include <signal.h>
 #include <sys/time.h>
 #include <sys/types.h>
 /*#ifdef	  __Imlib__*/
 #include <Imlib.h>
 /*#endif*/
 #include <X11/Xlib.h>
 #include <X11/Xutil.h>
 #include <X11/cursorfont.h>
 #include <X11/Xproto.h>
 #include <X11/keysym.h>
 #include <X11/Xresource.h>
 #include <X11/Xatom.h>
 #include <X11/Xcms.h>

 //Dark Side - Headers
 //#include <structures.h>

typedef struct DarkSideTitleBar {
 	char align;
 	char			align_shape;
  	char			grad_active_type;
  	char			grad_inactive_type;
  	unsigned int		height;
  	unsigned int		width;
  	unsigned int		space;
  	char				position;
  	char				width_mode;
  	char				*image_active;
  	char				*image_inactive;
  	char				*img_btn_close_active;
  	char				*img_btn_close_inactive;
  	char				*img_btn_destroy_active;
  	char				*img_btn_destroy_inactive;
  	char				*img_btn_max_active;
  	char				*img_btn_max_inactive;
  	char				*img_btn_shade_active;
  	char				*img_btn_shade_inactive;
  	char				*img_btn_iconify_active;
  	char				*img_btn_iconify_inactive;
  	char				*img_btn_max_height_active;
  	char				*img_btn_max_height_inactive;
  	char				*img_btn_max_width_active;
  	char				*img_btn_max_width_inactive;
  	char				*image_max;
  	struct Pixel		*pixels_active;
  	struct Pixel		*pixels_inactive;
  	GC				font_active;
  	GC				font_inactive;
  	XColor			color_active;
  	XColor			color_inactive;
  	XColor			color_stick;
  	XFontStruct		*font;
  	ImlibImage		*image;
 } DarkSideTitleBar;

 typedef struct t_core {
 	int				parent_pid;
 	XEvent			event;
  	Window 			root;
 	Display 			*display;
 	int 				screen_number;
 	char 			*screen_name;
 	unsigned int 		screen_width;
 	unsigned int		screen_height;
 	FILE 			*log;
 	FILE 			*settings;
 } Core;

 typedef struct win_settings {
 	Cursor			default_cursor;
  	Cursor			resize_S_cursor;
  	Cursor			resize_N_cursor;
  	Cursor			resize_E_cursor;
  	Cursor			resize_W_cursor;
  	Cursor			resize_NW_cursor;
  	Cursor			resize_NE_cursor;
  	Cursor			resize_SW_cursor;
  	Cursor			resize_SE_cursor;
  	Cursor			move_cursor;
  	Cursor			target_cursor;
  	/*Cursor			current_cursor;*/
  	GC				gcTransmask;
  	unsigned int		border_size;
  	unsigned int		button_width;
  	unsigned int		button_height;
  	int				focus_mode;
  	int				isChanging;
  	int				move_opaque;
  	int				resize_opaque;
  	int				smart_placement;
  	int				auto_raise;
  	int	  			first_start;
  	int 				have_max_btn;
 	int 				have_icon_btn;
 	int 				have_shade_btn;
 	int 				have_close_btn;
 	int 				have_menu_btn;
 	int 				pos_max_btn;
 	int 				pos_icon_btn;
 	int 				pos_shade_btn;
 	int 				s_menu_btn;
 	int 				lign_max_btn;
 	int 				lign_icon_btn;
 	int 				ign_close_btn;
 	int 				align_menu_btn;
  	XColor			ctive_color;
  	XColor			inactive_color;
  	XColor			stick_color;
  	XContext			context;
  	struct DarksideWindow		*current;
  	struct DarksideWindow		*left_win;
  	struct DarkSideTitleBar	titlebar;
  	struct darksideworkspace	*first_workspace;
  	struct darksideworkspace	*current_workspace;
  	struct ds_list	*first_win_group_list;
  	int				nb_elt;
  	unsigned int		virtual_width;
  	int				virtual_x;
  	int				cursor_position_x;
  	int				cursor_position_y;
  	unsigned int		current_win_width;
  	unsigned int		current_win_height;
  	unsigned int		current_win_border_width;
  	int				opaque_x;
  	int				opaque_y;
  	unsigned int		opaque_height;
  	unsigned int		opaque_width;
  	int				opaque_mvt;
 } WinSettings;

 Core CoreWM;
 //ImlibData imlib_data;
 WinSettings ds_win_settings;
 void OpenDisplay(void);
 //char *OpenLogFile(void);
 void CaptureWindow(void);
 XErrorHandler ErrorHandler(Display *dsp, XErrorEvent *xerror);

 #include <darksidewindow.h>
 #include <darksidewinlist.h>
 #include <DarkSideButtons.h>
 #include <darksideinit.h>
 #include <style.h>
 #include <darksidetitlebar.h>
 #include <darksideworkspace.h>
 #include <darksidekeyboard.h>
 #include <darksidemouse.h>
 #include <darksidemenu.h>
 #endif __DARK_SIDE_WM__