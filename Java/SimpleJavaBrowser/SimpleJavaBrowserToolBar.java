import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class SimpleJavaBrowserToolBar extends JPanel {
   private JButton wBack, wReload, wStop, wForward, wHome, wEmail;
   private JToolBar wTool;
   private JLabel lblAddress;
   private JComboBox txtURL;
   private JMenuBar sjMenuBar;
   private JMenu menuInternet, menuEdit;
   private JMenuItem mnuNewWindow, mnuMail, mnuOpenLocation, mnuAddBookmark, mnuEditBookmark, mnuExit, mnuCut, mnuCopy, mnuPaste, mnuOptions;
   private URL linuxURL;
   
   SimpleJavaBrowserToolBar() {
      addBorderLayout(new BorderLayout());
      
      // Menu assignments
      menuBar = new JMenuBar();

	   mnuInternet = new JMenu("Internet");
	   mnuNewWindow = new JMenuItem("New WIndow");
	   mnuMail = new JMenuItem("Mail");
	   mnuOpenLocation = new JMenuItem("Open Location");
	   mnuAddBookmark = new JMenuItem("Add Bookmark");
	   mnuEditBookmark = new JMenuItem("Edit Bookmarks");
	   mnuExit = new JMenuItem("Exit");

	   mnuInternet.add(mnuNewWindow);
	   mnuInternet.add(mnuMail);
	   mnuInternet.add(mnuOpenLocation);
	   mnuInternet.add(mnuAddBookmark);
	   mnuInternet.add(mnuEditBookmark);
	   mnuInternet.add(mnuExit);

	   mnuNewWindow.addActionListener(this);
	   mnuMail.addActionListener(this);
	   mnuOpenLocation.addActionListener(this);
	   mnuAddBookmark.addActionListener(this);
	   mnuEditBookmark.addActionListener(this);
	   mnuExit.addActionListener(this);
	   mnuOptions.addActionListener(this);

	   mnuEdit = new JMenu("Edit");
	   mnuCut = new JMenuItem("Cut");
	   mnuCopy = new JMenuItem("Copy");
	   mnuPaste = new JMenuItem("Paste");
	   mnuOptions = new JMenuItem("Options");

	   mnuEdit.add(mnuCut);
	   mnuEdit.add(mnuCopy);
	   mnuEdit.add(mnuPaste);
	   mnuEdit.add(mnuOptions);

	   sjMenuBar.add(mnuInternet);
	   sjMenuBar.add(mnuEdit);
   }  //end of SimpleJavaBrowser constructor
     
   JMenuBar getMenuBar(void) {
      return sjMenuBar;
   }