package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import kioskapp.ItemProduct;
import kioskapp.Order;
import kioskapp.OrderedItem;

public class Client implements ActionListener, ChangeListener {
	
	// Declaration Menu 1
	public JButton btnStart;
	public JRadioButton eatIn;
	public JRadioButton takeAway;
	public JFrame frameMain;
	public String selection = null;
	
	// Declaration Menu 2
	public JButton btnMenu1;
	public JButton btnMenu2;
	public JButton btnMenu3;
	public JButton btnMenu4;
	public JButton btnMenu5;
	public JButton btnMenu6;
	public JButton btnMenu7;
	public JButton btnMenu8;
	public JButton btnMenu9;
	public JButton btnMenu10;
	public JButton btnMenu11;
	public JButton btnMenu12;
	public JButton btnMenu13;
	public JFrame frameMain2;
	
	ItemProduct item1 = new ItemProduct();
	ItemProduct item2 = new ItemProduct();
	ItemProduct item3 = new ItemProduct();
	ItemProduct item4 = new ItemProduct();
	ItemProduct item5 = new ItemProduct();
	ItemProduct item6 = new ItemProduct();
	ItemProduct item7 = new ItemProduct();
	ItemProduct item8 = new ItemProduct();
	ItemProduct item9 = new ItemProduct();
	ItemProduct item10 = new ItemProduct();
	ItemProduct item11 = new ItemProduct();
	ItemProduct item12 = new ItemProduct();
	ItemProduct item13 = new ItemProduct();
	
	Order customerOrder = new Order();
	
	// Declaration Menu 3
	public JFrame frameMenu3;
	public JButton btnCartList;
	public JTextField txtDisplay;
	public JTextField txtCardNo;
	public JPanel itmAdd;
	public JPanel col;
	public JPanel col_1;
	public JPanel col_2;
	public JPanel col_3;
	public JPanel col_4;
	public JPanel col_5;
	public JPanel col_6;
	public JPanel col_7;
	public JPanel col_8;
	public JPanel col_9;
	public JPanel col_10;
	public JPanel col_11;
	public JPanel col_12;
	
	public JButton btnRemove1, btnRemove2, btnRemove3, btnRemove4, btnRemove5, btnRemove6, 
	btnRemove7, btnRemove8, btnRemove9, btnRemove10, btnRemove11, btnRemove12, btnRemove13;
	
	public JSpinner spinner = new JSpinner();
	public JSpinner spinner_1 = new JSpinner();
	public JSpinner spinner_2 = new JSpinner();
	public JSpinner spinner_3 = new JSpinner();
	public JSpinner spinner_4 = new JSpinner();
	public JSpinner spinner_5 = new JSpinner();
	public JSpinner spinner_6 = new JSpinner();
	public JSpinner spinner_7 = new JSpinner();
	public JSpinner spinner_8 = new JSpinner();
	public JSpinner spinner_9 = new JSpinner();
	public JSpinner spinner_10 = new JSpinner();
	public JSpinner spinner_11 = new JSpinner();
	public JSpinner spinner_12 = new JSpinner();
	
	double totalPrice = 0;
	double subPrice1 = 0;
	double subPrice2 = 0;
	double subPrice3 = 0;
	double subPrice4 = 0;
	double subPrice5 = 0;
	double subPrice6 = 0;
	double subPrice7 = 0;
	double subPrice8 = 0;
	double subPrice9 = 0;
	double subPrice10 = 0;
	double subPrice11 = 0;
	double subPrice12 = 0;
	double subPrice13 = 0;
	
	public JButton btnPayment;
	
	// Client Data
	int[] menuSelect = null;
	
	public void pause() throws InterruptedException {
		synchronized(this) {
			wait();
		}
	}
	
	public void release() throws InterruptedException {
		synchronized(this) {
			notifyAll();
		}
	}
	
	public void StartMenu() {
		
		// Object create
		
		JPanel panelRight;
		JPanel panelBottom;
		ImageIcon image;
		JLabel lblNewLabel;
		
		// Object
		frameMain = new JFrame();
		eatIn = new JRadioButton("Eat in");
		takeAway = new JRadioButton("Take Away");
				
		// Right Panel
		panelRight = new JPanel();
		panelRight.setBorder(new EmptyBorder(30, 30, 30, 70));
		panelRight.setLayout(new GridLayout(0 ,1 ));
		panelRight.add(eatIn);
		panelRight.add(takeAway);

		// Bottom Panel
		panelBottom = new JPanel();
		panelBottom.setBorder(new EmptyBorder(0, 0, 30, 0));
		btnStart = new JButton("Start");
		panelBottom.add(btnStart);
		panelBottom.setBorder(new EmptyBorder(0, 0, 0, 0));

		// Center
		image = new ImageIcon(getClass().getResource("/img/WelcomeMenu.png"));
		lblNewLabel = new JLabel(image);

		// Main Frame
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.setTitle("Welcome to the application");
		frameMain.setBounds(100, 100, 455, 305);
		frameMain.getContentPane().add(panelRight, BorderLayout.EAST);
		frameMain.getContentPane().add(panelBottom, BorderLayout.SOUTH);
		frameMain.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		
		// Action
		btnStart.addActionListener(this);
		eatIn.addActionListener(this);
		takeAway.addActionListener(this);
		
		frameMain.setVisible(true);
	}
	
	public void ItemSelection() {
		// Object create
		JPanel contentPane;
		
		// Button
		btnMenu1 = new JButton("Add Cart");
		btnMenu2 = new JButton("Add Cart");
		btnMenu3 = new JButton("Add Cart");
		btnMenu4 = new JButton("Add Cart");
		btnMenu5 = new JButton("Add Cart");
		btnMenu6 = new JButton("Add Cart");
		btnMenu7 = new JButton("Add Cart");
		btnMenu8 = new JButton("Add Cart");
		btnMenu9 = new JButton("Add Cart");
		btnMenu10 = new JButton("Add Cart");
		btnMenu11 = new JButton("Add Cart");
		btnMenu12 = new JButton("Add Cart");
		btnMenu13 = new JButton("Add Cart");
		btnCartList = new JButton("View Cart");
		
		frameMain2 = new JFrame();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTop = new JPanel();
		contentPane.add(panelTop, BorderLayout.NORTH);
		panelTop.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelTop.setBorder(new LineBorder(new Color(0, 0, 0)));
		JLabel lblTitle = new JLabel("Item Selection");
		panelTop.add(lblTitle);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new EmptyBorder(5, 0, 0, 0));
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel pnlAla = new JPanel();
		tabbedPane.addTab("Ala Carte", null, pnlAla, null);
		pnlAla.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 8.10", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlAla.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("McChicken");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item1.png")));
		panel_3.add(lblNewLabel_1, BorderLayout.CENTER);
		
		btnMenu1.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_3.add(btnMenu1, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 11.90", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlAla.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("Ayam Goreng McD Spicy (2pcs)");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_4.add(lblNewLabel_12, BorderLayout.NORTH);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item2.png")));
		panel_4.add(lblNewLabel_13, BorderLayout.CENTER);
		
		btnMenu2.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_4.add(btnMenu2, BorderLayout.SOUTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 30.20", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlAla.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_14 = new JLabel("Ayam Goreng McD Spicy (5pcs)");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_6.add(lblNewLabel_14, BorderLayout.NORTH);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item3.png")));
		panel_6.add(lblNewLabel_15, BorderLayout.CENTER);
		
		btnMenu3.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_6.add(btnMenu3, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 11.90", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlAla.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_16 = new JLabel("Spicy Chicken McDeluxe");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_7.add(lblNewLabel_16, BorderLayout.NORTH);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item4.png")));
		panel_7.add(lblNewLabel_17, BorderLayout.CENTER);
		
		btnMenu4.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_7.add(btnMenu4, BorderLayout.SOUTH);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 9.40", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlAla.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_18 = new JLabel("Chicken McNuggets (6pcs)");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_8.add(lblNewLabel_18, BorderLayout.NORTH);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item5.png")));
		panel_8.add(lblNewLabel_19, BorderLayout.CENTER);
		
		btnMenu5.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_8.add(btnMenu5, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 9.45", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlAla.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_20 = new JLabel("Double Cheeseburger");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_20, BorderLayout.NORTH);
		
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item6.png")));
		panel_5.add(lblNewLabel_21, BorderLayout.CENTER);
		
		btnMenu6.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_5.add(btnMenu6, BorderLayout.SOUTH);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 10.40", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlAla.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_22 = new JLabel("Big Mac");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_12.add(lblNewLabel_22, BorderLayout.NORTH);
		
		JLabel lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item7.png")));
		panel_12.add(lblNewLabel_23, BorderLayout.CENTER);
		
		btnMenu7.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_12.add(btnMenu7, BorderLayout.SOUTH);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 8.45", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		pnlAla.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_24 = new JLabel("Filet-O-Fish");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_13.add(lblNewLabel_24, BorderLayout.NORTH);
		
		JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item8.png")));
		panel_13.add(lblNewLabel_25, BorderLayout.CENTER);
		
		btnMenu8.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_13.add(btnMenu8, BorderLayout.SOUTH);
		
		JPanel pnlSuperValue = new JPanel();
		tabbedPane.addTab("Super Value Meal", null, pnlSuperValue, null);
		pnlSuperValue.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 13.20", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		pnlSuperValue.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("McChicken Meal (Medium)");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item9.png")));
		panel.add(lblNewLabel_7, BorderLayout.CENTER);
		
		btnMenu9.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel.add(btnMenu9, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 13.20", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		pnlSuperValue.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Chicken McNuggets 6pcs Meal (Medium)");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_1.add(lblNewLabel_8, BorderLayout.NORTH);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item10.png")));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_9, BorderLayout.CENTER);
		
		btnMenu10.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_1.add(btnMenu10, BorderLayout.SOUTH);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 13.00", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		pnlSuperValue.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("Filet-O-Fish Meal (Medium)");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_10.add(lblNewLabel_10, BorderLayout.NORTH);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item11.png")));
		panel_10.add(lblNewLabel_11, BorderLayout.CENTER);
		
		btnMenu11.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_10.add(btnMenu11, BorderLayout.SOUTH);
		
		JPanel panel_11 = new JPanel();
		pnlSuperValue.add(panel_11);
		
		JPanel pnlSundae = new JPanel();
		tabbedPane.addTab("Sundae", null, pnlSundae, null);
		pnlSundae.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel pnlStrwberry = new JPanel();
		pnlStrwberry.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 4.15", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlSundae.add(pnlStrwberry);
		pnlStrwberry.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Strawberry Sundae");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		pnlStrwberry.add(lblNewLabel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item13.png")));
		pnlStrwberry.add(lblNewLabel_3, BorderLayout.CENTER);
		
		btnMenu12.setFont(new Font("Tahoma", Font.BOLD, 10));
		pnlStrwberry.add(btnMenu12, BorderLayout.SOUTH);
		
		JPanel pnlChoco = new JPanel();
		pnlChoco.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "RM 4.15", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlSundae.add(pnlChoco);
		pnlChoco.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Chocolate Sundae");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		pnlChoco.add(lblNewLabel_4, BorderLayout.NORTH);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon(ItemSelection.class.getResource("/img/item14.png")));
		pnlChoco.add(lblNewLabel_5, BorderLayout.CENTER);
		
		btnMenu13.setFont(new Font("Tahoma", Font.BOLD, 10));
		pnlChoco.add(btnMenu13, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		pnlSundae.add(panel_2);
		
		JPanel panel_9 = new JPanel();
		pnlSundae.add(panel_9);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new EmptyBorder(5, 0, 5, 0));
		contentPane.add(panel_14, BorderLayout.SOUTH);
		panel_14.add(btnCartList);
	
		// Main Frame
		frameMain2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain2.setBounds(100, 100, 907, 601);
		frameMain2.setContentPane(contentPane);
		frameMain2.setVisible(true);
		
		// Action
		btnMenu1.addActionListener(this);
		btnMenu2.addActionListener(this);
		btnMenu3.addActionListener(this);
		btnMenu4.addActionListener(this);
		btnMenu5.addActionListener(this);
		btnMenu6.addActionListener(this);
		btnMenu7.addActionListener(this);
		btnMenu8.addActionListener(this);
		btnMenu9.addActionListener(this);
		btnMenu10.addActionListener(this);
		btnMenu11.addActionListener(this);
		btnMenu12.addActionListener(this);
		btnMenu13.addActionListener(this);
		btnCartList.addActionListener(this);
	}
	
	public void CartList() {
		
		// Object Create
		frameMenu3 = new JFrame();
		JPanel contentPane;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCL = new JPanel();
		contentPane.add(panelCL, BorderLayout.EAST);
		panelCL.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panelCL2 = new JPanel();
		panelCL.add(panelCL2);
		panelCL2.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel panelCL3 = new JPanel();
		panelCL2.add(panelCL3);
		
		JPanel panelCL4 = new JPanel();
		panelCL2.add(panelCL4);
		panelCL4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Total");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panelCL4.add(lblNewLabel_8, BorderLayout.NORTH);
		
		txtDisplay = new JTextField();
		txtDisplay.setEditable(false);
		txtDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		panelCL4.add(txtDisplay, BorderLayout.CENTER);
		txtDisplay.setColumns(10);
		
		JPanel panelCL5 = new JPanel();
		panelCL2.add(panelCL5);
		panelCL5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCard = new JLabel("Card No: ");
		lblCard.setHorizontalAlignment(SwingConstants.CENTER);
		panelCL5.add(lblCard);
		
		txtCardNo = new JTextField();
		panelCL5.add(txtCardNo);
		txtCardNo.setColumns(10);
		
		JPanel panelCL6 = new JPanel();
		panelCL2.add(panelCL6);
		
		btnPayment = new JButton("Payment");
		panelCL6.add(btnPayment);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel tableTitle = new JPanel();
		tableTitle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.setColumnHeaderView(tableTitle);
		tableTitle.setLayout(new GridLayout(0, 4, 20, 0));
		
		JLabel lblName = new JLabel("                          Name                    ");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		tableTitle.add(lblName);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		tableTitle.add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		tableTitle.add(lblQuantity);
		
		JLabel lblAction = new JLabel("Action");
		lblAction.setHorizontalAlignment(SwingConstants.CENTER);
		tableTitle.add(lblAction);
		
		itmAdd = new JPanel();
		itmAdd.setBorder(new LineBorder(Color.BLACK));
		scrollPane.setViewportView(itmAdd);
		itmAdd.setLayout(new GridLayout(13, 0, 10, 5));
		
		col = new JPanel();
		col.setBorder(new LineBorder(Color.BLACK));
		col.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblNewLabel = new JLabel("McChicken");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		col.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RM 8.10");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		col.add(lblNewLabel_1);
		
		col.add(spinner);
		
		btnRemove1 = new JButton("Remove");
		col.add(btnRemove1);
		
		col_1 = new JPanel();
		col_1.setBorder(new LineBorder(Color.BLACK));
		col_1.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblNewLabel_6 = new JLabel("Ayam Goreng McD Spicy (2pcs)");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		col_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("RM 11.90");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		col_1.add(lblNewLabel_1_1);
		
		col_1.add(spinner_1);
		
		btnRemove2 = new JButton("Remove");
		col_1.add(btnRemove2);
		
		col_2 = new JPanel();
		col_2.setBorder(new LineBorder(Color.BLACK));
		col_2.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Ayam Goreng McD Spicy (5pcs)");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		col_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1_2 = new JLabel("RM 30.20");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		col_2.add(lblNewLabel_1_2);
		
		col_2.add(spinner_2);
		
		btnRemove3 = new JButton("Remove");
		col_2.add(btnRemove3);
		
		col_3 = new JPanel();
		col_3.setBorder(new LineBorder(Color.BLACK));
		col_3.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblSpicyChickenMcdeluxe = new JLabel("Spicy Chicken McDeluxe");
		lblSpicyChickenMcdeluxe.setHorizontalAlignment(SwingConstants.CENTER);
		col_3.add(lblSpicyChickenMcdeluxe);
		
		JLabel lblNewLabel_1_3 = new JLabel("RM 11.90");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		col_3.add(lblNewLabel_1_3);
		
		col_3.add(spinner_3);
		
		btnRemove4 = new JButton("Remove");
		col_3.add(btnRemove4);
		
		col_4 = new JPanel();
		col_4.setBorder(new LineBorder(Color.BLACK));
		col_4.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblChickenMcnuggetspcs = new JLabel("Chicken McNuggets (6pcs)");
		lblChickenMcnuggetspcs.setHorizontalAlignment(SwingConstants.CENTER);
		col_4.add(lblChickenMcnuggetspcs);
		
		JLabel lblNewLabel_1_4 = new JLabel("RM 9.40");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		col_4.add(lblNewLabel_1_4);
		
		col_4.add(spinner_4);
		
		btnRemove5 = new JButton("Remove");
		col_4.add(btnRemove5);
		
		col_5 = new JPanel();
		col_5.setBorder(new LineBorder(Color.BLACK));
		col_5.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblDoubleCheeseburger = new JLabel("Double Cheeseburger");
		lblDoubleCheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
		col_5.add(lblDoubleCheeseburger);
		
		JLabel lblNewLabel_1_5 = new JLabel("RM 9.45");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		col_5.add(lblNewLabel_1_5);
		
		col_5.add(spinner_5);
		
		btnRemove6 = new JButton("Remove");
		col_5.add(btnRemove6);
		
		col_6 = new JPanel();
		col_6.setBorder(new LineBorder(Color.BLACK));
		col_6.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblBigMac = new JLabel("Big Mac");
		lblBigMac.setHorizontalAlignment(SwingConstants.CENTER);
		col_6.add(lblBigMac);
		
		JLabel lblNewLabel_1_6 = new JLabel("RM 10.40");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		col_6.add(lblNewLabel_1_6);
		
		col_6.add(spinner_6);
		
		btnRemove7 = new JButton("Remove");
		col_6.add(btnRemove7);
		
		col_7 = new JPanel();
		col_7.setBorder(new LineBorder(Color.BLACK));
		col_7.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblFiletofish = new JLabel("Filet-O-Fish");
		lblFiletofish.setHorizontalAlignment(SwingConstants.CENTER);
		col_7.add(lblFiletofish);
		
		JLabel lblNewLabel_1_7 = new JLabel("RM 8.45");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		col_7.add(lblNewLabel_1_7);
		
		col_7.add(spinner_7);
		
		btnRemove8 = new JButton("Remove");
		col_7.add(btnRemove8);
		
		col_8 = new JPanel();
		col_8.setBorder(new LineBorder(Color.BLACK));
		col_8.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblMcchickenMealmedium = new JLabel("McChicken Meal (Medium)");
		lblMcchickenMealmedium.setHorizontalAlignment(SwingConstants.CENTER);
		col_8.add(lblMcchickenMealmedium);
		
		JLabel lblNewLabel_1_8 = new JLabel("RM 13.20");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		col_8.add(lblNewLabel_1_8);
		
		col_8.add(spinner_8);
		
		btnRemove9 = new JButton("Remove");
		col_8.add(btnRemove9);
		
		col_9 = new JPanel();
		col_9.setBorder(new LineBorder(Color.BLACK));
		col_9.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblChickenMcnuggetspcs_1 = new JLabel("Chicken McNuggets 6pcs Meal (Medium)");
		lblChickenMcnuggetspcs_1.setHorizontalAlignment(SwingConstants.CENTER);
		col_9.add(lblChickenMcnuggetspcs_1);
		
		JLabel lblNewLabel_1_9 = new JLabel("RM 13.20");
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		col_9.add(lblNewLabel_1_9);
		
		col_9.add(spinner_9);
		
		btnRemove10 = new JButton("Remove");
		col_9.add(btnRemove10);
		
		col_10 = new JPanel();
		col_10.setBorder(new LineBorder(Color.BLACK));
		col_10.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblFiletofishMealmedium = new JLabel("Filet-O-Fish Meal (Medium)");
		lblFiletofishMealmedium.setHorizontalAlignment(SwingConstants.CENTER);
		col_10.add(lblFiletofishMealmedium);
		
		JLabel lblNewLabel_1_10 = new JLabel("RM 13.00");
		lblNewLabel_1_10.setHorizontalAlignment(SwingConstants.CENTER);
		col_10.add(lblNewLabel_1_10);
		
		col_10.add(spinner_10);
		
		btnRemove11 = new JButton("Remove");
		col_10.add(btnRemove11);
		
		col_11 = new JPanel();
		col_11.setBorder(new LineBorder(Color.BLACK));
		col_11.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblStrawberrySundae = new JLabel("Strawberry Sundae");
		lblStrawberrySundae.setHorizontalAlignment(SwingConstants.CENTER);
		col_11.add(lblStrawberrySundae);
		
		JLabel lblNewLabel_1_11 = new JLabel("RM 4.15");
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.CENTER);
		col_11.add(lblNewLabel_1_11);
		
		col_11.add(spinner_11);
		
		btnRemove12 = new JButton("Remove");
		col_11.add(btnRemove12);
		
		col_12 = new JPanel();
		col_12.setBorder(new LineBorder(Color.BLACK));
		col_12.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblChocolateSundae = new JLabel("Chocolate Sundae");
		lblChocolateSundae.setHorizontalAlignment(SwingConstants.CENTER);
		col_12.add(lblChocolateSundae);
		
		JLabel lblNewLabel_1_12 = new JLabel("RM 4.15");
		lblNewLabel_1_12.setHorizontalAlignment(SwingConstants.CENTER);
		col_12.add(lblNewLabel_1_12);
		
		col_12.add(spinner_12);
		
		btnRemove13 = new JButton("Remove");
		col_12.add(btnRemove13);
		new GridLayout(17, 0, 0, 0);
		
		// Frame
		frameMenu3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameMenu3.setBounds(100, 100, 774, 479);
		frameMenu3.setContentPane(contentPane);
		frameMenu3.setVisible(true);
		
		// Action
		btnRemove1.addActionListener(this);
		btnRemove2.addActionListener(this);
		btnRemove3.addActionListener(this);
		btnRemove4.addActionListener(this);
		btnRemove5.addActionListener(this);
		btnRemove6.addActionListener(this);
		btnRemove7.addActionListener(this);
		btnRemove8.addActionListener(this);
		btnRemove9.addActionListener(this);
		btnRemove10.addActionListener(this);
		btnRemove11.addActionListener(this);
		btnRemove12.addActionListener(this);
		btnRemove13.addActionListener(this);
		
		spinner.addChangeListener(this);
		spinner_1.addChangeListener(this);
		spinner_2.addChangeListener(this);
		spinner_3.addChangeListener(this);
		spinner_4.addChangeListener(this);
		spinner_5.addChangeListener(this);
		spinner_6.addChangeListener(this);
		spinner_7.addChangeListener(this);
		spinner_8.addChangeListener(this);
		spinner_9.addChangeListener(this);
		spinner_10.addChangeListener(this);
		spinner_11.addChangeListener(this);
		spinner_12.addChangeListener(this);
		
		btnPayment.addActionListener(this);
	}
	
	public String getSelection(){
		
		return selection;
	}
	
	public void setOrder() {
		
		item1.setItemProduct(1);
		item1.setName("McChicken");
		item1.setPrice((float) 8.1);
		
		item2.setItemProduct(2);
		item2.setName("Ayam Goreng McD Spicy (2pcs)");
		item2.setPrice((float) 11.9);
		
		item3.setItemProduct(3);
		item3.setName("Ayam Goreng McD Spicy (5pcs)");
		item3.setPrice((float) 30.2);
		
		item4.setItemProduct(4);
		item4.setName("Spicy Chicken McDeluxe");
		item4.setPrice((float) 11.9);
		
		item5.setItemProduct(5);
		item5.setName("Chicken McNuggets (6pcs)");
		item5.setPrice((float) 11.9);
		
		item6.setItemProduct(6);
		item6.setName("Double Cheeseburger");
		item6.setPrice((float) 9.45);
		
		item7.setItemProduct(7);
		item7.setName("Big Mac");
		item7.setPrice((float) 10.4);
		
		item8.setItemProduct(8);
		item8.setName("Filet-O-Fish");
		item8.setPrice((float) 8.45);
		
		item9.setItemProduct(9);
		item9.setName("McChicken Meal (Medium)");
		item9.setPrice((float) 13.2);
		
		item10.setItemProduct(10);
		item10.setName("Chicken McNuggets 6pcs Meal (Medium)");
		item10.setPrice((float) 13.2);
		
		item11.setItemProduct(11);
		item11.setName("Filet-O-Fish Meal (Medium)");
		item11.setPrice((float) 13);
		
		item12.setItemProduct(12);
		item12.setName("Strawberry Sundae");
		item12.setPrice((float) 4.15);
		
		item13.setItemProduct(13);
		item13.setName("Chocolate Sundae");
		item13.setPrice((float) 4.15);
	}

	/* this is Action Constructor */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// =================================== Main 1 (StartMenu)
		if (e.getSource() == eatIn) {
			takeAway.setSelected(false);
		}
		
		if (e.getSource() == takeAway) {
			eatIn.setSelected(false);
		}

		if (e.getSource() == btnStart ){

			if (takeAway.isSelected()) {
				selection = "Take Away";
			}

			else if (eatIn.isSelected()) {

				selection = "Eat in";
			}

			else {
				selection = "None";
			}

			getSelection();
			ItemSelection();
			frameMain.setVisible(false);
		}
		
		// ========================= Main 2 (ItemSlection)
		if (e.getSource() == btnMenu1) {
			btnMenu1.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu2) {
			btnMenu2.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu3) {
			btnMenu3.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu4) {
			btnMenu4.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu5) {
			btnMenu5.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu6) {
			btnMenu6.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu7) {
			btnMenu7.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu8) {
			btnMenu8.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu9) {
			btnMenu9.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu10) {
			btnMenu10.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu11) {
			btnMenu11.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu12) {
			btnMenu12.setEnabled(false);
		}
		
		if (e.getSource() == btnMenu13) {
			btnMenu13.setEnabled(false);
		}
		
		
		if (e.getSource() == btnCartList) {
			
			setOrder();
			CartList();	
			
			if (! btnMenu1.isEnabled()) {
				itmAdd.add(col);
			}
			
			if (! btnMenu2.isEnabled()) {
				itmAdd.add(col_1);
			}
			
			if (! btnMenu3.isEnabled()) {
				itmAdd.add(col_2);
			}
			
			if (! btnMenu4.isEnabled()) {
				itmAdd.add(col_3);
			}
			
			if (! btnMenu5.isEnabled()) {
				itmAdd.add(col_4);
			}
			
			if (! btnMenu6.isEnabled()) {
				itmAdd.add(col_5);
			}
			
			if (! btnMenu7.isEnabled()) {
				itmAdd.add(col_6);
			}
			
			if (! btnMenu8.isEnabled()) {
				itmAdd.add(col_7);
			}
			
			if (! btnMenu9.isEnabled()) {
				itmAdd.add(col_8);
			}
			
			if (! btnMenu10.isEnabled()) {
				itmAdd.add(col_9);
			}
			
			if (! btnMenu11.isEnabled()) {
				itmAdd.add(col_10);
			}
			
			if (! btnMenu12.isEnabled()) {
				itmAdd.add(col_11);
			}
			
			if (! btnMenu13.isEnabled()) {
				itmAdd.add(col_12);
			}
		}
		
		// ========================= Cartlist
		
		if (e.getSource() == btnRemove1) {
			itmAdd.remove(col);
			btnMenu1.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove2) {
			itmAdd.remove(col_1);
			btnMenu2.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove3) {
			itmAdd.remove(col_2);
			btnMenu3.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove4) {
			itmAdd.remove(col_3);
			btnMenu4.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove5) {
			itmAdd.remove(col_4);
			btnMenu5.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove6) {
			itmAdd.remove(col_5);
			btnMenu6.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove7) {
			itmAdd.remove(col_6);
			btnMenu7.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove8) {
			itmAdd.remove(col_7);
			btnMenu8.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove9) {
			itmAdd.remove(col_8);
			btnMenu9.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove10) {
			itmAdd.remove(col_9);
			btnMenu10.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove11) {
			itmAdd.remove(col_10);
			btnMenu11.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove12) {
			itmAdd.remove(col_11);
			btnMenu12.setEnabled(true);
		}
		
		if (e.getSource() == btnRemove13) {
			itmAdd.remove(col_12);
			btnMenu13.setEnabled(true);
		}
		
		// Payment Button
		if (e.getSource() == btnPayment) {
			if (txtCardNo.getText().length() == 12) {
				
				Complete complete = new Complete();
				complete.setVisible(true);
				
				try {
					release();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			else {
				Warning warning = new Warning();			
				warning.setVisible(true);
			}
		
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		ArrayList<OrderedItem> order = new ArrayList<OrderedItem>();
		
		if (e.getSource() == spinner) {
			double price = 8.10;
			int quantity = (Integer) spinner.getValue();
			subPrice1 = price * quantity;	
			
			OrderedItem orderItem1 = new OrderedItem();
			orderItem1.setOrderedItem(1);
			orderItem1.setItemProduct(item1);
			orderItem1.setQuantity(quantity);
			orderItem1.setSubTotalAmount((float) subPrice1);
			
			order.add(orderItem1);
		}
		
		if (e.getSource() == spinner_1) {
			double price = 11.90;
			int quantity = (Integer) spinner_1.getValue();
			subPrice2 = price * quantity;
			
			OrderedItem orderItem2 = new OrderedItem();
			orderItem2.setOrderedItem(2);
			orderItem2.setItemProduct(item2);
			orderItem2.setQuantity(quantity);
			orderItem2.setSubTotalAmount((float) subPrice2);
			
			order.add(orderItem2);
		}
		
		if (e.getSource() == spinner_2) {
			double price = 30.20;
			int quantity = (Integer) spinner_2.getValue();
			subPrice3 = price * quantity;	
			
			OrderedItem orderItem3 = new OrderedItem();
			orderItem3.setOrderedItem(3);
			orderItem3.setItemProduct(item3);
			orderItem3.setQuantity(quantity);
			orderItem3.setSubTotalAmount((float) subPrice3);
			
			order.add(orderItem3);
		}
		
		if (e.getSource() == spinner_3) {
			double price = 11.90;
			int quantity = (Integer) spinner_3.getValue();
			subPrice4 = price * quantity;	
			
			OrderedItem orderItem4 = new OrderedItem();
			orderItem4.setOrderedItem(4);
			orderItem4.setItemProduct(item4);
			orderItem4.setQuantity(quantity);
			orderItem4.setSubTotalAmount((float) subPrice4);
			
			order.add(orderItem4);
		}
		
		if (e.getSource() == spinner_4) {
			double price = 9.40;
			int quantity = (Integer) spinner_4.getValue();
			subPrice5 = price * quantity;	
			
			OrderedItem orderItem5 = new OrderedItem();
			orderItem5.setOrderedItem(5);
			orderItem5.setItemProduct(item5);
			orderItem5.setQuantity(quantity);
			orderItem5.setSubTotalAmount((float) subPrice5);
			
			order.add(orderItem5);
		}
		
		if (e.getSource() == spinner_5) {
			double price = 9.45;
			int quantity = (Integer) spinner_5.getValue();
			subPrice6 = price * quantity;	
			
			OrderedItem orderItem6 = new OrderedItem();
			orderItem6.setOrderedItem(6);
			orderItem6.setItemProduct(item6);
			orderItem6.setQuantity(quantity);
			orderItem6.setSubTotalAmount((float) subPrice6);
			
			order.add(orderItem6);
		}
		
		if (e.getSource() == spinner_6) {
			double price = 10.40;
			int quantity = (Integer) spinner_6.getValue();
			subPrice7 = price * quantity;	
			
			OrderedItem orderItem7 = new OrderedItem();
			orderItem7.setOrderedItem(7);
			orderItem7.setItemProduct(item7);
			orderItem7.setQuantity(quantity);
			orderItem7.setSubTotalAmount((float) subPrice7);
			
			order.add(orderItem7);
		}
		
		if (e.getSource() == spinner_7) {
			double price = 8.45;
			int quantity = (Integer) spinner_7.getValue();
			subPrice8 = price * quantity;	
			
			OrderedItem orderItem8 = new OrderedItem();
			orderItem8.setOrderedItem(8);
			orderItem8.setItemProduct(item8);
			orderItem8.setQuantity(quantity);
			orderItem8.setSubTotalAmount((float) subPrice8);
			
			order.add(orderItem8);
		}
		
		if (e.getSource() == spinner_8) {
			double price = 13.20;
			int quantity = (Integer) spinner_8.getValue();
			subPrice9 = price * quantity;	
			
			OrderedItem orderItem9 = new OrderedItem();
			orderItem9.setOrderedItem(9);
			orderItem9.setItemProduct(item9);
			orderItem9.setQuantity(quantity);
			orderItem9.setSubTotalAmount((float) subPrice9);
			
			order.add(orderItem9);
		}
		
		if (e.getSource() == spinner_9) {
			double price = 13.20;
			int quantity = (Integer) spinner_9.getValue();
			subPrice10 = price * quantity;	
			
			OrderedItem orderItem10 = new OrderedItem();
			orderItem10.setOrderedItem(10);
			orderItem10.setItemProduct(item10);
			orderItem10.setQuantity(quantity);
			orderItem10.setSubTotalAmount((float) subPrice10);
			
			order.add(orderItem10);
		}
		
		if (e.getSource() == spinner_10) {
			double price = 13.00;
			int quantity = (Integer) spinner_10.getValue();
			subPrice11 = price * quantity;	
			
			OrderedItem orderItem11 = new OrderedItem();
			orderItem11.setOrderedItem(11);
			orderItem11.setItemProduct(item11);
			orderItem11.setQuantity(quantity);
			orderItem11.setSubTotalAmount((float) subPrice11);
			
			order.add(orderItem11);
		}
		
		if (e.getSource() == spinner_11) {
			double price = 4.15;
			int quantity = (Integer) spinner_11.getValue();
			subPrice12 = price * quantity;	
			
			OrderedItem orderItem12 = new OrderedItem();
			orderItem12.setOrderedItem(12);
			orderItem12.setItemProduct(item12);
			orderItem12.setQuantity(quantity);
			orderItem12.setSubTotalAmount((float) subPrice12);
			
			order.add(orderItem12);
		}
		
		if (e.getSource() == spinner_12) {
			double price = 4.15;
			int quantity = (Integer) spinner_12.getValue();
			subPrice13 = price * quantity;	
			
			OrderedItem orderItem13 = new OrderedItem();
			orderItem13.setOrderedItem(13);
			orderItem13.setItemProduct(item13);
			orderItem13.setQuantity(quantity);
			orderItem13.setSubTotalAmount((float) subPrice13);
			
			order.add(orderItem13);
		}
		
		totalPrice = subPrice1 + subPrice2 + subPrice3 + subPrice4 + subPrice5 + subPrice6 + subPrice7 + subPrice8 + subPrice9 + subPrice10 + 
				subPrice11 + subPrice12 + subPrice13;
		
		txtDisplay.setText("RM " + String.format("%.2f", totalPrice));	
		
		customerOrder.setOrderId(1);
		customerOrder.setOrderReferenceNumber(1000);
		customerOrder.setOrderedItems(order);
		customerOrder.setTotalAmount((float) totalPrice);
	}
	
	
	
	public ArrayList<OrderedItem> unknown(){
		
		return (ArrayList<OrderedItem>) customerOrder.getOrderedItems();
	}
}
