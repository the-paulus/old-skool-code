/***************************************************************************
                          darksidewm.c  -  description
                             -------------------
    begin                : Wed Jul 19 2000
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

 void OpenDisplay(void)
 {
 		//char *logfile = OpenLogFile();
 		//printf("\nlogfile: %s", logfile);
 		
  	if((CoreWM.log = fopen("/home/paulus/.DarkSideWM.log", "a+")) == NULL)
  	{
  		fprintf(stderr, "\nOpenDisplay(): can't open log. Aborting..");
  		exit(1);
  	}
  	  	
  	if((CoreWM.display = XOpenDisplay(CoreWM.screen_name)) == NULL)
  	{
  		fprintf(CoreWM.log, "\nOpenDisplay(): can't open display. Aborting..");
  		fprintf(stderr, "\nOpenDisplay(): can't open display. Aborting..");
  		exit(1);
  	}
  	
  	fprintf(CoreWM.log, "\nOpenDisplay(): CoreWM.screen_name = %s", CoreWM.screen_name);
  	fprintf(stdout, "\nOpenDisplay(): CoreWM.screen_name = %s", CoreWM.screen_name);
  	
  	CoreWM.screen_number = DefaultScreen(CoreWM.display);
  	fprintf(CoreWM.log, "\nOpenDisplay(): CoreWM.screen_number = %i", CoreWM.screen_number);
  	fprintf(stdout, "\nOpenDisplay(): CoreWM.screen_number = %i", CoreWM.screen_number);
  	
  	CoreWM.root = RootWindow(CoreWM.display, CoreWM.screen_number);
  	fprintf(CoreWM.log, "\nOpenDisplay(): Got root window.");
  	fprintf(stdout, "\nOpenDisplay(): Got root window.");
  	
  	CoreWM.screen_width = DisplayWidth(CoreWM.display, CoreWM.screen_number);
  	CoreWM.screen_height = DisplayHeight(CoreWM.display, CoreWM.screen_number);
  	fprintf(CoreWM.log, "\nOpenDisplay(): Screen deminsions are %ix%i", CoreWM.screen_width, CoreWM.screen_height);
 		fprintf(stderr, "\nOpenDisplay(): Screen deminsions are %ix%i", CoreWM.screen_width, CoreWM.screen_height);
 		
 		XSetErrorHandler((XErrorHandler)ErrorHandler);
 }

 char *OpenLogFile(void)
 {
 		char *home;
 		char *tmp;
 		
 		home = getenv("HOME");
 		fprintf(CoreWM.log, "\nOpenLogFile(): recieved \"%s\" as the home directory for %s", home, getenv("USER"));
 		tmp = strcat(home, ".DarkSideWM.log");
 		printf("\nhome directory: %s", tmp);
 		
 		return(home);
 }

 /* Any Window's created before the window manager will captured and modified*/
 void CaptureWindow(void)
 {
 		Window root;
 		Window parent;
 		Window *children;
 		unsigned int ctrChildren;
 		int i;
 		
 		XQueryTree(CoreWM.display, RootWindow(CoreWM.display, CoreWM.screen_number),
 							 &root, &parent, &children, &ctrChildren);
 		fprintf(CoreWM.log, "\nCaptureWindow(): There were %i children.", ctrChildren);
 		for(i=0; i<ctrChildren;i++)
 			AdjustWindow(children[i]);
 }

 /* Handles X-Errors */
 XErrorHandler ErrorHandler(Display *dsp, XErrorEvent *xerror)
 {
 		if((xerror->request_code == X_ChangeWindowAttributes) && (xerror->error_code == BadAccess))
 		{
 			fprintf(stderr, "\nError! It seems that there is another Window Manager running..");
 			fprintf(CoreWM.log, "\nCannot start Dark Side WM due to another Window Manager that's running.");
 			exit(1);
 		}
 		else
 		{
 			fprintf(CoreWM.log, "\n**ERROR** %d %d", xerror->error_code, xerror->request_code);
 			return 0;
 		}
 }

 /* Adds all the nesscary components to the window */
