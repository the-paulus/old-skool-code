/***************************************************************************
                          wmmenuview.cpp  -  description
                             -------------------
    begin                : Sun Jul 29 03:50:44 CDT 2001
    copyright            : (C) 2001 by Paul Lyon
    email                : paulus@ticon.net
 ***************************************************************************/

/***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/

#include <qmessagebox.h>
#include <qapp.h>
#include <qfont.h>
#include <stdio.h>

#include "wmmenuview.h"

WmmenuView::WmmenuView(QWidget *parent, WmmenuDoc *doc) : QWidget(parent)
{
  /** connect doc with the view*/
  connect(doc, SIGNAL(documentChanged()), this, SLOT(slotDocumentChanged()));
/*Create objects*/

	//Label: lbl_from
	lbl_from = new QLabel("From", this);
	lbl_from->setFont(QFont("Helvetica", 12, QFont::Bold));
	lbl_from->setGeometry(8, 8, (this->width() /2), lbl_from->height());
	lbl_from->show();
	
	//Label: lbl_to
	lbl_to = new QLabel("To", this);
	lbl_to->setFont(QFont("Helvetica", 12, QFont::Bold));
	lbl_to->setGeometry(8, (lbl_from->y() + lbl_from->height() + 8), (this->width() /2), lbl_to->height());
	lbl_to->show();
	
	//Label: lbl_file
	lbl_file = new QLabel("Location", this);
	lbl_file->setFont(QFont("Helvetica", 12, QFont::Bold));
	lbl_file->setGeometry(8, (lbl_to->y() + lbl_to->height() + 8), (this->width() /2), lbl_file->height());
	lbl_file->show();
	
	//Combo box: cmb_from
	cmb_from = new QComboBox(this);
	cmb_from->insertItem("KDE", WMKDE);
	cmb_from->insertItem("KDE2", WMKDE2);
	cmb_from->insertItem("After Step", WMAS);
	cmb_from->insertItem("Black Box", WMBB);
	cmb_from->insertItem("Gnome", WMGNOME);
	cmb_from->insertItem("IceWM", WMICEWM);
	cmb_from->insertItem("Sawfish", WMSAWFISH);
	cmb_from->insertItem("Enlightenment", WME);
	cmb_from->setGeometry((lbl_from->x() + lbl_from->width() + 8), 8, (this->width()), cmb_from->height());
	cmb_from->show();
	for(int i=0; i <= 7; i++)
		printf("\n%s is %i", (const char*)cmb_from->text(i), i);
		
	//Combo Box: cmb_to
	cmb_to = new QComboBox(this);
	cmb_to->insertItem("KDE", WMKDE);
	cmb_to->insertItem("KDE2", WMKDE2);
	cmb_to->insertItem("After Step", WMAS);
	cmb_to->insertItem("Black Box", WMBB);
	cmb_to->insertItem("Gnome", WMGNOME);
	cmb_to->insertItem("IceWM", WMICEWM);
	cmb_to->insertItem("Sawfish", WMSAWFISH);
	cmb_to->insertItem("Enlightenment", WME);
	cmb_to->setGeometry((lbl_to->x() + lbl_to->width() + 8), (cmb_from->y() + cmb_from->height() + 8), (this->width()), cmb_to->height());
	cmb_to->show();
	
	//QLineEdit: led_location
	led_location = new QLineEdit(this);
	led_location->setGeometry((lbl_file->x() + lbl_file->width() + 8), (cmb_to->y() + cmb_to->height() + 8), (this->width()), led_location->height());
	led_location->show();
	
	//QPushButton: btn_convert
	btn_convert = new QPushButton("Convert", this);
	btn_convert->setGeometry(8, (led_location->y() + led_location->height() + 8), this->width(), btn_convert->height());
	btn_convert->show();
	
	//QPushButton: btn_quit
	btn_quit = new QPushButton("Quit", this);
	btn_quit->setGeometry((btn_convert->x() + btn_convert->width() + 8), (led_location->y() + led_location->height() + 8), this->width(), btn_convert->height());
	btn_quit->show();
	
	//resize
	led_location->resize((btn_quit->x() + btn_quit->width()), led_location->height());
	cmb_from->resize((btn_quit->x() + btn_quit->width()), led_location->height());
	cmb_to->resize((btn_quit->x() + btn_quit->width()), led_location->height());
	
	connect(btn_quit, SIGNAL(clicked()), , SLOT(quit()));
	
}

void WmmenuView::slotConvertMenu(void)
{
	int wm_from = this->cmb_from->currentItem();
	int wm_to = this->cmb_to->currentItem();
	int crtn = 0;
	
	/*switch(wm_from)
	{
		case WMKDE:
			switch(wm_to)
			{
				case WMKDE:
					QMessageBox::information(this, "Menu Converter", "Converting a KDE menu to a KDE menu would seem\nrather pointless. Wouldn't you think so?");
					break;
				case WMKDE2:
					crtn = KDEtoKDE2();
					break;
				case WMAS:
					crtn = KDEtoAfterStep();
					break;
				case WMBB:
					crtn = KDEtoBlackBox();
					break;
				case WMGNOME:
					crtn = KDEtoGnome();
					break;
				case WMICEWM:
					crtn = KDEtoIce();
					break;
				case WMSAWFISH:
					crtn = KDEtoSawFish();
					break;
				case WME:
					crtn = KDEtoEnlightenment();
					break;
			}
			break;
		case WMKDE2:
			switch(wm_to)
			{
				case WMKDE:
					crtn = KDEtoKDE2();
					break;
				case WMKDE2:
					QMessageBox::information(this, "Menu Converter", "Converting a KDE2 menu to a KDE2 menu would seem\nrather pointless. Wouldn't you think so?");
					break;
				case WMAS:
					crtn = KDEtoAfterStep();
					break;
				case WMBB:
					crtn = KDEtoBlackBox();		
					break;
				case WMGNOME:
					crtn = KDEtoGnome();
					break;
				case WMICEWM:
					crtn = KDEtoIce();
					break;
				case WMSAWFISH:
					crtn = KDEtoSawFish();
					break;
				case WME:
					crtn = KDEtoEnlightenment();
					break;
				}
				break;
			case WMAS:
				switch(wm_to)
				{
					case WMKDE:
						crtn = KDEtoKDE2();
						break;
					case WMKDE2:
						crtn = KDEtoKDE2();
						break;
					case WMAS:
						QMessageBox::information(this, "Menu Converter",
												 "Converting an After Step menu to an After Step menu would seem\n"
												 "a little pointless. Wouldn't you think so?");
						break;
					case WMBB:
						crtn = KDEtoBlackBox();
						break;
					case WMGNOME:
						crtn = KDEtoGnome();
						break;
					case WMICEWM:
						crtn = KDEtoIce();
						break;
					case WMSAWFISH:
						crtn = KDEtoSawFish();
						break;
					case WME:
						crtn = KDEtoEnlightenement();
						break;
				}
				break;
			case WMBB:
				switch(wm_to)
				{
					case WMKDE:
						crtn = KDEtoKDE2();
						break;
					case WMKDE2:
						crtn = KDEtoKDE2();
						break;
					case WMAS:
						crtn = KDEtoAfterStep();
						break;
					case WMBB:
						QMessageBox::information(this,"Menu Converter",
												"Converting a Black Box menu to a Black Box menu would seem\n" //Message
											 	"rather pointless. Wouldn't you think so?");       //rest of message		
						break;
					case WMGNOME:
						crtn = KDEtoGnome();
						break;
					case WMICEWM:
						crtn = KDEtoIce();
						break;
					case WMSAWFISH:
						crtn = KDEtoSawFish();
						break;
					case WME:
						crtn = KDEtoEnlightenement();
						break;
				}
				break;
			case WMGNOME:
				switch(wm_to)
				{
					case WMKDE:
						crtn = KDEtoKDE2();
						break;
					case WMKDE2:
						crtn = KDEtoKDE2();
						break;
					case WMAS:
						crtn = KDEtoAfterStep();
						break;
					case WMBB:
						crtn = KDEtoBlackBox();
						break;
					case WMGNOME:
						QMessageBox::information(this,"Menu Converter",
												"Converting a Gnome menu to a Gnome menu would seem\n" //Message
											 	"rather pointless. Wouldn't you think so?");       //rest of mess
						break;
					case WMICEWM:
						crtn = KDEtoIce();
						break;
					case WMSAWFISH:
						crtn = KDEtoSawFish();
						break;
					case WME:
						crtn = KDEtoEnlightenement();
						break;
				}
				break;
			case WMICEWM:
				switch(wm_to)
				{
					case WMKDE:
						crtn = KDEtoKDE2();
						break;
					case WMKDE2:
						crtn = KDEtoKDE2();
						break;
					case WMAS:
						crtn = KDEtoAfterStep();
						break;
					case WMBB:
						crtn = KDEtoBlackBox();
						break;
					case WMGNOME:
						crtn = KDEtoGnome();
						break;
					case WMICEWM:
						QMessageBox::information(this,"Menu Converter",
												"Converting an IceWM menu to an IceWM menu would seem\n" //Message
											 	"rather pointless. Wouldn't you think so?");       //rest of mess
						break;
					case WMSAWFISH:
						crtn = KDEtoSawFish();
						break;
					case WME:
						crtn = KDEtoEnlightenement();
						break;
				}
				break;
			case WMSAWFISH:
				switch(wm_to)
				{
					case WMKDE:
						crtn = KDEtoKDE2();
						break;
					case WMKDE2:
						crtn = KDEtoKDE2();
						break;
					case WMAS:
						crtn = KDEtoAfterStep();
						break;
					case WMBB:
						crtn = KDEtoBlackBox();
						break;
					case WMGNOME:
						crtn = KDEtoGnome();
						break;
					case WMICEWM:
						crtn = KDEtoIce();
						break;
					case WMSAWFISH:
						QMessageBox::information(this,"Menu Converter",
												"Converting a Saw Fish menu to a Saw Fish menu would seem\n" //Message
											 	"rather pointless. Wouldn't you think so?");       //rest of mess
						break;
					case WME:
						crtn = KDEtoEnlightenement();
						break;
				}
				break;
			case WME:
				switch(wm_to)
				{
					case WMKDE:
						crtn = KDEtoKDE2();
						break;
					case WMKDE2:
						crtn = KDEtoKDE2();
						break;
					case WMAS:
						crtn = KDEtoAfterStep();
						break;
					case WMBB:
						crtn = KDEtoBlackBox();
						break;
					case WMGNOME:
						crtn = KDEtoGnome();
						break;
					case WMICEWM:
						crtn = KDEtoIce();
						break;
					case WMSAWFISH:
						crtn = KDEtoSawFish();
						break;
					case WME:
						QMessageBox::information(this,"Menu Converter",
												"Converting an Enlightenment menu to an Enlightenment menu would seem\n" //Message
											 	"rather pointless. Wouldn't you think so?");       //rest of mess
						break;
				}
				
			}*/
		
}

WmmenuView::~WmmenuView()
{
}

void WmmenuView::slotDocumentChanged()
{
  //TODO update the view

}

int WmmenuView::KDEtoAfterStep(void)
{
	return 0;
}

int WmmenuView::KDEtoBlackBox(void)
{
	return 0;
}

int WmmenuView::KDEtoEnlightenment(void)
{
	return 0;
}

int WmmenuView::KDEtoGnome(void)
{
	return 0;
}

int WmmenuView::KDEtoIce(void)
{
	return 0;
}

int WmmenuView::KDEtoKDE2(void)
{
	return 0;
}

int WmmenuView::KDEtoSawFish(void)
{
	return 0;
}

void WmmenuView::resizeEvent(QResizeEvent *)
{
}