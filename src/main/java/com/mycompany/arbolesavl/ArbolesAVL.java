
package com.mycompany.arbolesavl;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author ABRAHAM
 */
public class ArbolesAVL {

    
         public static void main(String[] args) {
      
      SwingUtilities.invokeLater(new Runnable(){
          
           @Override
       public void run(){
          JFrame frame = new GraficaArbol();
          frame.setSize(500, 500);
          frame.setVisible(true);
      }
          
      });
     
      
    }
        
        
        
    }

