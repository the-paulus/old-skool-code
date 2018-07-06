#ifndef _CMAIN_
#define _CMAIN_

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

#include "CQBackupDoc.h"
#include "CQBackupView.h"
#include "resource.h"

class CMain : public QMainWindow
{
   Q_OBJECT
 public:
   CMain();
   ~CMain();
   void initMenuBar(void);
   void initToolBar(void);
   void initStatusBar(void);
   void initDoc(void);
   void initView(void);
   
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
   CQBackupView *view;
   CQBackupDoc *doc;
   
   QPopupMenu *mnuFile;
   QPopupMenu *mnuBackup;
   QPopupMenu *mnuHelp;
   QToolBar *toolbar;
};

#endif _CMAIN_
