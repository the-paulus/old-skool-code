/***************************************************************************
                          darksidewinlist.h  -  description
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

 #ifndef _DARK_SIDE_WINDOW_LIST_
 #define _DARK_SIDE_WINDOW_LIST_

 #include <darksidewm.h>

 typedef struct ds_list {
 	struct darksidewindow ds_window;
 	struct ds_list  *next_window;
 } WindowList;

 void Add_elt(DarkSideWindow win);
 DarkSideWindow Search_elt(Window win);

 #endif _DARK_SIDE_WINDOW_LIST_