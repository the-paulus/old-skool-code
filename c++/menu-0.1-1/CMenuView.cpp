#include "CMenuView.h"

CMenuView::CMenuView(QWidget *parent, CMenuDoc *doc) : QWidget(parent)
{
	connect(doc, SIGNAL(documentChanged()), this, SLOT(slotDocumentChanged()));

	/*Create objects*/
	cmb_from = new QComboBox(this);
	cmb_to = new QComboBox(this);
	lbl_from = new QLabel("From", this);
	lbl_to = new QLabel("To", this);
	lbl_file = new QLabel("Location", this);
	txt_location = new QTextField(
	btn_convert = new QButton(
	btn_quit = new QButton(
	dir_from = new QDir(
	dir_to = new QDir(
	file_from = new QFile(
	file_to = new QFile(

	setBaseSize(400, 300);

	lbl_from->setFont(new QFont("Helvetica", 12, QFont::Bold));
	lbl_to->setFont(new QFont("Helvetica", 12, QFont::Bold));
	lbl_file->setFont(new QFont("Helvetica", 12, QFont::Bold));
	
	lbl_from->setAutoResize(true);
	lbl_to->setAutoResize(true);
	lbl_file->setAutoResize(true);

	lbl_from->setGeometry(8, 8, (this->width() /3), lbl_from->height());
	lbl_to->setGeometry((lbl_from->width()+lbl_from->x()+8), 8, (this->width()/3), 
	lbl_file->setGeometry

	cmb_from->insertItem("KDE", WMKDE);
	cmb_from->insertItem("KDE2", WMKDE2);
	cmb_from->insertItem("After Step", WMAS);
	cmb_from->insertItem("Black Box", WMBB);
	cmb_from->insertItem("Gnome", WMGNOME);
	cmb_from->insertItem("IceWM", WMICEWM);
	cmb_from->insertItem("Sawfish", WMSAWFISH);
	cmb_from->insertItem("Enlightenment", WME);

	cmb_to->insertItem("KDE", WMKDE);
	cmb_to->insertItem("KDE2", WMKDE2);
	cmb_to->insertItem("After Step", WMAS);
	cmb_to->insertItem("Black Box", WMBB);
	cmb_to->insertItem("Gnome", WMGNOME);
	cmb_to->insertItem("IceWM", WMICEWM);
	cmb_to->insertItem("Sawfish", WMSAWFISH);
	cmb_to->insertItem("Enlightenment", WME);
}

void CMenuView::slotConvertMenu(int _wm)
{
	switch(_wm)
	{
		case WMKDE:
			
	
