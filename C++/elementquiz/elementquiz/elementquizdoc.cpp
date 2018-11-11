/***************************************************************************
                          elementquizdoc.cpp  -  description
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

#include "elementquizdoc.h"

ElementQuizDoc::ElementQuizDoc()
{
	fChem = new QFile("chem.key");
	fChem->open(IO_ReadOnly);
	ts = new QTextStream(fChem);
}

ElementQuizDoc::~ElementQuizDoc()
{
	fChem->close();
}

void ElementQuizDoc::CountElements(void)
{
	while(!ts->eof())
		elements++;
}
	

