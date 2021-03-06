#ifndef CDIRVIEW_H
#define CDIRVIEW_H

#include <qlistview.h>
#include <qstring.h>
#include <qfile.h>

class CDirView : public QListViewItem
{
 public:
   CDirView(QListView *parent);
   CDirView(CDirectory *parent, const char *filename);
   
   const char *text(int col) const;
   QString fullName(void);
   
   void setOpen(bool);
   void setup(void);
   
 private:
   QFile f;
   CDirectory *p;
   bool readable;
};

#endif
