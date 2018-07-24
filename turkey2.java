/*     */ package calcs;
/*     */ 
/*     */ import java.awt.Container;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.text.NumberFormat;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UIManager.LookAndFeelInfo;
/*     */ 
/*     */ public final class turkey2 extends javax.swing.JFrame
/*     */ {
/*     */   public JComboBox jComboBox1;
/*     */   private JLabel jLabel1;
/*     */   private JTextField jTextField1;
/*     */   private JTextField jTextField2;
/*     */   private JTextField jTextField3;
/*     */   private JLabel spum1;
/*     */   private JButton infom;
/*     */   
/*     */   public turkey2()
/*     */   {
/*  36 */     initComponents();
/*  37 */     setSize(500, 205);
/*  38 */     setResizable(false);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void initComponents()
/*     */   {
/*  51 */     this.jLabel1 = new JLabel();
/*  52 */     this.jComboBox1 = new JComboBox();
/*  53 */     this.infom = new JButton();
/*  54 */     this.jTextField1 = new javax.swing.JFormattedTextField();
/*  55 */     this.jTextField2 = new JTextField();
/*  56 */     this.jTextField3 = new JTextField();
/*     */     
/*  58 */     this.spum1 = new JLabel();
/*     */     
/*     */ 
/*  61 */     BufferedImage apple = new BufferedImage(1, 1, 3);
/*     */     
/*  63 */     URL imageURL = turkey2.class.getResource("stufficoned.png");
/*  64 */     ImageIcon imageIcon = new ImageIcon(imageURL);
/*  65 */     setIconImage(imageIcon.getImage());
/*  66 */     setTitle("Kappler Scale Calculator");
/*     */     
/*     */ 
/*  69 */     setDefaultCloseOperation(3);
/*  70 */     getContentPane().setLayout(null);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */     this.jComboBox1.addItemListener(new java.awt.event.ItemListener()
/*     */     {
/*     */       public void itemStateChanged(ItemEvent ie)
/*     */       {
/*  83 */         turkey2.this.carefull();
/*     */       }
/*     */       
/*  86 */     });
/*  87 */     this.infom.setOpaque(false);
/*  88 */     this.infom.setContentAreaFilled(false);
/*  89 */     this.infom.setBorderPainted(false);
/*  90 */     this.infom.setBounds(450, 140, 85, 50);
/*  91 */     getContentPane().add(this.infom);
/*  92 */     this.infom.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent entr) {
/*  94 */         infoFrame inforit = new infoFrame();
/*  95 */         inforit.setVisible(true);
/*  96 */         URL imageURL = turkey2.class.getResource("stufficoned.png");
/*  97 */         ImageIcon imageIcon = new ImageIcon(imageURL);
/*  98 */         inforit.setIconImage(imageIcon.getImage());
/*     */       }
/*     */       
/* 101 */     });
/* 102 */     this.jComboBox1.setFont(new Font("Times New Roman", 0, 14));
/* 103 */     this.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select A-Z", "Z (1:220)", "N (1:160)", "HO (1:87)", "S (1:64)", "O (1:48)", "#1 (1:32)", "A (1:29)", "1/2\" (1:24)", "G (1:22.5)", "F (1:20.3)", "M (1:13.7)", "1\" (1:12)" }));
/*     */     
/* 105 */     getContentPane().add(this.jComboBox1);
/* 106 */     this.jComboBox1.setBounds(345, 38, 108, 27);
/*     */     
/* 108 */     this.jTextField3.setFont(new Font("Times New Roman", 0, 14));
/* 109 */     this.jTextField3.setText("");
/* 110 */     this.jTextField3.addActionListener(this.jComboBox1);
/* 111 */     this.jTextField3.addActionListener(new ActionListener()
/*     */     {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 114 */         turkey2.this.jTextField3ActionPerformed(evt);
/*     */       }
/*     */       
/* 117 */     });
/* 118 */     this.jTextField3.addKeyListener(new KeyListener()
/*     */     {
/*     */       public void keyTyped(KeyEvent ke) {}
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       public void keyPressed(KeyEvent ke) {}
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       public void keyReleased(KeyEvent ke)
/*     */       {
/* 132 */         turkey2.this.carefull();
/* 133 */         if (ke.getKeyCode() == 8)
/*     */         {
/*     */ 
/* 136 */           turkey2.this.carefull();
/*     */         }
/*     */         
/*     */       }
/*     */       
/*     */ 
/* 142 */     });
/* 143 */     this.jTextField3.addMouseListener(new java.awt.event.MouseAdapter()
/*     */     {
/*     */ 
/*     */       public void mouseClicked(MouseEvent ey)
/*     */       {
/* 148 */         turkey2.this.jComboBox1.setSelectedItem("Select A-Z");
/*     */       }
/*     */       
/*     */ 
/* 152 */     });
/* 153 */     this.jTextField3.setBounds(248, 40, 69, 25);
/* 154 */     this.jTextField1.addActionListener(this.jComboBox1);
/* 155 */     this.jTextField1.setFont(new Font("Times New Roman", 0, 14));
/* 156 */     this.jTextField1.setText("0");
/*     */     
/*     */ 
/* 159 */     this.jTextField1.addActionListener(new ActionListener()
/*     */     {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 162 */         turkey2.this.jTextField1ActionPerformed(evt);
/*     */       }
/*     */       
/*     */ 
/* 166 */     });
/* 167 */     getContentPane().add(this.jTextField1);
/* 168 */     this.jTextField1.setBounds(230, 103, 72, 25);
/*     */     
/* 170 */     this.jTextField1.addKeyListener(new KeyListener()
/*     */     {
/*     */       public void keyTyped(KeyEvent ke) {}
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       public void keyPressed(KeyEvent ke) {}
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       public void keyReleased(KeyEvent ke)
/*     */       {
/* 184 */         turkey2.this.carefull();
/* 185 */         if (ke.getKeyCode() == 8)
/*     */         {
/*     */ 
/* 188 */           turkey2.this.carefull();
/*     */ 
/*     */         }
/*     */         
/*     */       }
/*     */       
/*     */ 
/* 195 */     });
/* 196 */     this.jTextField2.addActionListener(this.jComboBox1);
/* 197 */     this.jTextField2.addKeyListener(new KeyListener()
/*     */     {
/*     */       public void keyTyped(KeyEvent ke) {}
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       public void keyPressed(KeyEvent ke) {}
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       public void keyReleased(KeyEvent ke)
/*     */       {
/* 212 */         turkey2.this.carefull();
/*     */       }
/*     */       
/*     */ 
/* 216 */     });
/* 217 */     this.jTextField2.setFont(new Font("Times New Roman", 0, 14));
/* 218 */     this.jTextField2.setText("0");
/*     */     
/* 220 */     getContentPane().add(this.jTextField2);
/* 221 */     this.jTextField2.setBounds(313, 103, 72, 25);
/* 222 */     this.jTextField3.setVisible(true);
/* 223 */     getContentPane().add(this.jTextField3);
/*     */     
/* 225 */     this.spum1.setFont(new Font("Times New Roman", 0, 15));
/* 226 */     getContentPane().add(this.spum1);
/* 227 */     this.spum1.setBounds(410, 108, 110, 15);
/* 228 */     this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/calcs/KapCalc-graphics_v8-90dpi.jpg")));
/* 229 */     getContentPane().add(this.jLabel1);
/* 230 */     this.jLabel1.setBounds(0, 0, 495, 180);
/* 231 */     this.jLabel1.setVisible(true);
/*     */     
/*     */ 
/* 234 */     pack();
/* 235 */     setVisible(true);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void jComboBox1ActionPerformed(ActionEvent evt) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void jTextField3ActionPerformed(ActionEvent evt) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void jTextField1ActionPerformed(ActionEvent evt) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/* 268 */       for (UIManager.LookAndFeelInfo info : ) {
/* 269 */         if ("Nimbus".equals(info.getName())) {
/* 270 */           UIManager.setLookAndFeel(info.getClassName());
/* 271 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|javax.swing.UnsupportedLookAndFeelException ex) {
/* 275 */       Logger.getLogger(turkey2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 287 */         new turkey2().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void carefull()
/*     */   {
/* 307 */     String sumthing = "";
/*     */     
/*     */ 
/*     */ 
/*     */     double feet;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/* 316 */       feet = Double.parseDouble(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/* 318 */       feet = 0.0D;
/*     */     }
/*     */     double inches;
/*     */     try {
/* 322 */       inches = Double.parseDouble(this.jTextField2.getText());
/*     */     } catch (NumberFormatException e) {
/* 324 */       inches = 0.0D;
/*     */     }
/*     */     double custom;
/*     */     try
/*     */     {
/* 329 */       custom = Double.parseDouble(this.jTextField3.getText());
/*     */     } catch (NumberFormatException e) {
/* 331 */       custom = 0.0D;
/*     */     }
/*     */     
/*     */ 
/* 335 */     NumberFormat changer = NumberFormat.getNumberInstance();
/*     */     
/* 337 */     double tik = feet * 12.0D;
/*     */     
/* 339 */     double tok = inches + tik;
/*     */     
/* 341 */     sumthing = changer.format(tok / custom);
/*     */     
/*     */ 
/*     */     try
/*     */     {
/* 346 */       if (this.jComboBox1.getSelectedItem().equals("Select A-Z"))
/*     */       {
/*     */ 
/* 349 */         sumthing = changer.format(tok / custom);
/*     */       }
/* 351 */       if (this.jComboBox1.getSelectedItem().equals("Custom (1:?)"))
/*     */       {
/*     */ 
/* 354 */         sumthing = changer.format(tok / custom);
/* 355 */         this.jTextField3.setText("");
/*     */       }
/*     */       
/* 358 */       if (this.jComboBox1.getSelectedItem().equals("S (1:64)"))
/*     */       {
/*     */ 
/* 361 */         sumthing = changer.format(tok / 64.0D);
/* 362 */         this.jTextField3.setText("");
/*     */       }
/*     */       
/* 365 */       if (this.jComboBox1.getSelectedItem().equals("Z (1:220)"))
/*     */       {
/*     */ 
/* 368 */         sumthing = changer.format(tok / 220.0D);
/* 369 */         this.jTextField3.setText("");
/*     */       }
/*     */       
/*     */ 
/* 373 */       if (this.jComboBox1.getSelectedItem().equals("N (1:160)"))
/*     */       {
/*     */ 
/* 376 */         sumthing = changer.format(tok / 160.0D);
/* 377 */         this.jTextField3.setText("");
/*     */       }
/*     */       
/*     */ 
/* 381 */       if (this.jComboBox1.getSelectedItem().equals("HO (1:87)"))
/*     */       {
/* 383 */         sumthing = changer.format(tok / 87.0D);
/* 384 */         this.jTextField3.setText("");
/*     */       }
/*     */       
/* 387 */       if (this.jComboBox1.getSelectedItem().equals("O (1:48)"))
/*     */       {
/* 389 */         sumthing = changer.format(tok / 48.0D);
/* 390 */         this.jTextField3.setText("");
/*     */       }
/*     */       
/* 393 */       if (this.jComboBox1.getSelectedItem().equals("#1 (1:32)"))
/*     */       {
/* 395 */         sumthing = changer.format(tok / 32.0D);
/* 396 */         this.jTextField3.setText("");
/*     */       }
/* 398 */       if (this.jComboBox1.getSelectedItem().equals("A (1:29)"))
/*     */       {
/*     */ 
/* 401 */         sumthing = changer.format(tok / 29.0D);
/* 402 */         this.jTextField3.setText("");
/*     */       }
/* 404 */       if (this.jComboBox1.getSelectedItem().equals("1/2\" (1:24)"))
/*     */       {
/*     */ 
/* 407 */         sumthing = changer.format(tok / 24.0D);
/* 408 */         this.jTextField3.setText("");
/*     */       }
/* 410 */       if (this.jComboBox1.getSelectedItem().equals("G (1:22.5)"))
/*     */       {
/* 412 */         this.jTextField3.setText("");
/* 413 */         sumthing = changer.format(tok / 22.5D);
/*     */       }
/* 415 */       if (this.jComboBox1.getSelectedItem().equals("F (1:20.3)"))
/*     */       {
/* 417 */         this.jTextField3.setText("");
/* 418 */         sumthing = changer.format(tok / 20.3D);
/*     */       }
/* 420 */       if (this.jComboBox1.getSelectedItem().equals("M (1:13.7)"))
/*     */       {
/* 422 */         this.jTextField3.setText("");
/* 423 */         sumthing = changer.format(tok / 13.7D);
/*     */       }
/* 425 */       if (this.jComboBox1.getSelectedItem().equals("1\" (1:12)"))
/*     */       {
/* 427 */         this.jTextField3.setText("");
/* 428 */         sumthing = changer.format(tok / 12.0D);
/*     */       }
/*     */     }
/*     */     catch (NumberFormatException e) {}
/*     */     
/*     */ 
/* 434 */     BufferedImage img = null;
/*     */     
/*     */     try
/*     */     {
/* 438 */       img = javax.imageio.ImageIO.read(new java.io.File("windowiconed.png"));
/*     */     }
/*     */     catch (IOException e) {}
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 445 */     this.spum1.setText(sumthing + "\"");
/*     */   }
/*     */ }


/* Location:              /home/manuel/Desktop/calcs/calcs.jar!/calcs/turkey2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */