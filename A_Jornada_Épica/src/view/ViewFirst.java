package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import view.ViewFirst.SwingAction;

public class ViewFirst {

    private JFrame frame;
    private JTextField txtNome;
    private final Action action = new SwingAction();
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    ViewFirst window = new ViewFirst();
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
    public ViewFirst() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Nome Aluno:");
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel.setBounds(68, 65, 94, 50);
	frame.getContentPane().add(lblNewLabel);
	
	txtNome = new JTextField();
	txtNome.setBounds(167, 83, 96, 19);
	frame.getContentPane().add(txtNome);
	txtNome.setColumns(10);
	
	JButton btnMostrar = new JButton("Mostrar");
	btnMostrar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			action.putValue(null, e);
		    JOptionPane.showMessageDialog(null,action.getValue(txtNome.getText()));
		}
	});
	btnMostrar.setFont(new Font("Tahoma", Font.BOLD, 12));
	btnMostrar.setBounds(151, 144, 85, 21);
	frame.getContentPane().add(btnMostrar);
	
	textField = new JTextField();
	textField.setBounds(137, 198, 96, 19);
	frame.getContentPane().add(textField);
	textField.setColumns(10);
    }
    
	public class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue("João", "15 de poder");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
