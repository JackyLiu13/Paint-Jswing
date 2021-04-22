/**
 * Jacky Liu
 * ICS4U Period 1
 * Mr. Roy-Diclemente
 * April 22 2021
 * Object Orientated Programming challenges with Shapes 
 * Now with GUI and line rectangle triangle drawing options :O
 */
package painting;

/**
 *
 * @author Jacky
 */
public class paintFrame extends javax.swing.JFrame {

    /**
     * Creates new form paintFrame
     */
    public paintFrame() {
        initComponents();
    }
    public static final int LINE = 1;
    public static final int RECTANGLE = 2;
    public static final int TRIANGLE = 3;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        paintPanel1 = new painting.paintPanel();
        comboShapeBox = new javax.swing.JComboBox<>();
        drawButton = new javax.swing.JButton();
        animateBtn = new javax.swing.JButton();
        rotateBtn = new javax.swing.JButton();
        transTxtBox = new javax.swing.JTextField();
        degreeLbl = new javax.swing.JLabel();
        rotateTxtBox = new javax.swing.JTextField();
        transBtn = new javax.swing.JButton();
        scaleBtn = new javax.swing.JButton();
        scaleTxtBox = new javax.swing.JTextField();
        scaleLbl = new javax.swing.JLabel();
        transLbl = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout paintPanel1Layout = new javax.swing.GroupLayout(paintPanel1);
        paintPanel1.setLayout(paintPanel1Layout);
        paintPanel1Layout.setHorizontalGroup(
            paintPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        paintPanel1Layout.setVerticalGroup(
            paintPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        comboShapeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Line", "Rectangle", "Triangle" }));
        comboShapeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboShapeBoxActionPerformed(evt);
            }
        });

        drawButton.setText("Draw");
        drawButton.setActionCommand("drawButton");
        drawButton.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        animateBtn.setText("Animate");
        animateBtn.setActionCommand("animateBtn");
        animateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animateBtnActionPerformed(evt);
            }
        });

        rotateBtn.setText("Rotate");
        rotateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateBtnActionPerformed(evt);
            }
        });

        degreeLbl.setText("Enter Degrees to rotate");

        rotateTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateTxtBoxActionPerformed(evt);
            }
        });

        transBtn.setText("Translate");
        transBtn.setActionCommand("transBtn");
        transBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transBtnActionPerformed(evt);
            }
        });

        scaleBtn.setText("Scale");
        scaleBtn.setActionCommand("scaleBtn");
        scaleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleBtnActionPerformed(evt);
            }
        });

        scaleTxtBox.setName("scaleTxtBox"); // NOI18N

        scaleLbl.setText("Enter Multiplier to Scale");

        transLbl.setText("Enter X value seperated by Y value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paintPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drawButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(animateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboShapeBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(transTxtBox)
                            .addComponent(rotateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rotateTxtBox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(transBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scaleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scaleTxtBox)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(degreeLbl)
                                    .addComponent(scaleLbl))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(transLbl)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paintPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(comboShapeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawButton)
                .addGap(23, 23, 23)
                .addComponent(degreeLbl)
                .addGap(2, 2, 2)
                .addComponent(rotateTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotateBtn)
                .addGap(5, 5, 5)
                .addComponent(scaleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scaleTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scaleBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transBtn)
                .addGap(12, 12, 12)
                .addComponent(animateBtn)
                .addGap(14, 14, 14))
        );

        drawButton.getAccessibleContext().setAccessibleName("drawButton");
        animateBtn.getAccessibleContext().setAccessibleName("animateBtn");
        rotateBtn.getAccessibleContext().setAccessibleName("rotateBtn");
        transTxtBox.getAccessibleContext().setAccessibleName("transTxtBox");
        rotateTxtBox.getAccessibleContext().setAccessibleName("rotateTxtBox");
        transBtn.getAccessibleContext().setAccessibleName("transBtn");
        scaleBtn.getAccessibleContext().setAccessibleName("scaleBtn");
        scaleTxtBox.getAccessibleContext().setAccessibleName("scaleTxtBox");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboShapeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboShapeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboShapeBoxActionPerformed
    
    
    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        // TODO add your handling code here:
        //drawButton.setEnabled(false); would be used if enable was available
        
        //drawing mode is off
        if (paintPanel1.drawing == false) {
            //drawing mode on
            paintPanel1.drawing = true;
            //adds a shape to the number of shape
            paintPanel1.numberOfShapes +=1;
            //resets the points
            paintPanel1.clickPoint1 = null;
            paintPanel1.clickPoint2 = null;
            
            //sets proper mode from combobox to draw proper shape
            if ("Line".equals(comboShapeBox.getSelectedItem())) {
                paintPanel1.currentShape = LINE;

            } else if ("Rectangle".equals(comboShapeBox.getSelectedItem())) {
                paintPanel1.currentShape = RECTANGLE;

            } else {
                paintPanel1.currentShape = TRIANGLE;
            }
        }
        //if already drawing prompt user
        else{
            drawButton.setText("Already Drawing");
        }
        
        
            
    }//GEN-LAST:event_drawButtonActionPerformed

    private void rotateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateBtnActionPerformed
//        // TODO add your handling code here:
            
            //collect input and rotates all shapes
            paintPanel1.rotateAll(Double.parseDouble(rotateTxtBox.getText()));
            
            paintPanel1.repaint();
    }//GEN-LAST:event_rotateBtnActionPerformed

    private void rotateTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateTxtBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rotateTxtBoxActionPerformed

    private void transBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transBtnActionPerformed
        // TODO add your handling code here:
        
        //ensures there is text
        if (!(transTxtBox.getText().equals(""))) {
            //split the x and y to be translated
            String[] input = transTxtBox.getText().split(" ");            
            //translate the shapes to userinput
            paintPanel1.transAll(Double.parseDouble(input[0]),  Double.parseDouble(input[1]));
            paintPanel1.repaint();
        }
        //no text
        else{
            System.out.println("No inputs");
        }
    }//GEN-LAST:event_transBtnActionPerformed

    private void scaleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleBtnActionPerformed
        // TODO add your handling code here:
        paintPanel1.scaleAll(Double.parseDouble(scaleTxtBox.getText()));
        paintPanel1.repaint();
    }//GEN-LAST:event_scaleBtnActionPerformed

    private void animateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animateBtnActionPerformed
        // TODO add your handling code here:
        paintPanel1.anim();
    }//GEN-LAST:event_animateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(paintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paintFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton animateBtn;
    private javax.swing.JComboBox<String> comboShapeBox;
    private javax.swing.JLabel degreeLbl;
    private javax.swing.JButton drawButton;
    private javax.swing.JRadioButton jRadioButton1;
    private painting.paintPanel paintPanel1;
    private javax.swing.JButton rotateBtn;
    private javax.swing.JTextField rotateTxtBox;
    private javax.swing.JButton scaleBtn;
    private javax.swing.JLabel scaleLbl;
    private javax.swing.JTextField scaleTxtBox;
    private javax.swing.JButton transBtn;
    private javax.swing.JLabel transLbl;
    private javax.swing.JTextField transTxtBox;
    // End of variables declaration//GEN-END:variables

}