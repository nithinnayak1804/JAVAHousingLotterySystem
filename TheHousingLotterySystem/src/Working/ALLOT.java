/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Working;

/**
 *
 * @author Nithin Nayak
 */
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;
public class ALLOT extends javax.swing.JFrame {

private static int generateUniqueRandomNumber(int n) {
    if (n <= 0) {
        throw new IllegalArgumentException("n must be greater than 0");
    }

    if (n == 1) {
        return 1; // Special case when n is 1, return 1
    }

    if (generatedNumbers.size() >= n) {
        throw new IllegalStateException("All unique numbers have been generated.");
    }

    int randomNumber;
    do {
        randomNumber = random.nextInt(n) + 1;
    } while (generatedNumbers.contains(randomNumber));

    generatedNumbers.add(randomNumber);

    return randomNumber;
}

private static Random random = new Random();
private static ArrayList<Integer> generatedNumbers = new ArrayList<>();
    public ALLOT() {
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

        generate = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 1400, 580));
        setMinimumSize(new java.awt.Dimension(1399, 579));
        setResizable(false);
        setSize(new java.awt.Dimension(1399, 579));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generate.setBackground(new java.awt.Color(0, 204, 102));
        generate.setFont(new java.awt.Font("Century Schoolbook", 1, 48)); // NOI18N
        generate.setForeground(new java.awt.Color(255, 255, 255));
        generate.setText("Allot Houses");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        getContentPane().add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 460, 110));

        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 540, 80));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(like Lottery2021)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 390, 60));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FINAL ALLOTMENT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 730, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Working/logo .png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 360, 250));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LOTTERY SYSTEM");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 370, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("HOUSING");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 200, 50));

        jLabel5.setFont(new java.awt.Font("Perpetua", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 204));
        jLabel5.setText("We don't build  Houses, ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 350, 90));

        jLabel6.setFont(new java.awt.Font("Perpetua", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 204));
        jLabel6.setText("We Build  Dreams");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, 420, 90));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Give a name for lottery ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, 50));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Working/formbg.jpg"))); // NOI18N
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1680, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
  try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maindb", "root", "");

    // SQL query to count rows in the finaldetails table
    // Create lists to store unique pairs of values
List<Integer> finalDetailsIds = new ArrayList<>();
List<Integer> houseDetailIds = new ArrayList<>();

// Fetch all available IDs from finaldetails and housedetail tables
String sqlFinalDetailsIds = "SELECT Finsrno FROM finaldetails";
String sqlHouseDetailIds = "SELECT srno FROM housedetail";

PreparedStatement preparedStatementFinalDetailsIds = con.prepareStatement(sqlFinalDetailsIds);
PreparedStatement preparedStatementHouseDetailIds = con.prepareStatement(sqlHouseDetailIds);

ResultSet resultSetFinalDetailsIds = preparedStatementFinalDetailsIds.executeQuery();
ResultSet resultSetHouseDetailIds = preparedStatementHouseDetailIds.executeQuery();

while (resultSetFinalDetailsIds.next()) {
    finalDetailsIds.add(resultSetFinalDetailsIds.getInt("Finsrno"));
}

while (resultSetHouseDetailIds.next()) {
    houseDetailIds.add(resultSetHouseDetailIds.getInt("srno"));
}

// Shuffle the lists to randomize the order
Collections.shuffle(finalDetailsIds);
Collections.shuffle(houseDetailIds);

// Loop through the shuffled lists and insert the values
for (int i = 0; i < Math.min(finalDetailsIds.size(), houseDetailIds.size()); i++) {
    int m = finalDetailsIds.get(i);
    int n = houseDetailIds.get(i);

    // Create a SQL statement to insert data into ResultOutcome
    String createTableSQL = "INSERT INTO ResultOutcome (Lotno, Finuid, Finname, did, ttype, dadd) " +
                            "SELECT Lotno, Finuid, Finname, did, ttype, dadd " +
                            "FROM finaldetails, housedetail " +
                            "WHERE Finsrno = ? AND srno = ?";
    PreparedStatement createTablePstmt = con.prepareStatement(createTableSQL);
    createTablePstmt.setInt(1, m);
    createTablePstmt.setInt(2, n);

    int rowsInserted = createTablePstmt.executeUpdate();
    if (rowsInserted > 0) {
        System.out.println("Data inserted successfully.");
    } else {
        System.out.println("No data inserted.");
    }
}

// Rest of your code here
generate.setVisible(false);
JOptionPane.showMessageDialog(this, "Houses allotted successfully!");
Homepage home = new Homepage();
home.show();
this.dispose();
con.close();
  } catch (Exception e) {
    System.out.print(e.getMessage());
    generate.setVisible(false);
}

    }//GEN-LAST:event_generateActionPerformed

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
            java.util.logging.Logger.getLogger(ALLOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ALLOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ALLOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ALLOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALLOT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
