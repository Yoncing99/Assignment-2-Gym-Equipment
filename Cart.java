package assignment2;

import javax.swing.JOptionPane;

public class Cart extends javax.swing.JFrame {

    int x,y;
    public Cart() {
        initComponents();
        buy.setVisible(false); 
        total.setVisible(false);
        JOptionPane.showMessageDialog(null, "Item Add to Cart Successfully !\n Please enter the quantity !");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        reForm = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        cart = new javax.swing.JLabel();
        goback = new javax.swing.JLabel();
        background10 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        q5 = new javax.swing.JTextField();
        product = new javax.swing.JLabel();
        q4 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q1 = new javax.swing.JTextField();
        price = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ans = new javax.swing.JLabel();
        sum = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        buy = new javax.swing.JButton();
        purchase = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment2/x3.jpg"))); // NOI18N
        close.setText("jLabel1");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        reForm.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        reForm.setForeground(new java.awt.Color(255, 255, 0));
        reForm.setText("CART");

        mini.setBackground(new java.awt.Color(0, 0, 0));
        mini.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        mini.setForeground(new java.awt.Color(255, 255, 255));
        mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini.setText("—");
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(reForm)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(mini, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 30));

        cart.setFont(new java.awt.Font("Shrikhand", 1, 24)); // NOI18N
        cart.setForeground(new java.awt.Color(255, 255, 255));
        cart.setText("My Cart");
        jPanel1.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        goback.setBackground(new java.awt.Color(255, 255, 255));
        goback.setFont(new java.awt.Font("Bernard MT Condensed", 1, 36)); // NOI18N
        goback.setForeground(new java.awt.Color(255, 255, 255));
        goback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goback.setText("<");
        goback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        goback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gobackMouseClicked(evt);
            }
        });
        jPanel1.add(goback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 40));

        background10.setBackground(new java.awt.Color(0, 0, 0));
        background10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment2/t1.jpg"))); // NOI18N
        jPanel1.add(background10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 70));

        n1.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        n1.setText("Treadmill");
        jPanel1.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 100, 30));

        n2.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        n2.setText("Stationary Bike");
        jPanel1.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 160, 30));

        n3.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        n3.setText("Incline Bench Press");
        jPanel1.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 180, 30));

        c2.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        c2.setText("RM   800.00");
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 90, 30));

        c3.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        c3.setText("RM   400.00");
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 90, 30));

        c1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        c1.setText("RM 2000.00");
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 90, 30));

        n4.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        n4.setText("Dumbbells Set");
        jPanel1.add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 160, 30));

        n5.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        n5.setText("Barbells Set");
        jPanel1.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 160, 30));

        c4.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        c4.setText("RM   400.00");
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 90, 30));

        c5.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        c5.setText("RM   600.00");
        jPanel1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 90, 30));

        q5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 50, 30));

        product.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        product.setText("Product");
        jPanel1.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        q4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 50, 30));

        q3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 50, 30));

        q2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 50, 30));

        q1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 50, 30));

        price.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        price.setText("Price");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        total.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        total.setText("Total :");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        quantity.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        quantity.setText("Quantity");
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment2/z5.jpg"))); // NOI18N
        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 60, 60));

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment2/z4.jpg"))); // NOI18N
        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 60, 60));

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment2/z3.jpg"))); // NOI18N
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 60, 60));

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment2/z2.jpg"))); // NOI18N
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 60));

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment2/z1.jpg"))); // NOI18N
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 440, 2));

        ans.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        ans.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 160, 50));

        sum.setBackground(new java.awt.Color(0, 0, 0));
        sum.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        sum.setForeground(new java.awt.Color(255, 255, 255));
        sum.setText("Sum");
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });
        jPanel1.add(sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 100, 30));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, 450, 1));

        buy.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        buy.setText("BUY");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        jPanel1.add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 100, 40));

        purchase.setFont(new java.awt.Font("Century Schoolbook", 3, 18)); // NOI18N
        purchase.setForeground(new java.awt.Color(255, 0, 0));
        purchase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        purchase.setBorder(null);
        jPanel1.add(purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 430, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {                                   
        System.exit(0);
    }                                  

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {                                  
        this.setState(Cart.ICONIFIED);
    }                                 

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {                                     
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }                                    

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {                                     
        x = evt.getX();
        y = evt.getY();
    }                                    

    private void gobackMouseClicked(java.awt.event.MouseEvent evt) {                                    
        this.setVisible(false);
        Catalogue info = new Catalogue();
        info.setVisible(true);
    }                                   

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {                                    

        purchase.setVisible(false);
        total.setVisible(true);
        int a1 = Integer.parseInt(q1.getText());
        int a2 = Integer.parseInt(q2.getText());
        int a3 = Integer.parseInt(q3.getText());
        int a4 = Integer.parseInt(q4.getText());
        int a5 = Integer.parseInt(q5.getText());
            
        String ab = String.valueOf((2000*a1)+(800*a2)+(400*a3)+(400*a4)+(600*a5));
        ans.setText("RM "+ab);
        buy.setVisible(true);            
    }                                   

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        JOptionPane.showMessageDialog(null, "Purchase Successfully !");
        purchase.setVisible(true);
        String bu = evt.getActionCommand();
        if("BUY".equals(bu)){
            if(evt.getSource()==buy){
                purchase.setText("Purchase Successfully !");
            }else{
                purchase.setText("");
            }
        }
    }                                   

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel ans;
    private javax.swing.JLabel background10;
    private javax.swing.JButton buy;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel cart;
    private javax.swing.JLabel close;
    private javax.swing.JLabel goback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel price;
    private javax.swing.JLabel product;
    private javax.swing.JTextField purchase;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JLabel quantity;
    private javax.swing.JLabel reForm;
    private javax.swing.JButton sum;
    private javax.swing.JLabel total;
    // End of variables declaration                   
}