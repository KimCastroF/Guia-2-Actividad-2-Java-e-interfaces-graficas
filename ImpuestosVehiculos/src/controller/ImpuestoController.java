/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Impuesto;
import view.ImpuestosView;
import javax.swing.JOptionPane;


public class ImpuestoController {
    private ImpuestosView view;
    

    public ImpuestoController(ImpuestosView view) {
        this.view = view;
        this.view.setController(this);
        
    }

    public void calcularImpuesto() {
        try {
            int anio = Integer.parseInt(view.getTxtAnio().getText());
            double avaluo = Double.parseDouble(view.getTxtAvaluo().getText());
            int cilindraje = Integer.parseInt(view.getTxtCilindraje().getText());
            String uso = (String) view.getCmbUso().getSelectedItem();
            

            double impuesto = Impuesto.calcularImpuesto(anio, avaluo, cilindraje, uso);
            view.getLblResultado().setText("Impuesto a pagar: $" + String.format("%,.2f", impuesto));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


