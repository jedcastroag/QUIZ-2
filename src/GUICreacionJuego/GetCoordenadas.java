/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUICreacionJuego;

import javax.swing.*;

/**
 *
 * @author lucho
 */
public class GetCoordenadas extends JFrame{
    
    private JTextField Tcoox,Tcooy;
    private JLabel Lcoox,Lcooy;
    private JButton accept;

    public GetCoordenadas() {
        this.setLayout(null);
        this.setSize(900, 900);
        
        this.initComponents();
        this.addComponents();
        this.setLocationComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    private void initComponents(){
        //Texto
        this.Tcoox = new JTextField();
        this.Tcooy = new JTextField();
        //Etiquetas
        this.Lcoox = new JLabel("Coordenada x: ");
        this.Lcooy = new JLabel("Coordenada y: ");
        //Boton
        this.accept = new JButton("Aceptar");
    }
    
    private void addComponents(){
        //Texto
        this.add(this.Tcoox);
        this.add(this.Tcooy);
        //Etiquetas
        this.add(this.Lcoox);
        this.add(this.Lcooy);
    }
    
    private void setLocationComponents(){
        //Etiquetas
        this.Lcoox.setBounds(50, 50, 100, 20);
        this.Lcooy.setBounds(50, 150, 100, 20);
        //Texto
        this.Lcoox.setBounds(200, 50, 100, 20);
        this.Lcooy.setBounds(200, 150, 100, 20);
        //Boton
        this.accept.setBounds(300, 300, 200, 50);
    }
    
}
