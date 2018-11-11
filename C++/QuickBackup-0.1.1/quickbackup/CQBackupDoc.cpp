#include "CQBackupDoc.h"

CQBackupDoc::CQBackupDoc()
{
   modified = false;
}

CQBackupDoc::~CQBackupDoc()
{
}

void CQBackupDoc::newDoc(void)
{
}

bool CQBackupDoc::save(void);
{
   return true;
}

bool CQBackupDoc::saveAs(const QString &filename)
{
   return true;
}

bool CQBackupDoc::load(const QString &filename)
{
   emit documentChanged();
   return true;
}

bool CQBackupDoc::isModified(void) const
{
   return modified;
}
