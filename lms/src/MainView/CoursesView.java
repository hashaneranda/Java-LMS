/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainView;

import courses.AddCourses;
import courses.DeleteCourses;
import courses.UpdateCourses;
import lecturers.AddLecturers;
import lecturers.UpdateLecturers;

/**
 *
 * @author THISURA
 */
public class CoursesView extends javax.swing.JFrame {

    /**
     * Creates new form CoursesView
     */
    public CoursesView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPaneCourse = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        ADDCourse = new javax.swing.JButton();
        UPDATECourse = new javax.swing.JButton();
        DELETECourse = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));

        jPanel1.setBackground(new java.awt.Color(29, 171, 184));

        jDesktopPaneCourse.setMaximumSize(new java.awt.Dimension(834, 532));
        jDesktopPaneCourse.setName(""); // NOI18N
        jDesktopPaneCourse.setPreferredSize(new java.awt.Dimension(16005, 464));

        javax.swing.GroupLayout jDesktopPaneCourseLayout = new javax.swing.GroupLayout(jDesktopPaneCourse);
        jDesktopPaneCourse.setLayout(jDesktopPaneCourseLayout);
        jDesktopPaneCourseLayout.setHorizontalGroup(
            jDesktopPaneCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPaneCourseLayout.setVerticalGroup(
            jDesktopPaneCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Course Details");

        ADDCourse.setBackground(new java.awt.Color(29, 171, 184));
        ADDCourse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ADDCourse.setText("Add Courses");
        ADDCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDCourseActionPerformed(evt);
            }
        });

        UPDATECourse.setBackground(new java.awt.Color(44, 201, 144));
        UPDATECourse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UPDATECourse.setText("Update Courses");
        UPDATECourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATECourseActionPerformed(evt);
            }
        });

        DELETECourse.setBackground(new java.awt.Color(227, 0, 14));
        DELETECourse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DELETECourse.setText("Delete Courses");
        DELETECourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETECourseActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(29, 171, 184));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPaneCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ADDCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UPDATECourse, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DELETECourse, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDCourse)
                    .addComponent(UPDATECourse)
                    .addComponent(DELETECourse)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPaneCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDCourseActionPerformed
        jDesktopPaneCourse.removeAll();
        AddCourses m1 = new AddCourses();
        jDesktopPaneCourse.add(m1).setVisible(true);
    }//GEN-LAST:event_ADDCourseActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        select course = new select();
        course.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void UPDATECourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATECourseActionPerformed
        jDesktopPaneCourse.removeAll();
        UpdateCourses m2 = new UpdateCourses();
        jDesktopPaneCourse.add(m2).setVisible(true);
    }//GEN-LAST:event_UPDATECourseActionPerformed

    private void DELETECourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETECourseActionPerformed
        jDesktopPaneCourse.removeAll();
        DeleteCourses m3 = new DeleteCourses();
        jDesktopPaneCourse.add(m3).setVisible(true);
    }//GEN-LAST:event_DELETECourseActionPerformed

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
            java.util.logging.Logger.getLogger(CoursesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoursesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoursesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoursesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoursesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDCourse;
    private javax.swing.JButton DELETECourse;
    private javax.swing.JButton UPDATECourse;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPaneCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
