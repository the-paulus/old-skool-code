/***************************************************************************
                          cfilebrowse.h  -  description
                             -------------------
    begin                : Tue Oct 31 2000
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

#ifndef CFILEBROWSE_H
#define CFILEBROWSE_H

#include <qwidget.h>
#include <qsplitter.h>

#include "cdirectorynode.h"

/**
  *@author Paul Lyon
  */

class CFileBrowse : public QWidget
{
public: 
	CFileBrowse(QWidget *parent=0, const char*name=0);
	~CFileBrowse();
private:
	QSplitter *split;
	QListView *lvDir;
	QListView *lvFile;
};

#endif
