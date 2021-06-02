package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Font;

@SuppressWarnings("serial")
public class ItemSelection extends JFrame implements ActionListener {

	// Object create
	private JPanel contentPane;
	
	// Declaration
	String buttonTest = null;
	
	// Button
	private JButton btnMenu1;
	private JButton btnMenu2 = new JButton("Add Cart");
	private JButton btnMenu3 = new JButton("Add Cart");
	private JButton btnMenu4 = new JButton("Add Cart");
	private JButton btnMenu5 = new JButton("Add Cart");
	private JButton btnMenu6 = new JButton("Add Cart");
	private JButton btnMenu7 = new JButton("Add Cart");
	private JButton btnMenu8 = new JButton("Add Cart");
	private JButton btnMenu9 = new JButton("Add Cart");
	private JButton btnMenu10 = new JButton("Add Cart");
	private JButton btnMenu11 = new JButton("Add Cart");
	private JButton btnMenu12 = new JButton("Add Cart");
	private JButton btnMenu13 = new JButton("Add Cart");
	private JButton btnCartList = new JButton("View Cart");
	
	
	
	/**
	 * Create the frame and start.
	 */
	public ItemSelection() {
		initialize();
	}
	
	private void initialize() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 150, 907, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
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
		
		btnMenu1 = new JButton("Add Cart");
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
		
		btnMenu1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnMenu1) {
			buttonTest = "Button 1 Clicked";
		}
		
		else {
			buttonTest = "Button null";
		}	
		
		getButton();
	}
	
	public String getButton() {
		return buttonTest;
	}
}
