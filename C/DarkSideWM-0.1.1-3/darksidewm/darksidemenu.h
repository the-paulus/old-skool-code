/***************************************************************************
                          darksidemenu.h  -  description
                             -------------------
    begin                : Tue Aug 29 2000
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

 #ifndef _DARK_SIDE_MENU_H_
 #define _DARK_SIDE_MENU_H_

 #define MINI_MENU_WIDTH 100
 #define MENU_WIDTH_SPACE 32
 #define MENU_HEIGHT_SPACE 8
 #define MAX_MENU_TASK_WIDTH 200

 #define CMD 1
 #define FUNC 2
 #define GOTO 3
 #define SENDTO 4

 typedef struct DarkSideMenu {
 	unsigned int width;
 	unsigned int height;
 	short			font_head;
  	int			task_width;
  	int			prop_width_root;
  	int			prop_width_win;
  	int			workspace_width;
  	char			**current_elt;
  	char			**current_menu;
  	char			*current_prop;
  	char			*current_workspace;
  	char			*lngst_str;
  	char			*lngst_str_prop;
  	char			grad_type;
  	char			auto_menu;
  	char			prop_type;
  	char			workspace_type;
  	char			here_prop;
  	char			here_task;
  	Window		*current_task;
  	Window		menu_prop;
  	Window		menu_task;
  	Window		workspace;
  	struct Pixel	*pixels;
  	XFontStruct	*font;
  	GC			font_inactive;
  	GC			font_active;
  	XColor		color;
  	ImlibImage		*image;
  	char			*image_name;
  } DarkSideMenu;

  typedef struct DarkSideMenuTask {
  	DarkSideWindow *elt;
  	struct DarkSideWindow *next;
  } DarkSideMenuTask;

  typedef struct DarkSideMenuApps {
  	char *elt;
  	char *cmd;
  	void (*func) ();
  	struct DarkSideMenuApps *next;
  	struct DarkSideMenuApps *menu;
  } DarkSideMenuApps;

  typedef struct MenuPos {
  	char			*menu_name;
  	char			here;
  	char			stick;
  	short		nb_elt;
  	short		height;
  	short		win_pos;
  	Window   		win;
  	struct DarkSideApps	**pos;
  	struct s_menu_pos	*next;
  } MenuPos;

  DarkSideMenuApps ds_mnuApps;
  DarkSideMenuTask ds_mnuTask;
  DarkSideMenu ds_menu;
  MenuPos ds_mnuPos;

  #endif