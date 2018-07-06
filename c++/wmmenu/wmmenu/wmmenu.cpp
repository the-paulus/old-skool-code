/***************************************************************************
                          wmmenu.cpp  -  description
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

#ifdef HAVE_CONFIG_H
#include <config.h>
#endif

#include <qaccel.h>
#include "wmmenu.h"
#include "filesave.xpm"
#include "fileopen.xpm"
#include "filenew.xpm"

WmmenuApp::WmmenuApp()
{
  setCaption(tr("Wmmenu " VERSION));

  ///////////////////////////////////////////////////////////////////
  // call inits to invoke all other construction parts
  initDoc();
  initView();

}

WmmenuApp::~WmmenuApp()
{
}

void WmmenuApp::initDoc()
{
   doc=new WmmenuDoc();
}

void WmmenuApp::initView()
{
  ////////////////////////////////////////////////////////////////////
  // set the main widget here
  view=new WmmenuView(this, doc);
  setCentralWidget(view);
}




