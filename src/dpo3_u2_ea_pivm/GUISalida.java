package dpo3_u2_ea_pivm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.text.CharacterIterator;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Date;
import javax.swing.JTextField;

public class GUISalida extends JFrame implements ActionListener {

    String ubicacion;
    SQLConexion con = new SQLConexion();

    public GUISalida(String Ubicacion) {
        super();
        this.ubicacion = Ubicacion;
        initComponents();
    }

    private void initComponents() {

        this.setTitle("Salida");
        this.setSize(550, 510);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        //this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel PanelSalida = new javax.swing.JPanel();
        PanelSalida.setSize(533, 470);
        this.add(PanelSalida);

        //BUSCAR NUMERO DE BOLETO EN BASE DE DATOS CAJON
        String[] modelo = new String[10];
        String[] NumeroBoleto = new String[1];
        String[] DatosBoleto =new String[10];
        System.out.println("ubicacion: " + ubicacion);
        NumeroBoleto = con.obt_BusquedanUMERObOLETO(ubicacion);
        System.out.println("ubicacion: " + NumeroBoleto[3]);
        //BUSCAR DATOS DEL VEHICULO EN BASE DE DATOS BOLETO
        DatosBoleto= con.obt_BusquedaRegistroAuto(NumeroBoleto[3]);

        //GUI
        JLabel LBLTitulo = new javax.swing.JLabel("Salida de Autos");
        JLabel LBLSubTitulo = new javax.swing.JLabel("En Buenas Manos");
        String fechaActual;
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        fechaActual = formatofecha.format(fecha);
        JLabel LBLFecha = new javax.swing.JLabel(fechaActual);

        JLabel LBLHora = new JLabel(Hilo.Horas);
        JLabel LBLNoBoleto = new javax.swing.JLabel("No. Boleto:");
        JLabel LBLAcomodador = new javax.swing.JLabel("Acomodador:");
        JLabel LBLMarca = new javax.swing.JLabel("Marca:");
        JLabel LBLColor = new javax.swing.JLabel("Color:");
        JLabel LBLPlacas = new javax.swing.JLabel("Placas:");
        JLabel LBLHoraEntrada = new javax.swing.JLabel("Hora de Entrada:");
        JLabel LBLHoraSalida = new javax.swing.JLabel("Hora de Salida:");
        JLabel LBLMinutosEstancia = new javax.swing.JLabel("Minutos:");
        JLabel LBLTotal = new javax.swing.JLabel("Total $:");
        JLabel LBLUbicacion = new javax.swing.JLabel("Ubicacion");
        JLabel LBLLogo = new javax.swing.JLabel();
        LBLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));

        JTextField TXBNoBoleto = new javax.swing.JTextField(DatosBoleto[0]);
        JTextField TXBAcomodador = new javax.swing.JTextField(DatosBoleto[7]);
        JTextField TXBMarca = new javax.swing.JTextField(DatosBoleto[2]);
        JTextField TXBColor = new javax.swing.JTextField(DatosBoleto[4]);
        JTextField TXBPlacas = new javax.swing.JTextField(DatosBoleto[5]);
        JTextField TXBHoraEntrada = new javax.swing.JTextField(DatosBoleto[9]);
        JTextField TXBHoraSalida = new javax.swing.JTextField(Hilo.Horas);
        JTextField TXBMinutosEstancia = new javax.swing.JTextField();
        JTextField TXBTotal = new javax.swing.JTextField();
        JTextField TXBUbicacion = new javax.swing.JTextField(ubicacion);

        JButton BTNBuscarCalcular = new javax.swing.JButton("...");
        JButton BTNSalida = new javax.swing.JButton("Cobrar");

        LBLTitulo.setFont(new Font("Helvetica", Font.PLAIN, 18));
        LBLSubTitulo.setFont(new Font("Helvetica", Font.PLAIN, 18));

        LBLTitulo.setBounds(230, 10, 180, 20);
        LBLSubTitulo.setBounds(230, 40, 180, 20);
        LBLFecha.setBounds(230, 60, 120, 20);
        LBLHora.setBounds(230, 80, 120, 20);
        LBLNoBoleto.setBounds(80, 100, 120, 20);
        LBLAcomodador.setBounds(80, 120, 120, 20);
        LBLMarca.setBounds(80, 140, 120, 20);
        LBLColor.setBounds(80, 160, 120, 20);
        LBLPlacas.setBounds(80, 180, 120, 20);
        LBLHoraEntrada.setBounds(80, 200, 120, 20);
        LBLHoraSalida.setBounds(80, 220, 120, 20);
        LBLMinutosEstancia.setBounds(80, 240, 120, 20);
        LBLTotal.setBounds(80, 260, 120, 20);
        LBLUbicacion.setBounds(80, 280, 120, 20);
        LBLLogo.setBounds(100, 10, 80, 80);

        TXBNoBoleto.setBounds(200, 100, 150, 20);
        TXBAcomodador.setBounds(200, 120, 150, 20);
        TXBMarca.setBounds(200, 140, 150, 20);
        TXBColor.setBounds(200, 160, 150, 20);
        TXBPlacas.setBounds(200, 180, 150, 20);
        TXBHoraEntrada.setBounds(200, 200, 150, 20);
        TXBHoraSalida.setBounds(200, 220, 150, 20);
        TXBMinutosEstancia.setBounds(200, 240, 150, 20);
        TXBTotal.setBounds(200, 260, 150, 20);
        TXBUbicacion.setBounds(200, 280, 150, 20);

        BTNBuscarCalcular.setBounds(360, 100, 50, 20);
        BTNSalida.setBounds(400, 420, 80, 30);

        PanelSalida.add(LBLTitulo);
        PanelSalida.add(LBLSubTitulo);
        PanelSalida.add(LBLFecha);
        PanelSalida.add(LBLHora);
        PanelSalida.add(LBLNoBoleto);
        PanelSalida.add(LBLAcomodador);
        PanelSalida.add(LBLMarca);
        PanelSalida.add(LBLColor);
        PanelSalida.add(LBLPlacas);
        PanelSalida.add(LBLHoraEntrada);
        PanelSalida.add(LBLHoraSalida);
        PanelSalida.add(LBLMinutosEstancia);
        PanelSalida.add(LBLTotal);
        PanelSalida.add(LBLUbicacion);
        PanelSalida.add(LBLLogo);

        PanelSalida.add(TXBNoBoleto);
        PanelSalida.add(TXBAcomodador);
        PanelSalida.add(TXBMarca);
        PanelSalida.add(TXBColor);
        PanelSalida.add(TXBPlacas);
        PanelSalida.add(TXBHoraEntrada);
        PanelSalida.add(TXBHoraSalida);
        PanelSalida.add(TXBMinutosEstancia);
        PanelSalida.add(TXBTotal);
        PanelSalida.add(TXBUbicacion);
        PanelSalida.add(BTNBuscarCalcular);
        PanelSalida.add(BTNSalida);
        
        
            TXBHoraSalida.setText(Hilo.Horas);



        

        BTNSalida.addActionListener((ActionEvent ae) -> {
            //GUARDAR DATOS DE PAGO
            String Id = TXBNoBoleto.getText();
            int id = Integer.valueOf(Id);
            String HoraSalida = TXBHoraSalida.getText();
            String minutosTotales = TXBMinutosEstancia.getText();
            String Total = TXBTotal.getText();
            
            con.RecepcionAutoEdicion(id, Total, minutosTotales, HoraSalida);
            this.dispose();
        });
        BTNBuscarCalcular.addActionListener((ActionEvent ae) -> {
            TXBHoraSalida.setText(Hilo.Horas);
                    //CALCULAR MINUTOS
            calculos calculo = new calculos();
            
            String HoraSalida = Hilo.Horas;
            
            System.out.println("hSalida: " + HoraSalida);

            //String HoraSalida = TXBHoraSalida.getText();
            String HoraEntrada = TXBHoraEntrada.getText();
            double HoraInicio = calculo.limpiandoFecha(HoraEntrada);
            double HoraTermino = calculo.limpiandoFecha(HoraSalida);
            double diferencia = HoraTermino - HoraInicio;
            String minutosTotales = String.valueOf(diferencia);
            TXBMinutosEstancia.setText(minutosTotales);
            
            //CALCULAR IMPORTE
            double Costo = calculo.calcularTiempo(diferencia);
            String Total = String.valueOf(Costo);
            TXBTotal.setText(Total);
        });

        Hilo h2 = new Hilo(LBLHora);
        h2.start();

        PanelSalida.add(BTNSalida);
        PanelSalida.setLayout(null);
        PanelSalida.setVisible(true);
        PanelSalida.setBorder(BorderFactory.createLineBorder(Color.red, 1));

    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
