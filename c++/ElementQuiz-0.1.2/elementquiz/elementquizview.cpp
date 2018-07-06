/***************************************************************************
                          elementquizview.cpp  -  description
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

#include "elementquizview.h"

ElementQuizView::ElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent)
{
  /** connect doc with the view*/
  //connect(doc, SIGNAL(documentChanged()), this, SLOT(slotDocumentChanged()));
  int tmp_x = 0; 	//temp x coordnate
  int tmp_y = 0;    //temp y coordnate
  int tmp_w = 0;    //temp width
  int tmp_h = 0;    //temp height
  QString tmp_string;
  QString sep;
  QString tmp;

  if(debug)
  {
  	this->resize(500,500);

  	/*****************************************
   	*         (create objects)
   	*****************************************/
  	lneAtomicMass = new QLineEdit(this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created lneAtomicMass");
  	lneAtomicNumber = new QLineEdit(this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created lneAtomicNumber");
  	lneSymbol = new QLineEdit(this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created lneSymbol");
  	lblAtomicMass = new QLabel("Atomic Mass:", this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created lblAtomicMass");
  	lblAtomicNumber = new QLabel("Atomic Number:", this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created lblAtomicNumber");
  	lblName = new QLabel(this, "Name:");
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created lblName");
  	lblSymbol = new QLabel("Symbol:", this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created lblSymbol");
  	lblQuiz = new QLabel("Quiz On..", this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created lblQuiz");
  	pbAns = new QPushButton("Show Answer",this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created pbAns");
  	pbOK = new QPushButton("OK",this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created pbOK");
  	pbQuit = new QPushButton("Quit",this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created pbQuit");
  	//create radio buttons for option
  	rdoAtomicNumber = new QRadioButton("Atomic Number",this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created rdoAtomicNumber");
  	rdoName = new QRadioButton("Name",this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created rdoName");
  	rdoSymbol = new QRadioButton("Symbol",this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created rdoAtomicNumber");
  	btnGroup = new QButtonGroup("Quiz on..", this);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created btnGroup");
  	cmbName = new QComboBox(false, this);
   	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent) - created cmbName");

  	tmp_w = this->width() / 5;
  	tmp_h = lneAtomicNumber->height();
  	tmp_x = 8;
  	tmp_y = 8;
     fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): \n\ttmp_w = %i\n\ttmp_h = %i\n\ttmp_x = %i\n\ttmp_y = %i", tmp_w, tmp_h, tmp_x, tmp_y);
  	
  	//resize rdo buttons
  	rdoSymbol->resize(rdoSymbol->width()+32, rdoSymbol->height());
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): resized rdoSymbol (%i, %i)", rdoSymbol->width()+32, rdoSymbol->height());
  	
  	rdoAtomicNumber->resize(rdoAtomicNumber->width()+32, rdoAtomicNumber->height());
     fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): resized rdoAtomicNumber (%i, %i)", rdoAtomicNumber->width()+32, rdoAtomicNumber->height());
  	
  	//set quiz option to name
  	rdoName->setChecked(true);
   	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): rdoName is checked");


  	//Insert radio buttons into a button group
  	btnGroup->insert(rdoAtomicNumber);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): inserted rdoAtomicNumber to rdoGroup.");
  	btnGroup->insert(rdoName);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): inserted rdoName to rdoGroup.");
  	btnGroup->insert(rdoSymbol);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): inserted rdoSymbol to rdoGroup.");
  	btnGroup->hide(); //hide button group
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): rdoGroup is hidden.");

  	/***********************************
   	*   lblAtomicNumber
   	***********************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***lblAtomicNumber***");
  	lblAtomicNumber->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	lblAtomicNumber->setFont(QFont("Times", 14, QFont::Bold));
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): change font to \"Times\", 14, Bold");
  	tmp_x += lblAtomicNumber->width() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);

  	/***********************************
   	*   lneAtomicNumber
   	***********************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***lneAtomicNumber***");
  	lneAtomicNumber->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	tmp_x = 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);
  	tmp_y += lblAtomicNumber->height() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_y = %i", tmp_y);

  	/***********************************
  	 *   lblAtomicMass
  	 ***********************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***lblAtomicMass***");
  	lblAtomicMass->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	lblAtomicMass->setFont(QFont("Times", 14, QFont::Bold));
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): change font to \"Times\", 14, Bold");
  	tmp_x += lblAtomicMass->width() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);

  	/***********************************
  	 *   lneAtomicMass
  	 ***********************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***lneAtomicMass***");
  	lneAtomicMass->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	tmp_x = 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);
  	tmp_y += lblAtomicMass->height() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_y = %i", tmp_y);

  	/***********************************
  	 *   lblSymbol
  	 ***********************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***lblSymbol***");
  	lblSymbol->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	lblSymbol->setFont(QFont("Times", 14, QFont::Bold));
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): change font to \"Times\", 14, Bold");
  	tmp_x += lblSymbol->width() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);
  	
  	/************************************
  	 *  lneSymbol
  	 ************************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***lneSymbol***");
  	lneSymbol->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	tmp_x = 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);
  	tmp_y += lblSymbol->height() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_y = %i", tmp_y);
  	
  	/***********************************
  	 *   lblName
  	 ***********************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***lblName***");
  	lblName->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	lblName->setFont(QFont("Times", 14, QFont::Bold));
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): change font to \"Times\", 14, Bold");
  	tmp_x += lblName->width() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);
  	
  	/************************************
  	 *  cmbName
  	 ************************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***cmbName***");
  	cmbName->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	tmp_x = 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);
  	tmp_y += lblName->height() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_y = %i", tmp_y);
  	
  	/***********************************
  	 *   pbOK
  	 ***********************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***pbOK***");
  	pbOK->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	tmp_x += pbOK->width() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);

  	/***********************************
  	 *  pbAns
  	 ***********************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***pbAns***");
  	pbAns->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_y);
  	tmp_x = (this->width() / 4) - (pbQuit->width() / 2) - 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);
  	tmp_y += pbOK->height() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_y = %i", tmp_y);

  	/************************************
   	*  pbQuit
   	************************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***pbQuit***");
  	pbQuit->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	tmp_x = this->width() / 2;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_x = %i", tmp_x);
  	tmp_y = 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_y = %i", tmp_y);

  	/************************************
  	 *   lblQuiz
  	 ************************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***lblQuiz***");
  	lblQuiz->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	lblQuiz->setFont(QFont("Times", 18, QFont::Bold));
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): change font to \"Times\", 18, Bold");
  	tmp_y += lblQuiz->height() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_y = %i", tmp_y);

  	/***********************************
  	 *   rdoAtomicNumber
  	 ***********************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***rdoAtomicNumber***");
  	rdoAtomicNumber->move(tmp_x, tmp_y);
 	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
 	tmp_y += rdoAtomicNumber->height() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_y = %i", tmp_y);

  	/***********************************
  	 *   rdoName, rdoSymbol
  	 ***********************************/
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***rdoName***");
  	rdoName->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);
  	tmp_y += rdoName->height() + 8;
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): tmp_y = %i", tmp_y);

  	/***********************************
  	 *   rdoSymbol
  	 ***********************************/
  	 fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent):***rdoSymbol***");
  	rdoSymbol->move(tmp_x, tmp_y);
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): move to (%i, %i)", tmp_x, tmp_y);

  	/***********************************
  	 *  init status
   	***********************************/
   	number_correct = 0;
  	 number_wrong = 0;
   	total = 1;

   	Doc.Generate();
   	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): generating random element.");

   	cmbName->insertStrList(&Doc.getList(),0); //insert read elements into the combobox
   	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): inserted list to cmbName.");

   	if(rdoName->isChecked())
   	{
  		cmbName->changeItem(Doc.getName(), 0);
  		fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): cmbName->changeItem(%i, 0)", Doc.getName());
   	}
   	if(rdoAtomicNumber->isChecked())
   	{
  		lneAtomicNumber->setText(Doc.getAtomicNumber());
  		fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): lneAtomicNumber->setText(%s)", Doc.getAtomicNumber());
   	}
   	if(rdoSymbol->isChecked())
   	{
  		lneSymbol->setText(Doc.getSymbol());
  		fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): lneSymbol->setText(%s)", Doc.getSymbol());
   	}

  	connect(pbAns, SIGNAL(clicked()), this, SLOT(slotShowAnswer()));
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): connected clicked() from pbAns to slotShowAnswer()");
  	connect(pbOK, SIGNAL(clicked()), this, SLOT(slotNext()));
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): connected clicked() from pbOK to slotNext()");
  	connect(pbQuit, SIGNAL(clicked()), qApp, SLOT(quit()));
  	fprintf(stdout, "\nElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent): connected clicked() from pbQuit to qApp->quit()");
  }
  else
  {
  	this->resize(500,500);

  	/*****************************************
   	*         (create objects)
   	*****************************************/
  	lneAtomicMass = new QLineEdit(this);
  	lneAtomicNumber = new QLineEdit(this);
  	lneSymbol = new QLineEdit(this);
  	lblAtomicMass = new QLabel("Atomic Mass:", this);
  	lblAtomicNumber = new QLabel("Atomic Number:", this);
  	lblName = new QLabel(this, "Name:");
  	lblSymbol = new QLabel("Symbol:", this);
  	lblQuiz = new QLabel("Quiz On..", this);
  	pbAns = new QPushButton("Show Answer",this);
  	pbOK = new QPushButton("OK",this);
  	pbQuit = new QPushButton("Quit",this);
  	
  	//create radio buttons for option
  	rdoAtomicNumber = new QRadioButton("Atomic Number",this);
  	rdoName = new QRadioButton("Name",this);
  	rdoSymbol = new QRadioButton("Symbol",this);
  	btnGroup = new QButtonGroup("Quiz on..", this);
  	cmbName = new QComboBox(false, this);
   	
  	tmp_w = this->width() / 5;
  	tmp_h = lneAtomicNumber->height();
  	tmp_x = 8;
  	tmp_y = 8;
       	
  	//resize rdo buttons
  	rdoSymbol->resize(rdoSymbol->width()+32, rdoSymbol->height());
  	rdoAtomicNumber->resize(rdoAtomicNumber->width()+32, rdoAtomicNumber->height());
       	
  	//set quiz option to name
  	rdoName->setChecked(true);
   	
  	//Insert radio buttons into a button group
  	btnGroup->insert(rdoAtomicNumber);
  	btnGroup->insert(rdoName);
  	btnGroup->insert(rdoSymbol);
  	btnGroup->hide(); //hide button group
  	
  	/***********************************
   	*   lblAtomicNumber
   	***********************************/
  	lblAtomicNumber->move(tmp_x, tmp_y);
  	lblAtomicNumber->setFont(QFont("Times", 14, QFont::Bold));
  	tmp_x += lblAtomicNumber->width() + 8;
  	
  	/***********************************
   	*   lneAtomicNumber
   	***********************************/
  	lneAtomicNumber->move(tmp_x, tmp_y);
  	tmp_x = 8;
  	tmp_y += lblAtomicNumber->height() + 8;
  	
  	/***********************************
  	 *   lblAtomicMass
  	 ***********************************/
  	lblAtomicMass->move(tmp_x, tmp_y);
  	lblAtomicMass->setFont(QFont("Times", 14, QFont::Bold));
  	tmp_x += lblAtomicMass->width() + 8;
  	
  	/***********************************
  	 *   lneAtomicMass
  	 ***********************************/
  	lneAtomicMass->move(tmp_x, tmp_y);
  	tmp_x = 8;
  	tmp_y += lblAtomicMass->height() + 8;
  	
  	/***********************************
  	 *   lblSymbol
  	 ***********************************/
  	  	lblSymbol->move(tmp_x, tmp_y);
  	  	lblSymbol->setFont(QFont("Times", 14, QFont::Bold));
  	  	tmp_x += lblSymbol->width() + 8;
  	  	
  	/************************************
  	 *  lneSymbol
  	 ************************************/
  	  	lneSymbol->move(tmp_x, tmp_y);
  	  	tmp_x = 8;
  	  	tmp_y += lblSymbol->height() + 8;
  	  	
  	/***********************************
  	 *   lblName
  	 ***********************************/
  	  	lblName->move(tmp_x, tmp_y);
  	  	lblName->setFont(QFont("Times", 14, QFont::Bold));
  	  	tmp_x += lblName->width() + 8;
  	  	
  	/************************************
  	 *  cmbName
  	 ************************************/
  	  	cmbName->move(tmp_x, tmp_y);
  	  	tmp_x = 8;
  	  	tmp_y += lblName->height() + 8;
  	  	
  	/***********************************
  	 *   pbOK
  	 ***********************************/
  	  	pbOK->move(tmp_x, tmp_y);
  	  	tmp_x += pbOK->width() + 8;
  	
  	/***********************************
  	 *  pbAns
  	 ***********************************/
  	  	pbAns->move(tmp_x, tmp_y);
  	  	tmp_x = (this->width() / 4) - (pbQuit->width() / 2) - 8;
  	  	tmp_y += pbOK->height() + 8;
  	
  	/************************************
   	*  pbQuit
   	************************************/
  	  	pbQuit->move(tmp_x, tmp_y);
  	  	tmp_x = this->width() / 2;
  	  	tmp_y = 8;
  	
  	/************************************
  	 *   lblQuiz
  	 ************************************/
  	  	lblQuiz->move(tmp_x, tmp_y);
  	  	lblQuiz->setFont(QFont("Times", 18, QFont::Bold));
  	  	tmp_y += lblQuiz->height() + 8;
  	
  	/***********************************
  	 *   rdoAtomicNumber
  	 ***********************************/
  	  	rdoAtomicNumber->move(tmp_x, tmp_y);
 	 	tmp_y += rdoAtomicNumber->height() + 8;
  	
  	/***********************************
  	 *   rdoName, rdoSymbol
  	 ***********************************/
  	  	rdoName->move(tmp_x, tmp_y);
  	  	tmp_y += rdoName->height() + 8;
  	
  	/***********************************
  	 *   rdoSymbol
  	 ***********************************/
  	  	rdoSymbol->move(tmp_x, tmp_y);
  	
  	/***********************************
  	 *  init status
   	***********************************/
   	number_correct = 0;
  	 number_wrong = 0;
   	total = 1;

   	Doc.Generate();
   	
   	cmbName->insertStrList(&Doc.getList(),0); //insert read elements into the combobox
   	
   		if(rdoName->isChecked())
   	 		cmbName->changeItem(Doc.getName(), 0);
  	   	if(rdoAtomicNumber->isChecked())
   	  		lneAtomicNumber->setText(Doc.getAtomicNumber());
  		if(rdoSymbol->isChecked())
   			lneSymbol->setText(Doc.getSymbol());

  		connect(pbAns, SIGNAL(clicked()), this, SLOT(slotShowAnswer()));
  	  	connect(pbOK, SIGNAL(clicked()), this, SLOT(slotNext()));
  		connect(pbQuit, SIGNAL(clicked()), qApp, SLOT(quit()));
	}
}

ElementQuizView::~ElementQuizView()
{
	if(debug)
		fprintf(stdout, "\nElementQuizView::~ElementQuizView()");
}

void ElementQuizView::slotNext()
{
	int wrong = 0;
	QString tmp;
	
	if(debug)
	{
		if(show == 1)
		{
			
			fprintf(stdout, "\nvoid ElementQuizView::slotNext() - generate random element.");
			Doc.Generate();
			
			if(rdoName->isChecked())
			{
				cmbName->setCurrentItem(Doc.getElementIndex(Doc.getName()));
				fprintf(stdout, "\nvoid ElementQuizView::slotNext() - cmbName->setCurrentItem(%s)", Doc.getElementIndex(Doc.getName()));
			}
			if(rdoAtomicNumber->isChecked())
			{
				lneAtomicNumber->setText(Doc.getAtomicNumber());
				fprintf(stdout, "\nvoid ElementQuizView::slotNext() - lneAtomicNumber->setText(%s)",Doc.getAtomicNumber());
			}
			if(rdoSymbol->isChecked())
			{
				lneSymbol->setText(Doc.getSymbol());
				fprintf(stdout, "\nvoid ElementQuizView::slotNext() - lneSymbol->setText(%s)", Doc.getSymbol());
			}
			total++;
			fprintf(stdout, "\nvoid ElementQuizView::slotNext() - total = %i", total);
			show = 0;
			return ;
		}
	 	/****************************************
	 	*     User input
	 	****************************************/
	 	name = cmbName->currentText();
	 	symbol = lneSymbol->text();
	 	number = lneAtomicNumber->text();
	 	mass = lneAtomicMass->text();
	 	
	 	fprintf(stdout, "\n***********************\n   User input   \n***********************\n");
		fprintf(stdout, "Name: %s\n", (const char*)name);
		fprintf(stdout, "Symbol: %s\n", (const char*)symbol);
		fprintf(stdout, "Atomic Number: %s\n", (const char*)number);
		fprintf(stdout, "Atomic Mass: %s\n", (const char*)mass);
		
		if(strcmp((const char*)this->mass, Doc.getMass()) != 0)
		{
			fprintf(stdout, "\nvoid ElementQuizView::slotNext() - Mass is incorrect.");
			wrong++;
		}
		if(strcmp((const char*)this->number, Doc.getAtomicNumber()) != 0)
		{
			fprintf(stdout, "\nvoid ElementQuizView::slotNext() - Atomic Number is incorrect.");
			wrong++;
		}
		if(strcmp((const char*)this->name, Doc.getName()) !=0)
		{
			fprintf(stdout, "\nvoid ElementQuizView::slotNext() - Element name is incorrect.");
			wrong++;
		}
		if(strcmp((const char*)this->symbol, Doc.getSymbol()) != 0)
		{
		     fprintf(stdout, "\nvoid ElementQuizView::slotNext() - Symbol is incorrect.");
			wrong++;
		}
		
		if(wrong > 0)
		{
			fprintf(stdout, "\nvoid ElementQuizView::slotNext() - wrong = %i", wrong);
			if(QMessageBox::information(this, "Element Quiz v0.1.2","One or more of the answer you entered are wrong.\nWhat would you like to try again?", QMessageBox::Yes | QMessageBox::Default, QMessageBox::No) == QMessageBox::No)
			{
				Doc.Generate();
				fprintf(stdout, "\nvoid ElementQuizView::slotNext() - generate random element.");
			
				if(rdoName->isChecked())
   				{
  					cmbName->setCurrentItem(Doc.getElementIndex(Doc.getName()));
  					fprintf(stdout, "\nvoid ElementQuiz::ElementQuizView(void) - cmbName->setCurrentItem(%s, 0)", Doc.getName());
   				}
   				if(rdoAtomicNumber->isChecked())
   				{
  					lneAtomicNumber->setText(Doc.getAtomicNumber());
  					fprintf(stdout, "\nvoid ElementQuiz::ElementQuizView(void) - lneAtomicNumber->setText(%s)", Doc.getAtomicNumber());
   				}
   				if(rdoSymbol->isChecked())
   				{
  					lneSymbol->setText(Doc.getSymbol());
  					fprintf(stdout, "\nvoid ElementQuiz::ElementQuizView(void) - lneSymbol->setText(%s)", Doc.getSymbol());
   				}
				
				number_wrong++;
				fprintf(stdout, "\nvoid ElementQuiz::ElementQuizView(void) - number wrong is %i", number_wrong);
				total++;
				fprintf(stdout, "\nvoid ElementQuiz::ElementQuizView(void) - total is %i", total);
			}
		}
		else
		{
			Doc.Generate();
			fprintf(stdout, "\nvoid ElementQuizView::slotNext() - generate random element.");
			
			if(rdoName->isChecked())
   			{
  				cmbName->setCurrentItem(Doc.getElementIndex(Doc.getName()));
  				fprintf(stdout, "\nvoid ElementQuiz::ElementQuizView(void) - cmbName->changeItem(%s)", Doc.getName());
   			}
   			if(rdoAtomicNumber->isChecked())
   			{
  				lneAtomicNumber->setText(Doc.getAtomicNumber());
  				fprintf(stdout, "\nvoid ElementQuiz::ElementQuizView(void) - lneAtomicNumber->setText(%s)", Doc.getAtomicNumber());
   			}
   			if(rdoSymbol->isChecked())
   			{
  				lneSymbol->setText(Doc.getSymbol());
  				fprintf(stdout, "\nvoid ElementQuiz::ElementQuizView(void) - lneSymbol->setText(%s)", Doc.getSymbol());
   			}
			
			number_correct++;
			fprintf(stdout, "\nvoid ElementQuiz::ElementQuizView(void) - number correct is %i", number_correct);
			total++;
			fprintf(stdout, "\nvoid ElementQuiz::ElementQuizView(void) - total is %i", total);
		}
	}
	else
	{
		if(show == 1)
		{
			Doc.Generate();
			if(rdoName->isChecked())
				cmbName->setCurrentItem(Doc.getElementIndex(Doc.getName()));
			if(rdoAtomicNumber->isChecked())
				lneAtomicNumber->setText(Doc.getAtomicNumber());
			if(rdoSymbol->isChecked())
				lneSymbol->setText(Doc.getSymbol());
			total++;
			show = 0;
			return ;
		}
	 	/****************************************
	 	*     User input
	 	****************************************/
	 	name = cmbName->currentText();
	 	symbol = lneSymbol->text();
	 	number = lneAtomicNumber->text();
	 	mass = lneAtomicMass->text();
	 	
		
		if(strcmp((const char*)this->mass, Doc.getMass()) != 0)
			wrong++;
		if(strcmp((const char*)this->number, Doc.getAtomicNumber()) != 0)
			wrong++;
		if(strcmp((const char*)this->name, Doc.getName()) !=0)
			wrong++;
		if(strcmp((const char*)this->symbol, Doc.getSymbol()) != 0)
			wrong++;
		
		if(wrong > 0)
		{
			if(QMessageBox::information(this, "Element Quiz v0.1.2","One or more of the answer you entered are wrong.\nWhat would you like to try again?", QMessageBox::Yes | QMessageBox::Default, QMessageBox::No) == QMessageBox::No)
			{
				Doc.Generate();
				if(rdoName->isChecked())
					cmbName->changeItem(Doc.getName(), 0);
				if(rdoAtomicNumber->isChecked())
					lneAtomicNumber->setText(Doc.getAtomicNumber());
				if(rdoSymbol->isChecked())
					lneSymbol->setText((const char*)Doc.getSymbol());
				number_wrong++;
				total++;
			}
		}
		else
		{
			Doc.Generate();
			if(rdoName->isChecked())
				cmbName->setCurrentItem(Doc.getElementIndex(Doc.getName()));
			if(rdoAtomicNumber->isChecked())
				lneAtomicNumber->setText(Doc.getAtomicNumber());
			if(rdoSymbol->isChecked())
				lneSymbol->setText(Doc.getSymbol());
	     	number_correct++;
	     	total++;
		}
	}
}

void ElementQuizView::slotShowAnswer(void)
{
	if(debug)
	{
		number_wrong++;
		fprintf(stdout, "\nvoid ElementQuizView::slotShowAnswer(void) - number wrong is %i", number_wrong);
		cmbName->setCurrentItem(Doc.getElementIndex(Doc.getName()));
		fprintf(stdout, "\nvoid ElementQuizView::slotShowAnswer(void) - cmbName->setCurrentItem(Doc.getElementIndex(%s)", Doc.getName());
		lneAtomicMass->setText(Doc.getMass());
		fprintf(stdout, "\nvoid ElementQuizView::slotShowAnswer(void) - lneAtomicMass->setText(%s)", Doc.getMass());
		lneAtomicNumber->setText(Doc.getAtomicNumber());
		fprintf(stdout, "\nvoid ElementQuizView::slotShowAnswer(void) - lneAtomicNumber->setText(%s)", Doc.getAtomicNumber());
		lneSymbol->setText(Doc.getSymbol());
		fprintf(stdout, "\nvoid ElementQuizView::slotShowAnswer(void) - lneSymbol->setText(%s)", Doc.getSymbol());

		show = 1;
		fprintf(stdout, "\nvoid ElementQuizView::slotShowAnswer(void) - show = %i", show);
	}
	else
	{
		number_wrong++;
		cmbName->setCurrentItem(Doc.getElementIndex(Doc.getName()));
		lneAtomicMass->setText(Doc.getMass());
		lneAtomicNumber->setText(Doc.getAtomicNumber());
		lneSymbol->setText(Doc.getSymbol());

		show = 1;
	}
}
