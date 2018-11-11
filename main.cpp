#include <qapplication.h>
#include <qfont.h>

#include "quickbackup.h"

int main(int argc, char *argv[])
{
  QApplication a(argc, argv);
  a.setFont(QFont("helvetica", 12));
  /* uncomment the following line, if you want a Windows 95 look*/
  a.setStyle(WindowsStyle);
    
  QuickBackup *quickbackup=new QuickBackup();
  a.setMainWidget(quickbackup);

  quickbackup->setCaption("Document 1");
  quickbackup->show();

  return a.exec();
}
