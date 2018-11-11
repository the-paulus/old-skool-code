#include <qwidget.h>
#include <qfont.h>
#include <qapplication.h>
#include <qapp.h>
#include <qfile.h>
#include <qlabel.h>
#include <qpushbutton.h>
#include <qcheckbox.h>
#include <qlineedit.h>
#include <qcombobox.h>

class CChemistry : public QWidget
{
 public:
   CChemistry(QWidget *parent=0, const char *name=0);
   ~CChemistry();
 
 protected slots:
   void slotStart(void);
   
 private:
   QFile *chemkey;
   QLineEdit *txtNumber;
   QLineEdit *txtSymbol;
   QLineEdit *txtMass;
   QComboBox *cmbName;
   QPushButton *btnStart;
   QPushButton *btnQuit;
   QCheckBox *chbNumber;
   QCheckBox *chbMass;
   QCheckBox *chbSymbol;
   QCheckBox *chbName;
   
}
