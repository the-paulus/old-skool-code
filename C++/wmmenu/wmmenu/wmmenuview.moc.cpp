/****************************************************************************
** WmmenuView meta object code from reading C++ file 'wmmenuview.h'
**
** Created: Wed Aug 1 13:19:35 2001
**      by: The Qt MOC ($Id: qt/src/moc/moc.y   2.3.0   edited 2001-02-20 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 9
#elif Q_MOC_OUTPUT_REVISION != 9
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "wmmenuview.h"
#include <qmetaobject.h>
#include <qapplication.h>



const char *WmmenuView::className() const
{
    return "WmmenuView";
}

QMetaObject *WmmenuView::metaObj = 0;

void WmmenuView::initMetaObject()
{
    if ( metaObj )
	return;
    if ( qstrcmp(QWidget::className(), "QWidget") != 0 )
	badSuperclassWarning("WmmenuView","QWidget");
    (void) staticMetaObject();
}

#ifndef QT_NO_TRANSLATION

QString WmmenuView::tr(const char* s)
{
    return qApp->translate( "WmmenuView", s, 0 );
}

QString WmmenuView::tr(const char* s, const char * c)
{
    return qApp->translate( "WmmenuView", s, c );
}

#endif // QT_NO_TRANSLATION

QMetaObject* WmmenuView::staticMetaObject()
{
    if ( metaObj )
	return metaObj;
    (void) QWidget::staticMetaObject();
#ifndef QT_NO_PROPERTIES
#endif // QT_NO_PROPERTIES
    typedef void (WmmenuView::*m1_t0)();
    typedef void (QObject::*om1_t0)();
    typedef void (WmmenuView::*m1_t1)();
    typedef void (QObject::*om1_t1)();
    m1_t0 v1_0 = &WmmenuView::slotDocumentChanged;
    om1_t0 ov1_0 = (om1_t0)v1_0;
    m1_t1 v1_1 = &WmmenuView::slotConvertMenu;
    om1_t1 ov1_1 = (om1_t1)v1_1;
    QMetaData *slot_tbl = QMetaObject::new_metadata(2);
    QMetaData::Access *slot_tbl_access = QMetaObject::new_metaaccess(2);
    slot_tbl[0].name = "slotDocumentChanged()";
    slot_tbl[0].ptr = (QMember)ov1_0;
    slot_tbl_access[0] = QMetaData::Protected;
    slot_tbl[1].name = "slotConvertMenu()";
    slot_tbl[1].ptr = (QMember)ov1_1;
    slot_tbl_access[1] = QMetaData::Protected;
    metaObj = QMetaObject::new_metaobject(
	"WmmenuView", "QWidget",
	slot_tbl, 2,
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
