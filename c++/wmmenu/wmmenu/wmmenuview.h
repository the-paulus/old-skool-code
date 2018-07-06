/***************************************************************************
                          wmmenuview.h  -  description
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

#ifndef WMMENUVIEW_H
#define WMMENUVIEW_H

// include files for QT
#include <qwidget.h>
#include <qcombobox.h>
#include <qlabel.h>
#include <qpushbutton.h>
#include <qlineedit.h>
#include <qdir.h>
#include <qcollection.h>
#include <qfile.h>

#define WMKDE 0
#define WMKDE2 1
#define WMAS 2
#define WMBB 3
#define WMGNOME 4
#define WMICEWM 5
#define WMSAWFISH 6
#define WME 7

// application specific includes
#include "wmmenudoc.h"

/**
 * This class provides an incomplete base for your application view. 
 */

class WmmenuView : public QWidget
{
  Q_OBJECT
  public:
    WmmenuView(QWidget *parent=0, WmmenuDoc* doc=0);
    ~WmmenuView();
  
  protected slots:
    void slotDocumentChanged();
    void slotConvertMenu(void);

  protected:
  	int KDEtoKDE2(void);
  	int KDEtoAfterStep(void);
  	int KDEtoBlackBox(void);
  	int KDEtoGnome(void);
  	int KDEtoIce(void);
  	int KDEtoSawFish(void);
  	int KDEtoEnlightenment(void);
  	
  	//Overloaded function
  	void resizeEvent(QResizeEvent *);
  	
  private:
  	QComboBox *cmb_to, *cmb_from;
  	QLabel *lbl_to, *lbl_from, *lbl_file;
  	QLineEdit *led_location;
  	QButton *btn_convert, *btn_quit;
  	QDir *dir_to, *dir_from;
  	QFile *file_to, *file_from;
};

#endif
