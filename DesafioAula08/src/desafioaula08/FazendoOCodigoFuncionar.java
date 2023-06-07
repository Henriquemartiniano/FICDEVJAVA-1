import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FazendoOCodigoFuncionar {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("/test.txt"));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro de leitura do arquivo: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                System.err.println("Erro ao fechar o BufferedReader: " + ex.getMessage());
            }
        }
    }
}

