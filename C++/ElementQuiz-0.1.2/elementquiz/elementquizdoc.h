/***************************************************************************
                          elementquizdoc.h  -  description
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
#ifndef ELEMENTQUIZDOC_H
#define ELEMENTQUIZDOC_H

// include files for QT
#include <qobject.h>
#include <qstrlist.h>
#include <qfile.h>
#include <qtextstream.h>
#include <qstring.h>
#include <stdio.h>
#include <stdlib.h>

// application specific includes

/**
  * the Document Class
  */

class ElementQuizDoc : public QObject
{
  Q_OBJECT

  public:
    ElementQuizDoc();
    ~ElementQuizDoc();
    void Generate(void);
    	unsigned int getElements(void);
  	const char* getAtomicNumber(void);
  	const char* getMass(void);
  	const char* getName(void);
  	const char* getSymbol(void);
  	unsigned int getElementIndex(const char *element);
  	QStrList getList(void);
  private:
    unsigned int 	elements;
    QString number;
    QString mass;
    QString name;
    QString symbol;
    QStrList list;

};

#endif
