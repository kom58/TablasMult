package tabla;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicacion {

    private JPanel panBase;
    private JPanel panSuperior;
    private JPanel panMedio;
    private JPanel panInferior;
    private JButton btnSalir;
    private JButton btnTabla;
    private JLabel txtTitulo;
    private JPanel panIzq;
    private JPanel panDer;
    private JLabel titNomTabla;
    private JTextField txtTabla;
    private JTextArea tarTabla;


    public Aplicacion() {

        btnTabla.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                escribeTabla();
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
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
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
