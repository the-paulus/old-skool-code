/***************************************************************************
                          darksidekeyboard.c  -  description
                             -------------------
    begin                : Thu Jul 27 2000
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

 void GrabShortCuts(Window win)
 {
 		DarkSideShortCutList *list;
 		unsigned int mod;
 		int keycode;
 		
 		list = ds_shortcut_list;
 		
 		while(list)
 		{
 			mod = (((list->shortcut->shift) << 0) | ((list->shortcut->ctrl) << 2) | ((list->shortcut->alt) << 3));
 			keycode = XKeysymToKeycode(CoreWM.display, list->shortcut->key);
 			fprintf(CoreWM.log, "\nGrabShortCuts(): mod = %l \n\tkeycode = %l", mod, keycode);
 			XGrabKey(CoreWM.display, keycode, mod, win, True, GrabModeAsync, GrabModeAsync);
 			fprintf(CoreWM.log, "\nGrabShortCuts(): XGrabKey....");
      list = list->next;
    }
 }