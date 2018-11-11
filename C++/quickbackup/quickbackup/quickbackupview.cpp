/***************************************************************************
                          quickbackupview.cpp  -  description
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

#include "quickbackupview.h"
#include <qpushbutton.h>
#include <qsize.h>
#include <stdio.h>

QuickBackupView::QuickBackupView(QWidget *parent, QuickBackupDoc *doc) : QWidget(parent)
{
  /** connect doc with the view*/
  connect(doc, SIGNAL(documentChanged()), this, SLOT(slotDocumentChanged()));
  QSize hs;
  QSplitter *h_split = new QSplitter(QSplitter::Horizontal, this);
  hs = h_split->minimumSize();
  h_split->setMinimumSize(10,10);
  fprintf(stdout, "\nheight = %i\nWidth = %i", (int)hs.height(), (int)hs.width());
  h_split->setGeometry(100,100,200,200);

  //QPushButton *btn = new QPushButton(this, "suck");

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
