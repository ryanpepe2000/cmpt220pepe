package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BankingClasses.AccountHolder;
import HibernateClasses.Authentification;
import HibernateClasses.MakeQuery;
import HibernateClasses.SaveAccountHolder;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class BankingApp extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField dobField;
	private JTextField usernameField2;
	private JPasswordField passwordField2;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankingApp frame = new BankingApp();
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
	public BankingApp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BankingApp.class.getResource("/com/sun/javafx/scene/web/skin/Bold_16x16_JFX.png")));
		setTitle("Banking Application");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 641, 376);
		contentPane.add(tabbedPane);
		
		JPanel loginPanel = new JPanel();
		tabbedPane.addTab("Login", null, loginPanel, null);
		loginPanel.setLayout(null);
		
		JLabel lbl1 = new JLabel("Username");
		lbl1.setBounds(181, 126, 87, 14);
		loginPanel.add(lbl1);
		
		JLabel lbl2 = new JLabel("Password");
		lbl2.setBounds(181, 168, 87, 14);
		loginPanel.add(lbl2);
		
		usernameField = new JTextField();
		usernameField.setBounds(278, 123, 134, 20);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(278, 165, 134, 20);
		loginPanel.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
				// Stores username and password fields
				String uname = usernameField.getText();
				String pass = passwordField.getText();
				
				// Authenticates username/password combination
				if (Authentification.verifyCredentials(uname, pass)) {
					AccountHolder user = MakeQuery.acctHolderQuery("from AccountHolder a where a.username='"+uname+"'")[0];
					JOptionPane.showMessageDialog(contentPane, "Success");
					UserGui.newScreen(user);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Error: Invalid Credentials");
				}
			}
		});
		btnLogin.setBounds(252, 248, 89, 23);
		loginPanel.add(btnLogin);
		
		JLabel lbl3 = new JLabel("Banking Application");
		lbl3.setForeground(Color.RED);
		lbl3.setFont(new Font("Century", Font.BOLD, 18));
		lbl3.setBounds(196, 36, 304, 53);
		loginPanel.add(lbl3);
		
		JPanel createAccountPanel = new JPanel();
		tabbedPane.addTab("Create Account", null, createAccountPanel, null);
		createAccountPanel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(44, 87, 83, 14);
		createAccountPanel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(44, 129, 83, 14);
		createAccountPanel.add(lblLastName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth ");
		lblDateOfBirth.setToolTipText("");
		lblDateOfBirth.setBounds(44, 166, 83, 14);
		createAccountPanel.add(lblDateOfBirth);
		
		firstNameField = new JTextField();
		firstNameField.setBounds(134, 84, 154, 20);
		createAccountPanel.add(firstNameField);
		firstNameField.setColumns(10);
		
		lastNameField = new JTextField();
		lastNameField.setColumns(10);
		lastNameField.setBounds(134, 126, 154, 20);
		createAccountPanel.add(lastNameField);
		
		dobField = new JTextField();
		dobField.setText("YYYY-MM-DD");
		dobField.setColumns(10);
		dobField.setBounds(134, 163, 154, 20);
		createAccountPanel.add(dobField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(331, 87, 83, 14);
		createAccountPanel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(331, 129, 83, 14);
		createAccountPanel.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(331, 166, 83, 14);
		createAccountPanel.add(lblEmail);
		
		usernameField2 = new JTextField();
		usernameField2.setColumns(10);
		usernameField2.setBounds(424, 84, 154, 20);
		createAccountPanel.add(usernameField2);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBounds(424, 126, 154, 20);
		createAccountPanel.add(passwordField2);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(424, 163, 154, 20);
		createAccountPanel.add(emailField);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					String fName = firstNameField.getText();
					if (fName.contentEquals("")) {
						JOptionPane.showMessageDialog(contentPane, "Error: First name field is empty");
						throw new Exception("First name is empty");
					}
					String lName = lastNameField.getText();
					if (lName.contentEquals("")) {
						JOptionPane.showMessageDialog(contentPane, "Error: Last name field is empty");
						throw new Exception("Last name is empty");
					}
					Date dob = Date.valueOf(dobField.getText());
					String username = usernameField2.getText();
					if (username.contentEquals("")) {
						JOptionPane.showMessageDialog(contentPane, "Error: Username field is empty");
						throw new Exception("Username is empty");
					}
					String password = passwordField2.getText();
					if (password.contentEquals("")) {
						JOptionPane.showMessageDialog(contentPane, "Error: Password field is empty");
						throw new Exception("Password field is empty");
					}
					String email = emailField.getText();
					if (email.contentEquals("")) {
						JOptionPane.showMessageDialog(contentPane, "Error: Email field is empty");
						throw new Exception("Email field is empty");
					}
					AccountHolder temp = new AccountHolder(fName, lName, dob, username, password, email);
					SaveAccountHolder.save(temp);
					JOptionPane.showMessageDialog(contentPane, "Success. Account created.");
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Failure. Username is already taken.");
				}
			}
		});
		btnCreateAccount.setBounds(229, 243, 154, 23);
		createAccountPanel.add(btnCreateAccount);
		
		JLabel lblpleaseEnsureThat = new JLabel("**Please ensure that all fields are filled and proper formatting is used for the date of birth. ");
		lblpleaseEnsureThat.setBounds(55, 323, 534, 14);
		createAccountPanel.add(lblpleaseEnsureThat);
	}
}
