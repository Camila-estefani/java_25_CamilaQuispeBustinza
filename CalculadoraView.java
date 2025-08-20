package vallegrande.edu.pe.view;

import vallegrande.edu.pe.controller.CalculadoraController;

import javax.swing.*;
import java.awt.*;

public class CalculadoraView extends JFrame {
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtResultado;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;

    private final CalculadoraController controller;

    public CalculadoraView() {
        controller = new CalculadoraController();

        setTitle("Calculadora");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));

        // Componentes
        panel.add(new JLabel("Número 1:"));
        txtNum1 = new JTextField();
        panel.add(txtNum1);

        panel.add(new JLabel("Número 2:"));
        txtNum2 = new JTextField();
        panel.add(txtNum2);

        panel.add(new JLabel("Resultado:"));
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        panel.add(txtResultado);

        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");

        panel.add(btnSumar);
        panel.add(btnRestar);
        panel.add(btnMultiplicar);
        panel.add(btnDividir);

        add(panel);

        // Eventos
        btnSumar.addActionListener(e -> operar("sumar"));
        btnRestar.addActionListener(e -> operar("restar"));
        btnMultiplicar.addActionListener(e -> operar("multiplicar"));
        btnDividir.addActionListener(e -> operar("dividir"));
    }

    private void operar(String tipo) {
        try {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            double resultado = switch (tipo) {
                case "sumar" -> controller.sumar(n1, n2);
                case "restar" -> controller.restar(n1, n2);
                case "multiplicar" -> controller.multiplicar(n1, n2);
                case "dividir" -> controller.dividir(n1, n2);
                default -> 0;
            };
            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
