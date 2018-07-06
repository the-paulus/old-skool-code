#include "CMenuMain.h"

CMenuMain::CMenuMain()
{
   
   setCaption("Menu Converter");

   /*initMenuBar(); we dont have a menubar*/
   /*initToolBar(); we dont have a toolbar*/
   /*initStatusBar(); we dont have a status bar either*/
   
   initDoc();
   initView();
   
}

CMenuMain::~CMenuMain()
{
}


void CMenuMain::initDoc(void)
{
   
   doc = new CMenuDoc();
   
}


void CMenuMain::initView(void)
{
   
   view = new CMenuView(this, doc);
   setCentralWidget(view);
}


