package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BankingClasses.Account;
import BankingClasses.AccountHolder;
import BankingClasses.CheckingAccount;
import BankingClasses.SavingsAccount;
import HibernateClasses.AccountsTableModel;
import HibernateClasses.MakeQuery;
import HibernateClasses.SaveAccount;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Toolkit;

public class UserGui extends JFrame {

	private JPanel contentPane;
	private JTextField balanceField;
	private JTable table;
	private JTextField acctIdField;
	private JTextField withdrawAmtField;
	private JTextField acctIdField2;
	private JTextField depositAmtField;
	private JTextField transferFromField;
	private JTextField transferToField;
	private JTextField amtField;

	/**
	 * Launch the application.
	 */
	public static void newScreen(AccountHolder mainUser) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGui frame = new UserGui(mainUser);
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
	
	public UserGui(AccountHolder mainUser) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UserGui.class.getResource("/com/sun/javafx/scene/web/skin/Bold_16x16_JFX.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 631, 366);
		contentPane.add(tabbedPane);
		
		JPanel addAcctPanel = new JPanel();
		tabbedPane.addTab("Add Account", null, addAcctPanel, null);
		addAcctPanel.setLayout(null);
		
		// Creates a new savings account and uploads the information to the database
		JButton savingsAcctButton = new JButton("Create Savings Account");
		savingsAcctButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double balance = new Double(balanceField.getText());
					SavingsAccount temp = new SavingsAccount(balance, mainUser);
					SaveAccount.save(temp);
					JOptionPane.showMessageDialog(contentPane, "Success. Savings Account created.");
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Failure.");
				}
			}
		});
		savingsAcctButton.setBounds(79, 247, 189, 23);
		addAcctPanel.add(savingsAcctButton);
		
		// Creates a new checking account and uploads the information to the database
		JButton checkingAcctButon = new JButton("Create Checking Account");
		checkingAcctButon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double balance = new Double(balanceField.getText());
					CheckingAccount temp = new CheckingAccount(balance, mainUser);
					SaveAccount.save(temp);
					JOptionPane.showMessageDialog(contentPane, "Success. Checking Account created.");
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Failure.");
				}
			}
		});
		checkingAcctButon.setBounds(352, 247, 189, 23);
		addAcctPanel.add(checkingAcctButon);
		
		JLabel lblInitialBalance = new JLabel("Initial Balance:");
		lblInitialBalance.setBounds(79, 84, 105, 14);
		addAcctPanel.add(lblInitialBalance);
		
		balanceField = new JTextField();
		balanceField.setBounds(241, 81, 110, 20);
		addAcctPanel.add(balanceField);
		balanceField.setColumns(10);
		
		JTextPane txtpnContactASystem = new JTextPane();
		txtpnContactASystem.setText("We allow each user to create as many bank accounts as one wishes!\r\nPlease contact a system administrator to make changes to existing accounts");
		txtpnContactASystem.setBounds(79, 136, 462, 55);
		addAcctPanel.add(txtpnContactASystem);
		
		JPanel withdrawPanel = new JPanel();
		tabbedPane.addTab("Withdraw", null, withdrawPanel, null);
		withdrawPanel.setLayout(null);
		
		acctIdField = new JTextField();
		acctIdField.setBounds(138, 79, 86, 20);
		withdrawPanel.add(acctIdField);
		acctIdField.setColumns(10);
		
		JLabel lblAccountId = new JLabel("Account ID");
		lblAccountId.setBounds(51, 82, 77, 14);
		withdrawPanel.add(lblAccountId);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(51, 140, 46, 14);
		withdrawPanel.add(lblAmount);
		
		withdrawAmtField = new JTextField();
		withdrawAmtField.setBounds(138, 137, 86, 20);
		withdrawPanel.add(withdrawAmtField);
		withdrawAmtField.setColumns(10);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Integer acctId = new Integer(acctIdField.getText());
					Double ammount = new Double(withdrawAmtField.getText());
					Account temp = MakeQuery.retrieveAccount(acctId);
					//Checks to see if the user has access to the account whose ID was input
					if (mainUser.getUsername().compareTo(temp.getAccountHolder().getUsername()) == 0) {
						temp.withdraw(ammount);
						double newBal = temp.getBalance();
						MakeQuery.updateBalance(acctId, newBal);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Error. Ensure you have entered a valid account ID.");
				}
			}
		});
		btnWithdraw.setBounds(250, 265, 89, 23);
		withdrawPanel.add(btnWithdraw);
		
		
		
		JTextPane txtpnnoticeAllChecking = new JTextPane();
		txtpnnoticeAllChecking.setEditable(false);
		txtpnnoticeAllChecking.setText("**Notice**\r\nAll checking accounts have a standard overdraft limit of $5000");
		txtpnnoticeAllChecking.setBounds(363, 79, 177, 75);
		withdrawPanel.add(txtpnnoticeAllChecking);

		
		JPanel depositPanel = new JPanel();
		tabbedPane.addTab("Deposit", null, depositPanel, null);
		depositPanel.setLayout(null);
		
		acctIdField2 = new JTextField();
		acctIdField2.setColumns(10);
		acctIdField2.setBounds(138, 79, 86, 20);
		depositPanel.add(acctIdField2);
		
		JLabel label = new JLabel("Account ID");
		label.setBounds(51, 82, 77, 14);
		depositPanel.add(label);
		
		JLabel label_1 = new JLabel("Amount");
		label_1.setBounds(51, 140, 46, 14);
		depositPanel.add(label_1);
		
		depositAmtField = new JTextField();
		depositAmtField.setColumns(10);
		depositAmtField.setBounds(138, 137, 86, 20);
		depositPanel.add(depositAmtField);
		
		JButton depositButton = new JButton("Deposit");
		depositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Integer acctId = new Integer(acctIdField2.getText());
					Double ammount = new Double(depositAmtField.getText());
					Account temp = MakeQuery.retrieveAccount(acctId);
					//Ensures that the user has access to the account ID
					if (mainUser.getUsername().compareTo(temp.getAccountHolder().getUsername()) == 0) {
						temp.deposit(ammount);
						double newBal = temp.getBalance();
						MakeQuery.updateBalance(acctId, newBal);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Error. Ensure that you entered a valid account ID.");
				}
			}
		});
		depositButton.setBounds(250, 265, 89, 23);
		depositPanel.add(depositButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("**Notice**\r\nAll checking accounts have a standard overdraft limit of $5000");
		textPane.setEditable(false);
		textPane.setBounds(363, 79, 177, 75);
		depositPanel.add(textPane);
		
		JPanel transferPanel = new JPanel();
		tabbedPane.addTab("Transfer", null, transferPanel, null);
		transferPanel.setLayout(null);
		
		transferFromField = new JTextField();
		transferFromField.setColumns(10);
		transferFromField.setBounds(138, 72, 86, 20);
		transferPanel.add(transferFromField);
		
		JLabel lblTransferFrom = new JLabel("Transfer From:");
		lblTransferFrom.setBounds(51, 75, 101, 14);
		transferPanel.add(lblTransferFrom);
		
		JLabel lblTransferTo = new JLabel("Transfer To:");
		lblTransferTo.setBounds(51, 133, 101, 14);
		transferPanel.add(lblTransferTo);
		
		transferToField = new JTextField();
		transferToField.setColumns(10);
		transferToField.setBounds(138, 130, 86, 20);
		transferPanel.add(transferToField);
		
		JButton transferButton = new JButton("Transfer");
		transferButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Integer acctId1 = new Integer(transferFromField.getText());
					Integer acctId2 = new Integer(transferToField.getText());
					Double ammount = new Double(amtField.getText());
					Account temp1 = MakeQuery.retrieveAccount(acctId1);
					Account temp2 = MakeQuery.retrieveAccount(acctId2);
					// Ensures that the user has access to both account IDs
					if (mainUser.getUsername().compareTo(temp1.getAccountHolder().getUsername()) == 0 && 
							mainUser.getUsername().compareTo(temp2.getAccountHolder().getUsername()) == 0) {
						Account.transfer(temp1, temp2, ammount);
						double newBal1 = temp1.getBalance();
						double newBal2 = temp2.getBalance();
						MakeQuery.updateBalance(acctId1, newBal1);
						MakeQuery.updateBalance(acctId2, newBal2);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane, "Error. Ensure that you entered valid account IDs");
				}
			}
		});
		transferButton.setBounds(250, 265, 89, 23);
		transferPanel.add(transferButton);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("**Notice**\r\nAll checking accounts have a standard overdraft limit of $5000");
		textPane_1.setEditable(false);
		textPane_1.setBounds(363, 79, 177, 75);
		transferPanel.add(textPane_1);
		
		JLabel lblAccountId_1 = new JLabel("Account ID");
		lblAccountId_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblAccountId_1.setBounds(51, 48, 69, 14);
		transferPanel.add(lblAccountId_1);
		
		JLabel lblNewLabel = new JLabel("Amount");
		lblNewLabel.setBounds(51, 185, 69, 14);
		transferPanel.add(lblNewLabel);
		
		amtField = new JTextField();
		amtField.setBounds(138, 182, 86, 20);
		transferPanel.add(amtField);
		amtField.setColumns(10);
		
		JPanel checkAcctsPanel = new JPanel();
		tabbedPane.addTab("Check Accounts", null, checkAcctsPanel, null);
		checkAcctsPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 32, 626, 306);
		checkAcctsPanel.add(scrollPane);
		
		table = new JTable();
		table.setModel(AccountsTableModel.accountModel(mainUser));
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table.setDefaultRenderer(String.class, centerRenderer);
		table.setDefaultRenderer(Object.class, centerRenderer);
		scrollPane.setViewportView(table);
		
		// REFRESH BUTTON MAKES ANOTHER QUERY THAT WILL BE SAVED AS AN OBJECT[][] AND SET TO BE A DEFAULTTABLEMODEL
		JButton refreshButton = new JButton("Refresh");
		refreshButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setModel(AccountsTableModel.accountModel(mainUser));
				DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
				centerRenderer.setHorizontalAlignment( JLabel.CENTER );
				table.setDefaultRenderer(String.class, centerRenderer);
			}
		});
		refreshButton.setBounds(0, -2, 626, 35);
		checkAcctsPanel.add(refreshButton);
	}
}

