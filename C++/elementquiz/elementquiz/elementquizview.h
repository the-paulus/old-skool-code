/***************************************************************************
                          elementquizview.h  -  description
                             -------------------
    begin                : Wed Sep 20 15:55:34 EDT 2000
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

#ifndef ELEMENTQUIZVIEW_H
#define ELEMENTQUIZVIEW_H

// include files for QT
#include <qwidget.h>
#include <qlineedit.h>
#include <qcombobox.h>
#include <qcheckbox.h>
#include <qradiobutton.h>
#include <qpushbutton.h>
#include <qmsgbox.h>
#include <qfile.h>
#include <qstring.h>
#include <qlabel.h>
#include <qapp.h>
#include <qtextstream.h>
#include <stdlib.h>
#include <qbuttongroup.h>
#include <qmessagebox.h>

// application specific includes
#include "elementquizdoc.h"


/**
 * This class provides an incomplete base for your application view. 
 */

//void generate(void);

struct ElementData {
	unsigned int atomic_number;
	unsigned int current_number;
	float atomic_mass;
	QString symbol;
	QString name;
};

struct ElementList {
	unsigned int current;
	QString name;
	ElementList *next;
};

class ElementQuizView : public QWidget
{
  Q_OBJECT
  public:
    ElementQuizView(QWidget *parent=0, ElementQuizDoc* doc=0);
    ~ElementQuizView();

  protected:
  	/*ElementData decrypt(const char *data);
  	ElementData encrypt(const char *data);
  	ElementData encrypt(QString *data); */

  protected slots:
    	void slotDocumentChanged();
  /** Randomly picks another element */
    	void slotNext(void);
  /** shows the correct answer, then picks
another element at random. */
  	void slotShowAnswer(void);	

  private:
  	QLineEdit 		*lneAtomicNumber,
  					*lneAtomicMass,
  					*lneSymbol;
  	QComboBox			*cmbName;
  	QRadioButton		*rdoName,
  					//*chbAtomicMass,
  					*rdoSymbol,
  					*rdoAtomicNumber;
  	QPushButton		*pbOK,
  					*pbAns,
  					*pbQuit;
  	QLabel			*lblAtomicNumber,
  					*lblAtomicMass,
  					*lblSymbol,
  					*lblQuiz,
  					*lblName;
  	QButtonGroup		*btnGroup;
  	ElementData		input,
  					correct;
  	//QFile 			*fChem;
  	unsigned int 		number_elements;
};

#endif
