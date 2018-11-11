/***************************************************************************
                          main.cpp  -  description
                             -------------------
    begin                : Tue Oct 31 19:27:07 EST 2000
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

#include <qapplication.h>
#include <qfont.h>

#include "quickbackup.h"

int main(int argc, char *argv[])
{
  QApplication a(argc, argv);
  a.setFont(QFont("helvetica", 12));
  /* uncomment the following line, if you want a Windows 95 look*/
  a.setStyle(WindowsStyle);
    
  QuickBackup *quickbackup=new QuickBackup();
  a.setMainWidget(quickbackup);

  quickbackup->setCaption("Document 1");
  quickbackup->show();

  return a.exec();
}
