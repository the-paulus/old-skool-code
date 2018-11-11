/****************************************************************************
** QuickBackup meta object code from reading C++ file 'quickbackup.h'
**
** Created: Fri Nov 3 19:59:39 2000
**      by: The Qt Meta Object Compiler ($Revision: 2.25.2.12 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 2
#elif Q_MOC_OUTPUT_REVISION != 2
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "./quickbackup.h"
#include <qmetaobject.h>


const char *QuickBackup::className() const
{
    return "QuickBackup";
}

QMetaObject *QuickBackup::metaObj = 0;


#if QT_VERSION >= 200
static QMetaObjectInit init_QuickBackup(&QuickBackup::staticMetaObject);

#endif

void QuickBackup::initMetaObject()
{
    if ( metaObj )
	return;
    if ( strcmp(QMainWindow::className(), "QMainWindow") != 0 )
	badSuperclassWarning("QuickBackup","QMainWindow");

#if QT_VERSION >= 200
    staticMetaObject();
}

void QuickBackup::staticMetaObject()
{
    if ( metaObj )
	return;
    QMainWindow::staticMetaObject();
#else

    QMainWindow::initMetaObject();
#endif

    typedef void(QuickBackup::*m1_t0)(int);
    typedef void(QuickBackup::*m1_t1)();
    typedef void(QuickBackup::*m1_t2)();
    typedef void(QuickBackup::*m1_t3)();
    typedef void(QuickBackup::*m1_t4)();
    typedef void(QuickBackup::*m1_t5)();
    typedef void(QuickBackup::*m1_t6)();
    typedef void(QuickBackup::*m1_t7)();
    typedef void(QuickBackup::*m1_t8)();
    typedef void(QuickBackup::*m1_t9)();
    typedef void(QuickBackup::*m1_t10)();
    typedef void(QuickBackup::*m1_t11)();
    typedef void(QuickBackup::*m1_t12)();
    typedef void(QuickBackup::*m1_t13)();
    typedef void(QuickBackup::*m1_t14)(const QString&);
    m1_t0 v1_0 = &QuickBackup::statusCallback;
    m1_t1 v1_1 = &QuickBackup::slotFileNew;
    m1_t2 v1_2 = &QuickBackup::slotFileOpen;
    m1_t3 v1_3 = &QuickBackup::slotFileSave;
    m1_t4 v1_4 = &QuickBackup::slotFileSaveAs;
    m1_t5 v1_5 = &QuickBackup::slotFileClose;
    m1_t6 v1_6 = &QuickBackup::slotFileQuit;
    m1_t7 v1_7 = &QuickBackup::slotBackupAdd;
    m1_t8 v1_8 = &QuickBackup::slotBackupDelete;
    m1_t9 v1_9 = &QuickBackup::slotBackupRefresh;
    m1_t10 v1_10 = &QuickBackup::slotBackupOptions;
    m1_t11 v1_11 = &QuickBackup::slotBackupBackup;
    m1_t12 v1_12 = &QuickBackup::slotHelpAbout;
    m1_t13 v1_13 = &QuickBackup::slotHelpHomePage;
    m1_t14 v1_14 = &QuickBackup::slotStatusHelpMsg;
    QMetaData *slot_tbl = new QMetaData[15];
    slot_tbl[0].name = "statusCallback(int)";
    slot_tbl[1].name = "slotFileNew()";
    slot_tbl[2].name = "slotFileOpen()";
    slot_tbl[3].name = "slotFileSave()";
    slot_tbl[4].name = "slotFileSaveAs()";
    slot_tbl[5].name = "slotFileClose()";
    slot_tbl[6].name = "slotFileQuit()";
    slot_tbl[7].name = "slotBackupAdd()";
    slot_tbl[8].name = "slotBackupDelete()";
    slot_tbl[9].name = "slotBackupRefresh()";
    slot_tbl[10].name = "slotBackupOptions()";
    slot_tbl[11].name = "slotBackupBackup()";
    slot_tbl[12].name = "slotHelpAbout()";
    slot_tbl[13].name = "slotHelpHomePage()";
    slot_tbl[14].name = "slotStatusHelpMsg(const QString&)";
    slot_tbl[0].ptr = *((QMember*)&v1_0);
    slot_tbl[1].ptr = *((QMember*)&v1_1);
    slot_tbl[2].ptr = *((QMember*)&v1_2);
    slot_tbl[3].ptr = *((QMember*)&v1_3);
    slot_tbl[4].ptr = *((QMember*)&v1_4);
    slot_tbl[5].ptr = *((QMember*)&v1_5);
    slot_tbl[6].ptr = *((QMember*)&v1_6);
    slot_tbl[7].ptr = *((QMember*)&v1_7);
    slot_tbl[8].ptr = *((QMember*)&v1_8);
    slot_tbl[9].ptr = *((QMember*)&v1_9);
    slot_tbl[10].ptr = *((QMember*)&v1_10);
    slot_tbl[11].ptr = *((QMember*)&v1_11);
    slot_tbl[12].ptr = *((QMember*)&v1_12);
    slot_tbl[13].ptr = *((QMember*)&v1_13);
    slot_tbl[14].ptr = *((QMember*)&v1_14);
    metaObj = new QMetaObject( "QuickBackup", "QMainWindow",
	slot_tbl, 15,
	0, 0 );
}
