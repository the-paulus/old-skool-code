
/***************************************************************************
                          main.c  -  Root of the program. Where everything
                          		  comes together.
                             -------------------
    begin                : Wed Jul 19 16:20:46 EDT 2000
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

#ifdef HAVE_CONFIG_H
#include <config.h>
#endif

#include <darksidewm.h>

int main(int argc, char *argv[])
{
	printf("Hello, world!\n");
	OpenDisplay();
	CaptureWindow();
  XCloseDisplay(CoreWM.display);
  return EXIT_SUCCESS;
}
