/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian Gomez
 */
package JuegoSerpiente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MenuInicio extends JPanel {

    private final JuegoVentana juegoVentana;

    public MenuInicio(JuegoVentana juegoVentana) {
        this.juegoVentana = juegoVentana;
        initUI();
    }

    private void initUI() {
        setLayout(new GridLayout(4, 1, 0, 20));
        
        JLabel titleLabel = new JLabel("Serpiente", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel bestTimeLabel = new JLabel("Mejor tiempo: " + juegoVentana.getMejorTiempo() + " ms", SwingConstants.CENTER);

        JButton startButton = new JButton("Comenzar");
        JButton exitButton = new JButton("Salir");

        add(titleLabel);
        add(bestTimeLabel);
        add(startButton);
        add(exitButton);

        startButton.addActionListener((ActionEvent e) -> {
            juegoVentana.iniciarJuego();
        });

        exitButton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }
}

