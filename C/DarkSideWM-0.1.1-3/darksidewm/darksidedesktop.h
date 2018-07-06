/***************************************************************************
                          darksidedesktop.h  -  description
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

 #ifndef _DARK_SIDE_DESKTOP_H_
 #define _DARK_SIDE_DESKTOP_H_

 typedef struct desktop {
 	struct ds_list list_start;
 	struct desktop *next;
 } Desktop;

 #endif