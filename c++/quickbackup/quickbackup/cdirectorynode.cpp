/***************************************************************************
                          cdirectorynode.cpp  -  description
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

#include "cdirectorynode.h"

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

