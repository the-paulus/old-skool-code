/***************************************************************************
                          elementquizview.h  -  description
                             -------------------
    begin                : Sun Oct 17 21:52:05 EDT 1999
    copyright            : (C) 1999 by Paul Lyon
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

#ifndef ELEMENTQUIZVIEW_H
#define ELEMENTQUIZVIEW_H

// include files for QT
#include <qwidget.h>

#include <qlineedit.h>
#include <qcombobox.h>
#include <qlabel.h>
#include <qpushbutton.h>
#include <qbuttongroup.h>
#include <qradiobutton.h>
#include <qstring.h>
#include <qapp.h>
#include <qmessagebox.h>
#include <string.h>
#include <qstrlist.h>
#include <qfile.h>
#include <qtextstream.h>
#include <qstatusbar.h>
#include <qlist.h>
#include <stdio.h>
#include <stdlib.h>

// application specific includes
#include "elementquizdoc.h"

/**
 * This class provides an incomplete base for your application view. 
 */

class ElementQuizView : public QWidget
{
  Q_OBJECT
  public:
    ElementQuizView(QWidget *parent=0, ElementQuizDoc* doc=0);
    ~ElementQuizView();

  protected slots:
    void slotNext(void);
    void slotShowAnswer(void);

  private:
  	QLineEdit *lneAtomicMass;
     QLineEdit *lneAtomicNumber;
     QLineEdit *lneSymbol;

     QComboBox *cmbName;

     QLabel *lblAtomicMass;
     QLabel *lblAtomicNumber;
     QLabel *lblSymbol;
     QLabel *lblName;
     QLabel *lblQuiz;

     QPushButton *pbOK;
     QPushButton *pbAns;
     QPushButton *pbQuit;

     QButtonGroup *btnGroup;

     QRadioButton *rdoName;
     QRadioButton *rdoAtomicNumber;
     QRadioButton *rdoSymbol;

     QString name;
     QString symbol;
     QStrList list;
     QFile *fChem;
     QTextStream *ts;
     QString mass;
     QString number;

     unsigned int number_correct;
     unsigned int number_wrong;
     unsigned int total;
     unsigned int elements;
     int show;
     ElementQuizDoc Doc;

};

#endif
