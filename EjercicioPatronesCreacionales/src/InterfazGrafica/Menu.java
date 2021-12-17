package InterfazGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {

	private int opcion = 0;
	private int Qpers = 0;
	
	private JPanel contentPane;
	private JLabel lblAvisoSPer;
	private JLabel lblAviso1;
	private JButton btnElf;
	private JButton btnEnano;
	private JButton btnHumano;
	private JLabel lblAvisoG;
	private JTextField tFNumPers;
	private JButton btnGenerar;

	/**
	 * Crea el Frame.
	 */
	public Menu() {

		setBackground(Color.DARK_GRAY);
		setTitle("Personajes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		lblAvisoSPer = new JLabel("Selector de Personajes");
		lblAvisoSPer.setFont(new Font("Gill Sans MT", Font.BOLD, 25));
		lblAvisoSPer.setBounds(108, 55, 269, 63);
		contentPane.add(lblAvisoSPer);

		lblAviso1 = new JLabel("Por favor, seleccione al personaje que desea generar:");
		lblAviso1.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblAviso1.setBounds(74, 106, 327, 63);
		contentPane.add(lblAviso1);

		btnElf = new JButton("Elfo");
		btnElf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 1;
				lblAvisoG.setEnabled(true);
				tFNumPers.setEnabled(true);
			}
		});
		btnElf.setBounds(84, 174, 89, 23);
		contentPane.add(btnElf);

		btnEnano = new JButton("Enano");
		btnEnano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 2;
				lblAvisoG.setEnabled(true);
				tFNumPers.setEnabled(true);
			}
		});
		btnEnano.setBounds(183, 174, 89, 23);
		contentPane.add(btnEnano);

		btnHumano = new JButton("Humano");
		btnHumano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcion = 3;
				lblAvisoG.setEnabled(true);
				tFNumPers.setEnabled(true);
			}
		});
		btnHumano.setBounds(282, 174, 89, 23);
		contentPane.add(btnHumano);

		lblAvisoG = new JLabel("Cuantos desea Generar:");
		lblAvisoG.addComponentListener(new ComponentAdapter() {
		});
		lblAvisoG.setEnabled(false);
		lblAvisoG.setFont(new Font("Gill Sans MT", Font.PLAIN, 12));
		lblAvisoG.setBounds(74, 217, 128, 23);
		contentPane.add(lblAvisoG);

		tFNumPers = new JTextField();
		tFNumPers.setEnabled(false);
		tFNumPers.setColumns(10);
		tFNumPers.setBounds(206, 221, 86, 20);
		contentPane.add(tFNumPers);

		tFNumPers.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {

				if (tFNumPers.getText().length() == 1) {
					e.consume();
				}
				
				btnGenerar.setEnabled(true);
			}
		});
		
		
		btnGenerar = new JButton("Generar");
		btnGenerar.setFont(new Font("Gill Sans MT", Font.BOLD, 12));
		btnGenerar.setEnabled(false);
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Qpers = Integer.parseInt(tFNumPers.getText());
				ventana vent = new ventana(opcion, Qpers);
				vent.setVisible(true);
				dispose();
			}

		});
		btnGenerar.setBounds(183, 306, 89, 23);
		contentPane.add(btnGenerar);

		Image img = new ImageIcon("Imagenes\\Fondo.jpg").getImage();
		ImageIcon img2 = new ImageIcon(img.getScaledInstance(484, 361, Image.SCALE_SMOOTH));
		JLabel lblFondo = new JLabel("");
		lblFondo.setBackground(Color.BLACK);
		lblFondo.setIcon(img2);
		lblFondo.setBounds(0, 0, 484, 361);
		contentPane.add(lblFondo);
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
}
