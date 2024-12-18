package view;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import view.ViewFirst.SwingAction;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameInterface {

	private JFrame frame;
	private JTextField textCreatePerson;
	private JTextField textField_1;
	private final Action action = new SwingAction();
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Metal".equals(info.getName())) { // "Windows" "Metal"
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
					GameInterface window = new GameInterface();
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
	public GameInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 729, 616);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("A Jornada Épica");
		lblTitulo.setForeground(new Color(0, 0, 255));
		lblTitulo.setBackground(Color.BLACK);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(224, 46, 234, 24);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblCreatePerson = new JLabel("Nome Personagem:");
		lblCreatePerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCreatePerson.setBounds(148, 100, 164, 19);
		frame.getContentPane().add(lblCreatePerson);
		
		textCreatePerson = new JTextField();
		textCreatePerson.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textCreatePerson.setBounds(300, 102, 117, 19);
		frame.getContentPane().add(textCreatePerson);
		textCreatePerson.setColumns(10);
		
		JButton btnCreatePerson = new JButton("Criar");
		btnCreatePerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCreatePerson.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCreatePerson.setBounds(439, 101, 85, 21);
		frame.getContentPane().add(btnCreatePerson);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStatus.setBounds(118, 149, 85, 19);
		frame.getContentPane().add(lblStatus);
		
		JLabel lblInformaoDeStatus = new JLabel("Informação de Status");
		lblInformaoDeStatus.setBackground(Color.BLACK);
		lblInformaoDeStatus.setVerticalAlignment(SwingConstants.TOP);
		lblInformaoDeStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformaoDeStatus.setBounds(26, 178, 262, 156);
		frame.getContentPane().add(lblInformaoDeStatus);
		
		JLabel lblAco = new JLabel("Ação");
		lblAco.setHorizontalAlignment(SwingConstants.CENTER);
		lblAco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAco.setBounds(422, 196, 164, 19);
		frame.getContentPane().add(lblAco);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(367, 255, 117, 19);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton_1 = new JButton("Batalhar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(524, 254, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(367, 298, 117, 19);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton_1_1 = new JButton("Negociar");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(524, 298, 85, 21);
		frame.getContentPane().add(btnNewButton_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(367, 341, 117, 19);
		frame.getContentPane().add(textField_3);
		
		JButton btnNewButton_1_1_1 = new JButton("Explorar");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1_1.setBounds(524, 341, 85, 21);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JLabel lblNomeDoPersonagem = new JLabel("Nome do Personagem");
		lblNomeDoPersonagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeDoPersonagem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeDoPersonagem.setBounds(338, 225, 164, 19);
		frame.getContentPane().add(lblNomeDoPersonagem);
		
		JLabel lblInformaoDeStatus_1 = new JLabel("Informação de Status");
		lblInformaoDeStatus_1.setVerticalAlignment(SwingConstants.TOP);
		lblInformaoDeStatus_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformaoDeStatus_1.setBackground(Color.BLACK);
		lblInformaoDeStatus_1.setBounds(36, 373, 262, 182);
		frame.getContentPane().add(lblInformaoDeStatus_1);
		
		JLabel lblStatus_1 = new JLabel("Status");
		lblStatus_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStatus_1.setBounds(128, 344, 85, 19);
		frame.getContentPane().add(lblStatus_1);
	}
	
	
	
	public class SwingAction extends AbstractAction {//Information
		public SwingAction() {
			putValue("João", "15 de poder");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
