import javax.swing.*;
import java.io.IOException;
import java.nio.file.*;

public class DeletarArquivo {
    public static void main(String[] args) {
        try {
            JFileChooser chooser = new JFileChooser();
            
            chooser.setDialogTitle("Selecione o arquivo que deseja deletar.");
            int returnVal = chooser.showOpenDialog(null);
            String fileFullPath = "";
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                fileFullPath = chooser.getSelectedFile().getAbsolutePath();
                System.out.println("Você escolheu deletar este arquivo: " + chooser.getSelectedFile().getName());
                System.out.println("Caminho Completo do Arquivo: " + fileFullPath);
            } else {
                System.out.println("Que pena! Nenhum arquivo selecionado.");
                return;
            }

            Path pathToDelete = Paths.get(fileFullPath);
            Files.delete(pathToDelete);
            System.out.println("Arquivo deletado com sucesso: " + fileFullPath);
        } catch (NoSuchFileException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch (DirectoryNotEmptyException e) {
            System.out.println("O diretório não está vazio: " + e.getMessage());
        } catch (IOException e) {
        }
    }
}