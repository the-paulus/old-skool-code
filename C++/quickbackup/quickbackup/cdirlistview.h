/***************************************************************************
                          cdirlistview.h  -  description
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

#ifndef CDIRLISTVIEW_H
#define CDIRLISTVIEW_H

#include "cdirectorynode.h"
#include <qlist.h>
#include <qwidget.h>
/**
  *@author Paul Lyon
  */

class CDirListView : public QListView
{
public: 
	CDirListView(QWidget *parent=0, const char *name=0);
	QString fullName();
	~CDirListView();
signals:
	/*virtual void selectionChanged();
	virtual void selectionChanged(QListViewItem *);
	virtual void currentChanged(QListViewItem *);
	virtual void doubleClicked(QListViewItem *);
	virtual void returnPressed(QListViewItem *);
	virtual void rightButtonClicked(QListView *);
	virtual void rightButtonPressed(QListView *); */
private:
	QFileInfoList filelist;
};

#endif
