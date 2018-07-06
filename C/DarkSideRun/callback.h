#ifndef _CALLBACK_H_
#define _CALLBACK_H_

#include <gtk/gtk.h>
#include "interface.h"

void dsy_destroy( GtkWidget *parent,
		  gpointer data);

void dsy_delete_event( GtkWidget *parent,
		       gpointer data);

void chat_callback( GtkWidget *parent,
		    GtkWidget *buddylist);

void add_callback( GtkWidget *parent,
		   GtkWidget *buddylist);

void remove_callback( GtkWidget *parent,
		      GtkWidget *buddylist);

void profile_callback( GtkWidget *parent,
		       GtkWidget *buddylist);

void configure_callback( GtkWidget *parent,
			 gpointer data);

void autoreply_callback( GtkWidget *parent,
			 gpointer data);

void handle_statuse_change( GtkWidget *parent,
			    gpointer data);

void userselected_callback( GtkWidget *parent,
			    gpointer data);

void userunselecte_callback( GtkWidget *parent, 
			     gpointer data);

//Packet Stuff
int process_packets( gpointer data);
int process_message_packet( Yahoo_Packet *pkt);
void process_ping_packet( Yahoo_Packet *pkt);
void process_status_packet( Yahoo_Packet *pkt);
void process_mail_packet( Yahoo_Packet *pkt);
void process_packes(void);
