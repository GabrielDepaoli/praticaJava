package System;
import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame{

    public MainView(){
        initComponents();
    }

    public void initComponents(){
        setTitle("Sistema Financeiro");
        setSize(new Dimension(480, 840));
        setLayout(null);
        setIconImage(new ImageIcon("C:\\Users\\depao\\Desktop\\ControleFinanceiro\\src\\view\\icon.png").getImage());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainView().setVisible(true);
    }
}
