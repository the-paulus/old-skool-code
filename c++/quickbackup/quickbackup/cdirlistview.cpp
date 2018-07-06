/***************************************************************************
                          cdirlistview.cpp  -  description
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

#include "cdirlistview.h"

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

/*void CDirListView::currentChanged(QListViewItem *)
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
}                                                */

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