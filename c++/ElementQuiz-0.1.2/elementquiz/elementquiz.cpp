/***************************************************************************
                          elementquiz.cpp  -  description
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

#include "elementquiz.h"
#include "filesave.xpm"
#include "fileopen.xpm"
#include "filenew.xpm"

ElementQuiz::ElementQuiz()
{
  if(debug)
  {
  	setCaption("ElementQuiz " VERSION);
  
  	///////////////////////////////////////////////////////////////////
  	// call inits to invoke all other construction parts
  	//initStatusBar();

  	initDoc();
  	fprintf(stdout, "\nElementQuiz::ElementQuiz() - initDoc()");
  	initView();
  	fprintf(stdout, "\nElementQuiz::ElementQuiz() - initView()");
  }
  else
  {
  	setCaption("ElementQuiz " VERSION);

  	///////////////////////////////////////////////////////////////////
  	// call inits to invoke all other construction parts
  	//initStatusBar();

  	initDoc();
  	fprintf(stdout, "\nElementQuiz::ElementQuiz() - initDoc()");
  	initView();
  	fprintf(stdout, "\nElementQuiz::ElementQuiz() - initView()");
  }
}

ElementQuiz::~ElementQuiz()
{
	if(debug)
		fprintf(stdout, "\nElementQuiz::~ElementQuiz() - deconstuctor");
}

void ElementQuiz::initStatusBar()
{
  ///////////////////////////////////////////////////////////////////
  //STATUSBAR
  statusBar()->message(IDS_STATUS_DEFAULT, 2000);
}

void ElementQuiz::initDoc()
{
   if(debug)
   {
      doc=new ElementQuizDoc();
      fprintf(stdout, "\nElementQuiz::initDoc() - init doc");
   }
   else
   	doc = new ElementQuizDoc();
}

void ElementQuiz::initView()
{
  if(debug)
  {
  	////////////////////////////////////////////////////////////////////
  	// set the main widget here
  	view=new ElementQuizView(this, doc);
  	setCentralWidget(view);
  	fprintf(stdout, "\nElementQuiz::initView() - init view");
  }
  else
  {
  	////////////////////////////////////////////////////////////////////
  	// set the main widget here
  	view=new ElementQuizView(this, doc);
  	setCentralWidget(view);
  }
}

void ElementQuiz::resizeEvent(QResizeEvent *)
{
   if(debug)
   {
   	fprintf(stdout, "\n**********\n");
   	fprintf(stdout, "width = %i\n", width());
   	fprintf(stdout, "height = %i\n", height());
   	fprintf(stdout, "**********\n");
   }
}

