import javax.swing.*;
import static java.nio.file.StandardCopyOption.*;
import java.nio.file.*;

public class MoverArquivo {
    public static void main(String[] args) {
        try {
            JFileChooser chooser = new JFileChooser();
            
            chooser.setDialogTitle("Selecione o arquivo que deseja mover.");
            int returnVal1 = chooser.showOpenDialog(null);
            String fileFullPath = "";
            String fileName = "";
            if(returnVal1 == JFileChooser.APPROVE_OPTION) {
                System.out.println("Você escolheu abrir este arquivo: " + chooser.getSelectedFile().getName());
                fileFullPath = chooser.getSelectedFile().getAbsolutePath();
                fileName = chooser.getSelectedFile().getName();
                System.out.println("Caminho Completo do Arquivo: " + fileFullPath);
            } else {
                System.out.println("Que pena!");
                return;
            }

            chooser.setDialogTitle("Selecione a pasta de destino.");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnVal2 = chooser.showOpenDialog(null);
            String folderFullPath = "";
            if(returnVal2 == JFileChooser.APPROVE_OPTION) {
                folderFullPath = chooser.getSelectedFile().getAbsolutePath();
                System.out.println("Você escolheu abrir esta pasta: " + chooser.getSelectedFile().getName());
                System.out.println("Caminho Completo da Pasta: " + folderFullPath);
            } else {
                System.out.println("Que pena!");
                return;
            }

            Path pathOrigin = Paths.get(fileFullPath);
            Path pathDestination = Paths.get(folderFullPath, fileName);
            Files.move(pathOrigin, pathDestination, REPLACE_EXISTING);
            System.out.println("Arquivo movido com sucesso para: " + pathDestination);
        } catch (Exception e) {
            System.out.println("Não foi possível mover o arquivo: ");
        }
    }
}
