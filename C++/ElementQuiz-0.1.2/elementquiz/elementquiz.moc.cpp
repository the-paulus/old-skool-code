/****************************************************************************
** ElementQuiz meta object code from reading C++ file 'elementquiz.h'
**
** Created: Thu Oct 19 23:20:49 2000
**      by: The Qt Meta Object Compiler ($Revision: 2.25.2.12 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 2
#elif Q_MOC_OUTPUT_REVISION != 2
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "./elementquiz.h"
#include <qmetaobject.h>


const char *ElementQuiz::className() const
{
    return "ElementQuiz";
}

QMetaObject *ElementQuiz::metaObj = 0;


#if QT_VERSION >= 200
static QMetaObjectInit init_ElementQuiz(&ElementQuiz::staticMetaObject);

#endif

void ElementQuiz::initMetaObject()
{
    if ( metaObj )
	return;
    if ( strcmp(QMainWindow::className(), "QMainWindow") != 0 )
	badSuperclassWarning("ElementQuiz","QMainWindow");

#if QT_VERSION >= 200
    staticMetaObject();
}

void ElementQuiz::staticMetaObject()
{
    if ( metaObj )
	return;
    QMainWindow::staticMetaObject();
#else

    QMainWindow::initMetaObject();
#endif

    metaObj = new QMetaObject( "ElementQuiz", "QMainWindow",
	0, 0,
	0, 0 );
}
