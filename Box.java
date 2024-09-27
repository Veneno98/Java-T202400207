import javax.swing.*;

public class Box extends JFrame {

    private JComboBox<String> comboBoxAlunos;

    public Box() {
        super("Alunos");

        String[] nomesAlunos = {
            "Adrian", "Angelo", "Daniel", "Douglas", "Enrique", "Felipe", "Gabriel", "Gustavo", "Henrique", "Jean", "Rafael", "Farias", "Germano", "Julio", "Lucas", "Matheus",
        };

        comboBoxAlunos = new JComboBox<>(nomesAlunos);

        getContentPane().add(comboBoxAlunos);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Box());
    }
}