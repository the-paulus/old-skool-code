/***************************************************************************
                          chemistrydoc.cpp  -  description
                             -------------------
    begin                : Tue Sep 12 20:53:25 EDT 2000
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

#include "chemistrydoc.h"

ChemistryDoc::ChemistryDoc()
{
  modified = false;
}

ChemistryDoc::~ChemistryDoc()
{
}

void ChemistryDoc::newDoc()
{
}

bool ChemistryDoc::save()
{
  return true;
}

bool ChemistryDoc::saveAs(const QString &filename)
{
  return true;
}

bool ChemistryDoc::load(const QString &filename)
{
  emit documentChanged();
  return true;
}

bool ChemistryDoc::isModified() const
{
  return modified;
}
