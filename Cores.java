import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class Cores extends JPanel 
{
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g); 
      this.setBackground(Color.RED);

      g.setColor(Color.BLUE);
      g.fillRect(15, 25, 100, 20);
      g.drawString("Senac", 130, 40);

      g.setColor(Color.WHITE);
      g.fillRect(15, 50, 100, 20);
      g.drawString("Curso de Java", 130, 65);

   } 
}