/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appinterfaz;
import ConexionPg.*;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;

/**
 *
 * @author DajuOST
 */
public class AppInterfaz  implements ActionListener{
     private Button b1;
     private Button b2;
     private Frame f ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       AppInterfaz i = new AppInterfaz();
       i.caja();
        
    }

      public void addBoton(){
        b1 = new Button("Boton 1");
        b1.setName("btn1");
        b2 = new Button("Boton 2");
        f.add(b1);
        f.add(b2);
        b1.addActionListener(this);
          
      }
      
      public void caja(){
        f = new Frame("Ventana");
        f.setVisible(true);
        f.setBounds(100, 100, 500, 500);
        f.setLayout(new GridLayout(0,1));
        this.addBoton();
      }
      
      public void windowClosing(WindowEvent e) {
                
                System.exit(0);
        }
    @Override
    public void actionPerformed(ActionEvent e) {
        Button b = (Button) e.getSource();
        if("btn1".equals(b.getName())){
            System.out.println("hola");
            PosgresConect p = new PosgresConect();
            p.buscar();
        }
        
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
