/***************************************************************************
                          style.h  -  description
                             -------------------
    begin                : Mon Jul 24 2000
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

 #ifndef _STYLE_
 #define _STYLE_

 #define NO_TITLE 0x01
 #define NO_BORDER 0x02
 #define STICKY 0x04
 #define STAY_ON_TOP 0x08
 #define WINDOW_LIST_SKIP 0x10

 typedef struct appprop {
 	char *name;
 	char property;
 	struct appprop *next;
 } AppProp;

 typedef struct stayontop {
 	struct darksidewindow win;
 	struct stayontop *next;
 } StayOnTop;

 typedef struct optionsettings {
 	FILE *rc;
 	FILE *style;
 	unsigned int num_desktop;
 	int titlebar_pos;
 	int border_spacing;
 	int hasShade;
 	int hasIconify;
 	int hasMax;
 	int hasClose;
 } OptionSettings;

 AppProp ds_app_prop;
 StayOnTop ds_stay_on_top;
 GC gc_black;

 void CheckWindowProperty(DarkSideWindow *win, char *app_name);
 void init_properties(char *prop_name, char *prop);
 //void BuildStyle(FILE *file);
 int SearchAppProperties(char *app_name);
 char *ReadAppProperty(char *line, int index);

 #endif _STYLE_