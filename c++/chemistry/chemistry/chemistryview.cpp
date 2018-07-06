/***************************************************************************
                          chemistryview.cpp  -  description
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

#include "chemistryview.h"

ChemistryView::ChemistryView(QWidget *parent, ChemistryDoc *doc) : QWidget(parent)
{
  chemfile = new QFile("chem.key");
  //gFrame = new QGroupBox("Chemical Element",this);
  number = new QLineEdit(this);
  number->setFont(QFont("Times", 14, QFont::Bold));
  number->setMaxLength(3);
  number->setGeometry(8,8,32,24);

  mass = new QLineEdit(this);
  mass->setFont(QFont("Times", 14, QFont::Bold));
  mass->setGeometry(108,8,64,24);

  symbol = new QLineEdit(this);
  symbol->setFont(QFont("Times", 18, QFont::Bold));
  int tmp = 108 + 64;
  tmp = tmp / 4;
  symbol->setGeometry(tmp, symbol->y()+16, 64, 32);

  //ename = new QComboBox(FALSE, this);
  //mass = new QLineEdit(this);

  //symbol = new QLineEdit(this);

  /** connect doc with the view*/
  connect(doc, SIGNAL(documentChanged()), this, SLOT(slotDocumentChanged()));
}

ChemistryView::~ChemistryView()
{
}

void ChemistryView::slotDocumentChanged()
{
  //TODO update the view

}
