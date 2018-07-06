/***************************************************************************
                          elementquizfile.h  -  description
                             -------------------
    begin                : Sun Oct 17 1999
    copyright            : (C) 1999 by Paul Lyon
    email                : paulus@linuxstart.com
 ***************************************************************************/

/***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/

#ifndef ELEMENTQUIZFILE_H
#define ELEMENTQUIZFILE_H

#include <qstrlist.h>
#include <qstring.h>
#include <qfile.h>
#include <qtextstream.h>
#include <stdio.h>
#include <stdlib.h>

/**
  *@author Paul Lyon
  */

class ElementQuizFile {
public: 
	ElementQuizFile();
	~ElementQuizFile();
  /** Generate a random element */
  void Generate(void);
  /** counts and places the names of the elements in the combo box */
  void GetElements(void);

  float atomic_mass;
  unsigned int atomic_number;
  unsigned int number_elements;
  QStrList *list;
  QString name;
  QString symbol;

private:
  QFile *fChem;

};

#endif
