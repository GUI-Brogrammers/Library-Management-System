package LibraryDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wissam
 */
public class ReturnBook extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rs;
    ResultSet rsdeptno;
    String mem_id;

    /**
     * Creates new form AddEmployee
     * @param result
     */
    public ReturnBook(String result) {
        
        initComponents();
        
        // center form in screen 
        this.setLocationRelativeTo(null);
        this.setTitle("Return Book");
        
        // set all error labels to invisible
//        lblBorrowIDError.setVisible(false);
//        lblDateBorrowError.setVisible(false);
//        lblDateReturnError.setVisible(false);
//        lblDateDueError.setVisible(false);
//        lblMemIDError.setVisible(false);
//        lblBookIDError.setVisible(false);
//        lblCopyIDError.setVisible(false);
        
        mem_id = result;
        dbCon = new myDBCon();
        getNewData();
    }

    private void getNewData() {

        try {
            // populate deptno field
            rs = dbCon.executeStatement("SELECT * FROM BOOK_BORROWED WHERE MEMBER_ID = '"+mem_id+"' and RETURN_STATUS = 0 ORDER BY BORROW_ID ASC");           
            // displaying return status options (0 and 1)
//            cmbReturnStatus.removeAllItems();
//            cmbReturnStatus.addItem("0");
//            cmbReturnStatus.addItem("1");
            // populate rest of fields
            rs.beforeFirst();
            rs.first();
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected BORROW_ID.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDateBorrow = new javax.swing.JTextField();
        txtBookName = new javax.swing.JTextField();
        txtMemID = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        ftxtDateDue = new javax.swing.JFormattedTextField();
        txtBorrowID = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update/Delete Employee");
        setPreferredSize(new java.awt.Dimension(1000, 536));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setText("Return Book");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 60, 220, 36);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("BORROW ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 210, 130, 30);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setText("DATE BORROWED:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 290, 190, 30);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel6.setText("DATE DUE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 330, 120, 30);

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel8.setText("MEMBER ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 170, 130, 30);

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel9.setText("BOOK NAME:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 250, 130, 30);

        txtDateBorrow.setEditable(false);
        txtDateBorrow.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        getContentPane().add(txtDateBorrow);
        txtDateBorrow.setBounds(440, 290, 200, 28);

        txtBookName.setEditable(false);
        txtBookName.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        getContentPane().add(txtBookName);
        txtBookName.setBounds(440, 250, 200, 28);

        txtMemID.setEditable(false);
        txtMemID.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        getContentPane().add(txtMemID);
        txtMemID.setBounds(440, 170, 200, 28);

        btnReturn.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn);
        btnReturn.setBounds(430, 420, 190, 31);

        ftxtDateDue.setEditable(false);
        ftxtDateDue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-yyyy"))));
        ftxtDateDue.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        getContentPane().add(ftxtDateDue);
        ftxtDateDue.setBounds(440, 330, 200, 28);

        txtBorrowID.setEditable(false);
        txtBorrowID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtBorrowID);
        txtBorrowID.setBounds(440, 210, 200, 28);

        btnNext.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(641, 420, 120, 31);

        btnPrevious.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrevious);
        btnPrevious.setBounds(250, 420, 160, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populateFields() {
        try {
            rsdeptno = dbCon.executeStatement("SELECT BOOK_TITLE FROM BOOK WHERE BOOK_ID = '" + rs.getString("BOOK_ID")+ "'");
            rsdeptno.next();
            String title = rsdeptno.getString("BOOK_TITLE");
            
            txtBorrowID.setText(rs.getString("BORROW_ID"));
            txtDateBorrow.setText(rs.getDate("DATE_BORROWED").toString());
            //txtDateReturn.setText(rs.getString("DATE_RETURNED"));
            //cmbReturnStatus.setSelectedItem(rs.getString("RETURN_STATUS"));
            ftxtDateDue.setText(rs.getDate("DATE_DUE").toString());
            txtBookName.setText(title);
            txtMemID.setText(rs.getString("MEMBER_ID"));
//            String deptno = rs.getString("deptno");
//            
//            // retrieving the department number from the department name selected in the combo box
//            ResultSet rs1 = dbCon.executeStatement("SELECT DNAME FROM DEPT WHERE DEPTNO=" + Integer.valueOf(deptno));
//            rs1.first();
//            cmbReturnStatus.setSelectedItem(rs1.getString("dname"));
//            rs1.close();
            
            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MoveNext() {
        try {
            // TODO add your handling code here:
            if (!rs.isLast()) {
                rs.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void MovePrevious() {
        try {
            // TODO add your handling code here:
            if (!rs.isFirst()) {
                rs.previous();
                populateFields();
            }
        } catch (SQLException ex) {
           Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDisableButtons() {
        try {
            if (rs.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rs.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        try {
            // make the result set scrolable forward/backward updatable
            
            int a = JOptionPane.showConfirmDialog(null, "Confirm to Return the requested book based on Borrow_ID");
            if (a == JOptionPane.YES_OPTION)
            {
                String today = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
                String prepSQL = "UPDATE BOOK_BORROWED SET DATE_RETURNED = to_date('"+today+"','dd/mm/yyyy'), RETURN_STATUS = 1 WHERE MEMBER_ID = '"+txtMemID.getText().trim()+"' AND BORROW_ID = '" + txtBorrowID.getText().trim()+"'";
                int result = dbCon.executePrepared(prepSQL);
                String prep = "SELECT BOOK_TITLE FROM BOOK WHERE BOOK_ID ='"+ txtBookName.getText().trim()+"'";
                ResultSet rsnew = dbCon.executeStatement(prep);
                String btitle = rsnew.getString("book_title");
                if (result > 0) {
                    String p = "INSERT INTO BOOK_COPIES (copy_id, book_id) values ("
                            + rs.getString("copy_id") + "', "
                            + "'" + rs.getString("book_id") + "')";
                    //rs = dbCon.executeStatement(p);

                    int r = dbCon.executePrepared(p);
                    if (r > 0) {

                        javax.swing.JLabel label = new javax.swing.JLabel("Book copy added back to library successfully.");
                        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                        //clearInputBoxes();
                    } else {

                    }
                    javax.swing.JLabel label = new javax.swing.JLabel(btitle + " was returned successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "RETURN SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                    getNewData();
                }
            }
            else
            {
                javax.swing.JLabel label = new javax.swing.JLabel("Book selected was not Returned.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "RETURN UNSUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error returning the book.");
        }
    }//GEN-LAST:event_btnReturnActionPerformed

//    void clearErrorLabels() {
//        lblBorrowIDError.setText("");
//        lblBorrowIDError.setVisible(false);
//        lblDateBorrowError.setText("");
//        lblDateBorrowError.setVisible(false);
//        lblDateReturnError.setText("");
//        lblDateReturnError.setVisible(false);
//        lblDateDueError.setText("");
//        lblDateDueError.setVisible(false);
//        lblMemIDError.setText("");
//        lblMemIDError.setVisible(false);
//        lblBookIDError.setText("");
//        lblBookIDError.setVisible(false);
//        lblCopyIDError.setText("");
//        lblCopyIDError.setVisible(false);
//    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    
    public boolean isIntPositive(String s) {
        try {
            int n = Integer.parseInt(s);
            if (n > 0)
                return true;
            else
                return false;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

//    boolean isValidData() {
//        clearErrorLabels();
//        boolean result = true;
//        if (txtBorrowID.getText().trim().isEmpty() || (txtBorrowID.getText().trim().length() > 4)|| !isIntPositive(txtBorrowID.getText().trim())) {
//            if (txtBorrowID.getText().trim().isEmpty()) {
//                lblBorrowIDError.setText("Invalid. Cannot be empty.");
//            } else if (!isInteger(txtBorrowID.getText().trim())) {
//                lblBorrowIDError.setText("Invalid. Must be integer.");
//            }
//            else if (txtBorrowID.getText().trim().length() > 4){
//                lblBorrowIDError.setText("Invalid. Must be <=4 characters.");
//            }
//            
//            lblBorrowIDError.setVisible(true);
//            result = false;
//        }
//        
//        
//        if (txtDateBorrow.getText().trim().isEmpty() || (txtDateBorrow.getText().trim().length() > 10)) {
//            if (txtDateBorrow.getText().trim().isEmpty()) {
//                lblDateBorrowError.setText("Invalid. Cannot be empty.");
//            } else if ((txtDateBorrow.getText().trim().length() > 10)) {
//                lblDateBorrowError.setText("Invalid. Must be < 10 chars.");
//            }
//
//            lblDateBorrowError.setVisible(true);
//            result = false;
//        }
//
//        if (txtDateReturn.getText().trim().isEmpty() || (txtDateReturn.getText().trim().length() > 9)) {
//            if (txtDateReturn.getText().trim().isEmpty()) {
//                lblDateReturnError.setText("Invalid. Cannot be empty.");
//            } else if (txtDateReturn.getText().trim().length() > 9) {
//                lblDateReturnError.setText("Invalid. Must be < 9 chars.");
//            }
//            lblDateReturnError.setVisible(true);
//            result = false;
//        }
//
//        if (ftxtDateDue.getText().trim().isEmpty()) {
//            lblDateDueError.setText("Invalid. Cannot be empty.");
//            lblDateDueError.setVisible(true);
//            result = false;
//        }
//
//        if (txtBookID.getText().trim().isEmpty() || !(isInteger(txtBookID.getText().trim()) || isDouble(txtBookID.getText().trim()))) {
//            if (txtBookID.getText().trim().isEmpty()) {
//                lblMemIDError.setText("Invalid. Cannot be empty.");
//            } else if (!(isInteger(txtBookID.getText().trim()) || isDouble(txtBookID.getText().trim()))) {
//                lblMemIDError.setText("Invalid. Must be number.");
//            }
//
//            lblMemIDError.setVisible(true);
//            result = false;
//        }
//        
//        if (txtCopyID.getText().trim().isEmpty() || !(isInteger(txtCopyID.getText().trim()) || isDouble(txtCopyID.getText().trim()))) {
//            if (txtCopyID.getText().trim().isEmpty()) {
//                lblMemIDError.setText("Invalid. Cannot be empty.");
//            } else if (!(isInteger(txtCopyID.getText().trim()) || isDouble(txtCopyID.getText().trim()))) {
//                lblMemIDError.setText("Invalid. Must be number.");
//            }
//
//            lblMemIDError.setVisible(true);
//            result = false;
//        }
//
//        if (txtMemID.getText().trim().isEmpty() || !isInteger(txtMemID.getText().trim())) {
//            if (txtMemID.getText().trim().isEmpty()) {
//                lblBookIDError.setText("Invalid. Cannot be empty.");
//            } else if (!isInteger(txtMemID.getText().trim())) {
//                lblBookIDError.setText("Invalid. Must be integer");
//            }
//            lblBookIDError.setVisible(true);
//            result = false;
//        }
//        return result;
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnReturn;
    private javax.swing.JFormattedTextField ftxtDateDue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtBorrowID;
    private javax.swing.JTextField txtDateBorrow;
    private javax.swing.JTextField txtMemID;
    // End of variables declaration//GEN-END:variables
}
