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
    
    public GUIRecepcion(){

        super();
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

        TXBMarca = new javax.swing.JTextField ();
        TXBModelo = new javax.swing.JTextField ();
        TXBColor = new javax.swing.JTextField ();
        TXBPlacas = new javax.swing.JTextField ();
        TXBEstadoVehiculo = new javax.swing.JTextField ();
        TXBAcomodador = new javax.swing.JTextField ();
        TXBUbicacion = new javax.swing.JTextField ();
        
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

        PanelRecepcion.add(TXBMarca);
        PanelRecepcion.add(TXBModelo);
        PanelRecepcion.add(TXBColor);
        PanelRecepcion.add(TXBPlacas);
        PanelRecepcion.add(TXBEstadoVehiculo);
        PanelRecepcion.add(TXBAcomodador);
        PanelRecepcion.add(TXBUbicacion);
        
        BTNSalida.addActionListener((ActionEvent ae) -> {
            GUIMenu menu = new GUIMenu();
            menu.setVisible(true);
            this.dispose();
        });
        
        //GUICajones cajon = new GUICajones();
        //cajon.setBounds(10, 240, 400, 170);
        //PanelRecepcion.add(cajon);
        // Cajones
        int DerechaIzquierda =100;
        int ArribaAbajo = 250;
                JLabel LBL1 = new JLabel("1");
        LBL1.setBounds(DerechaIzquierda + 35, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL1);

        JLabel LBL2 = new JLabel("2");
        LBL2.setBounds(DerechaIzquierda + 55, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL2);

        JLabel LBL3 = new JLabel("3");
        LBL3.setBounds(DerechaIzquierda + 75, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL3);

        JLabel LBL4 = new JLabel("4");
        LBL4.setBounds(DerechaIzquierda + 95, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL4);

        JLabel LBL5 = new JLabel("5");
        LBL5.setBounds(DerechaIzquierda + 115, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL5);

        JLabel LBL6 = new JLabel("6");
        LBL6.setBounds(DerechaIzquierda + 135, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL6);

        JLabel LBL7 = new JLabel("7");
        LBL7.setBounds(DerechaIzquierda + 155, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL7);

        JLabel LBL8 = new JLabel("8");
        LBL8.setBounds(DerechaIzquierda + 175, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL8);

        JLabel LBL9 = new JLabel("9");
        LBL9.setBounds(DerechaIzquierda + 195, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL9);

        JLabel LBL10 = new JLabel("10");
        LBL10.setBounds(DerechaIzquierda + 210, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL10);

        JLabel LBL11 = new JLabel("11");
        LBL11.setBounds(DerechaIzquierda + 230, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL11);

        JLabel LBL12 = new JLabel("12");
        LBL12.setBounds(DerechaIzquierda + 250, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL12);

        JLabel LBL13 = new JLabel("13");
        LBL13.setBounds(DerechaIzquierda + 270, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL13);

        JLabel LBL14 = new JLabel("14");
        LBL14.setBounds(DerechaIzquierda + 290, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL14);

        JLabel LBL15 = new JLabel("15");
        LBL15.setBounds(DerechaIzquierda + 310, ArribaAbajo + 25, 15, 20);
        PanelRecepcion.add(LBL15);

        JLabel LBLA = new JLabel("A");
        LBLA.setFont(new Font("Helvetica", Font.PLAIN, 12));
        LBLA.setBounds(DerechaIzquierda + 10, ArribaAbajo + 45, 180, 20);
        PanelRecepcion.add(LBLA);

        JCheckBox jrb1 = new JCheckBox("A1");
        jrb1.setBounds(DerechaIzquierda + 30, ArribaAbajo + 45, 20, 20);
        jrb1.setSelected(false);
        jrb1.setBackground(Color.green);
        PanelRecepcion.add(jrb1);

        JCheckBox jrb2 = new JCheckBox("A2");
        jrb2.setBounds(DerechaIzquierda + 50, ArribaAbajo + 45, 20, 20);
        jrb2.setSelected(false);
        jrb2.setBackground(Color.green);
        PanelRecepcion.add(jrb2);

        JCheckBox jrb3 = new JCheckBox("A3");
        jrb3.setBounds(DerechaIzquierda + 70, ArribaAbajo + 45, 20, 20);
        jrb3.setSelected(false);
        jrb3.setBackground(Color.green);
        PanelRecepcion.add(jrb3);

        JCheckBox jrb4 = new JCheckBox("A4");
        jrb4.setBounds(DerechaIzquierda + 90, ArribaAbajo + 45, 20, 20);
        jrb4.setSelected(false);
        jrb4.setBackground(Color.green);
        PanelRecepcion.add(jrb4);

        JCheckBox jrb5 = new JCheckBox("A5");
        jrb5.setBounds(DerechaIzquierda + 110, ArribaAbajo + 45, 20, 20);
        jrb5.setSelected(false);
        jrb5.setBackground(Color.green);
        PanelRecepcion.add(jrb5);

        JCheckBox jrb6 = new JCheckBox("A6");
        jrb6.setBounds(DerechaIzquierda + 130, ArribaAbajo + 45, 20, 20);
        jrb6.setSelected(false);
        jrb6.setBackground(Color.green);
        PanelRecepcion.add(jrb6);

        JCheckBox jrb7 = new JCheckBox("A7");
        jrb7.setBounds(DerechaIzquierda + 150, ArribaAbajo + 45, 20, 20);
        jrb7.setSelected(false);
        jrb7.setBackground(Color.green);
        PanelRecepcion.add(jrb7);

        JCheckBox jrb8 = new JCheckBox("A8");
        jrb8.setBounds(DerechaIzquierda + 170, ArribaAbajo + 45, 20, 20);
        jrb8.setSelected(false);
        jrb8.setBackground(Color.green);
        PanelRecepcion.add(jrb8);

        JCheckBox jrb9 = new JCheckBox("A9");
        jrb9.setBounds(DerechaIzquierda + 190, ArribaAbajo + 45, 20, 20);
        jrb9.setSelected(false);
        jrb9.setBackground(Color.green);
        PanelRecepcion.add(jrb9);

        JCheckBox jrb10 = new JCheckBox("A10");
        jrb10.setBounds(DerechaIzquierda + 210, ArribaAbajo + 45, 20, 20);
        jrb10.setSelected(false);
        jrb10.setBackground(Color.green);
        PanelRecepcion.add(jrb10);

        JCheckBox jrb11 = new JCheckBox("A11");
        jrb11.setBounds(DerechaIzquierda + 230, ArribaAbajo + 45, 20, 20);
        jrb11.setSelected(false);
        jrb11.setBackground(Color.green);
        PanelRecepcion.add(jrb11);

        JCheckBox jrb12 = new JCheckBox("A12");
        jrb12.setBounds(DerechaIzquierda + 250, ArribaAbajo + 45, 20, 20);
        jrb12.setSelected(false);
        jrb12.setBackground(Color.green);
        PanelRecepcion.add(jrb12);

        JCheckBox jrb13 = new JCheckBox("A13");
        jrb13.setBounds(DerechaIzquierda + 270, ArribaAbajo + 45, 20, 20);
        jrb13.setSelected(false);
        jrb13.setBackground(Color.green);
        PanelRecepcion.add(jrb13);

        JCheckBox jrb14 = new JCheckBox("A14");
        jrb14.setBounds(DerechaIzquierda + 290, ArribaAbajo + 45, 20, 20);
        jrb14.setSelected(false);
        jrb14.setBackground(Color.green);
        PanelRecepcion.add(jrb14);

        JCheckBox jrb15 = new JCheckBox("A15");
        jrb15.setBounds(DerechaIzquierda + 310, ArribaAbajo + 45, 20, 20);
        jrb15.setSelected(false);
        jrb15.setBackground(Color.green);
        PanelRecepcion.add(jrb15);

        JLabel LBLB = new JLabel("B");
        LBLB.setFont(new Font("Helvetica", Font.PLAIN, 12));
        LBLB.setBounds(DerechaIzquierda + 10, ArribaAbajo + 70, 180, 20);
        PanelRecepcion.add(LBLB);

        JCheckBox jrb21 = new JCheckBox("B1");
        jrb21.setBounds(DerechaIzquierda + 30, ArribaAbajo + 70, 20, 20);
        jrb21.setSelected(false);
        jrb21.setBackground(Color.green);
        PanelRecepcion.add(jrb21);

        JCheckBox jrb22 = new JCheckBox("B2");
        jrb22.setBounds(DerechaIzquierda + 50, ArribaAbajo + 70, 20, 20);
        jrb22.setSelected(false);
        jrb22.setBackground(Color.green);
        PanelRecepcion.add(jrb22);

        JCheckBox jrb23 = new JCheckBox("B3");
        jrb23.setBounds(DerechaIzquierda + 70, ArribaAbajo + 70, 20, 20);
        jrb23.setSelected(false);
        jrb23.setBackground(Color.green);
        PanelRecepcion.add(jrb23);

        JCheckBox jrb24 = new JCheckBox("B4");
        jrb24.setBounds(DerechaIzquierda + 90, ArribaAbajo + 70, 20, 20);
        jrb24.setSelected(false);
        jrb24.setBackground(Color.green);
        PanelRecepcion.add(jrb24);

        JCheckBox jrb25 = new JCheckBox("B5");
        jrb25.setBounds(DerechaIzquierda + 110, ArribaAbajo + 70, 20, 20);
        jrb25.setSelected(false);
        jrb25.setBackground(Color.green);
        PanelRecepcion.add(jrb25);

        JCheckBox jrb26 = new JCheckBox("B6");
        jrb26.setBounds(DerechaIzquierda + 130, ArribaAbajo + 70, 20, 20);
        jrb26.setSelected(false);
        jrb26.setBackground(Color.green);
        PanelRecepcion.add(jrb26);

        JCheckBox jrb27 = new JCheckBox("B7");
        jrb27.setBounds(DerechaIzquierda + 150, ArribaAbajo + 70, 20, 20);
        jrb27.setSelected(false);
        jrb27.setBackground(Color.green);
        PanelRecepcion.add(jrb27);

        JCheckBox jrb28 = new JCheckBox("B8");
        jrb28.setBounds(DerechaIzquierda + 170, ArribaAbajo + 70, 20, 20);
        jrb28.setSelected(false);
        jrb28.setBackground(Color.green);
        PanelRecepcion.add(jrb28);

        JCheckBox jrb29 = new JCheckBox("B9");
        jrb29.setBounds(DerechaIzquierda + 190, ArribaAbajo + 70, 20, 20);
        jrb29.setSelected(false);
        jrb29.setBackground(Color.green);
        PanelRecepcion.add(jrb29);

        JCheckBox jrb30 = new JCheckBox("B10");
        jrb30.setBounds(DerechaIzquierda + 210, ArribaAbajo + 70, 20, 20);
        jrb30.setSelected(false);
        jrb30.setBackground(Color.green);
        PanelRecepcion.add(jrb30);

        JCheckBox jrb31 = new JCheckBox("B11");
        jrb31.setBounds(DerechaIzquierda + 230, ArribaAbajo + 70, 20, 20);
        jrb31.setSelected(false);
        jrb31.setBackground(Color.green);
        PanelRecepcion.add(jrb31);

        JCheckBox jrb32 = new JCheckBox("B12");
        jrb32.setBounds(DerechaIzquierda + 250, ArribaAbajo + 70, 20, 20);
        jrb32.setSelected(false);
        jrb32.setBackground(Color.green);
        PanelRecepcion.add(jrb32);

        JCheckBox jrb33 = new JCheckBox("B13");
        jrb33.setBounds(DerechaIzquierda + 270, ArribaAbajo + 70, 20, 20);
        jrb33.setSelected(false);
        jrb33.setBackground(Color.green);
        PanelRecepcion.add(jrb33);

        JCheckBox jrb34 = new JCheckBox("B14");
        jrb34.setBounds(DerechaIzquierda + 290, ArribaAbajo + 70, 20, 20);
        jrb34.setSelected(false);
        jrb34.setBackground(Color.green);
        PanelRecepcion.add(jrb34);

        JCheckBox jrb35 = new JCheckBox("B15");
        jrb35.setBounds(DerechaIzquierda + 310, ArribaAbajo + 70, 20, 20);
        jrb35.setSelected(false);
        jrb35.setBackground(Color.green);
        PanelRecepcion.add(jrb35);

        JLabel LBLC = new JLabel("C");
        LBLC.setFont(new Font("Helvetica", Font.PLAIN, 12));
        LBLC.setBounds(DerechaIzquierda + 10, ArribaAbajo + 95, 180, 20);
        PanelRecepcion.add(LBLC);

        JCheckBox jrb41 = new JCheckBox("C1");
        jrb41.setBounds(DerechaIzquierda + 30, ArribaAbajo + 95, 20, 20);
        jrb41.setSelected(false);
        jrb41.setBackground(Color.green);
        PanelRecepcion.add(jrb41);

        JCheckBox jrb42 = new JCheckBox("C2");
        jrb42.setBounds(DerechaIzquierda + 50, ArribaAbajo + 95, 20, 20);
        jrb42.setSelected(false);
        jrb42.setBackground(Color.green);
        PanelRecepcion.add(jrb42);

        JCheckBox jrb43 = new JCheckBox("C3");
        jrb43.setBounds(DerechaIzquierda + 70, ArribaAbajo + 95, 20, 20);
        jrb43.setSelected(false);
        jrb43.setBackground(Color.green);
        PanelRecepcion.add(jrb43);

        JCheckBox jrb44 = new JCheckBox("C4");
        jrb44.setBounds(DerechaIzquierda + 90, ArribaAbajo + 95, 20, 20);
        jrb44.setSelected(false);
        jrb44.setBackground(Color.green);
        PanelRecepcion.add(jrb44);

        JCheckBox jrb45 = new JCheckBox("C5");
        jrb45.setBounds(DerechaIzquierda + 110, ArribaAbajo + 95, 20, 20);
        jrb45.setSelected(false);
        jrb45.setBackground(Color.green);
        PanelRecepcion.add(jrb45);

        JCheckBox jrb46 = new JCheckBox("C6");
        jrb46.setBounds(DerechaIzquierda + 130, ArribaAbajo + 95, 20, 20);
        jrb46.setSelected(false);
        jrb46.setBackground(Color.green);
        PanelRecepcion.add(jrb46);

        JCheckBox jrb47 = new JCheckBox("C7");
        jrb47.setBounds(DerechaIzquierda + 150, ArribaAbajo + 95, 20, 20);
        jrb47.setSelected(false);
        jrb47.setBackground(Color.green);
        PanelRecepcion.add(jrb47);

        JCheckBox jrb48 = new JCheckBox("C8");
        jrb48.setBounds(DerechaIzquierda + 170, ArribaAbajo + 95, 20, 20);
        jrb48.setSelected(false);
        jrb48.setBackground(Color.green);
        PanelRecepcion.add(jrb48);

        JCheckBox jrb49 = new JCheckBox("C9");
        jrb49.setBounds(DerechaIzquierda + 190, ArribaAbajo + 95, 20, 20);
        jrb49.setSelected(false);
        jrb49.setBackground(Color.green);
        PanelRecepcion.add(jrb49);

        JCheckBox jrb50 = new JCheckBox("C10");
        jrb50.setBounds(DerechaIzquierda + 210, ArribaAbajo + 95, 20, 20);
        jrb50.setSelected(false);
        jrb50.setBackground(Color.green);
        PanelRecepcion.add(jrb50);

        JCheckBox jrb51 = new JCheckBox("C11");
        jrb51.setBounds(DerechaIzquierda + 230, ArribaAbajo + 95, 20, 20);
        jrb51.setSelected(false);
        jrb51.setBackground(Color.green);
        PanelRecepcion.add(jrb51);

        JCheckBox jrb52 = new JCheckBox("C12");
        jrb52.setBounds(DerechaIzquierda + 250, ArribaAbajo + 95, 20, 20);
        jrb52.setSelected(false);
        jrb52.setBackground(Color.green);
        PanelRecepcion.add(jrb52);

        JCheckBox jrb53 = new JCheckBox("C13");
        jrb53.setBounds(DerechaIzquierda + 270, ArribaAbajo + 95, 20, 20);
        jrb53.setSelected(false);
        jrb53.setBackground(Color.green);
        PanelRecepcion.add(jrb53);

        JCheckBox jrb54 = new JCheckBox("C14");
        jrb54.setBounds(DerechaIzquierda + 290, ArribaAbajo + 95, 20, 20);
        jrb54.setSelected(false);
        jrb54.setBackground(Color.green);
        PanelRecepcion.add(jrb54);

        JCheckBox jrb55 = new JCheckBox("C15");
        jrb55.setBounds(DerechaIzquierda + 310, ArribaAbajo + 95, 20, 20);
        jrb55.setSelected(false);
        jrb55.setBackground(Color.green);
        PanelRecepcion.add(jrb55);
                jrb1.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb1.getText();
                jrb1.setBackground(Color.red);
                jrb1.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb2.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb2.getText();
                jrb2.setBackground(Color.red);
                jrb2.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb3.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb3.getText();
                jrb3.setBackground(Color.red);
                jrb3.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb4.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb4.getText();
                jrb4.setBackground(Color.red);
                jrb4.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb5.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb5.getText();
                jrb5.setBackground(Color.red);
                jrb5.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb6.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb6.getText();
                jrb6.setBackground(Color.red);
                jrb6.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb7.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb7.getText();
                jrb7.setBackground(Color.red);
                jrb7.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb8.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb8.getText();
                jrb8.setBackground(Color.red);
                jrb8.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb9.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb9.getText();
                jrb9.setBackground(Color.red);
                jrb9.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb10.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb10.getText();
                jrb10.setBackground(Color.red);
                jrb10.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb11.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb11.getText();
                jrb11.setBackground(Color.red);
                jrb11.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });

        jrb12.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb12.getText();
                jrb12.setBackground(Color.red);
                jrb12.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb13.addActionListener((ActionEvent ae) -> {
            String nom;
            nom = jrb13.getText();
            jrb13.setBackground(Color.red);
            jrb13.setEnabled(false);
            TXBUbicacion.setText(nom);
        });
        jrb14.addActionListener((ActionEvent ae) -> {
            String nom;
            nom = jrb14.getText();
            jrb14.setBackground(Color.red);
            jrb14.setEnabled(false);
            TXBUbicacion.setText(nom);
        });
        jrb15.addActionListener((ActionEvent ae) -> {
            String nom;
            nom = jrb15.getText();
            jrb15.setBackground(Color.red);
            jrb15.setEnabled(false);
            TXBUbicacion.setText(nom);
        });

        jrb21.addActionListener((ActionEvent ae) -> {
            String nom;
            nom = jrb21.getText();
            jrb21.setBackground(Color.red);
            jrb21.setEnabled(false);
            TXBUbicacion.setText(nom);
        });
        jrb22.addActionListener((ActionEvent ae) -> {
            String nom;
            nom = jrb22.getText();
            jrb22.setBackground(Color.red);
            jrb22.setEnabled(false);
            TXBUbicacion.setText(nom);
        });
        jrb23.addActionListener((ActionEvent ae) -> {
            String nom;
            nom = jrb23.getText();
            jrb23.setBackground(Color.red);
            jrb23.setEnabled(false);
            TXBUbicacion.setText(nom);
        });
        jrb24.addActionListener((ActionEvent ae) -> {
            String nom;
            nom = jrb24.getText();
            jrb24.setBackground(Color.red);
            jrb24.setEnabled(false);
            TXBUbicacion.setText(nom);
        });
        jrb25.addActionListener((ActionEvent ae) -> {
            String nom;
            nom = jrb25.getText();
            jrb25.setBackground(Color.red);
            jrb25.setEnabled(false);
            TXBUbicacion.setText(nom);
        });
        jrb26.addActionListener((ActionEvent ae) -> {
            String nom;
            nom = jrb26.getText();
            jrb26.setBackground(Color.red);
            jrb26.setEnabled(false);
            TXBUbicacion.setText(nom);
        });
        jrb27.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb27.getText();
                jrb27.setBackground(Color.red);
                jrb27.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb28.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb28.getText();
                jrb28.setBackground(Color.red);
                jrb28.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb29.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb29.getText();
                jrb29.setBackground(Color.red);
                jrb29.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb30.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb30.getText();
                jrb30.setBackground(Color.red);
                jrb30.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb31.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb31.getText();
                jrb31.setBackground(Color.red);
                jrb31.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb32.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb32.getText();
                jrb32.setBackground(Color.red);
                jrb32.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb33.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb33.getText();
                jrb33.setBackground(Color.red);
                jrb33.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb34.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb34.getText();
                jrb34.setBackground(Color.red);
                jrb34.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb35.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb35.getText();
                jrb35.setBackground(Color.red);
                jrb35.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });

        jrb41.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb41.getText();
                jrb41.setBackground(Color.red);
                jrb41.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb42.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb42.getText();
                jrb42.setBackground(Color.red);
                jrb42.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb43.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb43.getText();
                jrb43.setBackground(Color.red);
                jrb43.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb44.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb44.getText();
                jrb44.setBackground(Color.red);
                jrb44.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        jrb45.addActionListener((ActionEvent ae) -> {
            {
                String nom;
                nom = jrb45.getText();
                jrb45.setBackground(Color.red);
                jrb45.setEnabled(false);
                TXBUbicacion.setText(nom);
            }
        });
        
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
