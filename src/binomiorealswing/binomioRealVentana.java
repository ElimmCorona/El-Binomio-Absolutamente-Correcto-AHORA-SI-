/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomiorealswing;

/**
 *
 * @author elimm
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Math.sin;
import java.math.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
public class binomioRealVentana extends JFrame implements ActionListener {
    
    JPanel panelNumeros;
    JTextField pantallaNum1;
    JTextField pantallaNum2;
    JTextField pantallaResp;
    JLabel label;
    
    JButton btnr;
    JButton btni;
 
    public binomioRealVentana(){
    setSize(500, 600);
		setTitle("");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		// Vamos a dibujar sobre el panel
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(null);
                
                // Ponemos los campos de texto
		pantallaNum1 = new JTextField("A", 20);
		pantallaNum1.setBorder(new EmptyBorder(4, 4, 4, 4));
                pantallaNum1.setBounds(128, 225, 30, 30);
		pantallaNum1.setFont(new Font("Arial", Font.BOLD, 25));
		pantallaNum1.setHorizontalAlignment(JTextField.RIGHT);
		pantallaNum1.setBackground(Color.WHITE);
		panel.add(pantallaNum1);
                
                pantallaNum2 = new JTextField("B", 20);
		pantallaNum2.setBorder(new EmptyBorder(4, 4, 4, 4));     
                pantallaNum2.setBounds(195, 225, 30, 30);
		pantallaNum2.setFont(new Font("Arial", Font.BOLD, 25));
		pantallaNum2.setHorizontalAlignment(JTextField.RIGHT);
		pantallaNum2.setBackground(Color.WHITE);
		panel.add(pantallaNum2);
                
                
                pantallaResp = new JTextField("Resultado", 20);
		pantallaResp.setFont(new Font("Arial", Font.BOLD, 25));
                pantallaResp.setBorder(new EmptyBorder(4, 4, 4, 4)); 
                pantallaResp.setBounds(100, 315, 290, 65);
		pantallaResp.setHorizontalAlignment(JTextField.RIGHT);
                pantallaResp.setEditable(false);
		pantallaResp.setBackground(Color.WHITE);
		panel.add(pantallaResp);
                
                JLabel label = new JLabel("(       +       )^2");
                label.setFont(new Font("Arial", Font.BOLD, 25));
                label.setBounds(115, 215, 790, 65);
                panel.add(label);
                
                btni = new JButton("iniciar");
                btni.setBounds(210, 515, 90, 55);
		btni.setForeground(Color.RED);
                btni.addActionListener(this);
                panel.add(btni);
                
                btnr = new JButton("reiniciar");
                btnr.setBounds(210, 515, 90, 55);
		btnr.setForeground(Color.RED);
                btnr.addActionListener(this);
                panel.add(btnr);
                
		validate();
    }
    
        // Usamos el metodo principal para obtener los valores de los campos y realizar la operacion
    private void operacionPulsado(String tecla) {
        
        int num1=Integer.parseInt(pantallaNum1.getText());
        int num2=Integer.parseInt(pantallaNum2.getText());
        double resp ;
        
		 if (tecla.equals("iniciar")) {
			resp = Math.pow(num1, 2) + (2*num1*num2)+ Math.pow(num2, 2) ;
                        pantallaResp.setText(""+resp+"");
		}else{
                     if (tecla.equals("reiniciar")) {
			pantallaResp.setText("Respuesta");
                        pantallaNum1.setText("A");
                        pantallaNum2.setText("B");
		}
                 }

	}
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()== btni){
        operacionPulsado("iniciar");
    }
        else{
        if (e.getSource()== btnr){
        operacionPulsado("reiniciar");
    }
                
                }
    } 
}
