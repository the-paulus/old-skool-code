/***************************************************************************
                          quickbackupdoc.cpp  -  description
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

#include "quickbackupdoc.h"

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
