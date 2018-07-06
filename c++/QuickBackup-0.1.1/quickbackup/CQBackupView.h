#ifndef CQBACKUPVIEW_H
#define CQBACKUPVIEW_H

#include <qwidget.h>
#include <qsplitter.h>
#include <qtabdialog.h>
#include <qmsgbox.h>
#include <qlistview.h>
#include <qdir.h>
#include <qfile.h>
#include <qstring.h>
#include <qfileinfo.h>

#include "CQBackupView.h"

class CQBackupView : public QWidget
{
   Q_OBJECT
 public:
   CQBackupView(QWidget *parent=0, CQBackupDoc *doc=0);
   CQBackupView();
   
 protected slots:
   void slotDocumentChanged(void);
};

#endif
