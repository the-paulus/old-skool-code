#include "CMain.h"

#include "ark.xpm" /*ark_xpm*/
#include "fileopen.xpm" /*fileopen*/
#include "filenew.xpm" /*filenew*/
#include "kfm_trash.xpm" /*trash2*/
#include "package.xpm" /*package*/
#include "Jrecycle.xpm" /*rec_xpm*/
#include "filesave.xpm" /*filesave*/
#include "mini-ark.xpm" /*ark*/

CMain::CMain()
{
   initMenuBar();
   initToolBar();
   initStatusBar();
   
   initDoc();
   initView();
}

CMain::~CMain()
{
}

void CMain::initMenuBar(void)
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
   mnuFIle->insertItem("&Close", this, SLOT(slotFileClose()), CTRL+Key_W, ID_FILE_CLOSE);
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
   mnuBackup = new QPopupMenu();
   mnuBackup->insertItem("About", this, SLOT(slotHelpAbout()), 0, ID_HELP_ABOUT);
   mnuBackup->insertItem("Home Page", this, SLOT(slotHelpHomePage()), 0, ID_HELP_HOMEPAGE);
   
   menuBar()->insertItem("&File", mnuFile);
   menuBar()->insertItem("&Backup", mnuBackup);
   menuBar()->insertItem("&Help", mnuHelp);
   
   connect(mnuFile, SIGNAL(highlighted(int)), SLOT(statusCallback(int)));
   connect(mnuBackup, SIGNAL(highlighted(int)), SLOT(statusCallback(int)));
   connect(mnuHelp, SIGNAL(highlighted(int)), SLOT(statusCallback(int)));
}

void CMain::initToolBar(void)
{
   QPixmap icoOpen;
   QPixmap icoNew;
   QPixmap icoSave;
   QPixmap icoArch;
   QPixmap icoAdd;
   QPixmap icoDelete;
   QPixmap icoRefresh;
   
   fileToolbar = new QToolBar(this, "toolbar");
   
   icoOpen = QPixmap(fileopen);
   icoNew = QPixmap(filenew);
   icoSave = QPixmap(filesave);
   icoArch = QPixmap(package);
   icoAdd = QPixmap(ark_xpm);
   icoDelete = QPixmap(trash2);
   icoRefresh = QPixmap(rec_xpm);
   
   QToolButton *tbnNew = new QToolButton(icoNew, "New Archive", 0, this, SLOT(slotFileNew()), toolbar);
   QToolButton *tbnOpen = new QToolButton(icoOpen, "Open Archive", 0, this, SLOT(slotFileOpen()), toolbar);
   QToolButton *tbnSave = new QToolButton(icoSave, "Save Archive", 0, this, SLOT(slotFileSave()), toolbar);
   toolbar->addSeparator();
   QToolButton *tbnAdd = new QToolButton(icoAdd, "Add File or Directory", 0, this, SLOT(slotBackupAdd()), toolbar);
   QToolButton *tbnDelete = new QToolButton(icoDelete, "Delete File or Directory", 0, this, SLOT(slotBackupDelete()), toolbar);
   QToolButton *tbnRefresh = new QToolButton(icoRefresh, "Refreshs view", 0, this, SLOT(slotBackupRefresh()), toolbar);
   QToolButton *tbnBackup = new QToolButton(icoBackup, "Write backup archive", 0, this, SLOT(slotBackupBackup()), toolbar);
}

void CMain::initStatusBar(void)
{
   statusbar()->message(IDS_STATUS_DEFAULT, 2000);
}

void CMain::initDoc(void)
{
   doc = new CQBackupDoc();
}

void CMain::initView(void)
{
   view = new CQBackupView(this, doc);
   setCentralWidget(view);
}

bool CMain::queryExit(void)
{
   switch(QMessageBox::information(this, "Quit...", "Do you really want to quit?", QMessageBox::Yes, QMessageBox::No))
     {
      case QMessageBox::Yes:
	return 1;
	break;
      case QMessageBox::No:
	return 0;
	break;
     }
}

void CMain::slotFileNew(void)
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
	     statusBar()->Message(IDS_STATUS_DEFAULT);
	     break;
	   case QMessageBox::No:
	     break;
	  }
     }
}

void CMain::slotFileOpen(void)
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

void CMain::slotFileSave(void)
{
   statusBar()->message("Saving file...");
   doc->save();
   statusBar()->message(IDS_STATUS_DEFAULT);
}

void CMain::slotFileSaveAs(void)
{
   QString tmp = QFileDialog::getSaveFileName(0,0,this);
   statusBar()->message("Saving file under a new name.");
   
   if(!tmp.isEmpty())
	doc->saveAs(tmp);
   else
     statusBar()->message("Error saving file...", 2000);
   
   statusBar()->message(IDS_STATUS_DEFAULT);
}

void CMain::slotFileClose(void)
{
   statusBar()->message("Closing file...");
   statusBar()->message(IDS_STATUS_DEFAULT);
}

void CMain::slotFileQuit(void)
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

void CMain::slotHelpAbout(void)
{
   QMessageBox::about(this, "About...", IDS_APP_ABOUT);
}

void CMain::slotHelpHomePage(void)
{
}

void CMain::slotStatusHelpMsg(const QString &text)
{
   statusBar()->message(text, 2000);
}

void CMain::statusCallback(int id_)
{
   switch(id_)
     {
      case ID_FILE_NEW:
	slotStatusHelpMsg("New backup file");
	break;
      case ID_FILE_OPEN:
	slotStatuHelpMsg("Open a backup file");
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
   
