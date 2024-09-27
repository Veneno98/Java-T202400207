
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
    
    public class Menus extends JFrame {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Menu");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JMenuBar menuBar = new JMenuBar();
         JMenu menuArquivo = new JMenu("Arquivo");
         JMenu menuEditar = new JMenu("Editar");         
         menuBar.add(menuArquivo);
         menuBar.add(menuEditar);
         frame.setJMenuBar(menuBar);
         frame.setVisible(true);
     }
 }