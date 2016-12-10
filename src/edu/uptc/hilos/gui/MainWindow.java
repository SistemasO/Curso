package edu.uptc.hilos.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import edu.uptc.hilos.logic.Cliente;
import edu.uptc.hilos.logic.Esperas;

public class MainWindow extends JFrame{

	private JButton begin;
	private JButton close;

	private JTextField jtfUno;
	private JTextField jtfDos;
	private JTextField jtfTres;

	private JProgressBar jpbUno;
	private JProgressBar jpbDos;
	private JProgressBar jpbTres;

	private JLabel jlUno;
	private JLabel jlDos;
	private JLabel jlTres;
	private JLabel espacio;

	
	private JTextField casilla;
	

	private boolean estado;

	private Esperas esperas;
	

	public MainWindow()  {


		esperas = new Esperas();


		setSize(new Dimension(520   ,   200));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		this.setLayout(new GridLayout(4, 4));

		estado = true;

		jlUno = new JLabel("    ===     CAJA UNO     ===  ");
		add(jlUno);
		jlDos = new JLabel("      ===     CAJA DOS     ===  ");
		add(jlDos);
		jlTres = new JLabel("         ===    CAJA TRES    ===  ");
		add(jlTres);


		jpbUno = new JProgressBar(0,100);
		jpbUno.setStringPainted(true);
		add(jpbUno);
		jpbDos = new JProgressBar(0,100);
		jpbDos.setStringPainted(true);
		add(jpbDos);
		jpbTres = new JProgressBar(0,100);
		jpbTres.setStringPainted(true);
		add(jpbTres);


		jtfUno = new JTextField();
		add(jtfUno);
		jtfUno.setEditable(false);
		jtfDos = new JTextField();
		add(jtfDos);
		jtfDos.setEditable(false);
		jtfTres = new JTextField();
		add(jtfTres);
		jtfTres.setEditable(false); 
		
		
		

		begin= new JButton("    ===     INICIAR     ===  ");
		add(begin);
		begin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				long id_Cliente = 0;
				int espera=0;

				for (int i = 1; i <= 200; i++) {

					espera= i;
					id_Cliente = (long)(Math.random() * (1058809059 - 1052407249) + 1052407249);

					esperas.getClientes().add(new Cliente(espera, id_Cliente));

					try {
						Thread.sleep((long) (Math.random()*5));

					} catch (Exception e) {
					}
				}
				
				
				new Thread(new Runnable() {


					@Override
					public void run() {

						for (int i = 0; i <= 60 ; i++) {

							if(i==0){
								caja1();
							}
							else {
								if (i==20) {
									caja2();
								}
								else {
									if (i==40) {
										caja3();

									}
								}
							}
							try {
								Thread.sleep(300);

							} catch (Exception e) {
								// TODO: handle exception
							}
						}

					}


				}).start();

				
			}


		});

		casilla = new JTextField();
		casilla.setEditable(false);
		add(casilla);
		
		close= new JButton("  ===     FINALIZAR   ===  ");
		add(close);

		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				estado= false;
				
			
			}
		});
	}




	private void begin() {

		
	}

	private void addShifts() {

		
	}


	public void caja1(){

		new Thread(new Runnable() {

			@Override
			public void run() {

						while(estado){
							
							int in= 0;
							long indetificacion = esperas.getClientes().get(in).getId_Cliente();
							int espera = esperas.getClientes().get(in).getEspera();
							
							casilla.setText("CAJA 1 " + "ESPERA:  " + espera + "IDENTIFICACION  " + indetificacion );
					
							esperas.delete(espera);
							
							jlUno.setText(" ESPERA :" + espera + " IDENTIFICACION " + indetificacion);
							
							new Thread(new Runnable() {
								
								@Override
								public void run() {
									
									for (int i = 0; i <= 100; i++) {
										
										jpbUno.setValue(i);
										jpbUno.repaint();
										jpbUno.setString( "" + i + " % " );
										try {
											
											Thread.sleep(100);
											
										} catch (Exception e) {
										}
									}
									
								}
							}).start();
							
							try {
								
								Thread.sleep(14230);

								
							} catch (Exception e) {
							}
						}
						
					}
				}).start();


			}			
			
		
	public void caja2(){

		
		new Thread(new Runnable() {

			@Override
			public void run() {

						while(estado){
							
							int in= 0;
							long indetificacion = esperas.getClientes().get(in).getId_Cliente();
							int espera = esperas.getClientes().get(in).getEspera();
							
							jtfDos.setText("CAJA 1 " + "ESPERA:  " + espera + "IDENTIFICACION  " + indetificacion );
					
							esperas.delete(espera);
							
							jtfDos.setText(" ESPERA :" + espera + " IDENTIFICACION " + indetificacion);
							
							new Thread(new Runnable() {
								
								@Override
								public void run() {
									
									for (int i = 0; i <= 100; i++) {
										
										jpbDos.setValue(i);
										jpbDos.repaint();
										jpbDos.setString( "" + i + " % " );
										try {
											
											Thread.sleep(100);
											
										} catch (Exception e) {
										}
									}
									
								}
							}).start();
							
							try {
								
								Thread.sleep(10285);

								
							} catch (Exception e) {
							}
						}
						
					}
				}).start();


			}			

	

	public void caja3(){
		
		new Thread(new Runnable() {

			@Override
			public void run() {

						while(estado){
							
							int in= 0;
							long indetificacion = esperas.getClientes().get(in).getId_Cliente();
							int espera = esperas.getClientes().get(in).getEspera();
							
							jtfTres.setText("CAJA 1 " + "ESPERA:  " + espera + "IDENTIFICACION  " + indetificacion );
					
							esperas.delete(espera);
							
							jtfTres.setText(" ESPERA :" + espera + " IDENTIFICACION " + indetificacion);
							
							new Thread(new Runnable() {
								
								@Override
								public void run() {
									
									for (int i = 0; i <= 100; i++) {
										
										jpbTres.setValue(i);
										jpbTres.repaint();
										jpbTres.setString( "" + i + " % " );
										try {
											
											Thread.sleep(200);
											
										} catch (Exception e) {
										}
									}
									
								}
							}).start();
							
							try {
								
								Thread.sleep(14230);

								
							} catch (Exception e) {
							}
						}
						
					}
				}).start();


			}			

	public static void main(String[] args) {


		MainWindow window = new MainWindow();
		window.setVisible(true);
	}

}
