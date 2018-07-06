/***************************************************************************
                          wmrootwindow.h  -  description
                             -------------------
    begin                : Tue Dec 12 2000
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

#ifndef WMROOTWINDOW_H
#define WMROOTWINDOW_H


/**Visual Plane
  *@author Paul Lyon
  */

class WMRootWindow
{
	public:
		WMRootWindow(Dispaly *dsp, unsigned int screen);
		WMRootWindow();
		~WMRootWindow();
	protected:
		
	private:
		Window root_window;
		XEvent evt;
		unsigned int screen_number;
};

#endif
