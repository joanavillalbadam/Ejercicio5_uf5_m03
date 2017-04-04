/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ALUMNEDAM
 */
public class GUIDomino extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3;
    public JTextField textfield1;
    public JLabel label1;
    public JButton boton1;

    public GUIDomino() {
        setLayout(null);
        mb = new JMenuBar();
        setJMenuBar(mb);
        menu1 = new JMenu("Opciones");
        mb.add(menu1);
        mi1 = new JMenuItem("Configuracion del Juego");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2 = new JMenuItem("Jugar amb la config per defecte");
        mi2.addActionListener(this);
        menu1.add(mi2);
//        mi3=new JMenuItem("Azul");
//        mi3.addActionListener(this);
//        menu1.add(mi3);               
    }

    public void actionPerformed(ActionEvent e) {
        Container f = this.getContentPane();
       
        if (e.getSource() == mi1) {
            
            f.setBackground(new Color(204, 255, 153));
            
            label1 = new JLabel("Numero De jugadores:");
            label1.setBounds(10, 10, 200, 30);
            add(label1);
            
            JTextField nJugadores = new JTextField();
            nJugadores.setBounds(160, 10, 150, 20);
            add(nJugadores);
            
            label1 = new JLabel("Amb totes les fitxes?");
            label1.setBounds(10, 40, 200, 30);
            add(label1);
            
            JTextField TodasFitxas = new JTextField();
            TodasFitxas.setBounds(160, 40, 150, 20);
            add(TodasFitxas);
            
            boton1 = new JButton("Aceptar");
            boton1.setBounds(210, 80, 100, 30);
            add(boton1);
            
           // boton1.addActionListener(this);
            
            boton1.addActionListener(new java.awt.event.ActionListener() {
                
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String n = nJugadores.getText();
                System.out.println(n);
                if(nJugadores.getText().equals("4")){
                JButtonObrirFinestraUnJugador(evt);
                }else{
                JButtonObrirFinestraDosJugadors(evt);
                }
                }

                private void JButtonObrirFinestraUnJugador(ActionEvent evt) {
                 // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                   String num = nJugadores.getText();
                   String fitx = TodasFitxas.getText();
                   FinestraJoc fj = new FinestraJoc(num, fitx);
                }

                private void JButtonObrirFinestraDosJugadors(ActionEvent evt) {
                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                   String num = nJugadores.getText();
                   String fitx = TodasFitxas.getText();
                   FinestraJoc2J fj = new FinestraJoc2J(num, fitx);
                
                }
        });
            }
        if (e.getSource() == mi2) {
            f.setBackground(new Color(0, 255, 0));
        }
        // if(e.getSource() == boton1){
        // }
//        if (e.getSource()==mi3) {
//            f.setBackground(new Color(0,0,255));
//        }        

             
    }

    public static void main(String[] ar) {
        GUIDomino formulario1 = new GUIDomino();
        formulario1.setBounds(10, 20, 500, 500);
        formulario1.setVisible(true);
    }
}
