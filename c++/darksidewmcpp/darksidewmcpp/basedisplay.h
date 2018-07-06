/***************************************************************************
                          basedisplay.h  -  description
                             -------------------
    begin                : Wed Jul 26 2000
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

#ifndef BASEDISPLAY_H
#define BASEDISPLAY_H

#include <X11/Xlib.h>
#include <X11/Xatom.h>

class ScreenInformation;

/**
  *@author Paul Lyon
  */

class BaseDisplay {
 private:
  struct DarkSideCursor {
    Cursor default_cursor;
    Cursor wait_cursor;
    Cursor move_cursor;
    Cursor resize_south_cursor;
    Cursor resize_north_cursor;
    Cursor resize_east_cursor;
    Cursor resize_west_cursor;
    Cursor resize_tl_cursor;
    Cursor resize_tr_cursor;
    Cursor resize_bl_cursor;
    Cursor resize_lr_cursor;
  };

public: 
	BaseDisplay();
	~BaseDisplay();
};

#endif
