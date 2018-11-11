/****************************************************************************
** ChemistryView meta object code from reading C++ file 'chemistryview.h'
**
** Created: Wed Sep 13 15:54:50 2000
**      by: The Qt Meta Object Compiler ($Revision: 2.25.2.12 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 2
#elif Q_MOC_OUTPUT_REVISION != 2
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "./chemistryview.h"
#include <qmetaobject.h>


const char *ChemistryView::className() const
{
    return "ChemistryView";
}

QMetaObject *ChemistryView::metaObj = 0;


#if QT_VERSION >= 200
static QMetaObjectInit init_ChemistryView(&ChemistryView::staticMetaObject);

#endif

void ChemistryView::initMetaObject()
{
    if ( metaObj )
	return;
    if ( strcmp(QWidget::className(), "QWidget") != 0 )
	badSuperclassWarning("ChemistryView","QWidget");

#if QT_VERSION >= 200
    staticMetaObject();
}

void ChemistryView::staticMetaObject()
{
    if ( metaObj )
	return;
    QWidget::staticMetaObject();
#else

    QWidget::initMetaObject();
#endif

    typedef void(ChemistryView::*m1_t0)();
    m1_t0 v1_0 = &ChemistryView::slotDocumentChanged;
    QMetaData *slot_tbl = new QMetaData[1];
    slot_tbl[0].name = "slotDocumentChanged()";
    slot_tbl[0].ptr = *((QMember*)&v1_0);
    metaObj = new QMetaObject( "ChemistryView", "QWidget",
	slot_tbl, 1,
	0, 0 );
}
