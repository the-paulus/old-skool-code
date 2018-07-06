#ifndef CMENUMAIN_H
#define CMENUMAIN_H

/*standard c*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*QT*/
#include <qstring.h>
#include <qmainwindow.h>
#include <qapp.h>

class CMenuMain : public QMainWindow
{
   Q_OBJECT
 public:
   CMenuMain();
   ~CMenuMain();
   void initView();
   
 private:
   CMenuView *view;
   CMenuDoc *doc;
};
#endif
   
