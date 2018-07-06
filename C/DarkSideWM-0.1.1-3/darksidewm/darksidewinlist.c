/***************************************************************************
                          darksidewinlist.c  -  description
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

 void Add_elt(DarkSideWindow win)
 {
 		WindowList *tmp_list;
 		
 		if (wm_settings.button.align_max_btn == 0)
 		{
 			fprintf(CoreWM.log, "\nAdd_elt(): align max button %i", wm_settings.button.align_max_btn);
 			win->button_max = 0;
 		}
  	if (wm_settings.button.align_icon_btn == 0)
  	{
  		fprintf(CoreWM.log, "\nAdd_elt(): align icon button %i", wm_settings.button.align_icon_btn);
    	win->button_iconify = 0;
    }
  	if (wm_settings.button.align_btn_close == 0)
  	{
  		fprintf(CoreWM.log, "\nAdd_elt(): align close button %i", wm_settings.button.align_icon_btn);
    	win->button_close = 0;
    }
  	if (wm_settings.button.align_btn_shade == 0)
  	{
    	fprintf(CoreWM.log, "\nAdd_elt(): align shade button %i", wm_settings.button.align_shade_btn);
    	win->button_shade = 0;
    }

  	win->iconify_title_win = 0;
  	win->is_shade = 0;
  	win->is_max = 0;
  	win->win_width = 0;
  	win->win_height = 0;
  	win->shade_width = 0;
  	win->shade_height = 0;
  	tmp_list = (DarkSideWindow *) malloc(sizeof(WindowList));
  	tmp_list->p_t_win = win;
  	tmp_list->next_elt = NULL;
		fprintf(CoreWM.log, "\nAdd_elt(): win elements (icon_title_win, isShade, isMax, win_width, win_height, shade_width, shade_height) set to 0");
  	
  	if (gl_epiwin.first_win_group_list == NULL)
    {
      wm_settings.win.first_win_group_list = tmp_list;
      wm_settings.win.nb_elt = 1;
    }else{
      tmp_list->next_elt = wm_settings.win.first_win_group_list;
      wm_settings.win.first_win_group_list = tmp_list;
      wm_settings.win.nb_elt++;
    }
 }