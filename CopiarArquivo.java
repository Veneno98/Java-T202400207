import javax.swing.*;
import static java.nio.file.StandardCopyOption.*;
import java.nio.file.*;

public class CopiarArquivo {
    public static void main(String[] args) throws Exception {
        try {
            JFileChooser chooser = new JFileChooser();
            
            chooser.setDialogTitle("Selecione o arquivo que deseja copiar.");
            int returnVal1 = chooser.showOpenDialog(null);
            String fileFullPath = "";
            String fileName = "";
            if(returnVal1 == JFileChooser.APPROVE_OPTION) {
                System.out.println("Você escolheu abrir esta pasta: " + chooser.getSelectedFile().getName());
                fileFullPath = chooser.getSelectedFile().getAbsolutePath();
                fileName = chooser.getSelectedFile().getName();
                System.out.println("Caminho completo da pasta: " + fileFullPath);
            } else {
                System.out.println("Que pena!");
            }

            chooser.setDialogTitle("Selecione a pasta de destino.");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnVal2 = chooser.showOpenDialog(null);
            String folderFullPath = "";
            if(returnVal2 == JFileChooser.APPROVE_OPTION) {
                folderFullPath = chooser.getSelectedFile().getAbsolutePath();
                System.out.println("Você escolheu abrir esta pasta: " + chooser.getSelectedFile().getName());
                System.out.println("Caminho completo da pasta: " + chooser.getSelectedFile().getAbsolutePath());
            } else {
                System.out.println("Que pena!");
            }

            Path pathOrigin = Paths.get(fileFullPath);
            Path pathDestination = Paths.get(folderFullPath + "\\" + fileName);
            Files.copy(pathOrigin, pathDestination, REPLACE_EXISTING);
        } catch (Exception e) {
            System.out.println("Não foi possível copiar o arquivo.");
        }
    }
}