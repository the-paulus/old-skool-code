#include <qapplication.h>
#include <qfont.h>
#include "CMenuMain.h"

int main(int argc, char *argv[])
{
   QApplication a(argc, argv);
   a.setFont(QFont("helvectica", 12));
   
   a.setStyle(WindowStyle);
   
   CMenu *menuapp = new CMenu();
   a.setMainWidget(menuapp);
   
   menuapp->setCaption("Conver Menu File");
   menuapp->show();
   
   return a.exec();
}

   
  
