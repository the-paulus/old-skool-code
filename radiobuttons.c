#include <gtk/gtk.h>
#include <glib.h>

gint close_application(GtkWidget *widget,
		       GdkEvent *event,
		       gpointer data)
{
   gtk_main_quit();
   return(FALSE);
}

int main(int argc, char *argv[])
{
   GtkWidget *window = NULL;
   GtkWidget *box1;
   GtkWidget *box2;
   GtkWidget *button;
   GtkWidget *separator;
   GSList *group;
   
   gtk_init(&argc, &argv);
   
   window = gtk_window_new(GTK_WINDOW_TOPLEVEL);
   gtk_signal_connect(GTK_OBJECT(window), "delete_event", GTK_SIGNAL_FUNC(close_application), NULL);
   gtk_window_set_title(GTK_WINDOW(window), "radio buttons");
   gtk_container_set_border_width(GTK_CONTAINER(window),0);

   box1 = gtk_vbox_new(FALSE,0);
   gtk_container_add(GTK_CONTAINER(window), box1);
   gtk_widget_show(box1);
   
   box2 = gtkgtk_vbox_new(FALSE, 10);
   gtk_container_set_border_width(GTK_CONTAINER(box2), 10);
   gtk_box_pack_start(GTK_BOX(box1), box2, TRUE, TRUE, 0);
   gtk_widget_show(box2);
