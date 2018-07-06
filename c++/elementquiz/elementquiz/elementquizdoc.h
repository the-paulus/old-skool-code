/***************************************************************************
                          elementquizdoc.h  -  description
                             -------------------
    begin                : Wed Sep 20 15:55:34 EDT 2000
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
#ifndef ELEMENTQUIZDOC_H
#define ELEMENTQUIZDOC_H

// include files for QT
#include <qobject.h>
#include <stdio.h>
#include <qstring.h>
#include <qfile.h>
#include <qtextstream.h>
#include <qstrlist.h>
#include <stdlib.h>
#include <qlist.h>

// application specific includes

/**
  * the Document Class
  */

class ElementQuizDoc
{
   public:
    ElementQuizDoc();
    ~ElementQuizDoc();
	void CountElements(void);
	void getRandomElement(void);
	float mass;
	unsigned int elements;
	unsigned int number;
	QFile *fChem;
	QTextStream *ts;
	QString name;
	QString symbol;
};

#endif
