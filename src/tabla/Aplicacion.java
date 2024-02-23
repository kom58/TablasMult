package tabla;

import javax.swing.*;

public class Aplicacion {

    private JPanel panBase;
    private JButton btnSalir;
    private JButton btnTabla;
    private JTextField txtTabla;
    private JTextArea tarTabla;

    public Aplicacion() {

        btnTabla.addActionListener(e -> escribeTabla());
        btnSalir.addActionListener(e -> System.exit(0));
        txtTabla.addActionListener(e -> escribeTabla());
    }

    public void escribeTabla() {

        String numStr = txtTabla.getText();         // Lee el numTabla
        int n = Integer.parseInt(numStr);           // lo convierte a int
        tarTabla.setText("");                       // Inicializa y borra
        // Escribe tabla
        for (int i = 1; i <= 10; i++) {
            tarTabla.append(String.format(" %2d  x %2d  = %4d \n", n, i, n * i));
        }
    }

    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("Tablas");
        frame.setContentPane(new Aplicacion().panBase);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
