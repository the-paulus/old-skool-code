/***************************************************************************
                          darksideworkspace.h  -  description
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

 #ifndef _DARK_SIDE_WORK_SPACE
 #define _DARK_SIDE_WORK_SPACE

 typedef struct darksideworkspace {
 	char *name;
 	struct darksideworkspace *next;
 	struct darksideworkspace *previous;
 	struct darksideiconlist *next_icon;
 	struct darksideiconlist *previous_icon;
 } DarkSideWorkSpace;

 void CreateWorkSpace(char *name);
 void RemoveWorkSpace(void);
 void SendWindowToWorkSpace(DarkSideWindow *win, int workspace_number);
 void BuildWorkSpace(FILE *file);
 int GetWorkSpaceNum(int x, int y);
 void SwitchToWorkSpace(int num);
 void	SetPagerCursor(char dir);
 void	MoveWindows(int width, int height);
 int	WinWorkspace(DarkSideWindow *win);
 //void			go_to_nth_workspace(int);
 void	WorkspacePosition(DarkSideWindow *win,  int *left, int *right);
 void	SetWorkspaceMenuWidth(char *name);

 int			ds_workspace_change_percent;
 int			ds_workspace_time_change;
 int			ds_workspace_to_send;
 int			ds_workspace_cycle;
 #endif _DARK_SIDE_WORK_SPACE