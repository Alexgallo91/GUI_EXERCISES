package ejercicioswing15;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends javax.swing.JFrame {

    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JButton btn;
    private JTextField jtext1;
    
    public Ventana() {
        initComponents();
        this.creacionVentana();
    }
    
    public void creacionVentana()
    {
        this.setTitle("Mi ventana");
        this.setSize(500,500);
        this.setLocation(100,100);
        
        etiqueta1 = new JLabel("primera etiqueta");
        etiqueta1.setText("label 1");
        etiqueta1.setBounds(10,10,100,20);
        this.getContentPane().add(etiqueta1);
        
        etiqueta2 = new JLabel("primera etiqueta");
        etiqueta2.setText("label 2");
        etiqueta2.setBounds(10,60,100,20);
        this.getContentPane().add(etiqueta2);
        
        btn = new JButton();
        btn.setText("boton 1");
        btn.setBounds(100,10,100,20);
        this.getContentPane().add(btn);
        
        btn = new JButton();
        btn.setText("boton 2");
        btn.setBounds(100,60,100,20);
        this.getContentPane().add(btn);
        
        jtext1 = new JTextField();
        jtext1.setText("textfield 2");
        jtext1.setBounds(250,60,100,20);
        this.getContentPane().add(jtext1);
        
        jtext1 = new JTextField();
        jtext1.setText("textfield 1");
        jtext1.setBounds(250,10,100,20);
        this.getContentPane().add(jtext1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
