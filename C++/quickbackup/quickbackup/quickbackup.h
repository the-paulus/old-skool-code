/***************************************************************************
                          quickbackup.h  -  description
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

#ifndef QUICKBACKUP_H
#define QUICKBACKUP_H

// include files for QT
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include <qstring.h>
#include <qpopupmenu.h>
#include <qmainwindow.h>
#include <qaccel.h>
#include <qmenubar.h>
#include <qtoolbar.h>
#include <qpixmap.h>
#include <qtoolbutton.h>
#include <qapp.h>
#include <qstatusbar.h>
#include <qmsgbox.h>
#include <qfiledialog.h>
#include <qpaintdevice.h>

// application specific includes
#include "quickbackupview.h"
#include "quickbackupdoc.h"
#include "resource.h"

/**
  * This Class is the base class for your application. It sets up the main
  * window and providing a menubar, toolbar
  * and statusbar. For the main view, an instance of class QuickBackupView is
  * created which creates your view.
  */
class QuickBackup : public QMainWindow
{
  Q_OBJECT
  
  public:
    QuickBackup();
    ~QuickBackup();
    void initMenuBar();
    void initToolBar();
    void initStatusBar();
    void initDoc();
    void initView();
  
    bool queryExit();
  
  public slots:
    void statusCallback(int id_);

    void slotFileNew(void);
    void slotFileOpen(void);
    void slotFileSave(void);
    void slotFileSaveAs(void);
    void slotFileClose(void);
    void slotFileQuit(void);

    void slotBackupAdd(void);
    void slotBackupDelete(void);
    void slotBackupRefresh(void);
    void slotBackupOptions(void);
    void slotBackupBackup(void);

    void slotHelpAbout(void);
    void slotHelpHomePage(void);
  
    void slotStatusHelpMsg(const QString &text);
  
  private:
    QuickBackupView *view;
    QuickBackupDoc *doc;
  
    QPopupMenu *mnuFile;
    QPopupMenu *mnuBackup;
    QPopupMenu *mnuHelp;
    QToolBar *toolbar;
};
#endif 

