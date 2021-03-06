package calculodeedad;

import java.awt.Color;
import javax.swing.JFrame;
import java.util.Date;
import javax.swing.JOptionPane;

public class CalculoEdad extends javax.swing.JFrame {
        
    int dia = 0;
    int mes = 0;
    int anno = 0;
    int d_machine = 0;
    int m_machine = 0;
    int y_machine = 0;
    Date fecha_maquina = new Date();

    public CalculoEdad() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.blue.darker());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        d_machine = fecha_maquina.getDate();
        m_machine = fecha_maquina.getMonth()+1;
        y_machine = fecha_maquina.getYear()+1900;
        
        lblFecha.setText("Fecha:"+d_machine+"/"+m_machine+"/"+y_machine);
        txtMensajes.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        lblTitulo = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        lblMes = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtAnno = new javax.swing.JTextField();
        lblAnno = new javax.swing.JLabel();
        btnEdad = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        txtMensajes = new javax.swing.JTextArea();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Edad");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitulo.setText("Fecha de Nacimiento");

        lblDia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDia.setText("Dia:");

        lblMes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMes.setText("Mes:");

        lblAnno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAnno.setText("Año:");

        btnEdad.setBackground(new java.awt.Color(255, 102, 0));
        btnEdad.setText("Calcular Edad");
        btnEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdadActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setText("Nombre:");

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellido.setText("Apellido:");

        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtMensajes.setBackground(new java.awt.Color(255, 102, 0));
        txtMensajes.setColumns(20);
        txtMensajes.setForeground(new java.awt.Color(51, 51, 255));
        txtMensajes.setRows(5);
        Scroll.setViewportView(txtMensajes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDia)
                                    .addComponent(lblMes)
                                    .addComponent(lblAnno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDia, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(txtMes)
                                    .addComponent(txtAnno)))
                            .addComponent(btnEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre))
                            .addComponent(Scroll)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblApellido)
                                .addGap(3, 3, 3)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDia)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMes)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdadActionPerformed
        try
        {
            int y = fecha_maquina.getYear()+1900;
            int m = fecha_maquina.getMonth()+1;
            int d = fecha_maquina.getDate();
            //obtención de la fecha de nacimiento del usuario. 
            dia = Integer.parseInt(txtDia.getText());
            mes = Integer.parseInt(txtMes.getText());
            anno = Integer.parseInt(txtAnno.getText());
            //
            int edad_actual,edad_futura,tiempo_dias,tiempo_meses;
            //Obtención del nombre y apellidos del usuario. 
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            /**Comparación de los meses tomando en cuenta el mes actual y el mes de nacimiento,
             *También se concideran los dias de la misma manera que los meses.
            */
            if(mes > m || m < mes && dia > d || d < dia)
            {
                /*
                    Dentro de este bloque, se realiza la operación que da la edad actual de la persona y
                    la edad que va a tener en el presente año. 
                */
                edad_actual = y - anno-1;
                edad_futura = edad_actual+1;
                txtMensajes.append(nombre+" "+apellido+".\nSu edad actual es: "+edad_actual+" años.\n");
                txtMensajes.append("Proximamente cumplirá: "+edad_futura+" años.");
                
                tiempo_dias =(dia>d||d>dia)?dia-d:d-dia;
                tiempo_meses =(mes > m || m > mes)?mes-m:m-mes;
                
                if(tiempo_meses % 2 == 0)
                {
                    tiempo_dias = 30-tiempo_dias;
                    txtMensajes.append("\nTiempo restante para su cumpleaños:\n"+tiempo_dias+" dias\n"+tiempo_meses+" mes/meses.");
                }
                else if(tiempo_meses % 2 != 0)
                {
                    tiempo_dias = 31-tiempo_dias;
                    txtMensajes.append("\nTiempo restante para su cumpleaños:\n"+tiempo_dias+" dias\n"+tiempo_meses+" mes/meses.");
                }
            }
            else if(mes == m && dia == d)//En esta sección solo se ejecuta cuando el mes y el dia coincidan.
            {                           // Y se calculan los años que cumplio. 
                edad_actual = y-anno;
                edad_futura = edad_actual;
                txtMensajes.append("!Feliz cumpleaños!, "+nombre+".\nFelices "+edad_futura+" años.\n");
                txtMensajes.append("Celebra con tus seres queridos este gran dia");
            }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos, por favor vuelva a intentarlo.");
        }
    }//GEN-LAST:event_btnEdadActionPerformed

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
            java.util.logging.Logger.getLogger(CalculoEdad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoEdad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoEdad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoEdad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculoEdad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll;
    public static javax.swing.JButton btnEdad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblAnno;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDia;
    public static javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAnno;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDia;
    public static javax.swing.JTextArea txtMensajes;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
