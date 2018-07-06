/***************************************************************************
                          elementquizdoc.cpp  -  description
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

#include "elementquizdoc.h"

QFile fChem("chem.key");
QTextStream ts(&fChem);

ElementQuizDoc::ElementQuizDoc()
{
	QString tmp;
	QString sep;
 	int pos = 0;
 	elements = 0;
 	
 	if(debug)
 	{
		if(fChem.open(IO_ReadOnly))
		{
			while(!ts.eof())
			{
				elements++;
				tmp = ts.readLine();
				fprintf(stdout, "\nElementQuizDoc::ElementQuizDoc() - QTextStream::readLine() = %s", (const char*)tmp);
				pos = tmp.find(':', 0, false);
				tmp.remove(0, pos+1);
				pos = tmp.find(':', 0, false);
				sep = tmp.left(pos);
				list.append(sep);
				fprintf(stdout, "\nElementQuizDoc::ElementQuizDoc() - list element %i: %s", elements, list.at(elements));
			}
		}
		fChem.close();
		fprintf(stdout, "\nElementQuizDoc::ElementQuizDoc() - close file.");
	}
	else
	{
		if(fChem.open(IO_ReadOnly))
		{
			while(!ts.eof())
			{
				elements++;
				tmp = ts.readLine();
				pos = tmp.find(':', 0, false);
				tmp.remove(0, pos+1);
				pos = tmp.find(':', 0, false);
				sep = tmp.left(pos);
				list.append(sep);
			}
		}
		fChem.close();
	}
}
		

ElementQuizDoc::~ElementQuizDoc()
{
	if(debug)
		fprintf(stdout, "\nElementQuizDoc::~ElementQuizDoc()");
}

void ElementQuizDoc::Generate(void)
{
	QString tmp;
	QString sep;
	int pos = 0;
	int rnd = 0;
	
	if(debug)
	{
		rnd = 1 + (int)(rand()) % elements;
		fprintf(stdout, "\nElementQuizDoc::Generate(void) - rnd = %i", rnd);
	
		if(fChem.open(IO_ReadOnly))
		{
			for(int i=0; i<rnd; i++)
			{
				tmp = ts.readLine();
				pos = tmp.find(':', 0, false);
				sep = tmp.left(pos);
				number = sep;
				tmp.remove(0, pos+1);
			
				pos = tmp.find(':', 0, false);
				name = tmp.left(pos);
				tmp.remove(0,pos+1);
			
				pos = tmp.find(':', 0, false);
				symbol = tmp.left(pos);
				tmp.remove(0, pos+1);
			
				mass = tmp;
			}
		}
		
		fprintf(stdout, "\nElementQuizDoc::Generate(void) - Retrived:");
		fprintf(stdout, "\nAtomic Number: %s", (const char*)number);
		fprintf(stdout, "\nName: %s", (const char*)name);
		fprintf(stdout, "\nSymbol: %s", (const char*)symbol);
		fprintf(stdout, "\nAtomic Mass: %s", (const char *)mass);
		fChem.close();
	}
	else
	{
		rnd = 1 + (int)(rand()) % elements;
	     	
		if(fChem.open(IO_ReadOnly))
		{
			for(int i=0; i<rnd; i++)
			{
				tmp = ts.readLine();
				pos = tmp.find(':', 0, false);
				sep = tmp.left(pos);
				number = sep;
				tmp.remove(0, pos+1);
			
				pos = tmp.find(':', 0, false);
				name = tmp.left(pos);
				tmp.remove(0,pos+1);
			
				pos = tmp.find(':', 0, false);
				symbol = tmp.left(pos);
				tmp.remove(0, pos+1);
			
				mass = tmp;
			}
		}
	}
}		

unsigned int ElementQuizDoc::getElements(void)
{
	if(debug)
	{
		fprintf(stdout, "\nunsigned int ElementQuizDoc::getElements(void) returned %i", elements);
		return elements;
	}
	else
		return elements;
}

const char* ElementQuizDoc::getAtomicNumber(void)
{
	if(debug)
	{
		fprintf(stdout, "\nconst char * ElementQuizDoc::getAtomicNumber(void) returned %s", (const char*)number);
		return ((const char*)number);
	}
	else
		return ((const char*)number);
}

const char* ElementQuizDoc::getMass(void)
{
	if(debug)
	{
		fprintf(stdout, "\nconst char* ElementQuizDoc::getMass(void) returned %s", (const char *)mass);
		return ((const char*)mass);
	}
	else
		return ((const char*)mass);
}

const char* ElementQuizDoc::getName(void)
{
	if(debug)
	{
		fprintf(stdout, "\nconst char* ElementQuizDoc::getName(void) returned %s", (const char*)name);
		return ((const char*)name);
	}
	else
		return ((const char*)name);
}

const char* ElementQuizDoc::getSymbol(void)
{
	if(debug)
	{
		fprintf(stdout, "\nconst char* ElementQuizDoc::getSymbol(void) returned %s", (const char*)symbol);
		return ((const char*)symbol);
	}
	else
		return ((const char*)symbol);
}

QStrList ElementQuizDoc::getList(void)
{
	int ctr = 0;
	
	if(debug)
	{
		fprintf(stdout, "\nQStrList ElementQuizDoc::getList(void): variable list contains:");
		for(const char *f = list.first(); f; f = list.next())
			fprintf(stdout, "\nQStrList ElementQuizDoc::getList(void): Item %i: %s", ctr, (const char*)f);
		return list;
	}
	else
		return list;
}

unsigned int ElementQuizDoc::getElementIndex(const char *element)
{
	int ctr = 0;
	
	if(debug)
	{
		fprintf(stdout, "\nunsigned int ElementQuizDoc::getElementIndex(const char *element): looking for %s", element);
	
		for(QString t = list.first(); t; t = list.next())
		{
			if(strcmp(element, (const char *)t) == 0)
			{
				fprintf(stdout, "\nunsigned int ElementQuizDoc::getElementIndex(const char *element): %s is item number %i", element, ctr);
				return ctr;
			}
			ctr++;
		}
	}
	else
	{
		for(QString t = list.first(); t; t = list.next())
		{
			if(strcmp(element, (const char*)t) == 0)
				return ctr;
			ctr++;
		}
	}
}	