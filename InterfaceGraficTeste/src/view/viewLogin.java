package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class viewLogin {

	private JFrame frame;
	private JTextField textLogin;
	private JPasswordField textKey;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { // "Windows" "Metal"
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewLogin window = new viewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public viewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 420, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Email/Nome");
		lblLogin.setBounds(128, 98, 100, 13);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(128, 167, 45, 13);
		frame.getContentPane().add(lblSenha);
		
		textLogin = new JTextField();
		textLogin.setBounds(128, 121, 150, 25);
		frame.getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CheckLogin(textLogin.getText(), new String(textKey.getPassword()))) {
					JOptionPane.showMessageDialog(null, "Bem vindo ao sistema!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Dados inválidos!", "Título", JOptionPane.ERROR_MESSAGE);
					//JOptionPane.INFORMATION_MESSAGE JOptionPane.WARNING_MESSAGE
				}
			}
		});
		btnLogin.setBounds(160, 232, 85, 30);
		frame.getContentPane().add(btnLogin);
		
		textKey = new JPasswordField();
		textKey.setBounds(128, 192, 150, 25);
		frame.getContentPane().add(textKey);
	}
	
	public boolean CheckLogin(String log, String key) {
		
		return log.equals("usuario") && key.equals("123");
	}
}
