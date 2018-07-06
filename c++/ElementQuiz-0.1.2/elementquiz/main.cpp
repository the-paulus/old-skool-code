/***************************************************************************
                          main.cpp  -  description
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

#include <qapplication.h>
#include <qfont.h>

#include "elementquiz.h"

int main(int argc, char *argv[])
{
  QApplication a(argc, argv);
  a.setFont(QFont("helvetica", 12));
  /* uncomment the following line, if you want a Windows 95 look*/
  a.setStyle(WindowsStyle);
    
  ElementQuiz *elementquiz=new ElementQuiz();
  elementquiz->resize(370,260);
  a.setMainWidget(elementquiz);

  elementquiz->setCaption("Element Quiz v0.1.2");
  elementquiz->show();

  return a.exec();
}
