/****************************************************************************
** ElementQuizDoc meta object code from reading C++ file 'elementquizdoc.h'
**
** Created: Thu Oct 19 17:53:39 2000
**      by: The Qt Meta Object Compiler ($Revision: 2.25.2.12 $)
**
** WARNING! All changes made in this file will be lost!
*****************************************************************************/

#if !defined(Q_MOC_OUTPUT_REVISION)
#define Q_MOC_OUTPUT_REVISION 2
#elif Q_MOC_OUTPUT_REVISION != 2
#error "Moc format conflict - please regenerate all moc files"
#endif

#include "./elementquizdoc.h"
#include <qmetaobject.h>


const char *ElementQuizDoc::className() const
{
    return "ElementQuizDoc";
}

QMetaObject *ElementQuizDoc::metaObj = 0;


#if QT_VERSION >= 200
static QMetaObjectInit init_ElementQuizDoc(&ElementQuizDoc::staticMetaObject);

#endif

void ElementQuizDoc::initMetaObject()
{
    if ( metaObj )
	return;
    if ( strcmp(QObject::className(), "QObject") != 0 )
	badSuperclassWarning("ElementQuizDoc","QObject");

#if QT_VERSION >= 200
    staticMetaObject();
}

void ElementQuizDoc::staticMetaObject()
{
    if ( metaObj )
	return;
    QObject::staticMetaObject();
#else

    QObject::initMetaObject();
#endif

    metaObj = new QMetaObject( "ElementQuizDoc", "QObject",
	0, 0,
	0, 0 );
}
