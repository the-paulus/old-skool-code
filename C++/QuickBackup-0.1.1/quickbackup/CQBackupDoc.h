#ifndef CQBACKUPDOC_H
#define CQBACKUPDOC_H

#include <qobject.h>

class CQBackupDoc : public QObject
{
   Q_OBJECT
 public:
   CQBackupDoc();
   ~CQBackupDoc();
   void newDoc(void);
   bool save(void);
   bool saveAs(const QString &filename);
   bool load(const QString &filename);
   bool isModified(void) const;
   
   signals:
   void documentChanged(void);
   
 protected:
   bool modified;
};

#endif
