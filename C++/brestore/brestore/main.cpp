/***************************************************************************
                          main.cpp  -  description
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

#include <qapplication.h>
#include <qfont.h>

#include "brestore.h"

int main(int argc, char *argv[])
{
  QApplication a(argc, argv);
  a.setFont(QFont("helvetica", 12));
  /* uncomment the following line, if you want a Windows 95 look*/
  // a.setStyle(WindowsStyle);
    
  Brestore *brestore=new Brestore();
  a.setMainWidget(brestore);

  brestore->setCaption("Document 1");
  brestore->show();

  return a.exec();
}
