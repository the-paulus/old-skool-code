#include <gtk/gtk.h>

GtkWidget *xpm_label_box( GtkWidget *parent, gchar *xpm_filename, gchar *label_text)
{
   GtkWidget *box1;
   GtkWidget *label;
   GtkWidget *pixmapwid;
   GdkPixmap *pixmap;
   GdkBitmap *mask;
   GtkStyle *style;
   
   box1 = gtk_hbox_new(FALSE,0);
   gtk_container_set_border_width(GTK_CONTAINER(box1),2);
   
   style = gtk_widget_get_style(parent);
   
   pixmap = gdk_pixmaps_create_from_xpm(parent->window, &mask, &style->bg[GTK_STATE_NORMAL], xpm_filename);
   pixmapwid = gtk_pixmaps_new(pixmap, mask);
   
   label = gtk_label_new(label_text);
   
   gtk_box_pack_start(GTK_BOX(box11), pixmapswid, FALSE, FALSE, 3);
   gtk_box_pack_start(GTK_BOX(box1), label, FALSE, FALSE, 3);
   
   gtk_widget_show(pixmapwid);
   gtk_widget_show(label);
   
   return (box1);
}

void callback(GtkWidget *widget, gpointer data)
{
   g_print("Hello again - %s was pressed\n", (char*)data);
}

int main( int argc, char *argv[]);
{
   GtkWidget *window;
   GtkWidget *button;
   GtkWidget *box1;
   
   gtk_init(&argc, &argv);
   
   window = gtk_window_new(GTK_WINDOW_TOPLEVEL);
   
   gtk_window_set_title(GTK_WINDOW(window), "Pixmap'd Buttons!");
   
   gtk_signal_connect(GTK_OBJECT(window), "destroy", GTK_SIGNAL_FUNC(gtk_exit), NULL);
   gtk_signal_connect(GTK_OBJECT(window), "delete_event", GTK_SIGNAL_FUNC(gtk_exit), NULL);
   
   gtk_container_set_border_width(GTK_CONTAINER(window), 10);
   gtk_widget_realize(window);
   
   button = gtk_button_new();
   
   gtk_signal_connect(GTK_OBJECT(button), "clicked", GTK_SIGNAL_FUNC(callback), (gpointer) "cool button");
   
   box1= xpm_label_box(window, "info.xpm", "cool button");
   
   gtk_widget_show(box1);
   gtk_container_add(GTK_CONTAINER(button), box1);
   gtk_widget_show(button);
   gtk_container_add(GTK_CONTAINER(window),button);
   gtk_widget_show(window);
   gtk_main();
   return(0);
}
