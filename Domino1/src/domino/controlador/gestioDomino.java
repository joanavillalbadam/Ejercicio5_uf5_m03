/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.controlador;

import domino.model.Fitxa;
import domino.model.Joc;
import domino.model.Jugador;
import domino.model.Torn;
import domino.vista.FinestraJoc;
import domino.vista.InterficieDomino;
import java.lang.reflect.Array;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUMNEDAM
 */
public class gestioDomino {
    private Joc joc;
    private Torn torn;
    private FinestraJoc vista;
    private Jugador jugador;
    private Fitxa fitxa;
    private String nombre[] = new String[4];

   
    public gestioDomino() {
        this.joc = new Joc(4,28,7);
        this.torn = new Torn(joc);
        //this.vista = new InterficieDomino();
        
    }
      public void introducirNombres() {
     
      //  System.out.println("llega a entrar en introducir nombres!!");
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   for (int m = 0; m < 4; m++){
   nombre[m] = JOptionPane.showInputDialog("Introduce el nombre del jugador" + m);
    System.out.println(m);
   }
    
    }
    public void Iniciar(){
        //System.out.println("hola");
        
        introducirNombres(); 
        
        joc.iniciar(nombre);
        torn.inicial();
       
        vista = new FinestraJoc();
        
        vista.MostrarNombreJugador(nombre[0], nombre[1], nombre[2], nombre[3]);
        vista.MostrarFitxasJugador(joc.jugadors[0].getFitxes(), joc.jugadors[1].getFitxes(), joc.jugadors[2].getFitxes(), joc.jugadors[3].getFitxes());
        vista.MostrarFitxasMesa(joc.getFitxesJugades());
        vista.MostrarTurnoJugador(joc.getJugadors()[joc.getTorn()]);
        /*
       */
        
       
       /* while(!joc.isFinalitzat()){
        joc.torn = joc.getTorn();
       // vista.MostrarNombreJugador(joc.getJugadors()[joc.getTorn()]);
        vista.MostrarFitxasJugador(joc.jugadors[0].getFitxes(), joc.jugadors[1].getFitxes(), joc.jugadors[2].getFitxes(), joc.jugadors[3].getFitxes());
        vista.MostrarFitxasMesa(joc.getFitxesJugades());
        vista.MostrarTurnoJugador(joc.getJugadors()[joc.getTorn()]);
          
        //respostaOpcioMenu();
        
        joc.actualitzarEstat();
        
        }
    System.out.println(joc.getGuanyador());
    }
    
    public void respostaOpcioMenu(){
   
    String accio = vista.mostraMenu();
    
    switch(accio){
        case "1":
            unaFitxa();
            break;
        case "2":
            dosFitxas();
            break;
        case "3":
            Passar();
            break;
        default:
            //vista.missatgeError();
            break;
    
}
    }

    private void unaFitxa() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Fitxa f;
    int fitx;
    boolean extrem;
    boolean conseguido;
    
    fitx = vista.elejirFitxa(joc.jugadors[joc.getTorn()].getFitxes());
    f = joc.jugadors[joc.getTorn()].getFitxes().get(fitx);
    extrem = vista.elejirLado();
    
    conseguido = torn.colocarUnaFitxa(f, extrem);
    
    
    }

    private void dosFitxas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Fitxa d1;
    Fitxa d2;
    int fitx;
    boolean extrem1;
    boolean extrem2;
    boolean conseguido; 
    
    fitx = vista.elejirFitxa(joc.jugadors[joc.getTorn()].getFitxes());
    d1 = joc.jugadors[joc.getTorn()].getFitxes().get(fitx);
    extrem1 = vista.elejirLado();
    
    fitx = vista.elejirFitxa(joc.jugadors[joc.getTorn()].getFitxes());
    d2 = joc.jugadors[joc.getTorn()].getFitxes().get(fitx);
    extrem2 = vista.elejirLado();
    
     conseguido = torn.colocarDosDobles(d1, extrem1, d2, extrem2);
    }

    private void Passar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Has passat!");
        torn.passar();
    
  */  }

  
}
