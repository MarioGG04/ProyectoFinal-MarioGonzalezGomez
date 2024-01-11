package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SplashScreen {

    public static void mostrar() {
        mostrarPantallaPresentacion();
        
        // Simular algún trabajo de inicialización
        for (int i = 0; i <= 100; i++) {
            // Simular trabajo en progreso
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            // Actualizar el progreso en la pantalla de presentación
            establecerProgresoPantallaPresentacion(i);
        }
        
        // Cerrar la pantalla de presentación cuando la inicialización esté completa
        cerrarPantallaPresentacion();
        
        // Tu código principal de la aplicación va aquí
        // ...
    }

    private static JWindow pantallaPresentacion;
    private static JProgressBar barraProgreso;

    private static void mostrarPantallaPresentacion() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        pantallaPresentacion = new JWindow();
        pantallaPresentacion.getContentPane().setLayout(new BorderLayout());

        JLabel etiquetaImagen = new JLabel(new ImageIcon("ruta/a/tu/imagen_de_presentacion.png"));
        pantallaPresentacion.getContentPane().add(etiquetaImagen, BorderLayout.CENTER);

        JPanel panelProgreso = new JPanel(new BorderLayout());
        panelProgreso.setBackground(Color.BLACK);
        barraProgreso = new JProgressBar();
        barraProgreso.setStringPainted(true);
        
        // Establecer la tipografía y color de la barra de progreso
        barraProgreso.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        barraProgreso.setForeground(Color.BLUE);
        
        barraProgreso.setBackground(Color.BLACK);
        barraProgreso.setString("Cargando...");
        panelProgreso.add(barraProgreso, BorderLayout.SOUTH);

        pantallaPresentacion.getContentPane().add(panelProgreso, BorderLayout.SOUTH);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pantallaPresentacion.setSize(400, 300);
        pantallaPresentacion.setLocation((screenSize.width - 400) / 2, (screenSize.height - 300) / 2);
        pantallaPresentacion.setVisible(true);
    }

    private static void establecerProgresoPantallaPresentacion(int progreso) {
        barraProgreso.setValue(progreso);
    }

    private static void cerrarPantallaPresentacion() {
        pantallaPresentacion.dispose();
    }
}
