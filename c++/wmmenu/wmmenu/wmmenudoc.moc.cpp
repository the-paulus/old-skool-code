/****************************************************************************
** WmmenuDoc meta object code from reading C++ file 'wmmenudoc.h'
**
** Created: Sun Jul 29 04:02:47 2001
**      by: The Qt MOC ($Id: qt/src/moc/moc.y   2.3.0   edited 2001-02-20 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 9
#elif Q_MOC_OUTPUT_REVISION != 9
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "wmmenudoc.h"
#include <qmetaobject.h>
#include <qapplication.h>



const char *WmmenuDoc::className() const
{
    return "WmmenuDoc";
}

QMetaObject *WmmenuDoc::metaObj = 0;

void WmmenuDoc::initMetaObject()
{
    if ( metaObj )
	return;
    if ( qstrcmp(QObject::className(), "QObject") != 0 )
	badSuperclassWarning("WmmenuDoc","QObject");
    (void) staticMetaObject();
}

#ifndef QT_NO_TRANSLATION

QString WmmenuDoc::tr(const char* s)
{
    return qApp->translate( "WmmenuDoc", s, 0 );
}

QString WmmenuDoc::tr(const char* s, const char * c)
{
    return qApp->translate( "WmmenuDoc", s, c );
}

#endif // QT_NO_TRANSLATION

QMetaObject* WmmenuDoc::staticMetaObject()
{
    if ( metaObj )
	return metaObj;
    (void) QObject::staticMetaObject();
#ifndef QT_NO_PROPERTIES
#endif // QT_NO_PROPERTIES
    QMetaData::Access *slot_tbl_access = 0;
    typedef void (WmmenuDoc::*m2_t0)();
    typedef void (QObject::*om2_t0)();
    m2_t0 v2_0 = &WmmenuDoc::documentChanged;
    om2_t0 ov2_0 = (om2_t0)v2_0;
    QMetaData *signal_tbl = QMetaObject::new_metadata(1);
    signal_tbl[0].name = "documentChanged()";
    signal_tbl[0].ptr = (QMember)ov2_0;
    metaObj = QMetaObject::new_metaobject(
	"WmmenuDoc", "QObject",
	0, 0,
	signal_tbl, 1,
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

// SIGNAL documentChanged
void WmmenuDoc::documentChanged()
{
    activate_signal( "documentChanged()" );
}
