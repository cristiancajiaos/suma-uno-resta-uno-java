package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {

    private Vista vista;
    private Modelo modelo;
    
    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnSumaUno.addActionListener(this);
        this.vista.btnRestaUno.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnSumaUno) {
            this.modelo.sumarUnoCuenta();
            this.vista.etiquetaCuenta.setText("Cuenta: " + this.modelo.getCuenta());
        } else if (e.getSource() == this.vista.btnRestaUno) {
            this.modelo.restarUnoCuenta();
            this.vista.etiquetaCuenta.setText("Cuenta: " + this.modelo.getCuenta());
        }
    }
    
}
