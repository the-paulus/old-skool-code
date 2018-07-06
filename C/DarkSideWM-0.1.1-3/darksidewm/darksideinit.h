/***************************************************************************
                          darksideinit.h  -  description
                             -------------------
    begin                : Fri Jul 21 2000
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

 #ifndef _DARK_SIDE_INIT_H_
 #define _DARK_SIDE_INIT_H_

 #include <darksidewm.h>

 ImlibData *ds_imlib_data;
 GC *gc_xor;

 void init_misc(void);
 /*initlib(Display *dsp);*/

 #endif _DARK_SIDE_INIT_H_