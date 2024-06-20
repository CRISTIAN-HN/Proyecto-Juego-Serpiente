/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoSerpiente;

import javax.swing.*;

public class JuegoVentana extends JFrame {

    private long mejorTiempo;

    public JuegoVentana() {
        setTitle("Serpiente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        mostrarMenuInicio();
        pack();
        setVisible(true);
        setLocationRelativeTo(null); // Esto centra la ventana
    }

    public void mostrarMenuInicio() {
        getContentPane().removeAll();
        MenuInicio menuInicio = new MenuInicio(this);
        add(menuInicio);
        pack();
        setLocationRelativeTo(null); // Esto centra la ventana
    }

    public void iniciarJuego() {
        getContentPane().removeAll();
        JuegoContenido juegoContenido = new JuegoContenido(this);
        add(juegoContenido);
        juegoContenido.requestFocusInWindow();
        pack();
        setLocationRelativeTo(null); // Esto centra la ventana
    }

    public long getMejorTiempo() {
        return mejorTiempo;
    }

    public void setMejorTiempo(long mejorTiempo) {
        this.mejorTiempo = mejorTiempo;
    }
}