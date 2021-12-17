package InterfazGrafica;
/**
 * Clase Ventana
 * 
 * Clase Interfaz de ventana, contiene los atributos para crear el la ventana donde se muestran los personajes creados.
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */

import Armaduras.Armaduras;
import Armas.Armas;
import Descripciones.Descripcion;
import Fabricas.*;
import Monturas.Monturas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ventana extends JFrame {

	private JPanel contentPane;
	private FabricaRazas fabrica;

	public ventana(int opcion, int Qpers) {

		if (opcion == 1) {
			fabrica = new FabricaElfos();
		} else if (opcion == 2) {
			fabrica = new FabricaEnanos();
		} else if (opcion == 3) {
			fabrica = new FabricaHumanos();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		Armaduras armadu = fabrica.CrearArmaduras();
		Armas arma = fabrica.CrearArmas();
		Monturas montu = fabrica.CrearMontura();
		Descripcion descrip = fabrica.CrearDescripcion();
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		JLabel lblArmadura = new JLabel("Armadura");
		lblArmadura.setForeground(Color.BLACK);
		lblArmadura.setFont(new Font("Gill Sans MT", Font.BOLD | Font.ITALIC, 15));
		lblArmadura.setBackground(Color.WHITE);
		lblArmadura.setBounds(120, 112, 63, 35);
		contentPane.add(lblArmadura);

		JLabel lblnomArmadura = new JLabel(armadu.getNombreArmadura());
		lblnomArmadura.setForeground(Color.BLACK);
		lblnomArmadura.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblnomArmadura.setBackground(Color.WHITE);
		lblnomArmadura.setBounds(107, 158, 87, 58);
		contentPane.add(lblnomArmadura);

		JLabel lblsrcAmadura = new JLabel("");
		lblsrcAmadura.setBounds(87, 225, 130, 97);
		contentPane.add(lblsrcAmadura);
		Image Armadura = new ImageIcon(armadu.getSrcArmadura()).getImage();
		ImageIcon nArmadura = new ImageIcon(Armadura.getScaledInstance(130, 97, Image.SCALE_SMOOTH));
		lblsrcAmadura.setIcon(nArmadura);

		JTextArea tArDesArmadura = new JTextArea();
		tArDesArmadura.setText(armadu.getDescripcionArmadura());
		tArDesArmadura.setFont(new Font("Gill Sans MT", Font.PLAIN, 12));
		tArDesArmadura.setEditable(false);
		tArDesArmadura.setBounds(75, 346, 160, 214);
		contentPane.add(tArDesArmadura);

		JLabel lblArma = new JLabel("Arma");
		lblArma.setForeground(Color.BLACK);
		lblArma.setFont(new Font("Gill Sans MT", Font.BOLD | Font.ITALIC, 15));
		lblArma.setBackground(Color.WHITE);
		lblArma.setBounds(308, 112, 39, 35);
		contentPane.add(lblArma);

		JLabel lblnomArma = new JLabel(arma.getNombreArmas());
		lblnomArma.setForeground(Color.BLACK);
		lblnomArma.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblnomArma.setBackground(Color.WHITE);
		lblnomArma.setBounds(299, 158, 63, 35);
		contentPane.add(lblnomArma);

		JLabel lblsrcMartillo = new JLabel("");
		lblsrcMartillo.setBounds(259, 225, 130, 97);
		contentPane.add(lblsrcMartillo);
		Image Marti = new ImageIcon(arma.getSrcArmas()).getImage();
		ImageIcon nMarti = new ImageIcon(Marti.getScaledInstance(130, 97, Image.SCALE_SMOOTH));
		lblsrcMartillo.setIcon(nMarti);

		JTextArea tArDesArco = new JTextArea();
		tArDesArco.setEditable(false);
		tArDesArco.setFont(new Font("Gill Sans MT", Font.PLAIN, 12));
		tArDesArco.setText(arma.getDescripcionArmas());
		tArDesArco.setBounds(245, 346, 160, 177);
		contentPane.add(tArDesArco);

		JLabel lblMontura = new JLabel("Montura");
		lblMontura.setForeground(Color.BLACK);
		lblMontura.setFont(new Font("Gill Sans MT", Font.BOLD | Font.ITALIC, 15));
		lblMontura.setBackground(Color.WHITE);
		lblMontura.setBounds(475, 112, 56, 35);
		contentPane.add(lblMontura);

		JLabel lblsrcMontura = new JLabel("");
		lblsrcMontura.setForeground(Color.BLACK);
		lblsrcMontura.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblsrcMontura.setBackground(Color.WHITE);
		lblsrcMontura.setBounds(437, 225, 130, 97);
		contentPane.add(lblsrcMontura);
		Image Montura = new ImageIcon(montu.getSrcMontura()).getImage();
		ImageIcon nMontura = new ImageIcon(Montura.getScaledInstance(130, 97, Image.SCALE_SMOOTH));
		lblsrcMontura.setIcon(nMontura);

		JLabel lblnomMontura = new JLabel(montu.getNombreMontura());
		lblnomMontura.setForeground(Color.BLACK);
		lblnomMontura.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		lblnomMontura.setBackground(Color.WHITE);
		lblnomMontura.setBounds(473, 158, 69, 35);
		contentPane.add(lblnomMontura);

		JTextArea tArDesMontura = new JTextArea();
		tArDesMontura.setFont(new Font("Gill Sans MT", Font.PLAIN, 12));
		tArDesMontura.setEditable(false);
		tArDesMontura.setText(montu.getDescripcionMontura());
		tArDesMontura.setBounds(422, 346, 160, 163);
		contentPane.add(tArDesMontura);

		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setForeground(Color.BLACK);
		lblDescripcion.setFont(new Font("Gill Sans MT", Font.BOLD | Font.ITALIC, 15));
		lblDescripcion.setBackground(Color.WHITE);
		lblDescripcion.setBounds(630, 112, 87, 35);
		contentPane.add(lblDescripcion);

		JLabel fondoLables1 = new JLabel("");
		Image i3 = new ImageIcon("Imagenes\\FondoLables.jpg").getImage();
		ImageIcon i4 = new ImageIcon(i3.getScaledInstance(160, 457, Image.SCALE_SMOOTH));

		JTextArea tArDescripcion = new JTextArea();
		tArDescripcion.setText(descrip.getDescripcion());
		tArDescripcion.setFont(new Font("Gill Sans MT", Font.PLAIN, 12));
		tArDescripcion.setEditable(false);
		tArDescripcion.setBounds(592, 178, 160, 319);
		contentPane.add(tArDescripcion);
		fondoLables1.setIcon(i4);
		fondoLables1.setBackground(Color.WHITE);
		fondoLables1.setBounds(75, 103, 160, 457);
		contentPane.add(fondoLables1);

		JLabel fondoLables2 = new JLabel("");
		fondoLables2.setIcon(i4);
		fondoLables2.setBackground(Color.WHITE);
		fondoLables2.setBounds(245, 103, 160, 457);
		contentPane.add(fondoLables2);

		JLabel fondoLables3 = new JLabel("");
		fondoLables3.setIcon(i4);
		fondoLables3.setBackground(Color.WHITE);
		fondoLables3.setBounds(422, 103, 160, 457);
		contentPane.add(fondoLables3);

		JLabel fondoLables4 = new JLabel("");
		fondoLables4.setIcon(i4);
		fondoLables4.setBackground(Color.WHITE);
		fondoLables4.setBounds(592, 103, 160, 457);
		contentPane.add(fondoLables4);

		JLabel fondoLables5 = new JLabel("");
		Image i1 = new ImageIcon("Imagenes\\FondoPersonajesIco.jpg").getImage();
		ImageIcon i2 = new ImageIcon(i1.getScaledInstance(160, 457, Image.SCALE_SMOOTH));
		
		JLabel lblPers1 = new JLabel("");
		lblPers1.setVisible(false);
		lblPers1.setBounds(775, 123, 69, 70);
		contentPane.add(lblPers1);
		Image iPers = new ImageIcon(descrip.getSrcPersonaje()).getImage();
		ImageIcon iP = new ImageIcon(iPers.getScaledInstance(69, 70, Image.SCALE_SMOOTH));
		lblPers1.setIcon(iP);
		
		JLabel lblPers2 = new JLabel("");
		lblPers2.setVisible(false);
		lblPers2.setBounds(849, 123, 69, 70);
		contentPane.add(lblPers2);
		lblPers2.setIcon(iP);
		
		JLabel lblPers3 = new JLabel("");
		lblPers3.setVisible(false);
		lblPers3.setBounds(775, 204, 69, 70);
		contentPane.add(lblPers3);
		lblPers3.setIcon(iP);
		
		JLabel lblPers4 = new JLabel("");
		lblPers4.setVisible(false);
		lblPers4.setBounds(849, 204, 69, 70);
		contentPane.add(lblPers4);
		lblPers4.setIcon(iP);
		
		JLabel lblPers5 = new JLabel("");
		lblPers5.setVisible(false);
		lblPers5.setBounds(775, 285, 69, 70);
		contentPane.add(lblPers5);
		lblPers5.setIcon(iP);
		
		JLabel lblPers6 = new JLabel("");
		lblPers6.setVisible(false);
		lblPers6.setBounds(849, 285, 69, 70);
		contentPane.add(lblPers6);
		lblPers6.setIcon(iP);
		
		JLabel lblPers7 = new JLabel("");
		lblPers7.setVisible(false);
		lblPers7.setBounds(775, 366, 69, 70);
		contentPane.add(lblPers7);
		lblPers7.setIcon(iP);
		
		JLabel lblPers8 = new JLabel("");
		lblPers8.setVisible(false);
		lblPers8.setBounds(849, 366, 69, 70);
		contentPane.add(lblPers8);
		lblPers8.setIcon(iP);
		
		switch(Qpers) {
			case 1: {
				lblPers1.setVisible(true);
				break;
			}
			case 2: {
				lblPers1.setVisible(true);
				lblPers2.setVisible(true);
				break;
			}
			case 3: {
				lblPers1.setVisible(true);
				lblPers2.setVisible(true);
				lblPers3.setVisible(true);
				break;
			}
			case 4: {
				lblPers1.setVisible(true);
				lblPers2.setVisible(true);
				lblPers3.setVisible(true);
				lblPers4.setVisible(true);
				break;
			}
			case 5: {
				lblPers1.setVisible(true);
				lblPers2.setVisible(true);
				lblPers3.setVisible(true);
				lblPers4.setVisible(true);
				lblPers5.setVisible(true);
				break;
			}
			case 6: {
				lblPers1.setVisible(true);
				lblPers2.setVisible(true);
				lblPers3.setVisible(true);
				lblPers4.setVisible(true);
				lblPers5.setVisible(true);
				lblPers6.setVisible(true);
				break;
			}
			case 7: {
				lblPers1.setVisible(true);
				lblPers2.setVisible(true);
				lblPers3.setVisible(true);
				lblPers4.setVisible(true);
				lblPers5.setVisible(true);
				lblPers6.setVisible(true);
				lblPers7.setVisible(true);
				break;
			}
			case 8: {
				lblPers1.setVisible(true);
				lblPers2.setVisible(true);
				lblPers3.setVisible(true);
				lblPers4.setVisible(true);
				lblPers5.setVisible(true);
				lblPers6.setVisible(true);
				lblPers7.setVisible(true);
				lblPers8.setVisible(true);
				break;
			}
		}
		
		fondoLables5.setBackground(Color.WHITE);
		fondoLables5.setBounds(769, 52, 160, 457);
		contentPane.add(fondoLables5);
		fondoLables5.setIcon(i2);

		JLabel lblFondo = new JLabel("");
		lblFondo.setBackground(Color.WHITE);
		lblFondo.setBounds(0, 0, 984, 611);
		contentPane.add(lblFondo);
		Image img = new ImageIcon("Imagenes\\Fondo.jpg").getImage();
		ImageIcon img2 = new ImageIcon(img.getScaledInstance(984, 611, Image.SCALE_SMOOTH));
		lblFondo.setIcon(img2);
		
	}
}
