/***************************************************************************
                          quickbackup.cpp  -  description
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

#include "quickbackup.h"

/*#include "ark.xpm" ark_xpm*/
#include "fileopen.xpm" /*fileopen*/
#include "filenew.xpm" /*filenew*/
/*#include "kfm_trash.xpm" trash2*/
/*#include "package.xpm" package*/
/*#include "Jrecycle.xpm" rec_xpm*/
#include "filesave.xpm" /*filesave*/
/*#include "mini-ark.xpm" ark*/
QuickBackup::QuickBackup()
{
  setCaption("QuickBackup " VERSION);
  
  ///////////////////////////////////////////////////////////////////
  // call inits to invoke all other construction parts
  initMenuBar();
  initToolBar();
  initStatusBar();

  initDoc();
  initView();  
}

QuickBackup::~QuickBackup()
{
}

void QuickBackup::initMenuBar(void)
{
  /********************************************
    * Menu Bar entry mnuFile
    * ******************************************/
   mnuFile = new QPopupMenu();
   mnuFile->insertItem("&New", this, SLOT(slotFileNew()), CTRL+Key_N, ID_FILE_NEW);
   mnuFile->insertItem("&Open", this, SLOT(slotFileOpen()), CTRL+Key_O, ID_FILE_OPEN);
   mnuFile->insertSeparator();
   mnuFile->insertItem("&Save", this, SLOT(slotFileSave()), CTRL+Key_S, ID_FILE_SAVE);
   mnuFile->insertItem("Save &As..", this, SLOT(slotFileSaveAs()), 0, ID_FILE_SAVE_AS);
   mnuFile->insertItem("&Close", this, SLOT(slotFileClose()), CTRL+Key_W, ID_FILE_CLOSE);
   mnuFile->insertSeparator();
   mnuFile->insertItem("E&xit", this, SLOT(slotFileQuit()), CTRL+Key_Q, ID_FILE_QUIT);

   /********************************************
    * Menu Bar entry mnuBackup
    * ******************************************/
   mnuBackup = new QPopupMenu();
   mnuBackup->insertItem("Add File/Directory", this, SLOT(slotBackupAdd()), 0, ID_BACKUP_ADD);
   mnuBackup->insertItem("Delete File/Directory", this, SLOT(slotBackupDelete()), 0 , ID_BACKUP_DELETE);
   mnuBackup->insertSeparator();
   mnuBackup->insertItem("Refresh", this, SLOT(slotBackupRefresh()), 0, ID_BACKUP_REFRESH);
   mnuBackup->insertItem("Backup Now", this, SLOT(slotBackupBackup()), 0, ID_BACKUP_BACKUP);
   mnuBackup->insertSeparator();
   mnuBackup->insertItem("Options", this, SLOT(slotBackupOptions()), 0, ID_BACKUP_OPTIONS);

   /*******************************************
    * Menu Bar entry mnuHelp
    * *****************************************/
   mnuHelp = new QPopupMenu();
   mnuHelp->insertItem("About", this, SLOT(slotHelpAbout()), 0, ID_HELP_ABOUT);
   mnuHelp->insertItem("Home Page", this, SLOT(slotHelpHomePage()), 0, ID_HELP_HOMEPAGE);

   menuBar()->insertItem("&File", mnuFile);
   menuBar()->insertItem("&Backup", mnuBackup);
   menuBar()->insertItem("&Help", mnuHelp);
  
  ///////////////////////////////////////////////////////////////////
  // CONNECT THE SUBMENU SLOTS WITH SIGNALS

  connect(mnuFile, SIGNAL(highlighted(int)), SLOT(statusCallback(int)));
  connect(mnuBackup, SIGNAL(highlighted(int)), SLOT(statusCallback(int)));
  connect(mnuHelp, SIGNAL(highlighted(int)), SLOT(statusCallback(int)));
  
}

void QuickBackup::initToolBar(void)
{
  ///////////////////////////////////////////////////////////////////
  // TOOLBAR
  QPixmap icoOpen;
  QPixmap icoNew;
  QPixmap icoSave;
  QPixmap icoArch;
  QPixmap icoAdd;
  QPixmap icoDelete;
  QPixmap icoRefresh;

  toolbar = new QToolBar(this);

  icoOpen = QPixmap(fileopen);
  icoNew = QPixmap(filenew);
  icoSave = QPixmap(filesave);
  icoArch = QPixmap("package.xpm");
  icoAdd = QPixmap("ark.xpm");
  icoDelete = QPixmap("kfm_trash.xpm");
  icoRefresh = QPixmap("Jrecycle.xpm");

  QToolButton *tbnNew = new QToolButton(icoNew, "New Archive", 0, this, SLOT(slotFileNew()), toolbar);
  QToolButton *tbnOpen = new QToolButton(icoOpen, "Open Archive", 0, this, SLOT(slotFileOpen()), toolbar);
  QToolButton *tbnSave = new QToolButton(icoSave, "Save Archive", 0, this, SLOT(slotFileSave()), toolbar);
  toolbar->addSeparator();
  QToolButton *tbnAdd = new QToolButton(icoAdd, "Add File or Directory", 0, this, SLOT(slotBackupAdd()), toolbar);
  QToolButton *tbnDelete = new QToolButton(icoDelete, "Delete File or Directory", 0, this, SLOT(slotBackupDelete()), toolbar);
  QToolButton *tbnRefresh = new QToolButton(icoRefresh, "Refreshs view", 0, this, SLOT(slotBackupRefresh()), toolbar);
  QToolButton *tbnBackup = new QToolButton(icoArch, "Write backup archive", 0, this, SLOT(slotBackupBackup()), toolbar);
}

void QuickBackup::initStatusBar(void)
{
  ///////////////////////////////////////////////////////////////////
  //STATUSBAR
  statusBar()->message(IDS_STATUS_DEFAULT, 2000);
}

void QuickBackup::initDoc(void)
{
   doc=new QuickBackupDoc();
}

void QuickBackup::initView(void)
{ 
  ////////////////////////////////////////////////////////////////////
  // set the main widget here
  view=new QuickBackupView(this, doc);
  setCentralWidget(view);
}

bool QuickBackup::queryExit(void)
{
  int exit=QMessageBox::information(this, "Quit...",
                                    "Do your really want to quit?",
                                    QMessageBox::Ok, QMessageBox::Cancel);

  if (exit==1)
  {
     qApp->quit();
  }
  else
  {

  };

  return (exit==1);
}

/////////////////////////////////////////////////////////////////////
// SLOT IMPLEMENTATION
/////////////////////////////////////////////////////////////////////


void QuickBackup::slotFileNew(void)
{
  if(!doc->isModified())
   {
      statusBar()->message("Creating new file...");
      doc->newDoc();
      statusBar()->message(IDS_STATUS_DEFAULT);
   }
   else
     {
	switch(QMessageBox::information(this, "New File", "Do you want to discard the unsaved changes before you start a new file?", QMessageBox::Yes, QMessageBox::No))
	  {
	   case QMessageBox::Yes:
	     statusBar()->message("Creating new file without saving changes...");
	     doc->newDoc();
	     statusBar()->message(IDS_STATUS_DEFAULT);
	     break;
	   case QMessageBox::No:
	     break;
	 }
   }
}

void QuickBackup::slotFileOpen(void)
{
  statusBar()->message("Opening file...");

   QString filename = QFileDialog::getOpenFileName(0,0,this);
   if(!filename.isEmpty())
     {
	doc->load(filename);
	QString tmp = "Quick Backup: " + filename;
	setCaption(tmp);
	tmp = "Loaded " + filename + " successfully.";
	statusBar()->message(tmp, 2000);
     }
   else
     {
	statusBar()->message("Error opening file...", 2000);
     }
}


void QuickBackup::slotFileSave(void)
{
  statusBar()->message("Saving file...");
   doc->save();
   statusBar()->message(IDS_STATUS_DEFAULT);
}

void QuickBackup::slotFileSaveAs(void)
{
  QString tmp = QFileDialog::getSaveFileName(0,0,this);
   statusBar()->message("Saving file under a new name.");

   if(!tmp.isEmpty())
	doc->saveAs(tmp);
   else
     statusBar()->message("Error saving file...", 2000);

   statusBar()->message(IDS_STATUS_DEFAULT);
}

void QuickBackup::slotFileClose(void)
{
  statusBar()->message("Closing file...");

  statusBar()->message(IDS_STATUS_DEFAULT);
}

void QuickBackup::slotFileQuit(void)
{ 
  statusBar()->message("Goodbye...");

   if(doc->isModified())
     {
	switch(QMessageBox::information(this, "Goodbye", "Do you wish to save changes before exiting?", QMessageBox::Yes, QMessageBox::No))
	  {
	   case QMessageBox::Yes:
	     doc->save();
	     break;
	   case QMessageBox::No:
	     qApp->quit();
	  }
     } else
     qApp->quit();
}

void QuickBackup::slotHelpAbout(void)
{
  QMessageBox::about(this,"About...",
                     IDS_APP_ABOUT );
}

void QuickBackup::slotHelpHomePage(void)
{
}

void QuickBackup::slotStatusHelpMsg(const QString &text)
{
  ///////////////////////////////////////////////////////////////////
  // change status message of whole statusbar temporary (text, msec)
  statusBar()->message(text, 2000);
}

void QuickBackup::statusCallback(int id_)
{
  switch (id_)
  {
    case ID_FILE_NEW:
	slotStatusHelpMsg("New backup file");
	break;
      case ID_FILE_OPEN:
	slotStatusHelpMsg("Open a backup file");
	break;
      case ID_FILE_SAVE:
	slotStatusHelpMsg("Save backup file");
	break;
      case ID_FILE_SAVE_AS:
	slotStatusHelpMsg("Save backup file under a new name");
	break;
      case ID_FILE_CLOSE:
	slotStatusHelpMsg("Closes the actual document");
	break;
      case ID_FILE_QUIT:
	slotStatusHelpMsg("Quit");
	break;
      case ID_BACKUP_ADD:
	slotStatusHelpMsg("Add file to archive");
	break;
      case ID_BACKUP_DELETE:
	slotStatusHelpMsg("Deletes file from archive");
	break;
      case ID_BACKUP_REFRESH:
	slotStatusHelpMsg("Refreshs view");
	break;
      case ID_BACKUP_OPTIONS:
	slotStatusHelpMsg("Displays options");
	break;
      case ID_BACKUP_BACKUP:
	slotStatusHelpMsg("Writes the archive");
	break;
      case ID_HELP_ABOUT:
	slotStatusHelpMsg("About this program");
	break;
      case ID_HELP_HOMEPAGE:
	slotStatusHelpMsg("Visit home page");
	break;
  }
}

void QuickBackup::slotBackupAdd(void)
{
}

void QuickBackup::slotBackupDelete(void)
{
}

void QuickBackup::slotBackupRefresh(void)
{
}

void QuickBackup::slotBackupOptions(void)
{
}

void QuickBackup::slotBackupBackup(void)
{
}
