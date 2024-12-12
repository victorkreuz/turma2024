/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor Kreuz
 */
public class comcoBox extends javax.swing.JFrame {

    /**
     * Creates new form comcoBox
     */
    public comcoBox() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbDiaSemana = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMaterias = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcbDiaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" }));
        jcbDiaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDiaSemanaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agenda dos Horários de Aula");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Dia da Semana:");

        jtaMaterias.setColumns(20);
        jtaMaterias.setRows(5);
        jtaMaterias.setBorder(javax.swing.BorderFactory.createTitledBorder("Matérias"));
        jScrollPane1.setViewportView(jtaMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbDiaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDiaSemanaActionPerformed
        String diaSemana = jcbDiaSemana.getSelectedItem().toString();
        jtaMaterias.setText("");
        switch (diaSemana) {
            case "Segunda-feira":
                jtaMaterias.append("Matemática\n");
                jtaMaterias.append("Matemática\n");
                jtaMaterias.append("Inglês\n");
                jtaMaterias.append("Inglês\n");
                jtaMaterias.append("Geografia\n");
                break;
            case "Terça-feira":
                jtaMaterias.append("Biologia\n");
                jtaMaterias.append("Artes\n");
                jtaMaterias.append("Biologia\n");
                jtaMaterias.append("Química\n");
                jtaMaterias.append("Química\n");
                break;
            case "Quarta-feira":
                jtaMaterias.append("Sociologia\n");
                jtaMaterias.append("Literatura\n");
                jtaMaterias.append("Filosofia\n");
                jtaMaterias.append("Matemática\n");
                jtaMaterias.append("Matemática\n");
                break;
            case "Quinta-feira":
                jtaMaterias.append("História\n");
                jtaMaterias.append("História\n");
                jtaMaterias.append("Português\n");
                jtaMaterias.append("Português\n");
                jtaMaterias.append("Geografia\n");
                break;
            case "Sexta-feira":
                jtaMaterias.append("Português\n");
                jtaMaterias.append("Física\n");
                jtaMaterias.append("Física\n");
                jtaMaterias.append("Ed.Física\n");
                jtaMaterias.append("Ed.Física\n");
                break;
        }
    }//GEN-LAST:event_jcbDiaSemanaActionPerformed

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
            java.util.logging.Logger.getLogger(comcoBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(comcoBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(comcoBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(comcoBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comcoBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbDiaSemana;
    private javax.swing.JTextArea jtaMaterias;
    // End of variables declaration//GEN-END:variables
}
