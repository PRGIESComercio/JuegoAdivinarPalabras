package com.iescomercio.edd.mapas.juegopalabras.vista;

import com.iescomercio.edd.mapas.juegopalabras.modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Vicente Pujades
 */
public class Interfaz extends javax.swing.JFrame {

    private ListaPalabras lp; //lista de palabras
    private Palabras p; //Palabras aleatorias
    private Palabras pUsuario; //Palabras introducidas por el usuario
    private Marcador m; //marcador

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();

        lp = new ListaPalabras();
        p = new Palabras();
        m = new Marcador();

        configurarGUI();

        comenzar();

    }

    private void configurarGUI() {

        //titulo
        this.setTitle("Aprende idiomas -- Roberto Vicente Pujades");
        
        //tamaño mínimo
        this.setMinimumSize(new java.awt.Dimension(600, 450));
        this.setResizable(false);
        
        //centrar
        this.setLocationRelativeTo(null);
        
        //icono
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/com/iescomercio/edd/mapas/juegopalabras/resources/2587.png")).getImage());
        
        //marcador
        this.jPanelMarcador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MARCADOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 0, 0)));
        
            //labels marcador
        this.jLabelAciertos.setFont(new java.awt.Font("Tahoma", 1, 12));
        this.jLabelFallos.setFont(new java.awt.Font("Tahoma", 1, 12));
        this.jLabelIntentos.setFont(new java.awt.Font("Tahoma", 1, 12));
        this.jLabelPuntuacion.setFont(new java.awt.Font("Tahoma", 1, 12));
        
        this.jLabelAciertos.setForeground(new java.awt.Color(204, 102, 0));
        this.jLabelFallos.setForeground(new java.awt.Color(204, 102, 0));
        this.jLabelIntentos.setForeground(new java.awt.Color(204, 102, 0));
        this.jLabelPuntuacion.setForeground(new java.awt.Color(204, 102, 0));

        this.jLabelAciertos.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        this.jLabelFallos.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        this.jLabelIntentos.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        this.jLabelPuntuacion.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        
        //iconos banderas labels
        this.jLabelEspañol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iescomercio/edd/mapas/juegopalabras/resources/ingles.png")));
        this.jLabelIngles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iescomercio/edd/mapas/juegopalabras/resources/ingles.png")));
        this.jLabelAleman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iescomercio/edd/mapas/juegopalabras/resources/español.png")));
        
        //alineación label y el texto de los labels respecto al icono bandera
        this.jLabelEspañol.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        this.jLabelEspañol.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        this.jLabelEspañol.setVerticalTextPosition(javax.swing.JLabel.BOTTOM);
        this.jLabelIngles.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        this.jLabelIngles.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        this.jLabelIngles.setVerticalTextPosition(javax.swing.JLabel.BOTTOM);
        this.jLabelAleman.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        this.jLabelAleman.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        this.jLabelAleman.setVerticalTextPosition(javax.swing.JLabel.BOTTOM);

    }

    private void comenzar() {
        int idioma; //idioma a mostrar: 0 español 1 inglés 2 alemán

        //reestablecemos
        this.jTextFieldAleman.setText("");
        this.jTextFieldEspañol.setText("");
        this.jTextFieldIngles.setText("");

        //sacar primera palabra aleatoria
        p = lp.palabraAleatoria();
        //idioma aleatorio
        idioma = p.idiomaAleatorio();

        switch (idioma) {
            case 0: //español

                this.jTextFieldEspañol.setText(p.getEspañol()); //mostramos la palabra en español
                this.jTextFieldEspañol.setEditable(false); //deshabilitamos la edición en el campo

                break;
            case 1: //inglés

                this.jTextFieldIngles.setText(p.getIngles()); //mostramos la palabra en ingles
                this.jTextFieldIngles.setEditable(false); //deshabilitamos la edición en el campo

                break;
            case 2: //aleman

                this.jTextFieldAleman.setText(p.getAleman()); //mostramos la palabra en aleman
                this.jTextFieldAleman.setEditable(false); //deshabilitamos la edición en el campo

                break;
        }

        //marcador
        this.jLabelAciertos.setText("ACIERTOS: " + m.numAciertos());
        this.jLabelFallos.setText("FALLOS: " + m.numFallos());
        this.jLabelIntentos.setText("INTENTOS: " + m.numIntentos());
        this.jLabelPuntuacion.setText("PUNTUACIÓN: " + m.numPuntuacion());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelMarcador = new javax.swing.JPanel();
        jLabelAciertos = new javax.swing.JLabel();
        jLabelFallos = new javax.swing.JLabel();
        jLabelIntentos = new javax.swing.JLabel();
        jLabelPuntuacion = new javax.swing.JLabel();
        jPanelResto = new javax.swing.JPanel();
        jLabelEspañol = new javax.swing.JLabel();
        jLabelIngles = new javax.swing.JLabel();
        jLabelAleman = new javax.swing.JLabel();
        jTextFieldEspañol = new javax.swing.JTextField();
        jTextFieldIngles = new javax.swing.JTextField();
        jTextFieldAleman = new javax.swing.JTextField();
        jButtonCorregir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelMarcador.setLayout(new java.awt.GridBagLayout());

        jLabelAciertos.setText("Aciertos: 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelMarcador.add(jLabelAciertos, gridBagConstraints);

        jLabelFallos.setText("Fallos: 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelMarcador.add(jLabelFallos, gridBagConstraints);

        jLabelIntentos.setText("Intentos: 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelMarcador.add(jLabelIntentos, gridBagConstraints);

        jLabelPuntuacion.setText("Puntuación: 0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelMarcador.add(jLabelPuntuacion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 0, 30);
        getContentPane().add(jPanelMarcador, gridBagConstraints);

        jPanelResto.setLayout(new java.awt.GridBagLayout());

        jLabelEspañol.setText("Infitivo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelResto.add(jLabelEspañol, gridBagConstraints);

        jLabelIngles.setText("Past Simple");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelResto.add(jLabelIngles, gridBagConstraints);

        jLabelAleman.setText("Traducción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelResto.add(jLabelAleman, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelResto.add(jTextFieldEspañol, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelResto.add(jTextFieldIngles, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelResto.add(jTextFieldAleman, gridBagConstraints);

        jButtonCorregir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCorregir.setText("Corregir");
        jButtonCorregir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCorregir(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(25, 50, 5, 50);
        jPanelResto.add(jButtonCorregir, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jPanelResto, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCorregir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCorregir

        pUsuario = new Palabras(); //palabras usuario
        int aciertos; //palabras acertadas
        int falladas; //palabras falladas
        
        ArrayList<String> idiomasFallo;
        

        if (!this.camposVacios()) {

            //añadir intento en el marcador
            m.añadirIntento();

            pUsuario.setAleman(this.jTextFieldAleman.getText());
            pUsuario.setIngles(this.jTextFieldIngles.getText());
            pUsuario.setEspañol(this.jTextFieldEspañol.getText());

            aciertos = p.corregirPalabra(pUsuario);
            falladas = 2 - aciertos;

            //añadimos puntuación, 50*acierto
            m.añadirPuntuacion(aciertos * 50);

            //añadimos aciertos
            while (aciertos > 0) {
                m.añadirAcierto();
                aciertos = aciertos - 1;
            }
            //añadir falladas
            while (falladas > 0) {
                m.añadirFalladas();
                falladas = falladas - 1;
            }

            //Indicamos que idiomas ha fallado
            idiomasFallo = p.idiomaPalabrasFalladas(pUsuario);
            
            if (!idiomasFallo.isEmpty()){
                
                JOptionPane.showMessageDialog(this, "Has fallado " + idiomasFallo.toString());
                
            }

            this.jTextFieldEspañol.setEditable(true); //habilitamos la edición en el campo
            this.jTextFieldIngles.setEditable(true); //habilitamos la edición en el campo
            this.jTextFieldAleman.setEditable(true); //habilitamos la edición en el campo
            
            //comenzamos otra vez
            comenzar();

        }

    }//GEN-LAST:event_botonCorregir

    /**
     * Método privado que devuelve true o false si están los campos vacíos o no
     * @return boolean True si hay algún campo vacío y false si están todos rellenos
     */
    private boolean camposVacios() {
        boolean resp = false;

        if (this.jTextFieldAleman.getText().equals("") || this.jTextFieldAleman.getText().trim().equals("")) {
            resp = true;
        }

        if (this.jTextFieldEspañol.getText().equals("") || this.jTextFieldEspañol.getText().trim().equals("")) {
            resp = true;
        }

        if (this.jTextFieldIngles.getText().equals("") || this.jTextFieldIngles.getText().trim().equals("")) {
            resp = true;
        }

        return resp;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCorregir;
    private javax.swing.JLabel jLabelAciertos;
    private javax.swing.JLabel jLabelAleman;
    private javax.swing.JLabel jLabelEspañol;
    private javax.swing.JLabel jLabelFallos;
    private javax.swing.JLabel jLabelIngles;
    private javax.swing.JLabel jLabelIntentos;
    private javax.swing.JLabel jLabelPuntuacion;
    private javax.swing.JPanel jPanelMarcador;
    private javax.swing.JPanel jPanelResto;
    private javax.swing.JTextField jTextFieldAleman;
    private javax.swing.JTextField jTextFieldEspañol;
    private javax.swing.JTextField jTextFieldIngles;
    // End of variables declaration//GEN-END:variables
}
