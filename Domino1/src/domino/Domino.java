package domino;

import domino.controlador.gestioDomino;
import domino.vista.GUIDomino;

public class Domino {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIDomino();
            }
        //gestioDomino domin = new gestioDomino();
       // domin.Iniciar();
       });
    }
}
