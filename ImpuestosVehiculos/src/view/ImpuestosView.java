/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ImpuestoController;
import javax.swing.*;
import java.awt.*;

public class ImpuestosView extends JFrame {
    private JTextField txtAnio, txtAvaluo, txtCilindraje, txtMarca, txtModelo;
    private JComboBox<String> cmbUso;
    private JLabel lblResultado;
    private JButton btnCalcular;
    private ImpuestoController controller;

    
    public ImpuestosView() {
        setTitle("Cálculo de Impuesto Vehicular");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null); // Para centrar ventana
        

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        

        
        addComponent(gbc, "Marca:", 0, 0);
        txtMarca = new JTextField(15);
        addComponent(txtMarca, gbc, 1, 0);
        

        addComponent(gbc, "Modelo:", 0, 1);
        txtModelo = new JTextField(15);
        addComponent(txtModelo, gbc, 1, 1);
        

        addComponent(gbc, "Año de fabricación:", 0, 2);
        txtAnio = new JTextField(10);
        addComponent(txtAnio, gbc, 1, 2);
        

        addComponent(gbc, "Cilindraje:", 0, 3);
        txtCilindraje = new JTextField(10);
        addComponent(txtCilindraje, gbc, 1, 3);
        

        addComponent(gbc, "Avalúo comercial:", 0, 4);
        txtAvaluo = new JTextField(10);
        addComponent(txtAvaluo, gbc, 1, 4);
        

        addComponent(gbc, "Tipo de uso:", 0, 5);
        cmbUso = new JComboBox<>(new String[]{"Particular", "Público"}); // Opcion de tipo de uso del auto
        addComponent(cmbUso, gbc, 1, 5);

        
        
        btnCalcular = new JButton("Calcular Impuesto");
        btnCalcular.setBackground(new Color(0x008F39));
        btnCalcular.setForeground(Color.WHITE);
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnCalcular, gbc);

        
       
        lblResultado = new JLabel("Impuesto a pagar: $0.00");
        lblResultado.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridy = 7;
        add(lblResultado, gbc);
        

        btnCalcular.addActionListener(e -> controller.calcularImpuesto());
        
    }

    private void addComponent(GridBagConstraints gbc, String text, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 12));
        add(label, gbc);
        
    }

    private void addComponent(JComponent component, GridBagConstraints gbc, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        add(component, gbc);
        
    }

    public void setController(ImpuestoController controller) {
        this.controller = controller;
        
    }

    public JTextField getTxtAnio() { return txtAnio; }
    public JTextField getTxtAvaluo() { return txtAvaluo; }
    public JTextField getTxtCilindraje() { return txtCilindraje; }
    public JComboBox<String> getCmbUso() { return cmbUso; }
    public JLabel getLblResultado() { return lblResultado; }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImpuestosView view = new ImpuestosView();
            ImpuestoController controller = new ImpuestoController(view);
            view.setVisible(true);
            
        });
    }
}





