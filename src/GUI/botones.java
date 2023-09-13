package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Sonido.reproducirAudio;

public class botones extends JFrame {
    private reproducirAudio sonido; // Instancia de la clase reproducirAudio

    public botones() {
        // Establece el título de la ventana
        setTitle("Lanzadora de Sonidos");

        // Establece el tamaño de la ventana
        setSize(400, 300); // Aumentamos la altura para hacer espacio para botones más grandes

        // Establece la operación por defecto al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea un panel con un GridLayout de 2 filas y 3 columnas
        JPanel panel = new JPanel(new GridLayout(2, 3, 10, 10)); // Espacio entre botones

        // Crea 6 botones con etiquetas
        JButton boton1 = new JButton("Sonido 1");
        JButton boton2 = new JButton("Sonido 2");
        JButton boton3 = new JButton("Sonido 3");
        JButton boton4 = new JButton("Sonido 4");
        JButton boton5 = new JButton("Sonido 5");
        JButton boton6 = new JButton("Sonido 6");

        // Cambia el tamaño de los botones y agrega colores
        boton1.setPreferredSize(new Dimension(100, 60)); // Tamaño más grande
        boton1.setBackground(Color.RED); // Color de fondo
        boton2.setPreferredSize(new Dimension(100, 60));
        boton2.setBackground(Color.GREEN);
        boton3.setPreferredSize(new Dimension(100, 60));
        boton3.setBackground(Color.BLUE);
        boton4.setPreferredSize(new Dimension(100, 60));
        boton4.setBackground(Color.YELLOW);
        boton5.setPreferredSize(new Dimension(100, 60));
        boton5.setBackground(Color.ORANGE);
        boton6.setPreferredSize(new Dimension(100, 60));
        boton6.setBackground(Color.MAGENTA);

        // Agrega los botones al panel
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(boton6);

        // Inicializa la instancia de la clase reproducirAudio
        sonido = new reproducirAudio();

        // Agrega un ActionListener a cada botón para manejar los eventos de clic
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sonido.Reproducir("sound1");
            }
        });

        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sonido.Reproducir("sound2");
            }
        });

        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sonido.Reproducir("sound3");
            }
        });

        boton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sonido.Reproducir("sound4");
            }
        });

        boton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sonido.Reproducir("sound5");
            }
        });

        boton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sonido.Reproducir("sound6");
            }
        });

        // Agrega el panel a la ventana
        add(panel);

        // Hacer la ventana visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new botones();
            }
        });
    }
}