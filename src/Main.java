import view.TelaPrincipal;

public class Main {
    public static void main(String[] args) {

        // Garante visual moderno do Swing
        try {
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName()
            );
        } catch (Exception e) {
            System.out.println("Erro ao aplicar o estilo visual: " + e.getMessage());
        }

        // Abrir a tela principal
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
}
