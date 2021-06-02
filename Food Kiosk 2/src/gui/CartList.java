package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class CartList extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	private JTextField txtCardNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartList frame = new CartList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CartList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 150, 894, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
		
		JButton btnPayment = new JButton("Payment");
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
		
		JPanel item = new JPanel();
		item.setBorder(new LineBorder(Color.BLACK));
		scrollPane.setViewportView(item);
		item.setLayout(new GridLayout(13, 0, 10, 5));
		
		JPanel col = new JPanel();
		col.setBorder(new LineBorder(Color.BLACK));
		item.add(col);
		col.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblNewLabel = new JLabel("McChicken");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		col.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RM 8.10");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		col.add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		col.add(spinner);
		
		JButton btnNewButton_1 = new JButton("Remove");
		col.add(btnNewButton_1);
		
		JPanel col_1 = new JPanel();
		col_1.setBorder(new LineBorder(Color.BLACK));
		item.add(col_1);
		col_1.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblNewLabel_6 = new JLabel("Ayam Goreng McD Spicy (2pcs)");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		col_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("RM 11.90");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		col_1.add(lblNewLabel_1_1);
		
		JSpinner spinner_1 = new JSpinner();
		col_1.add(spinner_1);
		
		JButton btnNewButton_1_1 = new JButton("Remove");
		col_1.add(btnNewButton_1_1);
		
		JPanel col_2 = new JPanel();
		col_2.setBorder(new LineBorder(Color.BLACK));
		item.add(col_2);
		col_2.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Ayam Goreng McD Spicy (5pcs)");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		col_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1_2 = new JLabel("RM 30.20");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		col_2.add(lblNewLabel_1_2);
		
		JSpinner spinner_2 = new JSpinner();
		col_2.add(spinner_2);
		
		JButton btnNewButton_1_2 = new JButton("Remove");
		col_2.add(btnNewButton_1_2);
		
		JPanel col_3 = new JPanel();
		col_3.setBorder(new LineBorder(Color.BLACK));
		item.add(col_3);
		col_3.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblSpicyChickenMcdeluxe = new JLabel("Spicy Chicken McDeluxe");
		lblSpicyChickenMcdeluxe.setHorizontalAlignment(SwingConstants.CENTER);
		col_3.add(lblSpicyChickenMcdeluxe);
		
		JLabel lblNewLabel_1_3 = new JLabel("RM 11.90");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		col_3.add(lblNewLabel_1_3);
		
		JSpinner spinner_3 = new JSpinner();
		col_3.add(spinner_3);
		
		JButton btnNewButton_1_3 = new JButton("Remove");
		col_3.add(btnNewButton_1_3);
		
		JPanel col_4 = new JPanel();
		col_4.setBorder(new LineBorder(Color.BLACK));
		item.add(col_4);
		col_4.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblChickenMcnuggetspcs = new JLabel("Chicken McNuggets (6pcs)");
		lblChickenMcnuggetspcs.setHorizontalAlignment(SwingConstants.CENTER);
		col_4.add(lblChickenMcnuggetspcs);
		
		JLabel lblNewLabel_1_4 = new JLabel("RM 9.40");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		col_4.add(lblNewLabel_1_4);
		
		JSpinner spinner_4 = new JSpinner();
		col_4.add(spinner_4);
		
		JButton btnNewButton_1_4 = new JButton("Remove");
		col_4.add(btnNewButton_1_4);
		
		JPanel col_5 = new JPanel();
		col_5.setBorder(new LineBorder(Color.BLACK));
		item.add(col_5);
		col_5.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblDoubleCheeseburger = new JLabel("Double Cheeseburger");
		lblDoubleCheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
		col_5.add(lblDoubleCheeseburger);
		
		JLabel lblNewLabel_1_5 = new JLabel("RM 9.45");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		col_5.add(lblNewLabel_1_5);
		
		JSpinner spinner_5 = new JSpinner();
		col_5.add(spinner_5);
		
		JButton btnNewButton_1_5 = new JButton("Remove");
		col_5.add(btnNewButton_1_5);
		
		JPanel col_6 = new JPanel();
		col_6.setBorder(new LineBorder(Color.BLACK));
		item.add(col_6);
		col_6.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblBigMac = new JLabel("Big Mac");
		lblBigMac.setHorizontalAlignment(SwingConstants.CENTER);
		col_6.add(lblBigMac);
		
		JLabel lblNewLabel_1_6 = new JLabel("RM 10.40");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		col_6.add(lblNewLabel_1_6);
		
		JSpinner spinner_6 = new JSpinner();
		col_6.add(spinner_6);
		
		JButton btnNewButton_1_6 = new JButton("Remove");
		col_6.add(btnNewButton_1_6);
		
		JPanel col_7 = new JPanel();
		col_7.setBorder(new LineBorder(Color.BLACK));
		item.add(col_7);
		col_7.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblFiletofish = new JLabel("Filet-O-Fish");
		lblFiletofish.setHorizontalAlignment(SwingConstants.CENTER);
		col_7.add(lblFiletofish);
		
		JLabel lblNewLabel_1_7 = new JLabel("RM 8.45");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		col_7.add(lblNewLabel_1_7);
		
		JSpinner spinner_7 = new JSpinner();
		col_7.add(spinner_7);
		
		JButton btnNewButton_1_7 = new JButton("Remove");
		col_7.add(btnNewButton_1_7);
		
		JPanel col_8 = new JPanel();
		col_8.setBorder(new LineBorder(Color.BLACK));
		item.add(col_8);
		col_8.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblMcchickenMealmedium = new JLabel("McChicken Meal (Medium)");
		lblMcchickenMealmedium.setHorizontalAlignment(SwingConstants.CENTER);
		col_8.add(lblMcchickenMealmedium);
		
		JLabel lblNewLabel_1_8 = new JLabel("RM 13.20");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		col_8.add(lblNewLabel_1_8);
		
		JSpinner spinner_8 = new JSpinner();
		col_8.add(spinner_8);
		
		JButton btnNewButton_1_8 = new JButton("Remove");
		col_8.add(btnNewButton_1_8);
		
		JPanel col_9 = new JPanel();
		col_9.setBorder(new LineBorder(Color.BLACK));
		item.add(col_9);
		col_9.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblChickenMcnuggetspcs_1 = new JLabel("Chicken McNuggets 6pcs Meal (Medium)");
		lblChickenMcnuggetspcs_1.setHorizontalAlignment(SwingConstants.CENTER);
		col_9.add(lblChickenMcnuggetspcs_1);
		
		JLabel lblNewLabel_1_9 = new JLabel("RM 13.20");
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		col_9.add(lblNewLabel_1_9);
		
		JSpinner spinner_9 = new JSpinner();
		col_9.add(spinner_9);
		
		JButton btnNewButton_1_9 = new JButton("Remove");
		col_9.add(btnNewButton_1_9);
		
		JPanel col_10 = new JPanel();
		col_10.setBorder(new LineBorder(Color.BLACK));
		item.add(col_10);
		col_10.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblFiletofishMealmedium = new JLabel("Filet-O-Fish Meal (Medium)");
		lblFiletofishMealmedium.setHorizontalAlignment(SwingConstants.CENTER);
		col_10.add(lblFiletofishMealmedium);
		
		JLabel lblNewLabel_1_10 = new JLabel("RM 13.00");
		lblNewLabel_1_10.setHorizontalAlignment(SwingConstants.CENTER);
		col_10.add(lblNewLabel_1_10);
		
		JSpinner spinner_10 = new JSpinner();
		col_10.add(spinner_10);
		
		JButton btnNewButton_1_10 = new JButton("Remove");
		col_10.add(btnNewButton_1_10);
		
		JPanel col_11 = new JPanel();
		col_11.setBorder(new LineBorder(Color.BLACK));
		item.add(col_11);
		col_11.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblStrawberrySundae = new JLabel("Strawberry Sundae");
		lblStrawberrySundae.setHorizontalAlignment(SwingConstants.CENTER);
		col_11.add(lblStrawberrySundae);
		
		JLabel lblNewLabel_1_11 = new JLabel("RM 4.15");
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.CENTER);
		col_11.add(lblNewLabel_1_11);
		
		JSpinner spinner_11 = new JSpinner();
		col_11.add(spinner_11);
		
		JButton btnNewButton_1_11 = new JButton("Remove");
		col_11.add(btnNewButton_1_11);
		
		JPanel col_12 = new JPanel();
		col_12.setBorder(new LineBorder(Color.BLACK));
		item.add(col_12);
		col_12.setLayout(new GridLayout(0, 4, 10, 0));
		
		JLabel lblChocolateSundae = new JLabel("Chocolate Sundae");
		lblChocolateSundae.setHorizontalAlignment(SwingConstants.CENTER);
		col_12.add(lblChocolateSundae);
		
		JLabel lblNewLabel_1_12 = new JLabel("RM 4.15");
		lblNewLabel_1_12.setHorizontalAlignment(SwingConstants.CENTER);
		col_12.add(lblNewLabel_1_12);
		
		JSpinner spinner_12 = new JSpinner();
		col_12.add(spinner_12);
		
		JButton btnNewButton_1_12 = new JButton("Remove");
		col_12.add(btnNewButton_1_12);
		new GridLayout(17, 0, 0, 0);
	}
}
