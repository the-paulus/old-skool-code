/****************************************************************************
** ElementQuizView meta object code from reading C++ file 'elementquizview.h'
**
** Created: Sun Oct 17 20:35:24 1999
**      by: The Qt Meta Object Compiler ($Revision: 2.25.2.12 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 2
#elif Q_MOC_OUTPUT_REVISION != 2
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "./elementquizview.h"
#include <qmetaobject.h>


const char *ElementQuizView::className() const
{
    return "ElementQuizView";
}

QMetaObject *ElementQuizView::metaObj = 0;


#if QT_VERSION >= 200
static QMetaObjectInit init_ElementQuizView(&ElementQuizView::staticMetaObject);

#endif

void ElementQuizView::initMetaObject()
{
    if ( metaObj )
	return;
    if ( strcmp(QWidget::className(), "QWidget") != 0 )
	badSuperclassWarning("ElementQuizView","QWidget");

#if QT_VERSION >= 200
    staticMetaObject();
}

void ElementQuizView::staticMetaObject()
{
    if ( metaObj )
	return;
    QWidget::staticMetaObject();
#else

    QWidget::initMetaObject();
#endif

    typedef void(ElementQuizView::*m1_t0)();
    typedef void(ElementQuizView::*m1_t1)();
    typedef void(ElementQuizView::*m1_t2)();
    m1_t0 v1_0 = &ElementQuizView::slotDocumentChanged;
    m1_t1 v1_1 = &ElementQuizView::slotNext;
    m1_t2 v1_2 = &ElementQuizView::slotShowAnswer;
    QMetaData *slot_tbl = new QMetaData[3];
    slot_tbl[0].name = "slotDocumentChanged()";
    slot_tbl[1].name = "slotNext()";
    slot_tbl[2].name = "slotShowAnswer()";
    slot_tbl[0].ptr = *((QMember*)&v1_0);
    slot_tbl[1].ptr = *((QMember*)&v1_1);
    slot_tbl[2].ptr = *((QMember*)&v1_2);
    metaObj = new QMetaObject( "ElementQuizView", "QWidget",
	slot_tbl, 3,
	0, 0 );
}
