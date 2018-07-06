#include <qapplication.h>
#include <qfont.h>

#include <CMain.h>

int main(int argc, char *argv[])
{
   QApplication a(argc, argv);
   a.setFont(QFont("helvetica", 12));
   a.setStyle(WindowsStyle);
   
   CMain *cmain = new CMain();
   a.setMainWidget(cmain);
   
   cmain->show();
   
   return a.exec();
}
