#include "CMenuDoc.h"

CMenuDoc::CMenuDoc()
{
   modified = false;
}

CMenuDoc::~CMenuDoc()
{
}

void CMenuDoc::newDoc()
{
}

bool CMenuDoc::save()
{
   return true;
}

bool CMenuDoc::load(const QString &filename)
{
   emit documentChanged();
   return true;
}

bool CMenuDoc::isModified() const
{  
   return modified;
}

