/***************************************************************************
                          wmdisplay.h  -  description
                             -------------------
    begin                : Wed Dec 13 2000
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

#ifndef WMDISPLAY_H
#define WMDISPLAY_H


/**
  *@author Paul Lyon
  */

class WMDisplay
{
public:
	WMDisplay();
	Display * getDisplay(void);
	int getConnectionNumber(void);
	Window getRootWindow(void);
	unsigned int getScreenNumber(void);
	unsigned long getBlackPixel(void);
	unsigned long getWhitePixel(void);
	GC getGC(void);
	Colormap getColorMap(void);
	~WMDisplay();
protected:
	//unsigned long getAllPlanes(void);
	void setDisplay(Display *xdsp);
	void setDisplay(void);
	void setConnectionNumber(int num);
	void setConnectionNumber(void);
	void setRootWindow(Window r);
	void setRootWindow(void);
	void setScreenNumber(unsigned int s_num);
	void setScreenNumber(void);
	void setPixel(unsigned long white, unsigned long black);
	void setPixel(void);
	void setWhitePixel(unsigned long white);
	void setWhitePixel(void);
	void setBlackPixel(unsigned long black);
	void setBlackPixel(void);
	void setGC(GC xgc);
	void setGC(void);
	void setColorMap(Colormap clrmap);
	void setColorMap(void);
private:
	Display *display;
	int connection_number;
	Window root;
	unsigned int screen_number;
	unsigned long white_pixel;
	unsigned long black_pixel;
	GC gc;
	Colormap color_map;
	char *display_name;
};

#endif
