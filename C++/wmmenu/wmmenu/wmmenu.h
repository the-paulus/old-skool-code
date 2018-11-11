/***************************************************************************
                          wmmenu.h  -  description
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

#ifndef WMMENU_H
#define WMMENU_H

// include files for QT
#include <qapp.h>
#include <qmainwindow.h>
#include <qstring.h>


// application specific includes
#include "wmmenuview.h"
#include "wmmenudoc.h"

/**
  * This Class is the base class for your application. It sets up the main
  * window and providing a menubar, toolbar
  * and statusbar. For the main view, an instance of class WmmenuView is
  * created which creates your view.
  */
class WmmenuApp : public QMainWindow
{
  Q_OBJECT
  
  public:
    /** construtor */
    WmmenuApp();
    /** destructor */
    ~WmmenuApp();
    /** setup the document*/
    void initDoc();
    /** setup the mainview*/
    void initView();

  public slots:


  private:

    /** view is the main widget which represents your working area. The View
     * class should handle all events of the view widget.  It is kept empty so
     * you can create your view according to your application's needs by
     * changing the view class.
     */
    WmmenuView *view;
    /** doc represents your actual document and is created only once. It keeps
     * information such as filename and does the serialization of your files.
     */
    WmmenuDoc *doc;

};
#endif 

