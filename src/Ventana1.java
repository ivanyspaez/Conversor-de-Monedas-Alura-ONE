import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Ventana1 extends JFrame{
	public JPanel panel;
	public JTextField texto1, texto2, texto3, texto4;
	public JComboBox lista1, lista2;
	
	public Ventana1() {
		setSize(700,720); //Tamano de mi ventana principal
		setTitle("Conversor"); //Titulo de ventana
		setLocationRelativeTo(null); //Apertura inicial ventana centro
		setDefaultCloseOperation(EXIT_ON_CLOSE); //LA "x" para cerrar la ventana
		iniciarComponentes();
		
	} 	
		
	
	private void iniciarComponentes() {
		colocarPaneles();
		colocarEtiquetas();
		colocarBotones();
		colocarCajasTexto(); 
		colocarListasDesplegables();
	}
	
	private void colocarPaneles() {
		
		panel = new JPanel();
		panel.setBackground(Color.BLUE); //Establecemos el color del panel
		panel.setLayout(null); //Desactivo el diseño
		this.getContentPane().add(panel); //agregamos el panel a la ventana			
	}
	
	private void colocarEtiquetas() {
		
		JLabel etiqueta = new JLabel("Valor a convertir",SwingConstants.CENTER); //creo una etiqueta de texto
		etiqueta.setBounds(30,230,200,20); 
		etiqueta.setForeground(Color.WHITE); //color de la letra	
		etiqueta.setFont(new Font("italic",3,20)); //cambio de fuente de letra
		panel.add(etiqueta); //agrego la etiqueta al panel
		
		JLabel etiqueta2 = new JLabel("son",SwingConstants.CENTER);
		etiqueta2.setBounds(215,300,200,20); 
		etiqueta2.setForeground(Color.WHITE);				
		etiqueta2.setFont(new Font("italic",3,20));
		panel.add(etiqueta2);
		
		ImageIcon imagen = new ImageIcon("src//conversor1.jpg");
		JLabel etiqueta3 = new JLabel(imagen);
		etiqueta3.setBounds(0,0,700,200);
		etiqueta3.setIcon(new ImageIcon(imagen.getImage().
		   getScaledInstance(etiqueta3.getWidth(),etiqueta3.getHeight(),Image.SCALE_SMOOTH)));
		panel.add(etiqueta3);
	}
	
	private void colocarBotones() {
		JButton boton1 = new JButton("Convertir");
		boton1.setBounds(190,380,100,30); //tamaño del boton
		boton1.setForeground(Color.BLUE); //Color de letra 
		boton1.setFont(new Font("cooper black",0,12)); //Fuente de letra 
		panel.add(boton1); //Agregamos el boton al panel
		
		JButton boton2 = new JButton("Borrar");
		boton2.setBounds(340,380,100,30);
		boton2.setForeground(Color.BLUE);
		boton2.setFont(new Font("cooper black",0,12));
		panel.add(boton2);
		
		ActionListener oyenteDeAccion = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lista1.getSelectedIndex()== 0) {
					Double valor = Double.parseDouble(texto1.getText());
					double cotizacion = 197.56;
					String resultado = String.valueOf(valor / cotizacion);
					texto2.setText(resultado);
				} else if(lista1.getSelectedIndex()== 1) {
					double valor = Double.parseDouble(texto1.getText());
					double cotizacion = 475.28;
					String resultado = String.valueOf(valor / cotizacion);
					texto2.setText(resultado);
				} else if(lista1.getSelectedIndex()== 2) {
					double valor = Double.parseDouble(texto1.getText());
					double cotizacion = 422.4;
					String resultado = String.valueOf(valor / cotizacion);
					texto2.setText(resultado);
				} else if(lista1.getSelectedIndex()== 3) {
					double valor = Double.parseDouble(texto1.getText());
					double cotizacion = 69.01;
					String resultado = String.valueOf(valor / cotizacion);
					texto2.setText(resultado);
				} else if(lista1.getSelectedIndex()== 4) {
					double valor = Double.parseDouble(texto1.getText());
					double cotizacion = 6.61;
					String resultado = String.valueOf(valor / cotizacion);
					texto2.setText(resultado);
				} else if(lista1.getSelectedIndex()== 5) {
					double valor = Double.parseDouble(texto1.getText());
					Double cotizacion = 197.56;
					String resultado = String.valueOf(valor * cotizacion);
					texto2.setText(resultado);
				} else if(lista1.getSelectedIndex()== 6) {
					double valor = Double.parseDouble(texto1.getText());
					double cotizacion = 475.28;
					String resultado = String.valueOf(valor * cotizacion);
					texto2.setText(resultado);
				} else if(lista1.getSelectedIndex()== 7) {
					double valor = Double.parseDouble(texto1.getText());
					double cotizacion = 422.4;
					String resultado = String.valueOf(valor * cotizacion);
					texto2.setText(resultado);
				} 			
			}
		};
		
		ActionListener oyenteDeAccion2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				texto1.setText(null);
				texto2.setText(null);
			}
		};
		
		boton1.addActionListener(oyenteDeAccion);
		boton2.addActionListener(oyenteDeAccion2);
		
		JButton boton3 = new JButton("Pasar");
		boton3.setBounds(310,570,100,30); 
		boton3.setForeground(Color.BLUE); 
		boton3.setFont(new Font("cooper black",0,12));  
		panel.add(boton3); 
		
		ActionListener oyenteDeAccion3 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lista2.getSelectedIndex()== 0) {
					double valor = Double.parseDouble(texto3.getText());
					double operacion = 2.204;
					String resultado = String.valueOf(valor * operacion);
					texto4.setText(resultado);
				 } else if(lista2.getSelectedIndex()== 1) {
					 double valor = Double.parseDouble(texto3.getText());
						double operacion = 35.274;
						String resultado = String.valueOf(valor * operacion);
						texto4.setText(resultado);
				 } else if(lista2.getSelectedIndex()== 2) {
					 double valor = Double.parseDouble(texto3.getText());
						double operacion =  2.204;
						String resultado = String.valueOf(valor / operacion);
						texto4.setText(resultado);
				 } else if(lista2.getSelectedIndex()== 3) {
					 double valor = Double.parseDouble(texto3.getText());
						double operacion =  35.274;
						String resultado = String.valueOf(valor / operacion);
						texto4.setText(resultado);					 
				 }				 
			}										
		};					
	
		JButton boton4 = new JButton("Borrar");
		boton4.setBounds(310,620,100,30); 
		boton4.setForeground(Color.BLUE); 
		boton4.setFont(new Font("cooper black",0,12)); 
		panel.add(boton4); 
		
		ActionListener oyenteDeAccion4 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				texto3.setText(null);
				texto4.setText(null);
			}
		};				
						
		boton3.addActionListener(oyenteDeAccion3);
		boton4.addActionListener(oyenteDeAccion4);				
	} 
	
	private void colocarCajasTexto() {
		texto1 = new JTextField();
		texto1.setBounds(90,300,150,25);
		panel.add(texto1);
		
		texto2 = new JTextField();
		texto2.setBounds(390,300,150,25);
		panel.add(texto2);
		
		texto3 = new JTextField();
		texto3.setBounds(90,600,150,25);
		panel.add(texto3);
		
		texto4 = new JTextField();
		texto4.setBounds(470,600,150,25);
		panel.add(texto4);	
		
	}
	
	private void colocarListasDesplegables() {
		String[] cambios = {"De Peso ARG a Dólar","De Peso ARG a Euro","De Peso ARG a Libras Esterlinas",
							"De Peso ARG a Yen Japonés","De Peso ARG a Won sul-coreano",
							"De Dólar a Peso ARG","De Euro a Peso ARG","De Libras Esterlinas a Peso ARG",
							"De Yen Japonés a Peso ARG","De Won sul-coreano a Peso ARG"};
		lista1 = new JComboBox(cambios);
		lista1.setBounds(350,230,300,25);
		lista1.setFont(new Font("arial",2,15));
		panel.add(lista1);
		
		String[] cambios2 = {"Pasar de Kilogramo a Libra","Pasar de Kilogramo a Onza",
						"Pasar de Libra a Kilogramo","Pasar de Onza a Kilogramo"};
		lista2 = new JComboBox(cambios2);
		lista2.setBounds(40,500,250,25);
		lista2.setFont(new Font("arial",2,15));
		panel.add(lista2);
					
	}
}
