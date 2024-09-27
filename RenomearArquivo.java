import javax.swing.*;
import java.io.IOException;
import java.nio.file.*;

public class RenomearArquivo {
    public static void main(String[] args) {
        try {
            JFileChooser chooser = new JFileChooser();
            
            chooser.setDialogTitle("Selecione o arquivo que deseja renomear.");
            int returnVal = chooser.showOpenDialog(null);
            String fileFullPath = "";
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                fileFullPath = chooser.getSelectedFile().getAbsolutePath();
                System.out.println("Você escolheu renomear este arquivo: " + chooser.getSelectedFile().getName());
                System.out.println("Caminho Completo do Arquivo: " + fileFullPath);
            } else {
                System.out.println("Que pena! Nenhum arquivo selecionado.");
                return;
            }

            String novoNome = JOptionPane.showInputDialog("Digite o novo nome (com sua extenção):");
            if (novoNome == null || novoNome.isEmpty()) {
                System.out.println("Nome inválido. Operação cancelada.");
                return;
            }

            Path pathOriginal = Paths.get(fileFullPath);
            Path pathRenomeado = Paths.get(pathOriginal.getParent().toString(), novoNome);
            
            Files.move(pathOriginal, pathRenomeado, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Arquivo renomeado com sucesso para: " + novoNome);
        } catch (NoSuchFileException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao renomear o arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
