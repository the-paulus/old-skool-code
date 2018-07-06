/***************************************************************************
                          darksideworkspace.c  -  description
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

 void CreateWorkSpace(char *name)
 {
		t_workspace	*new_workspace;
  	t_workspace	*last;

  	new_workspace = (t_workspace *)malloc(sizeof(t_workspace));
  	new_workspace->next = NULL;
  	new_workspace->prev = NULL;
  	new_workspace->name = (char *)malloc(sizeof(char) * (strlen(name) + 1));
  	strcpy(new_workspace->name, name);
  	new_workspace->first_icon = NULL;
  	new_workspace->last_icon = NULL;
  	if (!(gl_epiwin.first_workspace))
    {
      gl_epiwin.first_workspace = new_workspace;
      gl_epiwin.current_workspace = gl_epiwin.first_workspace;
    }
  	else
    {
      last = gl_epiwin.first_workspace;
      while (last->next)
				last = last->next;
      last->next = new_workspace;
      new_workspace->prev = last;
    }
  	gl_epiwin.virtual_width = gl_epiwin.virtual_width + gl_scr_info.dpy_width;
  	set_workspace_menu_width(name);
 }

 void RemoveWorkSpace(void)
 {
		DarkSideWorkSpace	*tmp;
  	DarkSideWindow	*win;
  	WindowList	*apps_list;
  	int		nb;

  	nb = 1;
  	apps_list = gl_epiwin.first_win_group_list;
  	tmp = wm_settings.win.first_workspace;
  	while(tmp->next)
    {
      nb++;
      tmp = tmp->next;
    }
  	if (apps_list)
    	while(apps_list->next)
      {
				win = apps_list->ds_win;
				if (win->x > (nb * CoreWM.screen_width))
	  		{
	    		if (!(ds_workspace_cycle))
	      	{
						/* remove window */
	      	}
	    		else
	      		if ((win->x + win->width) < (nb * CoreWM.screen_width))
						{
		  				/* remove window */
						}
	  		}
				apps_list = apps_list->next_window;
      }
  	tmp->previous->next = NULL;
  	free(tmp->name);
  	free(tmp);
  	wm_settings.win.virtual_width = wm_settings.win.virtual_width - CoreWM.screen_width;
 }


 void SendWindowToWorkSpace(DarkSideWindow *win, int workspace_number)
 {

 }

 void BuildWorkSpace(FILE *file)
 {

 }


 int GetWorkSpaceNum(int x, int y)
 {

 }

 void SwitchToWorkSpace(int num)
 {

 }

 void	SetPagerCursor(char dir)
 {

 }

 void	MoveWindows(int width, int height)
 {

 }

 int	WinWorkspace(DarkSideWindow *win)
 {

 }

 /*void			go_to_nth_workspace(int)
 {

 }*/

 void	WorkspacePosition(DarkSideWindow *win,  int *left, int *right)
 {

 }

 void	SetWorkspaceMenuWidth(char *name)
 {

 }
