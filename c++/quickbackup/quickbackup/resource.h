/***************************************************************************
                          resource.h  -  description
                             -------------------
    begin                : Tue Oct 31 19:27:07 EST 2000
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
#ifndef RESOURCE_H
#define RESOURCE_H

#ifdef HAVE_CONFIG_H
#include <config.h>
#endif


///////////////////////////////////////////////////////////////////
// resource.h  -- contains macros used for commands


///////////////////////////////////////////////////////////////////
// COMMAND VALUES FOR MENUBAR AND TOOLBAR ENTRIES


/*///////////////////////////////////////////////////////////////////
// File-menu entries
#define ID_FILE_NEW                 10020
#define ID_FILE_OPEN                10030

#define ID_FILE_SAVE                10050
#define ID_FILE_SAVE_AS             10060
#define ID_FILE_CLOSE               10070

#define ID_FILE_PRINT               10080

#define ID_FILE_QUIT                10100


///////////////////////////////////////////////////////////////////
// Edit-menu entries
#define ID_EDIT_UNDO                11010
#define ID_EDIT_REDO                11020
#define ID_EDIT_COPY                11030
#define ID_EDIT_CUT                 11040
#define ID_EDIT_PASTE               11050
#define ID_EDIT_SELECT_ALL          11060


///////////////////////////////////////////////////////////////////
// View-menu entries                    
#define ID_VIEW_TOOLBAR             12010
#define ID_VIEW_STATUSBAR           12020

///////////////////////////////////////////////////////////////////
// Help-menu entries
#define ID_HELP_ABOUT               1002 */

#define ID_FILE_NEW 10010
#define ID_FILE_OPEN 10020
#define ID_FILE_SAVE 10030
#define ID_FILE_SAVE_AS 10040
#define ID_FILE_CLOSE 10050
#define ID_FILE_QUIT 10060

#define ID_BACKUP_ADD 20010
#define ID_BACKUP_DELETE 20020
#define ID_BACKUP_REFRESH 20030
#define ID_BACKUP_OPTIONS 20040
#define ID_BACKUP_BACKUP 20050

#define ID_HELP_ABOUT 30010
#define ID_HELP_HOMEPAGE 30020

///////////////////////////////////////////////////////////////////
// General application values
#define IDS_APP_ABOUT               "QuickBackup\nVersion " VERSION \
                                    "\n(w) 2000 by Paul Lyon"
#define IDS_STATUS_DEFAULT          "Ready."

#endif // RESOURCE_H
