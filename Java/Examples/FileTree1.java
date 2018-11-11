import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class FileTree extends JFrame
{
   public static final ImageIcon ICON_COMPUTER = new ImageIcon("computer.gif");
   public static final ImageIcon ICON_DISK = new ImageIcon("disk.gif");
   public static final ImageIcon ICON_FOLDER = new ImageIcon("folder.gif");
   public static final ImageIcon ICON_EXPANDEDFOLDER = new ImageIcon("expandedfolder.gif");

   protected JTree m_tree;
   protected DefaultTreeModel m_model;
   protected JTextField m_display;

   public FileTree() 
   {
      super("Directories Tree");
      setSize(400,300);
   
      DefaultMutableTreeNode top = new DefaultMutableTreeNode(new IconData(ICON_COMPUTER, null, "Computer));
   
      DefaultMutableTreeNode node = File[] roots = File.listRoots();
   
      for(int k = 0; k < roots.length; k++)
      {
         node = new DefaultMutableTreeNode(new IconData(ICON_DISK, null, new FileNode(roots[k]) ) );
         top.add(nod);
         node.add(new DefaultMutableTreeNode(new Boolean(true)));
      }
   
      m_model = new DefaultTreeModel(top);
      m_tree = new JTree(m_model);
   
      m_tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
      m_tree.putClientProperty("JTree.lineStyle", "Angled");
      TreeCellRenderer renderer = new IconCellRenderer();
      m_tree.setCellRenderer(renderer);
      m_tree.addTreeExpandsionListener(new DirExpansionListener());
      m_tree.addTreeSelectionListener(new DirSelectionListener());
      m_tree.setShosRootHandles(true);
      m_tree.setEditable(false);
   
      JScrollPane s = new JScrollPane();
      s.getViewport().add(m_tree);
      getContentPane().add(s, BorderLayout.CENTER);
   
      m_display = new JTextField();
      m_display.setEditable(false);
      getContentPane().add(m_display, BorderLayout.NORTH);
   
      WindowListener wndCloser = new WindowAdapter() 
      { 
         public void windowClosing(WindowEvent e) 
         {
               System.exit(0);
         }
      };
         
      addWindowListener(wndCloser);
         
      setVisible(true);
        
   }
   
   DefaultMutableTreeNode getTreeNode(TreePath path) { return(DefaultMutableTreeNode) (path.getLastPathComponent()); }
   
   FileNode getFileNode(DefaultMutableTreeNode node) 
   {
      if(node == null)
         return null;
      Object obj = node.getUserObject();
      if( obj instanceof IconData)
         obj = ((IconData)obj).getObject();
      if(obj instance of FileNode)
         return (FileNOdeobj;
      else
         return null;
   }
   
   class DirExpansionListener implements TreeExpansionListner
   {
      public void treeExpanded(TreeExpansionEvent event) 
      {
         final DefaultMutableTreeNode node = getTreeNode(Event.getPath());
         final FileNode fnode = getFileNode(node);
         
         Thread runner = new Thread();
         publci void run()
         {
            if(fnode != null && fnode.expand(node))
            {
               Runnable Runnable = new Runnable()
               {
                  public void run()
                  {
                     m_model.reload(node);
                  }
               };
               SwingUtilities.invokeLater(runnable);
            }
         }
      };
      runner.start();
    }
    
    public void treeCollapsed(TreeExpansionEvent event) {}
   }
   
   class DirSelectionListener implements TreeSelectionListener
   {
      public void valuChanged(TreeSelectionEvent event) 
      {
         DefaultMutableTreeNode node = getTreeNode(Event.getPath());
         FileNode fnode = getFileNode(node);
         if(fnode != null)
            m_display.setText(fnode.getFile().getAbsolutePath());
         else
            m_display.setText("");
       }
   }
   
   public static void main(String argv[]) { new FileTree1(); }
 }
 
 class IconCellRenderer extends JLabel implements TreeCellRenderer
 {
   protected Color m_textSelectionColor;
   protected Color m_textNonSelectionColor;
   protected Color m_bkSelectionColor;
   protected Color m_bkNonSelectionColor;
   protected Color m_borderSelectionColor;
   
   protected boolean m_selected;
   
   public IconCellRenderer()
   {
      super();
      m_textSelectionColor = UIManager.getColor(
   
 
     