/***************************************************************************
                          chemistryview.h  -  description
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

#ifndef CHEMISTRYVIEW_H
#define CHEMISTRYVIEW_H

// include files for QT
#include <qwidget.h>
#include <qfile.h>
#include <qlineedit.h>
#include <qpushbutton.h>
#include <qlabel.h>
#include <qcheckbox.h>
#include <qcombobox.h>
// application specific includes
#include "chemistrydoc.h"

/**
 * This class provides an incomplete base for your application view. 
 */

class ChemistryView : public QWidget
{
  Q_OBJECT
  public:
    ChemistryView(QWidget *parent=0, ChemistryDoc* doc=0);
    ~ChemistryView();
  
  protected slots:
    void slotDocumentChanged();

  private:
  	QFile *chemfile;
  	QLineEdit *number,
  			*symbol,
  			*mass;
  	QComboBox *ename;
  	QPushButton *start, *quit;
  	QLabel *status;
  	QCheckBox *oNumber, *oMass, *oSymbol, *oName;
  	//QGroupBox *gFrame;
  
};

#endif
