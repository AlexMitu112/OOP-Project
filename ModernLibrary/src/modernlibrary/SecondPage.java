package modernlibrary;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JTextArea;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;

public class SecondPage extends javax.swing.JFrame {
    //Creates new form SecondPage
    public SecondPage() throws Exception{
        initComponents();
        rd.Books();
        NoMore.setVisible(false);
               
        //Initially hide the controls that allow the user to borrow a book. If the book is not available, these fields are not needed!
        HideControls();

    // Create an instance of SimpleDateFormat used for formatting 
    // the string representation of date according to the chosen pattern
    DateFormat df = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);

    // Get the today date using Calendar object.
    Date today = Calendar.getInstance().getTime();        
    // Using DateFormat format method we can create a string 
    // representation of a date with the defined format.
    String todayAsString = df.format(today);

    // Print it!
    Today.setText(todayAsString);
    
    
    
    }
    
    public void HideControls(){
        Details.setVisible(false);
        ScrollPane2.setVisible(false);
        Period.setVisible(false);
        StartDate.setVisible(false);
        EndDate.setVisible(false);
        Today.setVisible(false);
        InsertEndDate.setVisible(false);
        BorrowButton.setVisible(false);
        WrongDate.setVisible(false);
        Success.setVisible(false);
        RemCopies.setVisible(false);
        Next.setVisible(false);
        
        avail.setVisible(false);
        nr1.setVisible(false);
        totalb.setVisible(false);
        nr2.setVisible(false);
        
    }
    public void ShowControls(){
        Details.setVisible(true);
        ScrollPane2.setVisible(true);
        Period.setVisible(true);
        StartDate.setVisible(true);
        EndDate.setVisible(true);
        Today.setVisible(true);
        InsertEndDate.setVisible(true);
        BorrowButton.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckButton = new javax.swing.JButton();
        ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowBooks = new javax.swing.JTextArea();
        label1 = new java.awt.Label();
        NoMore = new javax.swing.JLabel();
        ScrollPane2 = new javax.swing.JScrollPane();
        Details = new javax.swing.JTextArea();
        Period = new javax.swing.JLabel();
        StartDate = new javax.swing.JLabel();
        Today = new javax.swing.JTextField();
        InsertEndDate = new javax.swing.JTextField();
        EndDate = new javax.swing.JLabel();
        WrongDate = new javax.swing.JLabel();
        RemCopies = new javax.swing.JLabel();
        BorrowButton = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Success = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        avail = new java.awt.Label();
        totalb = new java.awt.Label();
        nr1 = new java.awt.Label();
        nr2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1800, 1000));

        CheckButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        CheckButton.setText("Check");
        CheckButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckButtonMouseClicked(evt);
            }
        });
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel2.setText("If you want to borrow a book, insert the ID \nand press the button!");

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.setToolTipText("");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ShowBooks.setColumns(20);
        ShowBooks.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ShowBooks.setRows(5);
        ShowBooks.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ShowBooksInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ShowBooks);

        label1.setFont(new java.awt.Font("Dialog", 2, 48)); // NOI18N
        label1.setName("Borrow Books"); // NOI18N
        label1.setText("Borrow Books");

        NoMore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NoMore.setForeground(new java.awt.Color(255, 0, 0));
        NoMore.setText("No more books of this type are available!");

        Details.setColumns(20);
        Details.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        Details.setRows(5);
        ScrollPane2.setViewportView(Details);

        Period.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Period.setText("Select borrow period(max. 30 days)");

        StartDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StartDate.setText("Start date");

        Today.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Today.setText("jTextField1");
        Today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayActionPerformed(evt);
            }
        });

        InsertEndDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        InsertEndDate.setText("YYYY/MM/DD");
        InsertEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertEndDateActionPerformed(evt);
            }
        });

        EndDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EndDate.setText("End Date");

        WrongDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        WrongDate.setForeground(new java.awt.Color(204, 0, 0));
        WrongDate.setText("Borrow dates are not valid. Please select a borrow period under 30 days!");

        RemCopies.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        RemCopies.setText("jLabel5");

        BorrowButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BorrowButton.setText("Borrow!");
        BorrowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowButtonMouseClicked(evt);
            }
        });
        BorrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowButtonActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        Success.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        Success.setText("Successfully borrwoed the book! Copies remaining:");

        Next.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Next.setText("Next Book");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });

        avail.setText("Available copies: ");

        totalb.setText("out of total:");

        nr2.setText("label3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(WrongDate, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(avail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(totalb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(378, 378, 378))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(StartDate))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(InsertEndDate)
                                            .addComponent(Today, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(Success, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(RemCopies))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(Period, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(31, 31, 31)
                                                        .addComponent(CheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(NoMore, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(BorrowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Next)
                        .addGap(88, 88, 88)))
                .addContainerGap(6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(NoMore, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nr1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nr2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Period, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Today, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InsertEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(WrongDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(BorrowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Back))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Next)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Success)
                            .addComponent(RemCopies))
                        .addGap(71, 71, 71))))
        );

        avail.getAccessibleContext().setAccessibleName("avail");
        totalb.getAccessibleContext().setAccessibleName("totalb");
        nr1.getAccessibleContext().setAccessibleName("nr1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowBooksInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ShowBooksInputMethodTextChanged
    }//GEN-LAST:event_ShowBooksInputMethodTextChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try{
        String s="";
        String a="";
        Integer i=0;
        while(((s=rd.books[i].getName())!=null) && ((a=rd.books[i].getAuthor())!=null))
        {i++;
        ShowBooks.append(String.valueOf(i)+") "+s+", Author: "+a+"\n");
        }    
        }catch(Exception ee){}
    }//GEN-LAST:event_jButton2MouseClicked

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
    }//GEN-LAST:event_IDActionPerformed

    private void CheckButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckButtonMouseClicked
        bi=Integer.parseInt(ID.getText());
        int q=rd.books[bi-1].getQuantity();
        if(q==0)
            NoMore.setVisible(true);
        else
            {   //Show the Controls that allow the user to borrow a book
                ShowControls();
     
                //Show details about the chosen book
                Details.append("ISBN: "+rd.books[bi-1].getISBN()+"\n"+"Title: "+rd.books[bi-1].getName()+"\n"+"Author: "+rd.books[bi-1].getAuthor()
                        +"\n"+"Book's Language: "+rd.books[bi-1].getLanguage()+"\n"+"ShelfNumber: "+rd.books[bi-1].getShelf()+"\n"+"Copies Available: "
                        +rd.books[bi-1].getQuantity());
                rd.books[bi-1].updateQuantity();
            }
    }//GEN-LAST:event_CheckButtonMouseClicked

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed
    }//GEN-LAST:event_CheckButtonActionPerformed

    private void InsertEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertEndDateActionPerformed
    }//GEN-LAST:event_InsertEndDateActionPerformed

    private void BorrowButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowButtonMouseClicked
        
        int tot=0;
        for(int i=0;i<2;i++)
            tot+=rd.books[i].getQuantity();
        
        
        //Check the date the user inserts
        String end = InsertEndDate.getText();
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
        try {
            Date end1 = format.parse(end);
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
            Date today = Calendar.getInstance().getTime();
            Long days = ChronoUnit.DAYS.between(today.toInstant(), end1.toInstant());
            if(days>=31){
                WrongDate.setVisible(true);
                //continue else with borrow
            }
            else
            {
                InsertEndDate.setText(end);
                Success.setVisible(true);
                RemCopies.setVisible(true);
                RemCopies.setText(String.valueOf(rd.books[bi-1].getQuantity()));
                Next.setVisible(true);
                
                int sum=0;
                
                avail.setVisible(true);
                
                for(int i=0;i<2;i++)
                    sum+=rd.books[i].getQuantity();
                nr1.setText(String.valueOf(sum));
                nr1.setVisible(true);
                
                
                
                totalb.setVisible(true);
                
                nr2.setVisible(true);
                nr2.setText(String.valueOf(tot));
                
                
             
                //Date endBorrow = format.parse(end);
                //rd.res[0].setBorrowValues(today,endBorrow,rd.books[bi-1].getISBN());
                //System.out.println(rd.res[0].getbEnd()+" "+ rd.res[0].getbStart());
                
                
      
        
        
            }
        } catch (ParseException ex) {}
        
        
        //Message + Number of copies remaining
        
    }//GEN-LAST:event_BorrowButtonMouseClicked

    private void BorrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowButtonActionPerformed
    }//GEN-LAST:event_BorrowButtonActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        {
        //Move to the previous page
        this.setVisible(false);
        try{
            new MenuPage().setVisible(true);
        }catch(Exception e){}
        }
    }//GEN-LAST:event_BackMouseClicked

    private void TodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayActionPerformed
    }//GEN-LAST:event_TodayActionPerformed

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        //The user might want to borrow another book. We hide the controls to start the process again.
        HideControls();
        ShowBooks.setText("");
        ID.setText("");
    }//GEN-LAST:event_NextMouseClicked

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
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new SecondPage().setVisible(true);
                }catch(Exception e){}
            }
        });
    }
    
    ReadingData rd = new ReadingData();
    int bi;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton BorrowButton;
    private javax.swing.JButton CheckButton;
    private javax.swing.JTextArea Details;
    private javax.swing.JLabel EndDate;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField InsertEndDate;
    private javax.swing.JButton Next;
    private javax.swing.JLabel NoMore;
    private javax.swing.JLabel Period;
    private javax.swing.JLabel RemCopies;
    private javax.swing.JScrollPane ScrollPane2;
    private javax.swing.JTextArea ShowBooks;
    private javax.swing.JLabel StartDate;
    private javax.swing.JLabel Success;
    private javax.swing.JTextField Today;
    private javax.swing.JLabel WrongDate;
    private java.awt.Label avail;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label nr1;
    private java.awt.Label nr2;
    private java.awt.Label totalb;
    // End of variables declaration//GEN-END:variables
}