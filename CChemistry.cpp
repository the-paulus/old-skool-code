#include "CChemistry.h"

CChemistry::CChemistry(QWidget *parent, const char *name) : QWidget(parent, name)
{
   chemkey = new QFile("chemistry.key");
   
   txtNumber = new QLineEdit(this);
   txtNumber->setGeometry(8, 8, 32, 24);
   
   txtSymbol = new QLineEdit(this);
   txtSymbol->setFont(QFont("Times", 16, QFont::Bold));
   txtSymbol->setGeometry(40, 48, 47, 32);
   
   txtMass = new QLineEdit(this);
   txtMass->setGeometry(40, 8, 32, 24);
   
   cmbName = new QComboBox(this, FALSE);
   cmbName->setGeometry(16, 56, 39, 32);
   
   chbNumber = new QCheckBox(this);
   chbNumber->setGeometry(95, 8, 32, 24);
   
   chbMass = new QCheckBox(this);
   chbMass->setGeometry(95, 32, 32, 24);
   
   chbSymbol = new QCheckBox(this);
   chbSymbol->setGeometry(95, 40, 32, 24);
   
   chbName = new QCheckBox(this);
   chbName->setGeometry(95, 48, 32, 24);
   
   btnStart = new QPushButton(this, "Start");
   btnStart->move(95, 56);
   connect(btnStart, SIGNAL(clicked()), this, SLOT(slotStart()));
   
   btnQuit = new QPushButton(this, "Quit");
   btnQuit->move(103, 56);
   connect(btnQuit, SIGNAL(clicked()), app, SLOT(quit()));
}
   
   
