/***************************************************************************
                          DarkSideButtons.h  -  description
                             -------------------
    begin                : Thu Jul 20 2000
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

 #ifndef _DARK_SIDE_BUTTONS_H_
 #define _DARK_SIDE_BUTTONS_H_

 #define MAX_BUTTON 1
 #define ICONIFY_BUTTON 2
 #define CLOSE_BUTTON 3
 #define SHADE_BUTTON 4
 #define MENU_BUTTON 5

 typedef struct Button {
 	int x;
 	int y;
 	unsigned int width;
 	unsigned int height;
 	char border;
 	unsigned long		bgcolor;
  	unsigned long		fgcolor;
  	Cursor		cursor;
  	Window		Parent;
 } Button;

 typedef struct DSButton {
 	Window button_win;
 	char *inactive_image;
 	char *click_image;
 	char *mouseover_image;
 	unsigned int width;
 	unsigned int height;
 } DSButton;

 Window CreateButton(DarkSideWindow *win, int align, char pos, int type);
 int SetButtonPosition(DarkSideWindow *win, int align, int pos);
 Window AddButton(DSButton btn);  //or Window AddButton(Button btn);
 void DrawButton(Window button, int state, int type);

 #endif _DARK_SIDE_BUTTONS_H_