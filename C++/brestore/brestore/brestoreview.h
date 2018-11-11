/***************************************************************************
                          brestoreview.h  -  description
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

#ifndef BRESTOREVIEW_H
#define BRESTOREVIEW_H

// include files for QT
#include <qwidget.h>

// application specific includes
#include "brestoredoc.h"

/**
 * This class provides an incomplete base for your application view. 
 */

class BrestoreView : public QWidget
{
  Q_OBJECT
  public:
    BrestoreView(QWidget *parent=0, BrestoreDoc* doc=0);
    ~BrestoreView();
  
  protected slots:
    void slotDocumentChanged();
  
};

#endif
