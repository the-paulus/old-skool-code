/***************************************************************************
                          darksidewindow.h  -  description
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

 #ifndef _DARK_SIDE_WINDOW_H_
 #define _DARK_SIDE_WINDOW_H_

 #include <darksidewm.h>

 #define GRAD_NB_PIXEL 128

 typedef enum windowstate {
 	WINDOW_STATE_MAXIMIZED,
 	WINDOW_STATE_ICONIFIED,
 	WINDOW_STATE_MINIMIZED,
 	WINDOW_STATE_SHADED,
 	WINDOW_STATE_DEFAULT
 } WindowState;

 typedef enum windowactivity {
 	ACTIVE,
 	INACTIVE
 } WindowActivity;

 typedef enum type {
 	TITLEBAR,
 	PARENT
 } Type;

 typedef struct darksidehints {
 	unsigned int min_width;
 	unsigned int min_height;
 	unsigned int max_width;
 	unsigned int max_height;
 	unsigned int inc_width;
 	unsigned int inc_height;
 } DarkSideHints; 	

 /*typedef struct darksidewindow {
 	Window Win;
 	Window Parent;
 	Window BorderFrame;
 	Button Max_Button;
 	Button Menu_Button;
 	Button Iconify_Button;
 	Button Shade_Button;
 	Button Close_Button;
 	struct TitleBar titlebar;
 	struct AppProperties app_prop;
 	struct darksidehints hints;
 	int state;
 	int isActive;
 	int x;
 	int y;
 	unsigned int width;
 	unsigned int height;
 	unsigned int shade_width;
 	unsigned int shade_height;
  int state;
  int isActive;
  AppProperties app_prop;
  DSHints hints;
 } DarkSideWindow;*/

typedef struct DSMenuWindow {
  Window Win;
  Window BorderFrame;
  unsigned int width;
  unsigned int height;
  unsigned int shade_width;
  unsigned int shade_height;
  int state;
  int hasfocus;
} DS_MenuWindow;

 typedef struct darksidewindow {
 	Window Win;
 	Window Parent;
 	Window BorderFrame;
 	Window Menu_Button;
 	Window TitleBar;
 	Window Max_Button;
 	Window Iconify_Button;
 	Window Shade_Button;
 	Window Close_Button;
 	Window IconifyTitleWin;
 	Window Iconify;
 	int x;
 	int y;
 	unsigned int width;
 	unsigned int height;
 	unsigned int shade_width;
 	unsigned int shade_height;
 	unsigned int titlebar_width;
 	unsigned int titlebar_height;
 	unsigned int titlebar_border;
 	char app_prop;
 	int state;
 	int border_size;
  //struct darksidetitlebar titlebar;
  /*struct d*/
 	int isAcitve;
 } DarkSideWindow;

 /*typedef struct ds_list {
 	struct darksidewindow ds_window;
 	struct ds_list  *next_window;
 } WindowList;*/

 void AdjustWindow(Window win);
 int GetShape(Window win);
 Window AddParent(DarkSideWindow *win, XWindowAttributes *win_attr);
 Window AddBorderFrame(DarkSideWindow *win, Window *win_parent);
 Window AddTitleBar(DarkSideWindow *win, Window *win_parent);
 void SetWindowState(DarkSideWindow *win, int state);
 void IconifyWindow(DarkSideWindow win); /*int d, d1*/
 int SmartPlacement(DarkSideWindow win);
 void MapRequest(Window win);
 int ChoosePlace(DarkSideWindow *win, int *pX, int *pY);
 DarkSideWindow *CreateWindow(Window win);
 #endif _DARK_SIDE_WINDOW_H_
