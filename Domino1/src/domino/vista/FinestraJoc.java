/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.vista;

import domino.model.Fitxa;
import domino.model.Jugador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ALUMNEDAM
 */
public class FinestraJoc extends JFrame implements ActionListener {

    private JPanel pNord, pImatges, PSud, PEst, POest, pCenter;
    public Scanner lector = new Scanner (System.in);
    //String num, fitx;

    public FinestraJoc() {
        super("Exemple BorderLayout");
        configuracio();
        this.pack();
        this.setVisible(true);
    }

    FinestraJoc(String num, String fitx) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.    
    super("Exemple BorderLayout");
        configuracio();
        this.pack();
        this.setVisible(true);
    //boolean cx = num.isEmpty();
        System.out.println(num);
    if(num.equals("4")){
        System.out.println("Aqui hay algo :D"+ num);
    }else{
        System.out.println("Aqui no hay na");
    }
    
    }

    public void configuracio() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 300);
        this.setPreferredSize(new Dimension(600, 400));
//        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        //Configuració Panel pNord
        pNord = new JPanel();
        PSud = new JPanel();
        PEst = new JPanel();
        POest = new JPanel();
        pCenter = new JPanel();

        this.add(pNord, BorderLayout.NORTH);
        this.add(PSud, BorderLayout.SOUTH);
        this.add(PEst, BorderLayout.WEST);
        this.add(POest, BorderLayout.EAST);
        this.add(pCenter, BorderLayout.CENTER);
        
//     this.getContentPane().add(pNord,BorderLayout.NORTH);

      

    }

      public void MostrarNombreJugador(String string, String string0, String string1, String string2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    JLabel lbl1 = new JLabel("Jug1:" + string);
    pNord.add(lbl1,BorderLayout.NORTH);
    
     JLabel lbl2 = new JLabel("Jug2:" + string0);
    PEst.add(lbl2,BorderLayout.WEST);
    
    
     JLabel lbl3 = new JLabel("Jug3:" + string1);
    POest.add(lbl3,BorderLayout.EAST);
    
    
     JLabel lbl4 = new JLabel("Jug4:" + string2);
    PSud.add(lbl4,BorderLayout.SOUTH);
    }

    public void MostrarTurnoJugador(Jugador jugador) {
        
    JLabel lblT = new JLabel("Li toca ha: " + jugador.nom);
    lblT.setBounds(10, 10, 200, 200);
    pNord.add(lblT);
    
    }

    public void MostrarFitxasJugador(ArrayList<Fitxa> fitxes, ArrayList<Fitxa> fitxes0, ArrayList<Fitxa> fitxes1, ArrayList<Fitxa> fitxes2) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   ImageIcon iconB = new ImageIcon("imagenes/backv.gif");
   ImageIcon iconB2 = new ImageIcon("imagenes/back.gif");
    for(int i=0; i < fitxes.size(); i++){
        JLabel lblT = new JLabel(" ");
        lblT.setPreferredSize(new Dimension(50,50));
        lblT.setIcon(iconB);
        pNord.add(lblT,BorderLayout.NORTH);
       System.out.println("**"+fitxes.get(i).valors[0]+"|"+fitxes.get(i).valors[1]+"**");
    }
    
    for(int i=0; i < fitxes0.size(); i++){
        JLabel lblT = new JLabel(" ");
         lblT.setPreferredSize(new Dimension(50,50));
        lblT.setIcon(iconB2);
        PEst.add(lblT,BorderLayout.WEST);
        PEst.setLayout(new GridLayout(8,1));
       //System.out.println("**"+fitxes.get(i).valors[0]+"|"+fitxes.get(i).valors[1]+"**");
    }
    
    for(int i=0; i < fitxes1.size(); i++){
        JLabel lblT = new JLabel(" ");
         lblT.setPreferredSize(new Dimension(50,50));
        lblT.setIcon(iconB2);
        POest.add(lblT,BorderLayout.EAST);
        POest.setLayout(new GridLayout(8,1));
      // System.out.println("**"+fitxes.get(i).valors[0]+"|"+fitxes.get(i).valors[1]+"**");
    }
    
    for(int i=0; i < fitxes2.size(); i++){
        ImageIcon icon = new ImageIcon("imagenes/"+fitxes2.get(i).valors[0]+fitxes2.get(i).valors[1]+"v.gif");
        JLabel lblT = new JLabel(" ");
        lblT.setPreferredSize(new Dimension(50,50));
        lblT.setIcon(icon);
        PSud.add(lblT,BorderLayout.SOUTH);
       //System.out.println("**"+fitxes.get(i).valors[0]+"|"+fitxes.get(i).valors[1]+"**");
    }
    }

    public void MostrarFitxasMesa(ArrayDeque<Fitxa> fitxesJugades) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       for(int i = 0; i < fitxesJugades.size(); i++){
          
      //  String path = "/imagenes/"+fitxesJugades.getFirst().getValors()[0]+fitxesJugades.getFirst().valors[1]+".gif";
       // URL url = this.getClass().getResource(path);
        ImageIcon icon = new ImageIcon("imagenes/"+fitxesJugades.getFirst().getValors()[0]+fitxesJugades.getFirst().valors[1]+".gif");
        JLabel lblFM = new JLabel(" ");
       // lblFM.setBounds(100, 100, 500, 500);
        lblFM.setPreferredSize(new Dimension(200,200));
        lblFM.setIcon(icon);
        pCenter.add(lblFM);
        System.out.println("*fitxasMesa*"+fitxesJugades.getFirst().getValors()[0]+"|"+fitxesJugades.getFirst().valors[1]+"**");
               
        //System.out.println("*fitxasMesa*"+fitxesJugades.getFirst().getValors()[0]+"|"+fitxesJugades.getFirst().valors[1]+"**");
    //preguntar por este metodo!!
            }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Color")) {
            this.pNord.setBackground(Color.red);
        }

    }
public String mostraMenu(){
 System.out.println("Seleccionar operació:"
 +"\n 1.Jugada Normal"+"\n 2.Jugada Doble" + "\n 3. Pasar");
 return lector.nextLine(); 
}
 public boolean elejirLado() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    boolean conseguido = false;
     int x;
     System.out.println("Escribe en que lado quieres poner la ficha");
        System.out.println("1.-Izquierda");
        System.out.println("2.-Derecha");
     x = lector.nextInt();
     if(x == 1){ 
     conseguido = true;
     }
     if(x == 2){
     conseguido =false;
     }   
     return conseguido;
    }

    public int elejirFitxa(ArrayList<Fitxa> fitxes) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int pos; 
       int decis;
      
       System.out.println("Escoje mediante el numero de posicion que fitxa quieres jugar");
        pos = lector.nextInt();
       
        System.out.println("Has escollit **"+fitxes.get(pos).valors[1]+"|"+fitxes.get(pos).valors[0]+"**");

        return pos;
    }

    public String DarNombres(int m) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String nom;
    System.out.println("Introdueix el nom del jugador " + m);
    nom = lector.nextLine();
    
    return nom;
    }

}