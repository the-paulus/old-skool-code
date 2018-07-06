/***************************************************************************
                          brestoreview.cpp  -  description
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

#include "brestoreview.h"

BrestoreView::BrestoreView(QWidget *parent, BrestoreDoc *doc) : QWidget(parent)
{
  /** connect doc with the view*/
  connect(doc, SIGNAL(documentChanged()), this, SLOT(slotDocumentChanged()));
}

BrestoreView::~BrestoreView()
{
}

void BrestoreView::slotDocumentChanged()
{
  //TODO update the view

}
