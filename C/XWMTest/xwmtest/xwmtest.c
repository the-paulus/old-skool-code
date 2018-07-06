/***************************************************************************
                          xwmtest.c  -  description
                             -------------------
    begin                : Thu Jun 29 2000
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
 *************************************************************************/

#include <X11/Xlib.h>
#include <X11/Xutil.h>
#include <X11/Xcms.h> //Color managment
#include <X11/Xresource.h> //declares all functions, types, and symbols for resources.
#include <X11/Xatom.h> //declares all predefined atoms. (prefix: XA_)
#include <X11/cursorfont.h> //declares standarded cursor font (prefix: XC_)
#include <X11/keysymdef.h> //declares standard keysym values (prefix: XK_)
#include <X11/Xproto.h> //declares types and symbols for the basic X protocol.
#include <X11/X10.h> //declares all functions, types and symbols associated with X10
#include <stdio.h>                                                  

void addborder(void);

Display *display;
char *display_name;
int screen_number;

int main(int argc, char *argv)                                           
{
	Window window;
  XEvent event;
	int evlp=1;
	FILE *log;
	log = fopen("log", "a+");

	if((display=XOpenDisplay(display_name))==NULL)
		exit(1);
	
	//display = DefaultScreen(display_name);
	screen_number = DefaultScreen(display);
	
	window = RootWindow(display, screen_number);
	XSelectInput(display, window, ButtonPressMask);	

	addborder();
	
	while(evlp==1)
	{
		//if(XPending(display))
		//{
			XNextEvent(display, &event);
			if(event.type == KeyPress)
				fprintf(log, "key pressed!\n");
			else if(event.type == ButtonPress)
			{
				fprintf(log, "Button Pressed!\n");
				evlp=0;
			}
			else if(event.type == MotionNotify)
				fprintf(log,"Mouse is moving");
		//}
	}
	return 0;
}

void addborder(void)
{
	XWindowAttributes	attrib;
	Window	root;
  Window	parent;
  Window	*children;
  Window new_parent;
	XSetWindowAttributes a;
  unsigned int	nb_children;
  int		i;

  XQueryTree(display, RootWindow(display,screen_number),
	     &root, &parent, &children, &nb_children);
  for (i = 0; i < nb_children; i++)
	{
  	XGetWindowAttributes(display, children[i], &attrib);
  	if (attrib.map_state == IsViewable)
  	{
  		XAddToSaveSet(display, children[i]);
  		XGrabServer(display);
  		XUnmapWindow(display, children[i]);
  		new_parent = XCreateSimpleWindow(display, RootWindow(display, screen_number),
  																		 500, 500, attrib.width+200, attrib.height+200,
  																		 BlackPixel(display, screen_number),
  																		 WhitePixel(display, screen_number),0);
  		XChangeWindowAttributes(display, new_parent, CWEventMask, &a);
  		XReparentWindow(display, children[i], new_parent, 0, 0);
  		XMapWindow(display, new_parent);
  	}
  }
}