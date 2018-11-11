/***************************************************************************
                          quickbackupview.h  -  description
                             -------------------
    begin                : Tue Oct 31 19:27:07 EST 2000
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

#ifndef QUICKBACKUPVIEW_H
#define QUICKBACKUPVIEW_H

// include files for QT
#include <qwidget.h>
#include <qsplitter.h>
#include <qtabdialog.h>
#include <qmsgbox.h>
#include <qlistview.h>
#include <qdir.h>
#include <qfile.h>
#include <qstring.h>
#include <qfileinfo.h>

// application specific includes
#include "quickbackupdoc.h"
#include "cdirlistview.h"
/**
 * This class provides an incomplete base for your application view. 
 */

class QuickBackupView : public QWidget
{
  Q_OBJECT
  public:
    QuickBackupView(QWidget *parent=0, QuickBackupDoc* doc=0);
    ~QuickBackupView();
  
  protected slots:
    void slotDocumentChanged();

  private:
  	/*QSplitter *h_splitter;
  	QSplitter *v_splitter; */
  	CDirListView *lvDir;
  	QListView *lvFile;
  	QListView *lvBkList;
};

#endif
