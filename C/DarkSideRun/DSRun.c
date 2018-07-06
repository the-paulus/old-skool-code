#include <gtk/gtk.h>
#include <unistd.h>
#include <errno.h>

extern char *environ;

struct Window {
  GtkWidget *window;
  GtkWidget *table;
  GtkWidget *entry;
  GtkWidget *button_browse;
  GtkWidget *button_execute;
  GtkWidget *button_quit;
};

//Declare callbacks
void callback_browse(GtkWidget *parent, GtkWidget *entry);
void callback_execute(GtkWidget *parent, GtkWidget *entry);
//void callback_quit(GtkWidget *parent, gpointer data);

//Declare functions
GtkWidget * CreateWindow(void);

//Define callbacks


//main program
int main(int argc, char *argv[])
{
  Window *dsrun;

  //create top level window with the title "Dark Side Run"
  dsrun->window = gtk_window_new(GTK_TOPLEVEL_WINDOW);
  gtk_window_set_title(GTK_WINDOW(GTK_WIDGET(dsrun)->window), "Dark Side Run");
  //set startup position to be centered
  gtk_window_set_position(GTK_WINDOW(GTK_WIDGET(dsrun)->window), GTK_WIN_POS_CENTER);
  //connect signals to the window allowing it to close
  gtk_signal_connect(GTK_OBJECT(GTK_WIDGET(dsrun)->window), "destroy", 
		     GTK_SIGNAL_FUNC(gtk_main_quit), NULL);
  gtk_signal_connect(GTK_OBJECT(GTK_WIDGET(dsrun)->window), "delete_event",
		     GTK_SIGNAL_FUNC(gtk_main_quit), NULL);

  //create a table 2x2 and is not homogenious
  dsrun->table = gtk_table_new(2,2,FALSE);
  //show the widget and place it in the window
  gtk_container_add(GTK_CONTAINER(GTK_WIDGET(dsrun)->window), GTK_WIDGET(dsrun)->table);

  //create a text entry
  dsrun->entry = gtk_entry_new();
  //attach it to the table from point 0 to point 1 in both directions. 
  //it should fill both X and Y with a border width of 2
  gtk_table_attach(GTK_TABLE(GTK_WIDGET(dsrun)->table), dsrun->entry, 0, 1,
		   0, 1, GTK_FILL, GTK_FILL, 2, 2);
  //create the browse button with the label "Browse.."
  dsrun->button_browse = gtk_button_new_with_label("Browse..");
  //connect signals to button
  gtk_signal_connect(GTK_OBJECT(GTK_WIDGET(dsrun)->button_browse), "clicked",
		     GTK_SIGNAL_FUNC(callback_browse), GTK_OBJECT(GTK_WIDGET(dsrun)->entry));
  //attach it to the table from point 1 to point 2 
  gtk_table_attach(GTK_TABLE(GTK_WIDGET(dsrun)->table), GTK_WIDGET(dsrun)->button_browse, 1, 2,
		   0, 1, GTK_FILL, GTK_FILL, 2, 2);  
  
  //Create the execute button 
  dsrun->button_execute = gtk_button_new_with_label("Execute");
  //connect signals to button
  gtk_signal_connect(GTK_OBJECT(GTK_WIDGET(dsrun)->button_execute), "clicked", 
		     GTK_SIGNAL_FUNC(callback_execute), GTK_WIDGET(dsrun)->button_execute);
  gtk_table_attach(GTK_TABLE(GTK_WIDGET(dsrun)->table), GTK_WIDGET(dsrun)->button_execute, 0, 1,
		   1, 2, GTK_FILL, GTK_FILL, 2, 2);

  //create the exit button
  dsrun->button_quit = gtk_button_new_with_label("Quit");
  gtk_signal_connect(GTK_OBJECT(GTK_WIDGET(dsrun)->button_quit), "clicked", 
		     GTK_SIGNAL_FUNC(gtk_main_quit), NULL);
  gtk_table_attach(GTK_TABLE(GTK_WIDGET(dsrun)->table), GTK_WIDGET(dsrun)->button_quit, 1, 2, 1, 2, GTK_FILL, GTK_FILL, 2, 2);

  gtk_widget_show(GTK_WIDGET(dsrun)->window


