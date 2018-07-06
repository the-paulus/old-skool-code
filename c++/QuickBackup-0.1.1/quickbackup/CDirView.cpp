#include "CDirView.h"
#include <qdir.h>
#include <qfile.h>
#include <qfileinfo.h>

CDirView::CDirView(CDirView *parent, const char *filename) : QListViewItem(parent), f(filename)
{
   p = parent;
   readable = true;
}

CDirView::CDirView(QListView *parent) : QListViewItem(parent), f("/")
{
   p = 0;
   readable = true;
}

void CDirView::setOpen(bool o)
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
	     while((f=it.current() != 0)
		   {
		      ++it;
		      if(f->fileName() == "." || f->fileName() == "..")
			; //nothing
		      else if(f->isSymLink())
			; //nothing
		      else if(f->isDir())
			new CDirView(this, f->fileName());
		      else 
			new QListViewItem(this, (const char*)f->fileName(), f->isFile() ? "File" : "Special", 0); 
		   }
	       }
	  }
	QListViewItem::setOpen(o);
     }

   void CDirView::setup(void)
     {
	setExpandable(TRUE);
	QListViewItem::setup();
     }
   
   QString CDirView::fullName(void)
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
   
   const char * CDirView::text(int column) const
     {
	if (column == 0)
	  return f.name();
	else if (readable)
	  return "Directory";
	else
	  return "Private";
     }
