#include <gtk/gtk.h>

#include <stdio.h>
#include <errno.h>
#include <unistd.h>

extern char *environ;

//callbacks
void onBrowse( GtkWidget *parent,
	       GtkWidget *entry)
{


int main(int argc, char *argv[])
{
  GtkWidget *window;
  GtkWidget *table;
  GtkWidget *entry;
  GtkWidget *button_browse;
  GtkWidget *button_execute;
  GtkWidget *button_quit;

  gtk_init(&argc, &argv);

  window = gtk_window_new(GTK_WINDOW_TOPLEVEL);
  gtk_window_set_title(GTK_WINDOW(window), "Dark Side Run");

  table = gtk_table_new(2,3, TRUE);
  gtk_container_add(GTK_CONTAINER(window), table);

  entry = gtk_entry_new();

  button_browse = gtk_button_new_with_label("Browse");
  button_execute = gtk_button_new_with_label("Execute");
  button_quit = gtk_button_new_with_label("Quit");

  gtk_table_attach(GTK_TABLE(table), entry, 0, 2, 0, 1, GTK_FILL, GTK_FILL, 2, 2);
  gtk_table_attach(GTK_TABLE(table), button_browse, 2, 3, 0, 1, GTK_FILL, GTK_FILL, 2, 2); 
  gtk_table_attach(GTK_TABLE(table), button_execute, 1, 2, 1, 2, GTK_FILL, GTK_FILL, 2, 2);
  gtk_table_attach(GTK_TABLE(table), button_quit, 2, 3, 1, 2, GTK_FILL, GTK_FILL, 2, 2);

  gtk_signal_connect(GTK_OBJECT(window), "destroy", GTK_SIGNAL_FUNC(gtk_main_quit), NULL);
  gtk_signal_connect(GTK_OBJECT(window), "delete_event", GTK_SIGNAL_FUNC(gtk_main_quit), NULL);
  gtk_signal_connect(GTK_OBJECT(button_browse), "clicked", GTK_SIGNAL_FUNC(onBrowse), GTK_OBJECT(entry));
  gtk_signal_connect(GTK_OBJECT(button_execute), "clicked", GTK_SIGNAL_FUNC(onExecute), GTK_OBJECT(entry));
  gtk_signal_connect(GTK_OBJECT(button_quit), "clicked", GTK_SIGNAL_FUNC(gtk_main_qui), NULL);

  gtk_widget_show(window);
  gtk_widget_show(table);
  gtk_widget_show(entry);
  gtk_widget_show(button_browse);
  gtk_widget_show(button_execute);
  gtk_widget_show(button_quit);
  
  gtk_main();
  return 0;
}
