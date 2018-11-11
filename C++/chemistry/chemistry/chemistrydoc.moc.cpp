/****************************************************************************
** ChemistryDoc meta object code from reading C++ file 'chemistrydoc.h'
**
** Created: Wed Sep 13 15:54:48 2000
**      by: The Qt Meta Object Compiler ($Revision: 2.25.2.12 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 2
#elif Q_MOC_OUTPUT_REVISION != 2
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "./chemistrydoc.h"
#include <qmetaobject.h>


const char *ChemistryDoc::className() const
{
    return "ChemistryDoc";
}

QMetaObject *ChemistryDoc::metaObj = 0;


#if QT_VERSION >= 200
static QMetaObjectInit init_ChemistryDoc(&ChemistryDoc::staticMetaObject);

#endif

void ChemistryDoc::initMetaObject()
{
    if ( metaObj )
	return;
    if ( strcmp(QObject::className(), "QObject") != 0 )
	badSuperclassWarning("ChemistryDoc","QObject");

#if QT_VERSION >= 200
    staticMetaObject();
}

void ChemistryDoc::staticMetaObject()
{
    if ( metaObj )
	return;
    QObject::staticMetaObject();
#else

    QObject::initMetaObject();
#endif

    typedef void(ChemistryDoc::*m2_t0)();
    m2_t0 v2_0 = &ChemistryDoc::documentChanged;
    QMetaData *signal_tbl = new QMetaData[1];
    signal_tbl[0].name = "documentChanged()";
    signal_tbl[0].ptr = *((QMember*)&v2_0);
    metaObj = new QMetaObject( "ChemistryDoc", "QObject",
	0, 0,
	signal_tbl, 1 );
}

// SIGNAL documentChanged
void ChemistryDoc::documentChanged()
{
    activate_signal( "documentChanged()" );
}
