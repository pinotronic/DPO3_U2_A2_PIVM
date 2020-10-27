package dpo3_u2_ea_pivm;
import java.util.*;
import javax.swing.JLabel;
public class HiloCajon extends Thread {
    private GUIRecepcion guirecepcion;
JLabel LBLHora;
    public HiloCajon(JLabel hiloCajon) {
        this.LBLHora = hiloCajon;
    }
    HiloCajon() {
        throw new UnsupportedOperationException("No soportado ."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void run() {
        int minutos = 0;
        while(!Thread.currentThread().isInterrupted()){
             minutos = minutos + 1;
              System.out.println("prueba");
              LBLHora.setText(String.valueOf(minutos));
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Algo esta mal.");
                Thread.currentThread().interrupt();
            }
        }
    }
}
