/****************************************************************************
** WmmenuApp meta object code from reading C++ file 'wmmenu.h'
**
** Created: Sun Jul 29 05:59:07 2001
**      by: The Qt MOC ($Id: qt/src/moc/moc.y   2.3.0   edited 2001-02-20 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 9
#elif Q_MOC_OUTPUT_REVISION != 9
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "wmmenu.h"
#include <qmetaobject.h>
#include <qapplication.h>



const char *WmmenuApp::className() const
{
    return "WmmenuApp";
}

QMetaObject *WmmenuApp::metaObj = 0;

void WmmenuApp::initMetaObject()
{
    if ( metaObj )
	return;
    if ( qstrcmp(QMainWindow::className(), "QMainWindow") != 0 )
	badSuperclassWarning("WmmenuApp","QMainWindow");
    (void) staticMetaObject();
}

#ifndef QT_NO_TRANSLATION

QString WmmenuApp::tr(const char* s)
{
    return qApp->translate( "WmmenuApp", s, 0 );
}

QString WmmenuApp::tr(const char* s, const char * c)
{
    return qApp->translate( "WmmenuApp", s, c );
}

#endif // QT_NO_TRANSLATION

QMetaObject* WmmenuApp::staticMetaObject()
{
    if ( metaObj )
	return metaObj;
    (void) QMainWindow::staticMetaObject();
#ifndef QT_NO_PROPERTIES
#endif // QT_NO_PROPERTIES
    QMetaData::Access *slot_tbl_access = 0;
    metaObj = QMetaObject::new_metaobject(
	"WmmenuApp", "QMainWindow",
	0, 0,
	0, 0,
#ifndef QT_NO_PROPERTIES
	0, 0,
	0, 0,
#endif // QT_NO_PROPERTIES
	0, 0 );
    metaObj->set_slot_access( slot_tbl_access );
#ifndef QT_NO_PROPERTIES
#endif // QT_NO_PROPERTIES
    return metaObj;
}
