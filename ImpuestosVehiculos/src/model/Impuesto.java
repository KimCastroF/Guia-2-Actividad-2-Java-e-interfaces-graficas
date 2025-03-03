/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Impuesto {
    public static double calcularImpuesto(int anio, double avaluo, int cilindraje, String uso) {
        double tarifa = 0.025; // Tarifa base 2.5%

        
        
        if (avaluo < 54057000) {
            tarifa = 0.015; // Tarifa 1.5% para automóviles de menor avalúo
            
        } else if (avaluo >= 54057001 && avaluo <= 121635000) {
            tarifa = 0.025; // Tarifa 2.5% para automóviles de rango medio
            
        } else {
            tarifa = 0.035; // Tarifa del 3.5% para vehículos de lujo
            
        }

        // Aplicación de Descuento del 20% si es un vehículo de servicio público
        if ("Público".equals(uso)) {
            tarifa *= 0.8;
        }

        
        
        return avaluo * tarifa;
    }
}



