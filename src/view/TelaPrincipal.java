package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {

    private JButton btnCadastrar;
    private JButton btnListar;
    private JButton btnSair;
    private JLabel titulo;

    public TelaPrincipal() {
        iniciarComponentes();
        configurarEventos();
    }

    private void iniciarComponentes() {
        setTitle("Controle Financeiro");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // layout manual

        titulo = new JLabel("Controle Financeiro");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setBounds(90, 20, 300, 30);

        btnCadastrar = new JButton("Cadastrar Transação");
        btnCadastrar.setBounds(100, 90, 180, 30);

        btnListar = new JButton("Listar Transações");
        btnListar.setBounds(100, 130, 180, 30);

        btnSair = new JButton("Sair");
        btnSair.setBounds(100, 170, 180, 30);

        add(titulo);
        add(btnCadastrar);
        add(btnListar);
        add(btnSair);
    }

    private void configurarEventos() {

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "👉 Aqui abrirá a tela de cadastro!");
            }
        });

        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "📄 Aqui abrirá a tela de listagem!");
            }
        });

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmacao = JOptionPane.showConfirmDialog(null,
                        "Deseja realmente sair?", "Confirmar",
                        JOptionPane.YES_NO_OPTION);

                if (confirmacao == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

    }
}
