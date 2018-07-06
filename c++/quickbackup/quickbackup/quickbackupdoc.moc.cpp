/****************************************************************************
** QuickBackupDoc meta object code from reading C++ file 'quickbackupdoc.h'
**
** Created: Fri Nov 3 19:59:41 2000
**      by: The Qt Meta Object Compiler ($Revision: 2.25.2.12 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 2
#elif Q_MOC_OUTPUT_REVISION != 2
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "./quickbackupdoc.h"
#include <qmetaobject.h>


const char *QuickBackupDoc::className() const
{
    return "QuickBackupDoc";
}

QMetaObject *QuickBackupDoc::metaObj = 0;


#if QT_VERSION >= 200
static QMetaObjectInit init_QuickBackupDoc(&QuickBackupDoc::staticMetaObject);

#endif

void QuickBackupDoc::initMetaObject()
{
    if ( metaObj )
	return;
    if ( strcmp(QObject::className(), "QObject") != 0 )
	badSuperclassWarning("QuickBackupDoc","QObject");

#if QT_VERSION >= 200
    staticMetaObject();
}

void QuickBackupDoc::staticMetaObject()
{
    if ( metaObj )
	return;
    QObject::staticMetaObject();
#else

    QObject::initMetaObject();
#endif

    typedef void(QuickBackupDoc::*m2_t0)();
    m2_t0 v2_0 = &QuickBackupDoc::documentChanged;
    QMetaData *signal_tbl = new QMetaData[1];
    signal_tbl[0].name = "documentChanged()";
    signal_tbl[0].ptr = *((QMember*)&v2_0);
    metaObj = new QMetaObject( "QuickBackupDoc", "QObject",
	0, 0,
	signal_tbl, 1 );
}

// SIGNAL documentChanged
void QuickBackupDoc::documentChanged()
{
    activate_signal( "documentChanged()" );
}
