/***************************************************************************
                          wmmenudoc.cpp  -  description
                             -------------------
    begin                : Sun Jul 29 03:50:44 CDT 2001
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

#include "wmmenudoc.h"

WmmenuDoc::WmmenuDoc()
{
  modified = false;
}

WmmenuDoc::~WmmenuDoc()
{
}

void WmmenuDoc::newDoc()
{
}

bool WmmenuDoc::save()
{
  return true;
}

bool WmmenuDoc::saveAs(const QString &filename)
{
  return true;
}

bool WmmenuDoc::load(const QString &filename)
{
  emit documentChanged();
  return true;
}

bool WmmenuDoc::isModified() const
{
  return modified;
}
