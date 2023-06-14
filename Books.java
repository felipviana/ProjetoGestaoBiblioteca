/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookshop;

import bookshop.models.Book;
import bookshop.models.DataManager;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Books extends javax.swing.JFrame {
    private boolean isEditing = false;
    
    /**
     * Creates new form Book
     */
    public Books() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        titleInput = new javax.swing.JTextField();
        publisherInput = new javax.swing.JTextField();
        yearInput = new javax.swing.JTextField();
        authorInput = new javax.swing.JTextField();
        isbnInput = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Publisher", "Year", "Author", "ISBN"
            }
        ));
        jScrollPane2.setViewportView(booksTable);

        titleInput.setToolTipText("");
        titleInput.setPreferredSize(new java.awt.Dimension(100, 22));
        titleInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleInputActionPerformed(evt);
            }
        });

        publisherInput.setPreferredSize(new java.awt.Dimension(100, 22));

        yearInput.setPreferredSize(new java.awt.Dimension(100, 22));

        authorInput.setPreferredSize(new java.awt.Dimension(100, 22));
        authorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorInputActionPerformed(evt);
            }
        });

        isbnInput.setPreferredSize(new java.awt.Dimension(100, 22));
        isbnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnInputActionPerformed(evt);
            }
        });

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Title");

        jLabel2.setText("Publisher");

        jLabel3.setText("Year");

        jLabel4.setText("Author");

        jLabel5.setText("ISBN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(titleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(publisherInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(isbnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(306, 306, 306)
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisherInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isbnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(saveButton)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleInputActionPerformed

    }//GEN-LAST:event_titleInputActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveEditedData();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = booksTable.getSelectedRow();
        Boolean noRowSelected = selectedRow == -1;
        
        if (!noRowSelected) {
            DefaultTableModel model = (DefaultTableModel) booksTable.getModel();
            model.removeRow(selectedRow);
            DataManager.getInstance().removeBook(selectedRow);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Home home = new Home();  
        home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        populateInputsFromSelectedRow();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void authorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorInputActionPerformed

    }//GEN-LAST:event_authorInputActionPerformed

    private void isbnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnInputActionPerformed

    }//GEN-LAST:event_isbnInputActionPerformed

    public void populateInputsFromSelectedRow() {
        int selectedRow = booksTable.getSelectedRow();
        Boolean noRowSelected = selectedRow == -1;
        
        if (!noRowSelected) {
            isEditing = true;
            Book selectedBook = DataManager.getInstance().getBooks().get(selectedRow);
            titleInput.setText(selectedBook.getTitle());
            publisherInput.setText(selectedBook.getPublisher());
            yearInput.setText(selectedBook.getYear());
            authorInput.setText(selectedBook.getAuthor());
            isbnInput.setText(selectedBook.getISBN());
        }
    }
    
    public void saveEditedData() {
        String title = titleInput.getText();
        String publisher = publisherInput.getText();
        String year = yearInput.getText();
        String author = authorInput.getText();
        String isbn = isbnInput.getText();
        
        if (title.isBlank() || publisher.isBlank() || year.isBlank() || author.isBlank() || isbn.isBlank()) {
            JOptionPane.showMessageDialog(null, "Fill the fields correctly", "Alert", JOptionPane.ERROR_MESSAGE);
            return;
        }

                
        if (isEditing) {
            int selectedRow = booksTable.getSelectedRow();
            Boolean noRowSelected = selectedRow == -1;
            
            if (!noRowSelected) {
                Book previousUserData = DataManager.getInstance().getBookAt(selectedRow);
                Book updatedBook = new Book(previousUserData.getId(),title, publisher, year, author, isbn);
                DataManager.getInstance().updateBookAt(selectedRow, updatedBook);

                DefaultTableModel model = (DefaultTableModel)booksTable.getModel();
                model.setValueAt(title, selectedRow, 0);
                model.setValueAt(publisher, selectedRow, 1);
                model.setValueAt(year, selectedRow, 2);
                model.setValueAt(author, selectedRow, 3);
                model.setValueAt(isbn, selectedRow, 4);

            }
        } else {
            DefaultTableModel model = (DefaultTableModel)booksTable.getModel();
            DataManager dataManager = DataManager.getInstance();
            dataManager.addBook(new Book(UUID.randomUUID().toString(),titleInput.getText(), publisherInput.getText(), yearInput.getText(), authorInput.getText(), isbnInput.getText()));
            model.addRow(new Object[]{titleInput.getText(), publisherInput.getText(), yearInput.getText(), authorInput.getText(), isbnInput.getText()});
        }
        
        resetFields();
        isEditing = false;
    }

    public void resetFields() {
        titleInput.setText("");
        publisherInput.setText("");
        yearInput.setText("");
        authorInput.setText("");
        isbnInput.setText("");
    }
    
    public void populateTable() {
        List<Book> books = DataManager.getInstance().getBooks(); 
        
        String[] columnNames = {"Title", "Publisher", "Year", "Author", "ISBN"};

        Object[][] data = new Object[books.size()][columnNames.length];
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            data[i][0] = book.getTitle();
            data[i][1] = book.getPublisher();
            data[i][2] = book.getYear();
            data[i][3] = book.getAuthor();
            data[i][4] = book.getISBN();
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // all cells false
                return false;
            }
        };

        booksTable.setModel(model);
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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorInput;
    private javax.swing.JButton backButton;
    private javax.swing.JTable booksTable;
    private javax.swing.JTextField isbnInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField publisherInput;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField titleInput;
    private javax.swing.JTextField yearInput;
    // End of variables declaration//GEN-END:variables
}
