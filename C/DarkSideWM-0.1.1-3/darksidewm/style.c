/***************************************************************************
                          style.c  -  description
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

 #include <darksidewm.h>

 void CheckWindowProperty(DarkSideWindow *win, char *app_name)
 {
 		int app_prop;
 		
 		app_prop = SearchAppProperty(app_name);
 		fprintf(CoreWM.log, "\nCheckWindowProperty(): Searching for \"%s\"..", app_name);
 		win->app_prop = app_prop;
 		fprintf(CoreWM.log, "\nCheckWindowProperty(): Found %i for \"%s\"", app_prop, app_name);
 		
 		if(app_prop)
 		{
 			if(app_prop & NO_TITLE)
 			{
 				fprintf(CoreWM.log, "\nCheckWindowProperty(): Got NO_TITLE flag and setting titlebar_height and titlebar_border = 0");
 				win->titlebar_height = 0;
 				win->titlebar_border = 0;
 			}
 			if(app_prop & NO_BORDER)
 			{
 				fprintf(CoreWM.log, "\nCheckWindowProperty(): Got NO_BORDER flag. Setting border_size to 0");
 				win->border_size = 0;
 			}
 		}
 }

 void init_properties(char *prop_name, char *prop)
 {
 		if (!strcmp(prop_name, "No Title"))
    {
    	fprintf(CoreWM.log, "\ninit_properties(): No Titles");
    	*prop |= NO_TITLE;
    }
  	else if (!strcmp(prop_name, "No Border"))
  	{
  		fprintf(CoreWM.log, "\ninit_properties(): No Border");
    	*prop |= NO_BORDER;
  	}
  	else if (!strcmp(prop_name, "Sticky"))
  	{
  		fprintf(CoreWM.log, "\ninit_properties(): Sticky");
    	*prop |= STICKY;
		}
  	else if (!strcmp(prop_name, "Window List Skip"))
		{
			fprintf(CoreWM.log, "\ninit_porperties(): Window List Skip");
    	*prop |= WINDOW_LIST_SKIP;
  	}
  	else if (!strcmp(prop_name, "Stay On Top"))
  	{
  		fprintf(CoreWM.log, "\ninit_porperties(): Stay On Top");
    	*prop |= STAY_ON_TOP;
  	}
 }

 /*void BuildStyle(FILE *file)
 {
 		char tmp[256];
 		char *app_return;
 		AppProp **pApp_Prop;
 		
 		while(fgets(
 }*/

 int SearchAppProperties(char *app_name)
 {
 		AppProp *pApp_Prop;
 		 	
 }