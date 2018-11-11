/***************************************************************************
                          elementquiz.h  -  description
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

#ifndef ELEMENTQUIZ_H
#define ELEMENTQUIZ_H

// include files for QT
#include <qstring.h>
#include <qfile.h>
#include <qtextstream.h>
#include <qmainwindow.h>
#include <qapp.h>
#include <qstatusbar.h>
#include <qmsgbox.h>
#include <qlineedit.h>
#include <qlabel.h>
#include <qcombobox.h>
#include <qpushbutton.h>
#include <qbuttongroup.h>
#include <qstrlist.h>
#include <qapp.h>

// application specific includes
#include "elementquizview.h"
#include "elementquizdoc.h"
#include "resource.h"

/*Debugging
 *on = 1
 *off = 0
 */
#define debug 1

/**
  * This Class is the base class for your application. It sets up the main
  * window and providing a menubar, toolbar
  * and statusbar. For the main view, an instance of class ElementQuizView is
  * created which creates your view.
  */
class ElementQuiz : public QMainWindow
{
  Q_OBJECT
  
  public:
    /** construtor */
    ElementQuiz();
    /** destructor */
    ~ElementQuiz();
    void initStatusBar();
    /** setup the document*/
    void initDoc();
    /** setup the mainview*/
    void initView();

  protected:
    void resizeEvent(QResizeEvent *);

  private:

    /** view is the main widget which represents your working area. The View
     * class should handle all events of the view widget.  It is kept empty so
     * you can create your view according to your application's needs by
     * changing the view class.
     */
    ElementQuizView *view;
    /** doc represents your actual document and is created only once. It keeps
     * information such as filename and does the serialization of your files.
     */
    ElementQuizDoc *doc;

};
#endif 

