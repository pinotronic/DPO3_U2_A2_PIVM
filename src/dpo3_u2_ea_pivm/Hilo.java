package dpo3_u2_ea_pivm;
import java.util.*;
import javax.swing.JLabel;
public class Hilo extends Thread{
    private GUISalida guisalida;
    static String Horas = "";
    String hora, minutos, segundos, ampm, tiempo;
    private final int contador = 0;
    JLabel LBLHora;
    public Hilo(JLabel hilo){
        this.LBLHora = hilo;
    }
    Hilo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void run(){
                
        while(!Thread.currentThread().isInterrupted()){
            
            Calendar calendario = new GregorianCalendar();
             hora = Integer.toString(calendario.get(Calendar.HOUR_OF_DAY));
             minutos = Integer.toString(calendario.get(Calendar.MINUTE));
             segundos = Integer.toString(calendario.get(Calendar.SECOND));
             Horas = hora+":"+ minutos+":"+segundos;
             LBLHora.setText(Horas);
             //System.out.println(hora+":"+ minutos+":"+segundos);
        try{
                
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Algo esta mal.");
                Thread.currentThread().interrupt();
            }
        }
        
    }

}


