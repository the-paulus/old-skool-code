/***************************************************************************
                          cdirectorynode.h  -  description
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

#ifndef CDIRECTORYNODE_H
#define CDIRECTORYNODE_H

#include <qlistview.h>
#include <qstring.h>
#include <qfile.h>
#include <qdir.h>
#include <qfileinfo.h>

/**
  *@author Paul Lyon
  */

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

#endif
