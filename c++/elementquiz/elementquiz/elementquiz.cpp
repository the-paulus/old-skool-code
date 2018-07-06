/***************************************************************************
                          elementquiz.cpp  -  description
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

#include "elementquiz.h"
#include "filesave.xpm"
#include "fileopen.xpm"
#include "filenew.xpm"

ElementQuiz::ElementQuiz()
{
  setCaption("ElementQuiz " VERSION);
  
  ///////////////////////////////////////////////////////////////////
  // call inits to invoke all other construction parts
  //initMenuBar();
  //initToolBar();
  //initStatusBar();

  initDoc();
  initView();  
}

ElementQuiz::~ElementQuiz()
{
}

void ElementQuiz::initDoc()
{
   doc=new ElementQuizDoc();
}

void ElementQuiz::initView()
{ 
  ////////////////////////////////////////////////////////////////////
  // set the main widget here
  view=new ElementQuizView(this, doc);
  setCentralWidget(view);
}


/*void ElementQuiz::generate(void)
{
	int rnd = 0;
	int ctr = 0;
	int pos;
	int tmp;
	QString tmp_string;
	QString sep;
	QTextStream ts(&fChem);
	
	rnd = 1 + ((int)(rand()) % number_elements);
	//fprintf(stdout, "\n%i", rnd);
	fChem.setName("chem.key");	
	if(fChem.open(IO_ReadOnly))
	{
		//fprintf(stdout, "\n%s", fChem.name());
		while(ctr != rnd)
		{
			tmp_string = ts.readLine();
			ctr++;
		}
	}
	fChem.close();
	fprintf(stdout, "\n%s", (const char *)tmp_string);	
	
	//Atomic Number
	pos = tmp_string.find(':', 0, false);
	sep = tmp_string.left(pos);
	correct.atomic_number = sep.toInt();
	tmp_string.remove(0, pos+1);
	fprintf(stdout, "\n\n%s", (const char *)tmp_string);
	
	//Element Name
	pos = tmp_string.find(':', 0, false);
	sep = tmp_string.left(pos);
	correct.name = sep;
	tmp_string.remove(0, pos+1);
	fprintf(stdout, "\n\n%s", (const char *)tmp_string);	
	
	//Symbol
	pos = tmp_string.find(':', 0, false);
	sep = tmp_string.left(pos);
	correct.symbol = sep;
	tmp_string.remove(0, pos+1);
	//fprintf(stdout, "\
	
	//Atomic Mass
	pos = tmp_string.find(':', 0, false);
	sep = tmp_string.left(pos);
	correct.atomic_mass = sep.toFloat();
	
	
	fprintf(stdout, "\nAtomic Number: %i", correct.atomic_number);
	fprintf(stdout, "\nElement: %s", (const char *)correct.name);
	fprintf(stdout, "\nSymbol: %s", (const char *)correct.symbol);
	fprintf(stdout, "\nAtomic Mass: %f", correct.atomic_mass);
}                                                              */
