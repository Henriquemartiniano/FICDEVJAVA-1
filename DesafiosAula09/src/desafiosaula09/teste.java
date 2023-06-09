import java.util.logging.Logger;

public class teste {
    private static final Logger logger = Logger.getLogger(teste.class.getName());

    public static void main(String[] args) {
        teste teste = new teste();
        teste.meuMetodo();
    }

    public void meuMetodo() {
        // ...
        logger.info("Mensagem informativa");
        logger.warning("Mensagem de aviso");
        // ...
    }
}
