/***************************************************************************
                          brestoredoc.cpp  -  description
                             -------------------
    begin                : Sat Apr 28 03:01:55 CDT 2001
    copyright            : (C) 2001 by Paul Lyon
    email                : paulus@ticon.net
 ***************************************************************************/

/***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/

#include "brestoredoc.h"

BrestoreDoc::BrestoreDoc()
{
  modified = false;
}

BrestoreDoc::~BrestoreDoc()
{
}

void BrestoreDoc::newDoc()
{
}

bool BrestoreDoc::save()
{
  return true;
}

bool BrestoreDoc::saveAs(const QString &filename)
{
  return true;
}

bool BrestoreDoc::load(const QString &filename)
{
  emit documentChanged();
  return true;
}

bool BrestoreDoc::isModified() const
{
  return modified;
}
