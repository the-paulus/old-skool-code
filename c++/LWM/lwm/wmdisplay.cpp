/***************************************************************************
                          wmdisplay.cpp  -  description
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

#include "wmdisplay.h"

WMDisplay::WMDisplay()
{
	Display *dsp;
	Window root;
	int screen_num;
	char *dsp_name;
	int con_num;
	GC deGC;
	Colormap colrm;
	
	if((dsp = XOpenDisplay(dsp_name)) == NULL)
		exit(1);
	screen_num = DefaultScreen(dsp);
	root = RootWindow(dsp, screen_num);
	
	black_pixel = XBlackPixel(dsp, screen_num);
	white_pixel = XWhitePixel(dsp, screen_num);
	con_number = XConnectionsNumber(dsp);
	deGC = DefaultGC(dsp, screen_num);
	colrm = DefaultColormap(dsp, screen_num);
	
	setDisplay(dsp);
	setScreenNumber(screen_num);	
	setRootWindow(root);
	setPixel(white_pixel, black_pixel);
	setConnectionNumber(con_number);
	setGC(deGC);
	setColorMap(colrm);
}

unsigned long WMDisplay::getBlackPixel(void)
{
	return (black_pixel);
}

Colormap WMDisplay::getColorMap(void)
{
	return (color_map);
}

int WMDisplay::getConnectionNumber(void)
{
	return (connection_number);
}

Display *WMDisplay::getDisplay(void)
{
	return (display);
}

GC WMDisplay::getGC(void)
{
	return (gc);
}

Window WMDisplay::getRootWindow(void)
{
	return (root);
}

unsigned int WMDisplay::getScreenNumber(void)
{
	return (screen_number);
}

WMDisplay::~WMDisplay()
{
}

void WMDisplay::setBlackPixel(void)
{
	black_pixel = XBlackPixel(display, screen_number);
}

void WMDisplay::setBlackPixel(unsigned long black)
{
	black_pixel = black;
}

void WMDisplay::setColorMap(void)
{
	color_map = DefaultColormap(display, screen_number);
}

void WMDisplay::setColorMap(Colormap clrmap)
{
	color_map = clrmap;
}

void WMDisplay::setConnectionNumber(void)
{
	connection_number = XConnectionNumber(display);
}
	
void WMDisplay::setConnectionNumber(int num)
{
	connection_number = num;
}

void WMDisplay::setDisplay(void)
{
	if((display = XOpenDisplay(display_name)) == NULL)
		exit(1);
}

void WMDisplay::setDisplay(Display *xdsp)
{
	display = xdsp;
}

void WMDisplay::setGC(void)
{
	gc = DefaultGC(display, screen_number);
}

void WMDisplay::setGC(GC xgc)
{
   gc = xgc;
}

void WMDisplay::setPixel(void)
{
	black_pixel = XBlackPixel(display, screen_number);
	white_pixel = XWhitePixel(display, screen_number);
}

void WMDisplay::setPixel(unsigned long white, unsigned long black)
{
	black_pixel = black;
	white_pixel = white;
}

void WMDisplay::setRootWindow(Window r)
{
	root = r;
}

void WMDisplay::setRootWindow(void)
{
	root = RootWindow(display, screen_number);
}

void WMDisplay::setScreenNumber(void)
{
	screen_number = DefaultScreen(display);
}

void WMDisplay::setScreenNumber(unsigned int s_num)
{
	screen_number = s_num;
}

void WMDisplay::setWhitePixel(unsigned long white)
{
	white_pixel = white;
}

void WMDisplay::setWhitePixel(void)
{
	white_pixel = XWhitePixel(display, screen_number);
}
