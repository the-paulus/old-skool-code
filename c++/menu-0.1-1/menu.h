/*#ifndef _MENU_H_
#define _MENU_H_*/

#include <qwindow.h>
#include <qdir.h>
#include <qapp.h>
#include <qfile.h>
#include <qapplication.h>
#include <qbutton.h>
#include <qcollection.h>
#include <qtextfield.h>
#include <qlabel.h>
#include <qlistbox.h>

/*class CMain : QWindow
{
   Q_OBJECT
   public:
     CMain();
     ~CMain();
     void initView(void);
     
    private:
	CMenuView *menu_view;
}*/

class CMenuView : QWidget
{
    Q_OBJECT
    public:
	CMenuView(QWidget *parent=0);
	~CMenuView();
protected slots:
    void slotConvert(void);
    void slotQuit(void);
    
private:
    QDir *dir;
    QFile *file;
    QButton *btn_Convert;
    QButton *btn_Quit;
    QCollection *col_dirs;
    QTextField *tf_path_from;
    QTextFirld *tf_path_to;
    QLabel *lbl_from;
    QLabel *lbl_to;
    
}

/*CMain::CMain()
{
   initView();*/

CMenuView::CMenuView(QWidget *parent) : QWidget(parent)
{
   
