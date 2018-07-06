#ifndef CMENUVIEW_H
#define CMENUVIEW_H

/*QT*/
#include <qwidget.h>
#include <qcombobox.h>
#include <qlabel.h>
#include <qbutton.h>
#include <qtextfield.h>
#include <qdir.h>
#include <qcollection.h>
#include <qfile.h>

/*program headers*/
#include "CMenuDoc.h"

/*constants*/
#define WM_KDE 1 /*kde 1*/
#define WM_KDE2 2 /*kde 2*/
#define WM_AS 3 /*afterstep*/
#define WM_BB 4 /*blackbox*/
#define WM_GNOME 5 /*gnome*/
#define WM_ICEWM 6 /*icewm*/
#define WM_SAWFISH 7 /*sawfish*/
#define WM_E 8 /*enlightenment*/

class CMenuView : public QWidget
{
   Q_OBJECT
 public:
   CMenuView(QWidget *parent=0, CMenuDoc *doc=0);
   ~CMenuView();
   
 protected slots:
   void slotDocumentChanged(void);
   void slotConvertMenu(int _wm);
   void slotQuit(void);
 
 protected:
     void resizeEvent(QResizeEvent *);
   
 private:
   QComboBox *cmb_from;
   QComboBox *cmb_to;
   QLabel *lbl_from;
   QLabel *lbl_to;
   QLabel *lbl_file;
   QTextField *txt_location;
   QButton *btn_convert;
   QButton *btn_quit;
   QDir *dir_from;
   QDir *dir_to;
   QFile *file_from;
   QFile *file_to;
};
   
   
