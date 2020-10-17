package dpo3_u2_a2_pivm;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;

public class GUIRecepcion extends JFrame implements ActionListener{
    
    JPanel PanelRecepcion;
    JLabel LBLTitulo, LBLSubTitulo, LBLFecha, LBLHora, LBLMarca, LBLModelo, LBLColor, LBLPlacas, LBLEstadoVehiculo, LBLAcomodador, LBLUbicacion;
    javax.swing.JTextField TXBMarca, TXBModelo, TXBColor, TXBPlacas, TXBEstadoVehiculo, TXBAcomodador, TXBUbicacion;
    String ubicacion;
    public GUIRecepcion(String Ubicacion){
        super();
        this.ubicacion = Ubicacion;
        initComponents();
    }
    
   private void initComponents(){
       
        this.setTitle("Recepcion");                   
        this.setSize(550, 510);                                 
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(false);                              
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        PanelRecepcion = new javax.swing.JPanel();
        PanelRecepcion.setSize(533, 470);
        this.add(PanelRecepcion);

        LBLTitulo = new javax.swing.JLabel("Recepcion de Autos");
        LBLSubTitulo = new javax.swing.JLabel("Pinotronic");
        
        String fechaActual;
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        fechaActual = formatofecha.format(fecha);
        LBLFecha = new javax.swing.JLabel(fechaActual);
                
        LBLHora = new JLabel(Hilo.Horas);

        LBLMarca = new javax.swing.JLabel("Marca");
        LBLModelo = new javax.swing.JLabel("Modelo");
        LBLColor = new javax.swing.JLabel("Color");
        LBLPlacas = new javax.swing.JLabel("Placas");
        LBLEstadoVehiculo = new javax.swing.JLabel("Estado Vehiculo");
        LBLAcomodador = new javax.swing.JLabel("Acomodador");
        LBLUbicacion = new javax.swing.JLabel("Ubicacion");
        JLabel LBLLogo = new javax.swing.JLabel();
        LBLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_a2_pivm/img/troncomobilPequeno.png")));

        TXBMarca = new javax.swing.JTextField ();
        TXBModelo = new javax.swing.JTextField ();
        TXBColor = new javax.swing.JTextField ();
        TXBPlacas = new javax.swing.JTextField ();
        TXBEstadoVehiculo = new javax.swing.JTextField ();
        TXBAcomodador = new javax.swing.JTextField ();
        TXBUbicacion = new javax.swing.JTextField (ubicacion);
        
        JButton BTNImprimir = new javax.swing.JButton("Imprimir");
        JButton BTNSalida = new javax.swing.JButton("Salida");
        
        LBLTitulo.setBounds(230, 10, 120, 20);
        LBLSubTitulo.setBounds(230, 40, 80, 20);
        LBLFecha.setBounds(230, 60, 100, 20);
        LBLHora.setBounds(230, 80, 100, 20);
        LBLMarca.setBounds(80, 100, 50, 20);
        LBLModelo.setBounds(80, 120, 50, 20);
        LBLColor.setBounds(80, 140, 50, 20);
        LBLPlacas.setBounds(80, 160, 50, 20);
        LBLEstadoVehiculo.setBounds(80, 180, 100, 20);
        LBLAcomodador.setBounds(80, 200, 100, 20);
        LBLUbicacion.setBounds(80, 220, 80, 20);
        LBLLogo.setBounds(100, 10, 80, 80);
        
        TXBMarca.setBounds(200, 100, 150, 20);
        TXBModelo.setBounds(200, 120, 150, 20);
        TXBColor.setBounds(200, 140, 150, 20);
        TXBPlacas.setBounds(200, 160, 150, 20);
        TXBEstadoVehiculo.setBounds(200, 180, 150, 20);
        TXBAcomodador.setBounds(200, 200, 150, 20);
        TXBUbicacion.setBounds(200, 220, 150, 20);

        BTNImprimir.setBounds(80, 420, 100, 30);
        BTNSalida.setBounds(400, 420, 80, 30);

        PanelRecepcion.add(LBLTitulo);
        PanelRecepcion.add(LBLSubTitulo);
        PanelRecepcion.add(LBLFecha);
        PanelRecepcion.add(LBLHora);
        PanelRecepcion.add(LBLMarca);
        PanelRecepcion.add(LBLModelo);
        PanelRecepcion.add(LBLColor);
        PanelRecepcion.add(LBLPlacas);
        PanelRecepcion.add(LBLEstadoVehiculo);
        PanelRecepcion.add(LBLAcomodador);
        PanelRecepcion.add(LBLUbicacion);
        PanelRecepcion.add(LBLLogo);

        PanelRecepcion.add(TXBMarca);
        PanelRecepcion.add(TXBModelo);
        PanelRecepcion.add(TXBColor);
        PanelRecepcion.add(TXBPlacas);
        PanelRecepcion.add(TXBEstadoVehiculo);
        PanelRecepcion.add(TXBAcomodador);
        PanelRecepcion.add(TXBUbicacion);
        
        BTNSalida.addActionListener((ActionEvent ae) -> {
            //GUICajones menu = new GUICajones();
            //menu.setVisible(true);
            this.dispose();
        });
        
        //GUICajones cajon = new GUICajones();
        //cajon.setBounds(10, 240, 400, 170);
        //PanelRecepcion.add(cajon);
        // Cajones

        
        Hilo h1 = new Hilo(LBLHora);
        h1.start();
        //Panel
        PanelRecepcion.add(BTNImprimir);
        PanelRecepcion.add(BTNSalida);
        PanelRecepcion.setLayout(null);
        PanelRecepcion.setVisible(true);
        PanelRecepcion.setBorder(BorderFactory.createLineBorder(Color.red, 1));
   }
    
        @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
