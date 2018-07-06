/***************************************************************************
                          darksidekeyboard.h  -  description
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

 #ifndef _DARK_SIDE_KEY_BOARD_
 #define _DARK_SIDE_KEY_BOARD_

 typedef struct darksideshortcut {
 	char ctrl;
 	char shift;
 	char alt;
 	KeySym key;
 } DarkSideShortCut;

 typedef struct darksideshortcutlist {
 	struct darksideshortcut *cmd;
 	void (*pFunct)();
 	struct darksideshortcutlist *next;
 } DarkSideShortCutList;

 DarkSideShortCutList ds_shortcut_list;

 void GrabShortCuts(Window win);

 #endif _DARK_SIDE_KEY_BOARD_