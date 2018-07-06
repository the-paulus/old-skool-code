/***************************************************************************
                          chemistrydoc.h  -  description
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
#ifndef CHEMISTRYDOC_H
#define CHEMISTRYDOC_H

// include files for QT
#include <qobject.h>

// application specific includes

/**
  * the Document Class
  */

class ChemistryDoc : public QObject
{
  Q_OBJECT

  public:
    ChemistryDoc();
    ~ChemistryDoc();
    void newDoc();
    bool save();
    bool saveAs(const QString &filename);
    bool load(const QString &filename);
    bool isModified() const;

  signals:
    void documentChanged();

  protected:
    bool modified;
};

#endif
