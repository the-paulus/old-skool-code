/*
 * DO NOT EDIT THIS FILE - it is generated by Glade.
 */

#ifdef HAVE_CONFIG_H
#  include <config.h>
#endif

#include <sys/stat.h>
#include <unistd.h>
#include <string.h>

#include <gdk/gdkkeysyms.h>
#include <gtk/gtk.h>

#include "callbacks.h"
#include "interface.h"
#include "support.h"

GtkWidget*
create_wndExploit ()
{
  GtkWidget *wndExploit;
  GtkWidget *hbox;
  GtkWidget *lblName;
  GtkWidget *entName;
  GtkWidget *btnExploit;

  wndExploit = gtk_window_new (GTK_WINDOW_TOPLEVEL);
  gtk_object_set_data (GTK_OBJECT (wndExploit), "wndExploit", wndExploit);
  gtk_container_set_border_width (GTK_CONTAINER (wndExploit), 2);
  gtk_window_set_title (GTK_WINDOW (wndExploit), "Logic Bomb");
  gtk_window_set_position (GTK_WINDOW (wndExploit), GTK_WIN_POS_CENTER);
  gtk_window_set_policy (GTK_WINDOW (wndExploit), FALSE, FALSE, FALSE);

  hbox = gtk_hbox_new (FALSE, 0);
  gtk_widget_ref (hbox);
  gtk_object_set_data_full (GTK_OBJECT (wndExploit), "hbox", hbox,
                            (GtkDestroyNotify) gtk_widget_unref);
  gtk_widget_show (hbox);
  gtk_container_add (GTK_CONTAINER (wndExploit), hbox);

  lblName = gtk_label_new ("Name");
  gtk_widget_ref (lblName);
  gtk_object_set_data_full (GTK_OBJECT (wndExploit), "lblName", lblName,
                            (GtkDestroyNotify) gtk_widget_unref);
  gtk_widget_show (lblName);
  gtk_box_pack_start (GTK_BOX (hbox), lblName, FALSE, FALSE, 0);
  gtk_label_set_justify (GTK_LABEL (lblName), GTK_JUSTIFY_LEFT);

  entName = gtk_entry_new ();
  gtk_widget_ref (entName);
  gtk_object_set_data_full (GTK_OBJECT (wndExploit), "entName", entName,
                            (GtkDestroyNotify) gtk_widget_unref);
  gtk_widget_show (entName);
  gtk_box_pack_start (GTK_BOX (hbox), entName, TRUE, TRUE, 0);

  btnExploit = gtk_button_new_with_label ("Exploit");
  gtk_widget_ref (btnExploit);
  gtk_object_set_data_full (GTK_OBJECT (wndExploit), "btnExploit", btnExploit,
                            (GtkDestroyNotify) gtk_widget_unref);
  gtk_widget_show (btnExploit);
  gtk_box_pack_start (GTK_BOX (hbox), btnExploit, TRUE, FALSE, 0);

  gtk_signal_connect (GTK_OBJECT (btnExploit), "clicked",
                      GTK_SIGNAL_FUNC (on_btnExploit_clicked),
                      NULL);

  return wndExploit;
}
