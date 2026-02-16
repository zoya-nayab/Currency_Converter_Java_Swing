/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currencyconverter;

import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class CurrencyConverter {

    public static final Logger logger = Logger.getLogger(ConverterForm.class.getName());


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new ConverterForm().setVisible(true);
        }
    });
    }
}