#include <gtk/gtk.h>

#include "interface.h"
#include "callback.h"

int main(int argc, char *argv[])
{
  GtkWidget *mainwindow;

  gtk_init(&argc, &argv);

  mainwindow = create_main_window();

  gtk_main();

  return 0;
}
