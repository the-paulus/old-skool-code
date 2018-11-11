#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <qlistview.h>
#include <qstring.h>
#include <qfile.h>
#include <qdir.h>
#include <qfileinfo.h>
#include <qlist.h>
#Include <qwidget.h>
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
#include <qobject.h>
#include <qsplitter.h>
#include <qtabdialog.h>
/*#include "ark.xpm" ark_xpm*/
#include "fileopen.xpm" /*fileopen*/
#include "filenew.xpm" /*filenew*/
/*#include "kfm_trash.xpm" trash2*/
/*#include "package.xpm" package*/
/*#include "Jrecycle.xpm" rec_xpm*/
#include "filesave.xpm" /*filesave*/
/*#include "mini-ark.xpm" ark*/
#include <resource.h>
/***********************************************************************
 *                                         CDirectoryNode
 ***********************************************************************/
class CDirectoryNode : public QListViewItem
{
	public:
		CDirectoryNode(QListView *parent);
		CDirectoryNode(CDirectoryNode *parent, const char *filename);
	     	
		const char * text( int column ) const;
	
		QString fullName();
	
		void setOpen( bool );
		void setup();
	
	 private:
	 	QFile f;
	 	CDirectoryNode *p;
	 	bool readable;
};

CDirectoryNode::CDirectoryNode(QListView *parent) : QListViewItem(parent), f("/")
{
	p = 0;
	readable = true;
}
		
CDirectoryNode::CDirectoryNode(CDirectoryNode *parent, const char *filename) : QListViewItem(parent), f(filename)
{
	p = parent;
	readable = true;
}

void CDirectoryNode::setOpen(bool o)
{
	if(o && !childCount())
	{
		QString s(fullName());
		QDir thisDir(s);
		if(!thisDir.isReadable())
	  	{
	     	readable = false;
	     	return;
	  	}
	
		const QFileInfoList *files = thisDir.entryInfoList();
		if(files)
		{
	     	QFileInfoListIterator it(*files);
	     	QFileInfo *f;
	     	while((f=it.current()) != 0)
			{
		 		++it;
		     	if(f->fileName() == "." || f->fileName() == "..")
					; //nothing
		      	else if(f->isSymLink())
					new CDirectoryNode(this, f->fileName());
		      	else if(f->isDir())
					new CDirectoryNode(this, f->fileName());
		      	else
					new QListViewItem(this, (const char*)f->fileName(), f->isFile() ? "File" : "Special", 0);
		   	}
		}
	}
	QListViewItem::setOpen(o);
}

void CDirectoryNode::setup(void)
{
	setExpandable(true);
	QListViewItem::setup();
}

QString CDirectoryNode::fullName()
{
	QString s;
	if(p)
	{
		s = p->fullName();
	     s.append(f.name());
	     s.append("/");
	}else{
		s = "/";
	}
	return s;
}

const char * CDirectoryNode::text( int column ) const
{
	if ( column == 0 )
		return f.name();
	else if ( readable )
		return "Directory";
	else
		return "Unreadable Directory";
}

/**********************************************************************
 *                                   CDirListView
 **********************************************************************/
class CDirListView : public QListView
{
public: 
	CDirListView(QWidget *parent=0, const char *name=0);
	QString fullName();
	~CDirListView();
signals:
	void selectionChanged();
	void selectionChanged(QListViewItem *);
	void currentChanged(QListViewItem *);
	void doubleClicked(QListViewItem *);
	void returnPressed(QListViewItem *);
	void rightButtonClicked(QListView *);
	void rightButtonPressed(QListView *);
private:
	QFileInfoList filelist;
};

CDirListView::CDirListView(QWidget *parent, const char *name)
{
	CDirectoryNode root(this);
	insertItem(&root);
		
	QString s(fullName());
	QDir thisDir(s);
	
	const QFileInfoList *files = thisDir.entryInfoList();
	if(files)
	{
		QFileInfoListIterator it(*files);
		QFileInfo *f;
		while((f=it.current()) != 0)
		{
			++it;
			if(f->fileName() == "." | f->fileName() == "..")
				; //nothing
			else if(f->isDir())
				; //nothing
			else
				filelist.append(f);
		}
	}
}

CDirListView::~CDirListView()
{
}

void CDirListView::currentChanged(QListViewItem *)
{
	QString s(fullName());
	QDir thisDir(s);
	
	const QFileInfoList *files = thisDir.entryInfoList();
	if(files)
	{
		QFileInfoListIterator it(*files);
		QFileInfo *f;
		while((f=it.current()) != 0)
		{
			++it;
			if(f->fileName() == "." | f->fileName() == "..")
				; //nothing
			else if(f->isDir())
				; //nothing
			else
				filelist.append(f);
		}
	}
}

void CDirListView::doubleClicked(QListViewItem *)
{
	QString s(fullName());
	QDir thisDir(s);
	
	const QFileInfoList *files = thisDir.entryInfoList();
	if(files)
	{
		QFileInfoListIterator it(*files);
		QFileInfo *f;
		while((f=it.current()) != 0)
		{
			++it;
			if(f->fileName() == "." | f->fileName() == "..")
				; //nothing
			else if(f->isDir())
				; //nothing
			else
				filelist.append(f);
		}
	}
}

void CDirListView::returnPressed(QListViewItem *)
{
	QString s(fullName());
	QDir thisDir(s);
	
	const QFileInfoList *files = thisDir.entryInfoList();
	if(files)
	{
		QFileInfoListIterator it(*files);
		QFileInfo *f;
		while((f=it.current()) != 0)
		{
			++it;
			if(f->fileName() == "." | f->fileName() == "..")
				; //nothing
			else if(f->isDir())
				; //nothing
			else
				filelist.append(f);
		}
	}
}

void CDirListView::rightButtonClicked(QListView *)
{
	QString s(fullName());
	QDir thisDir(s);
	
	const QFileInfoList *files = thisDir.entryInfoList();
	if(files)
	{
		QFileInfoListIterator it(*files);
		QFileInfo *f;
		while((f=it.current()) != 0)
		{
			++it;
			if(f->fileName() == "." | f->fileName() == "..")
				; //nothing
			else if(f->isDir())
				; //nothing
			else
				filelist.append(f);
		}
	}
}

void CDirListView::rightButtonPressed(QListView *)
{
	QString s(fullName());
	QDir thisDir(s);
	
	const QFileInfoList *files = thisDir.entryInfoList();
	if(files)
	{
		QFileInfoListIterator it(*files);
		QFileInfo *f;
		while((f=it.current()) != 0)
		{
			++it;
			if(f->fileName() == "." | f->fileName() == "..")
				; //nothing
			else if(f->isDir())
				; //nothing
			else
				filelist.append(f);
		}
	}
}

void CDirListView::selectionChanged()
{
	QString s(fullName());
	QDir thisDir(s);
	
	const QFileInfoList *files = thisDir.entryInfoList();
	if(files)
	{
		QFileInfoListIterator it(*files);
		QFileInfo *f;
		while((f=it.current()) != 0)
		{
			++it;
			if(f->fileName() == "." | f->fileName() == "..")
				; //nothing
			else if(f->isDir())
				; //nothing
			else
				filelist.append(f);
		}
	}
}

void CDirListView::selectionChanged(QListViewItem *)
{
	QString s(fullName());
	QDir thisDir(s);
	
	const QFileInfoList *files = thisDir.entryInfoList();
	if(files)
	{
		QFileInfoListIterator it(*files);
		QFileInfo *f;
		while((f=it.current()) != 0)
		{
			++it;
			if(f->fileName() == "." | f->fileName() == "..")
				; //nothing
			else if(f->isDir())
				; //nothing
			else
				filelist.append(f);
		}
	}
}

QString CDirListView::fullName()
{
	QString path;
	QString t;
	QString last = currentItem()->text(0);
	
	while(!t.isNull())
	{
		t = currentItem()->parent()->text(0);
		t.append("/");
		if(t == "/")
			t = "/";
		path.insert(1, t);
	}
	
	path.append(last);
	return path;
}

/***********************************************************************
 *                                      QuickBackup
 ***********************************************************************/
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

/******************************************************************
 *                          QuickBackupDoc
 ******************************************************************/
class QuickBackupDoc : public QObject
{
  Q_OBJECT

  public:
    QuickBackupDoc();
    ~QuickBackupDoc();
    void newDoc();
    bool save();
    bool saveAs(const QString &filename);
    bool load(const QString &filename);
    bool isModified() const;

  signals:
    void documentChanged();

  protected:
    bool modified;
};

QuickBackupDoc::QuickBackupDoc()
{
  modified = false;
}

QuickBackupDoc::~QuickBackupDoc()
{
}

void QuickBackupDoc::newDoc()
{
}

bool QuickBackupDoc::save()
{
  return true;
}

bool QuickBackupDoc::saveAs(const QString &filename)
{
  return true;
}

bool QuickBackupDoc::load(const QString &filename)
{
  emit documentChanged();
  return true;
}

bool QuickBackupDoc::isModified() const
{
  return modified;
}

/********************************************************************
 *                                      QuickBackupView
**********************************************************************/
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

QuickBackupView::QuickBackupView(QWidget *parent, QuickBackupDoc *doc) : QWidget(parent)
{
  /** connect doc with the view*/
  connect(doc, SIGNAL(documentChanged()), this, SLOT(slotDocumentChanged()));
  
  QSplitter *h_split = new QSplitter(QSplitter::Horizontal, this);
  
  /*h_splitter = new QSplitter(parent);
  h_splitter->setOrientation(QSplitter::Horizontal);

  v_splitter = new QSplitter(parent);
  v_splitter->setOrientation(QSplitter::Vertical);

  lvDir = new CDirListView(v_splitter);
  lvFile = new QListView(v_splitter);
  lvBkList = new QListView(h_splitter);  */

}

QuickBackupView::~QuickBackupView()
{
}

void QuickBackupView::slotDocumentChanged()
{
  //TODO update the view

}
