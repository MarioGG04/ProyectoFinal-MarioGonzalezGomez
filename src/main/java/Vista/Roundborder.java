import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.border.AbstractBorder;

class Roundborder extends JTextField {

    public Roundborder(int cols) {
        super(cols);
        inicializar();
    }

    private void inicializar() {
        // Establecer el borde redondeado
        setBorder(BorderFactory.createCompoundBorder(
                new RoundBorder(),
                new EmptyBorder(5, 10, 5, 10)  // Ajustes de margen
        ));
    }

    // Clase interna para el borde redondeado
    private static class RoundBorder extends AbstractBorder {
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(Color.BLACK);  // Puedes cambiar el color del borde
            g2d.drawRoundRect(x, y, width - 1, height - 1, 10, 10);  // Ajusta el radio según tu preferencia
            g2d.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ejemplo JTextField con Bordes Redondeados");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Roundborder textField = new Roundborder(15);
            frame.getContentPane().add(textField, BorderLayout.CENTER);

            frame.setSize(300, 100);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
