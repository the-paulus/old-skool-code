/***************************************************************************
                          darksidebutton.c  -  description
                             -------------------
    begin                : Mon Jul 31 2000
    copyright            : (C) 2000 by Paul Lyon
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

#include <darksidewm.h>

void CatchWindowMouse(void)
{
	Window	child;
  Window	root;
  int		rootX;
  int		rootY;
  int		winX;
  int		winY;
  unsigned int	status;
 	DarkSideWindow *temp;

  XQueryPointer(CoreWM.display, CoreWM.root, &root, &child, &rootX, &rootY, &winX, &winY, &status);
  temp = search_elt(child);
  if (temp)
    if (child == temp->Parent)
      if ((wm_settings.mouse.focus_mode == FOCUS_SLOPPY) || (wm_settings.mouse.focus_mode == FOCUS_FOLLOW_MOUSE))
				SetWindowState(temp, ACTIVE);
}