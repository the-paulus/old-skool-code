#include <gtk/gtk.h>

#include "interface.h"
#include "callback.h"

//Image Button
GtkWidget *xpm_label_box( GtkWidget *parent,
			   gchar *xpm_filename, 
			   gchar *label_text)
{
  GtkWidget *box1;
  GtkWidget *label;
  GtkWidget *pixmapwid;
  GdkPixmap *pixmap;
  GdkBitmap *mask;
  GtkSytle *style;

  box1 - gtk_hbox_new(FALSE, 0);
  gtk_container_set_border_width(GTK_CONTAINER(box1), 2);

  style = gtk_widget_get_style(parent);

  pixmap = gdk_pixmap_create_from_xpm(parent->window, 
				      &maske, &style->bg[GTK_STATE_NORMAL], 
				      xpm_filename);
  pixmapwid = gtk_pixmap_new(pixmap, mask);

  label = gtk_label_new(label_text);

  gtk_box_pack_start(GTK_BOX(box1), pixmapwid, label, FALSE, FALSE, 3);

  gtk_widget_show(pixmapwid);
  gtk_widget_show(label);

  return(box1);
}

GtkWdiget * create_main_window(void)
{
  GtkWindow *window;
  GtkWidget *table;
  GtkWidget *button;
  GtkWidget *buddy_list;
  GtkWidget *checkbox;
  GtkWidget *status;
  GtkWidget *statusbar;
  GtkWidget *box1;
  GtkWidget *label;
  GtkWidget *menu;
  GtkWidget *menu_item;

  window = gtk_window_new(GTK_WINDOW_TOPLEVEL);
  gtk_window_set_title(GTK_WINDOW(window), current_user);
  gtk_window_set_position(GTK_WINDOW(window), GTK_WIN_POS_CENTER);
  gtk_container_set_border_width(GTK_CONTAINER(window), 2);

  //connect windows signals
  gtk_signal_connect(GTK_OBJECT(window), "destroy", GTK_SIGNAL_FUNC(dsy_destroy), NULL);
  gtk_signal_connect(GTK_OBJECT(window), "delete_event", GTK_SIGNAL_FUNC(dsy_delete_event)

  table = gtk_table_new(5, 5, TRUE);

  gtk_container_add(GTK_CONTAINER(window), table);

  //Chat Button
  button = gtk_button_new();
  gtk_signal_connect(GTK_OBJECT(button), "clicked", 
		     GTK_SIGNAL_FUNC(chat_callback), buddy_list);
  box1 = xpm_label_box(window, "images/ksmiletris.xpm", "Chat");
  gtk_widget_show(box1);
  gtk_container_add(GTK_CONTAINER(button), box1);
  gtk_widget_show(button);
  gtk_table_attach(GTK_TABLE(table), button, 0, 1, 
		   0, 1, GTK_FILL, GTK_FILL, 2, 2);

  //Add Buddy Button
  button = gtk_button_new();
  gtk_signal_connect(GTK_OBJECT(button), "clicked",
		     GTK_SIGNAL_FUNC(add_callback), buddy_list);
  box1 = xpm_label_box(window, "images/kdmconfig.xpm", "Add");
  gtk_widget_show(box1);
  gtk_container_add(GTK_CONTAINER(button), box1);
  gtk_widget_show(button);
  gtk_table_attach(GTK_TABLE(table), button, 1, 2, 
		   0, 1, GTK_FILL, GTK_FILL, 2, 2);

  //Remove Buddy
  button = gtk_button_new();
  gtk_signal_connect(GTK_OBJECT(button), "clicked", 
		     GTK_SIGNAL_FUNC(remove_callback), 
		     buddy_list);
  box1 = xpm_label_box(window, "images/x.xpm", "Remove");
  gtk_widget_show(box1);
  gtk_container_add(GTK_CONTAINER(button), box1);
  gtk_widget_show(button);
  gtk_table_attach(GTK_TABLE(table), button, 2, 3,
		   0, 1, GTK_FILL, GTK_FILL, 2, 2);

  //Profile Button
  button = gtk_button_new();
  gtk_signal_connect(GTK_OBJECT(button), "click",
		     GTK_SIGNAL_FUNC(profile_callback),
		     (gpointer) (gpointer) buddy_list);
  box1 = xpm_label_box(window, "images/info.xpm", "Profile");
  gtk_widget_show(box1);
  gtk_container_add(GTK_CONTAINER(button), box1);
  gtk_widget_show(button):
  gtk_table_attach(GTK_TABLE(table), button, 3, 4, 
		   0, 1, GTK_FILL, GTK_FILL, 2, 2);

  //Configure Button
  button = gtk_button_new();
  gtk_signal_connect(GTK_OBJECT(button), "clicked",
		     GTK_SIGNAL_FUNC(configure_callback),
		     NULL);
  box1 = xpm_label_show(window, "images/script.xpm", "Configure");
  gtk_widget_show(box1);
  gtk_container_add(GTK_CONTAINER(button), box1);
  gtk_widget_show(button);
  gtk_table_attach(GTK_TABLE(table), button, 4, 5,
		   0, 1, GTK_FILL, GTK_FILL, 2, 2);

  //Buddy List
  buddy_list = gtk_clist_new(1);
  gtk_clist_set_selection_mode(GTK_CLIST(buddy_list), GTK_SELECTION_MULTIPLE);
  gtk_clist_column_titles_show(GTK_CLIST(buddy_list));
  gtk_clist_set_column_title(GTK_CLIST(buddy_list), 1, "Friends");
  gtk_clist_set_column_justification(GTK_CLIST(buddy_list), 1, GTK_JUSTIFY_LEFT);
  //gtk_signal_connect(GTK_OBJECT(buddy_list), "select-row", GTK_SIGNAL_FUNC(userselected_callback), NULL);
  //gtk_signal_connect(GTK_OBJECT(buddy_list), "unselect_row", GTK_SIGNAL_FUNC(userunselect_callback), NULL);
  gtk_widget_show(buddy_list);
  gtk_table_attach(GTK_TABLE(table), buddy_list, 0, 5,
		   1, 3, GTK_FILL, GTK_FILL, 2, 2);

  //Enable Auto Reply
  checkbox = gtk_check_button_new_with_label("Auto Reply");
  gtk_signal_connect(GTK_OBJECT(checkbox), "toggled", 
		     GTK_SIGNAL_FUNC(autoreply_callback), (gpointer) checkbox);
  gtk_widget_show(checkbox);
  gtk_table_attach(GTK_TABLE(table), checkbox, 0, 2, 
		   3, 4, GTK_FILL, GTK_FILL, 2, 2);
 
  //label
  label = gtk_label_new("Status");
  gtk_widget_show(label);
  gtk_widget_show(label);
  gtk_table_attach(GTK_TABLE(table), label, 2, 3, 
		   3, 4, GTK_FILL, GTK_FILL, 2, 2);

  //statusmenu
  status = gtk_option_menu_new();
  menu = gtk_menu_new();
  gtk_widget_show(menu);

  //Statusmenu - avalible
  menu_item = gtk_menu_item_new_with_label("Available");
  gtk_signal_connect(GTK_OBJECT(menu_item), "activate",
			    GTK_SIGNAL_FUNC(handle_status_change), 
			    STATUS_AVAILABLE);
  gtk_widget_show(menu_item);
  gtk_menu_append(GTK_MENU(menu), menu_item);

  //Statusmenu - Be Right Back
  menu_item = gtk_menu_item_new_with_label("Be Right Back");
  gtk_signal_connect(GTK_OBJECT(menu_item), "activate",
		     GTK_SIGNAL_FUNC(handle_status_change),
		     STATUS_BRB);
  gtk_widget_show(menu_item);
  gtk_menu_append(GTK_MENU(menu), menu_item);

  //Statusmenu - Busy
  menu_item = gtk_menu_item_new_with_label("Busy");
  gtk_signal_connect(GTK_OBJECT(menu_item), "activate",
		     GTK_SIGNAL_FUNC(handle_status_change),
		     STATUS_BUSY);
  gtk_widget_show(menu_item);
  gtk_menu_append(GTK_MENU(menu), menu_item);

  //Statusmenu - Not At Home
  menu_item = gtk_menu_item_new_with_label("Not Home");
  gtk_signal_connect(GTK_OBJECT(menu_item), "activate",
		     GTK_SIGNAL_FUNC(handle_status_change),
		     STATUS_NOTHOME);
  gtk_widget_show(menu_item);
  gtk_menu_append(GTK_MENU(menu), menu_item);

  //Statusmenu - Not at my desk
  menu_item = gtk_menu_item_new_with_label("Not at my Desk");
  gtk_signal_connect(GTK_OBJECT(menu_item), "activate",
		     GTK_SIGNAL_FUNC(handle_status_change),
		     STATUS_NOTATDESK);
  gtk_widget_show(menu_item);
  gtk_menu_append(GTK_MENU(menu), menu_item);

  //Statusmenu - Not in the Office
  menu_item = gtk_menu_item_new_with_label("Not in the Office");
  gtk_signal_connect(GTK_OBJECT(menu_item), "activate",
		     GTK_SIGNAL_FUNC(handle_status_change),
		     STATUS_NOTINOFFICE);
  gtk_widget_show(menu_item);
  gtk_menu_append(GTK_MENU(menu), menu_item);

  //Statusmenu - Phone
  menu_item = gtk_menu_item_new_with_label("On the Phone");
  gtk_signal_connect(GTK_OBJECT(menu_item), "activate",
		     GTK_SIGNAL_FUNC(handle_status_change),
		     STATUS_PHONE);
  gtk_widget_show(menu_item);
  gtk_menu_append(GTK_MENU(menu), menu_item);

  //Statusmenu - Vacation
 menu_item = gtk_menu_item_new_with_label("On Vacation");
  gtk_signal_connect(GTK_OBJECT(menu_item), "activate",
		     GTK_SIGNAL_FUNC(handle_status_change),
		     STATUS_VACATION);
  gtk_widget_show(menu_item);
  gtk_menu_append(GTK_MENU(menu), menu_item);

  //Statusmenu - Lunch
  menu_item = gtk_menu_item_new_with_label("Lunch");
  gtk_signal_connect(GTK_OBJECT(menu_item), "activate",
		     GTK_SIGNAL_FUNC(handle_status_change),
		     STATUS_LUNCH);
  gtk_widget_show(menu_item);
  gtk_menu_append(GTK_MENU(menu), menu_item);

  //Statusmenu - Stepped out
  menu_item = gtk_menu_item_new_with_label("Stepped Out");
  gtk_signal_connect(GTK_OBJECT(menu_item), "activate",
		     GTK_SIGNAL_FUNC(handle_status_change),
		     STATUS_STEPOUT);
  gtk_widget_show(menu_item);
  gtk_menu_append(GTK_MENU(menu), menu_item);

  gtk_option_menu_set_menu(GTK_OPTION_MENU(status), menu);
  gtk_widget_show(menu);
  gtk_widget_show(status);
  gtk_table_attach(GTK_TABLE(table), status, 3, 5,
		   3, 4, GTK_FILL, GTK_FILL, 2, 2);

  //Statusbar
  statusbar = gtk_statusbar_new();
  gtk_widget_show(statusbar);
  gtk_table_attach(GTK_TABLE(table), statusbar, 0, 5,
		   4, 5, GTK_FILL, GTK_FILL, 2, 2);

  gtk_widget_show(table);
  
  return window;
 }
  
