/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ALUMNEDAM
 */
public class FinestraJoc extends JFrame implements ActionListener {

    private JPanel pNord, pImatges;
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
        JButton boto1 = new JButton("Color");
        boto1.addActionListener(this);
        pNord.add(boto1);

        this.add(pNord, BorderLayout.CENTER);
//        this.getContentPane().add(pNord,BorderLayout.NORTH);

      

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Color")) {
            this.pNord.setBackground(Color.red);
        }

    }
}