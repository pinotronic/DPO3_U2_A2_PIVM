
package dpo3_u2_ea_pivm;


public class calculos {
    
    public calculos(){
        double minuto; 
    }
    public double calcularTiempo(double minuto){
        
        double minutosdescuento;
        double fracioinarlotramosveinte;
        double resto;
        double eliminarresto;
        double pago = 0.0;
        
        if(minuto <= 60){
            System. out. println("El Pago sera de : $45.00 \n");
            pago = 45;
        }
        if(minuto > 60){
            minutosdescuento = minuto - 60;
            fracioinarlotramosveinte = minutosdescuento / 20;
            resto = fracioinarlotramosveinte%1;
            if(resto > 0){
                eliminarresto = fracioinarlotramosveinte - resto;
                fracioinarlotramosveinte = eliminarresto + 1;
            }
            pago = 45 + (fracioinarlotramosveinte * 5);
            System. out. println("El Pago sera de : " + pago);
        }
        return pago;
    }
        public double limpiandoFecha(String Fecha) {
        String TextoFinal = "";
        char ch = ':';
        int contador = 1;
        int horasAMinutos = 0;
        double sumaMinutos=0.0;
        for (char caracter : Fecha.toCharArray()) {
            if (caracter == ch) {
                if (contador == 1) {
                    horasAMinutos = Integer.valueOf(TextoFinal) * 60;
                    TextoFinal = "";
                    contador = 2;
                }else if(contador == 2){
                sumaMinutos =  Double.valueOf(horasAMinutos) + Double.parseDouble(TextoFinal);
            }

            } else {
                TextoFinal = TextoFinal + Character.toString(caracter);
            }
        }
        System.out.println( sumaMinutos );
        return sumaMinutos;
    }
}
