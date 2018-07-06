/***************************************************************************
                          darksidetitlebar.h  -  description
                             -------------------
    begin                : Tue Jul 25 2000
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

 #ifndef _DARK_SIDE_TITLE_BAR_H_
 #define _DARK_SIDE_TITLE_BAR_H_

 typedef enum DSTITLEBAR {
 	TITLE_BAR,
 	TOP,
 	BOTTOM,
 	RIGHT,
 	LEFT,
 	ALIGN_LEFT,
 	ALIGN_RIGHT
 } DSTITLEBAR;

 typedef enum MEASURETYPE {
 	IN_PIXELS,
 	IN_PERCENT,
 	IN_INCHES
 } MEASURETYPE;

 void DrawGradient(DarkSideWindow *group_win, Window win, int target, int status);
 void DarkTitleBarImage(DarkSideWindow *win, int state);
 unsigned int GetTitleBarWidth(DarkSideWindow *win);
 void TitleBarButtonState(DarkSideWindow *win, int state);

 #endif