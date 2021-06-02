package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class StartMenu {

	// Object create
	private JFrame frame;
	private JPanel panelRight;
	private JPanel panelBottom;
	private JButton btnStart;
	private ImageIcon image;
	private JLabel lblNewLabel;
	
	// Declaration
	String selection = null;

	/**
	 * Create the application.
	 */
	public StartMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Object
		frame = new JFrame();
		JRadioButton eatIn = new JRadioButton("Eat in");
		JRadioButton takeAway = new JRadioButton("Take Away");
		
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Welcome to the application");
		frame.setBounds(150, 150, 455, 305);
		frame.getContentPane().add(panelRight, BorderLayout.EAST);
		frame.getContentPane().add(panelBottom, BorderLayout.SOUTH);
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		frame.setVisible(true);
		
		// Action Handler
		eatIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				takeAway.setSelected(false);
			}
		});
		
		takeAway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eatIn.setSelected(false);
			}
		});
		
		btnStart.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
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
						
				
				ItemSelection itemSelection = new ItemSelection();
				itemSelection.show();
				
				
			}
		});
		
		
	}
	
	public String getSelection(){
		return selection;
	}
}
