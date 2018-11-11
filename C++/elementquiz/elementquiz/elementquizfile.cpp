/***************************************************************************
                          elementquizfile.cpp  -  description
                             -------------------
    begin                : Sun Oct 17 1999
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

#include "elementquizfile.h"

ElementQuizFile::ElementQuizFile()
{
	fChem = new QFile("chem.key");
	fChem->open(IO_ReadOnly);
}
ElementQuizFile::~ElementQuizFile()
{
	fChem->close();
}
/** counts and places the names of the elements in the combo box */
void ElementQuizFile::GetElements(void)
{
	QTextStream ts(fChem);
	QString tmp;
	QString sep;
	unsigned int pos = 0;
	
	while(!ts.eof())
 	{
  		tmp = ts.readLine();   //count number of lines. 1 line = 1 element
  		pos = tmp.find(':', 0, false);
		sep = tmp.left(pos);
		tmp.remove(0, pos+1);
		pos = tmp.find(':', 0, false);
		sep = tmp.left(pos);
		list->append(sep);
  		number_elements++;
  		printf("\nElementQuizView(): read line = %s, count = %i", (const char*)tmp, number_elements);
  	}
}
/** Generate a random element */
void ElementQuizFile::Generate(void)
{
	unsigned int rnd = 0;
	unsigned int pos = 0;
	unsigned int ctr = 0;
	QString tmp_string, sep;
	QTextStream ts(fChem);
	
	/*Pick a random element between
   	 *1 and the total number of elements*/
  	rnd = 1 + ((int)(rand()) % number_elements);

  	/*Open chem.key for read only.
   	 *get the element on line rnd*/
  	if(fChem->open(IO_ReadOnly))
  	{
		while(ctr != number_elements)
		{
			tmp_string = ts.readLine();
			ctr++;
  		}
  	}
  	
  	//Atomic Number
  	pos = tmp_string.find(':', 0, false);
  	sep = tmp_string.left(pos);
  	atomic_number = sep.toInt();
  	tmp_string.remove(0, pos+1);
  	fprintf(stdout, "\n\nAtomic Number: %i", atomic_number);

  	//Element Name
  	pos = tmp_string.find(':', 0, false);
  	sep = tmp_string.left(pos);
  	name = sep;
  	tmp_string.remove(0, pos+1);
  	fprintf(stdout, "\n\nElement Name: %s", (const char *)name);	

  	//Symbol
  	pos = tmp_string.find(':', 0, false);
  	sep = tmp_string.left(pos);
  	symbol = sep;
  	tmp_string.remove(0, pos+1);
  	fprintf(stdout, "\n\nSymbol: %s", (const char*) symbol);
  	
  	//Atomic Mass
  	pos = tmp_string.find(':', 0, false);
  	sep = tmp_string.left(pos);
  	atomic_mass = sep.toFloat();
  	fprintf(stdout, "\n\nAtomic Mass: %f", atomic_mass);
}
