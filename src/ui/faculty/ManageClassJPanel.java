/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.faculty;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.CourseSchedule.CourseOffer;
import model.CourseSchedule.Seat;
import model.CourseSchedule.SeatAssignment;
import model.Department.Department;
import model.Persona.StudentProfile;

/**
 *
 * @author piyush
 */
public class ManageClassJPanel extends javax.swing.JPanel {
    JPanel workArea;
    CourseOffer course;
    /**
     * Creates new form ManageClassNewJPanel
     */
    public ManageClassJPanel(JPanel workArea, CourseOffer course) {
        this.workArea = workArea;
        this.course = course;
        
        initComponents();
        populateTable();
        roomNumberTextField.setText(course.getRoomNumber());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        studentLabel = new javax.swing.JLabel();
        roomLabel = new javax.swing.JLabel();
        roomNumberTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Grade", "Student ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        studentLabel.setText("Students");

        roomLabel.setText("Change Room Number");

        roomNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumberTextFieldActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(roomLabel)
                            .addGap(34, 34, 34)
                            .addComponent(roomNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(saveButton)
                            .addGap(48, 48, 48))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentLabel)
                        .addGap(259, 259, 259)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(studentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton)))
                    .addComponent(roomLabel))
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roomNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumberTextFieldActionPerformed
      
    }//GEN-LAST:event_roomNumberTextFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        DefaultTableModel table = (DefaultTableModel)jTable.getModel();
        for(int i = 0;i<course.getSeatlist().size();i++){
           course.getSeatlist().get(i).getSeatAssignment().setGrade(((Float)table.getValueAt(i, 0)));
       } 
       course.setRoomNumber(roomNumberTextField.getText());
    }//GEN-LAST:event_saveButtonActionPerformed

    
    public void populateTable(){
        DefaultTableModel table = (DefaultTableModel)jTable.getModel();
        table.setRowCount(0);
        for(Seat s: course.getSeatlist()){
            SeatAssignment sa = s.getSeatAssignment();
            Object[] row = new Object[2];
            row[0] = sa.getGrade();
            row[1] = sa.getStudent().getPerson().getPersonId();
            
            table.addRow(row);
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JTextField roomNumberTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel studentLabel;
    // End of variables declaration//GEN-END:variables
}