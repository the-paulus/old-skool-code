/***************************************************************************
                          elementquizview.cpp  -  description
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

#include "elementquizview.h"

ElementQuizView::ElementQuizView(QWidget *parent, ElementQuizDoc *doc) : QWidget(parent)
{
  /** connect doc with the view*/
  //connect(doc, SIGNAL(documentChanged()), this, SLOT(slotDocumentChanged()));

  /*Declare local variables*/
  int tmp_x = 0; 	//temp x coordnate
  int tmp_y = 0;    //temp y coordnate
  int tmp_w = 0;    //temp width
  int tmp_h = 0;    //temp height
  int rnd = 0;
  QString tmp_string;
  QString sep;
  //QTextStream ts(&fChem); //text stream
  QString tmp;

  this->resize(500,500);

  //create radio buttons for option
  rdoAtomicNumber = new QRadioButton("Atomic Number",this);
  rdoName = new QRadioButton("Name",this);
  rdoSymbol = new QRadioButton("Symbol",this);
  btnGroup = new QButtonGroup("Quiz on..", this);
  cmbName = new QComboBox(false, this);
  doc->CountElements();
  fprintf(stderr, "\n%i elements", doc->elements);
  //resize rdo buttons
  rdoSymbol->resize(rdoSymbol->width()+32, rdoSymbol->height());
  rdoAtomicNumber->resize(rdoAtomicNumber->width()+32, rdoAtomicNumber->height());
  //set quiz option to name
  rdoName->setChecked(true);

  btnGroup->insert(rdoAtomicNumber);
  btnGroup->insert(rdoName);
  btnGroup->insert(rdoSymbol);
  btnGroup->hide();

  //create objects
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
  tmp_w = this->width() / 5;
  tmp_h = lneAtomicNumber->height();
  tmp_x = 8;
  tmp_y = 8;

  lblAtomicNumber->move(tmp_x, tmp_y);
  lblAtomicNumber->setFont(QFont("Times", 14, QFont::Bold));
  tmp_x += lblAtomicNumber->width() + 8;
  lneAtomicNumber->move(tmp_x, tmp_y);
  tmp_x = 8;
  tmp_y += lblAtomicNumber->height() + 8;

  lblAtomicMass->move(tmp_x, tmp_y);
  lblAtomicMass->setFont(QFont("Times", 14, QFont::Bold));
  tmp_x += lblAtomicMass->width() + 8;
  lneAtomicMass->move(tmp_x, tmp_y);
  tmp_x = 8;
  tmp_y += lblAtomicMass->height() + 8;

  lblSymbol->move(tmp_x, tmp_y);
  lblSymbol->setFont(QFont("Times", 14, QFont::Bold));
  tmp_x += lblSymbol->width() + 8;
  lneSymbol->move(tmp_x, tmp_y);
  tmp_x = 8;
  tmp_y += lblSymbol->height() + 8;

  lblName->move(tmp_x, tmp_y);
  lblName->setFont(QFont("Times", 14, QFont::Bold));
  tmp_x += lblName->width() + 8;
  cmbName->move(tmp_x, tmp_y);
  tmp_x = 8;
  tmp_y += lblName->height() + 8;

  pbOK->move(tmp_x, tmp_y);
  tmp_x += pbOK->width() + 8;
  pbAns->move(tmp_x, tmp_y);
  tmp_x = (this->width() / 4) - (pbQuit->width() / 2) - 8;
  tmp_y += pbOK->height() + 8;
  pbQuit->move(tmp_x, tmp_y);

  tmp_x = this->width() / 2;
  tmp_y = 8;
  lblQuiz->move(tmp_x, tmp_y);
  lblQuiz->setFont(QFont("Times", 18, QFont::Bold));
  tmp_y += lblQuiz->height() + 8;

  rdoAtomicNumber->move(tmp_x, tmp_y);
  tmp_y += rdoAtomicNumber->height() + 8;

  rdoName->move(tmp_x, tmp_y);
  tmp_y += rdoName->height() + 8;

  rdoSymbol->move(tmp_x, tmp_y);
  fprintf(stdout, "\n1");

  /*for(QString f = doc->list->first(); f; f = doc->list->next())
  	cmbName->insertItem(f);  */
  fprintf(stdout, "\n2");

  if(rdoName->isChecked())
  	cmbName->setCurrentItem(rnd);
  if(rdoAtomicNumber->isChecked())
  	lneAtomicNumber->setText((const char*)correct.atomic_number);
  if(rdoSymbol->isChecked())
  	lneSymbol->setText(correct.symbol);


  connect(pbAns, SIGNAL(clicked()), this, SLOT(slotShowAnswer()));
  connect(pbOK, SIGNAL(clicked()), this, SLOT(slotNext()));
  connect(pbQuit, SIGNAL(clicked()), qApp, SLOT(quit()));
}

ElementQuizView::~ElementQuizView()
{
}

void ElementQuizView::slotDocumentChanged()
{
  //TODO update the view

}
/**  */
void ElementQuizView::slotNext(void)
{
  //declare variables
  /*int tmp_ans = 0;
  int rnd = 0;
  int ctr = 0;
  int pos = 0;
  QString tmp_string;
  QString sep;
  QTextStream ts(doc->fChem);

  /*************************************************************************
   *                              (Check User's answer)
   *************************************************************************/
  //get user input
  /*tmp_string = lneAtomicNumber->text();
  input.atomic_number = tmp_string.toInt();
  fprintf(stdout, "\nUser input for atomic number: %i", input.atomic_number);
  input.name = cmbName->text(cmbName->currentItem());
  fprintf(stdout, "\nUser input for element name: %s", (const char *)input.name);
  input.symbol = lneSymbol->text();
  fprintf(stdout, "\nUser input for element name: %s", (const char *)input.symbol);
  tmp_string = lneAtomicMass->text();
  input.atomic_mass = tmp_string.toFloat();
  fprintf(stdout, "\nUser input for element name: %f", input.atomic_mass);

  /*************************************************************************
   *                              (Check Option)
   *************************************************************************/
   /*if(rdoName->isChecked())
   {
   	tmp_string = lneAtomicMass->text();
   	if(strcmp(cmbName->text(cmbName->currentItem()), correct.name) != 0)
   		cmbName->setEditText(correct.name);
   	if(strcmp(lneSymbol->text(), correct.symbol) != 0)
   	{
   		tmp_ans++;
   		QMessageBox::information(this, "Wrong Answer", "The answer you put in for the symbol is incorrect. Please try again.", QMessageBox::Yes | QMessageBox::Default);
   	}
   	if(correct.atomic_mass != tmp_string.toFloat())	
   	{
   		tmp_ans++;
   		QMessageBox::information(this, "Wrong Answer", "The answer you put in for the atomic mass is incorrect. Please try again.", QMessageBox::Yes | QMessageBox::Default);
   	}
   	tmp_string = lneAtomicNumber->text();
   	if(correct.atomic_number != tmp_string.toInt())
   	{
   		tmp_ans++;
   		QMessageBox::information(this, "Wrong Answer", "The answer you put in for the atmoic number is incorrect. Please try again.", QMessageBox::Yes | QMessageBox::Default);
   	}
   	if(tmp_ans == 0)
   	{
   		rnd = 1 + ((int)(rand()) % number_elements);
  		//fprintf(stdout, "\n%i", rnd);
  		doc->fChem.setName("chem.key");	
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

  		//Atomic Mass
  		pos = tmp_string.find(':', 0, false);
  		sep = tmp_string.left(pos);
  		correct.atomic_mass = sep.toFloat();

	
  		fprintf(stdout, "\nAtomic Number: %i", correct.atomic_number);
  		fprintf(stdout, "\nElement: %s", (const char *)correct.name);
  		fprintf(stdout, "\nSymbol: %s", (const char *)correct.symbol);
  		fprintf(stdout, "\nAtomic Mass: %f", correct.atomic_mass);
   	}
   }		   	
   			
   if(rdoSymbol->isChecked())
   {
     tmp_string = lneAtomicMass->text();
   	if(strcmp(cmbName->text(cmbName->currentItem()), correct.name) != 0)
   	{
   		tmp_ans++;
   		QMessageBox::information(this, "Wrong Answer", "The answer you put in for the name is incorrect. Please try again.", QMessageBox::Yes | QMessageBox::Default);
   	}
   	if(strcmp(lneSymbol->text(), correct.symbol) != 0)
   		lneSymbol->setText(correct.symbol);
   	if(correct.atomic_mass != tmp_string.toFloat())	
   	{
   		tmp_ans++;
   		QMessageBox::information(this, "Wrong Answer", "The answer you put in for the atomic mass is incorrect. Please try again.", QMessageBox::Yes | QMessageBox::Default);
   	}
   	tmp_string = lneAtomicNumber->text();
   	if(correct.atomic_number != tmp_string.toInt())
   	{
   		tmp_ans++;
   		QMessageBox::information(this, "Wrong Answer", "The answer you put in for the atmoic number is incorrect. Please try again.", QMessageBox::Yes | QMessageBox::Default);
   	}
   	if(tmp_ans == 0)
   	{
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

  		//Atomic Mass
  		pos = tmp_string.find(':', 0, false);
  		sep = tmp_string.left(pos);
  		correct.atomic_mass = sep.toFloat();

	
  		fprintf(stdout, "\nAtomic Number: %i", correct.atomic_number);
  		fprintf(stdout, "\nElement: %s", (const char *)correct.name);
  		fprintf(stdout, "\nSymbol: %s", (const char *)correct.symbol);
  		fprintf(stdout, "\nAtomic Mass: %f", correct.atomic_mass);
   	}
   }		

   if(rdoAtomicNumber->isChecked())
   {
   	tmp_string = lneAtomicMass->text();
   	if(strcmp(cmbName->text(cmbName->currentItem()), correct.name) != 0)
   	{
   		tmp_ans++;
   		QMessageBox::information(this, "Wrong Answer", "The answer you put in for the name is incorrect. Please try again.", QMessageBox::Yes | QMessageBox::Default);
   	}
   	if(strcmp(lneSymbol->text(), correct.symbol) != 0)
   	{
   		tmp_ans++;
   		QMessageBox::information(this, "Wrong Answer", "The answer you put in for the symbol is incorrect. Please try again.", QMessageBox::Yes | QMessageBox::Default);
   	}
   	if(correct.atomic_mass != tmp_string.toFloat())	
   	{
   		tmp_ans++;
   		QMessageBox::information(this, "Wrong Answer", "The answer you put in for the atomic mass is incorrect. Please try again.", QMessageBox::Yes | QMessageBox::Default);
   	}
   	tmp_string = lneAtomicNumber->text();
   	if(correct.atomic_number != tmp_string.toInt())
   		lneAtomicNumber->setText((const char*)correct.atomic_number);
   	if(tmp_ans == 0)
   	{
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

  		//Atomic Mass
  		pos = tmp_string.find(':', 0, false);
  		sep = tmp_string.left(pos);
  		correct.atomic_mass = sep.toFloat();

	
  		fprintf(stdout, "\n1Atomic Number: %i", correct.atomic_number);
  		fprintf(stdout, "\nElement: %s", (const char *)correct.name);
  		fprintf(stdout, "\nSymbol: %s", (const char *)correct.symbol);
  		fprintf(stdout, "\nAtomic Mass: %f", correct.atomic_mass);
   	}
   }	*/		
}
/** shows the correct answer, then picks
another element at random. */
void ElementQuizView::slotShowAnswer(void)
{
}
