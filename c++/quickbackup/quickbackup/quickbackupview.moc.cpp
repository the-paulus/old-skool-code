/****************************************************************************
** QuickBackupView meta object code from reading C++ file 'quickbackupview.h'
**
** Created: Fri Nov 3 19:59:37 2000
**      by: The Qt Meta Object Compiler ($Revision: 2.25.2.12 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 2
#elif Q_MOC_OUTPUT_REVISION != 2
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "./quickbackupview.h"
#include <qmetaobject.h>


const char *QuickBackupView::className() const
{
    return "QuickBackupView";
}

QMetaObject *QuickBackupView::metaObj = 0;


#if QT_VERSION >= 200
static QMetaObjectInit init_QuickBackupView(&QuickBackupView::staticMetaObject);

#endif

void QuickBackupView::initMetaObject()
{
    if ( metaObj )
	return;
    if ( strcmp(QWidget::className(), "QWidget") != 0 )
	badSuperclassWarning("QuickBackupView","QWidget");

#if QT_VERSION >= 200
    staticMetaObject();
}

void QuickBackupView::staticMetaObject()
{
    if ( metaObj )
	return;
    QWidget::staticMetaObject();
#else

    QWidget::initMetaObject();
#endif

    typedef void(QuickBackupView::*m1_t0)();
    m1_t0 v1_0 = &QuickBackupView::slotDocumentChanged;
    QMetaData *slot_tbl = new QMetaData[1];
    slot_tbl[0].name = "slotDocumentChanged()";
    slot_tbl[0].ptr = *((QMember*)&v1_0);
    metaObj = new QMetaObject( "QuickBackupView", "QWidget",
	slot_tbl, 1,
	0, 0 );
}
