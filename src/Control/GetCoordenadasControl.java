/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class GetCoordenadasControl implements ActionListener{
    
    private JTextField x;
    private JTextField y;

    public GetCoordenadasControl(JTextField x, JTextField y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x.getText();
    }
    
    
    
}
