import javax.swing.JFrame;

public class MostrarCores
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Painel do Java");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Cores colorJPanel = new Cores();
      frame.add(colorJPanel); 
      frame.setSize(300, 120);
      frame.setVisible(true);
   } 
}