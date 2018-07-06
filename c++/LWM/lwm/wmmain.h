/***************************************************************************
                          wmmain.h  -  description
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

#ifndef WMMAIN_H
#define WMMAIN_H


/**
  *@author Paul Lyon
  */

class WMMain
{
public: 
	WMMain(const char *log);
	WMMain();
	~WMMain();
protected:
	//unsigned int init(void);
	void exec(void);
private:
	WMRootWindow *root;
	WMMenu *menu;
	WMScreen *screen;
};

#endif
