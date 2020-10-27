package dpo3_u2_ea_pivm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class GUICajones extends JFrame implements ActionListener {

    boolean statusA1 = false, statusA2 = false, statusA3 = false, statusA4 = false, statusA5 = false, statusA6 = false, statusA7 = false, statusA8 = false, statusA9 = false, statusA10 = false, statusA11 = false, statusA12 = false, statusA13 = false, statusA14 = false, statusA15 = false, statusB1 = false, statusB2 = false, statusB3 = false, statusB4 = false, statusB5 = false, statusB6 = false, statusB7 = false, statusB8 = false, statusB9 = false, statusB10 = false, statusB11 = false, statusB12 = false, statusB13 = false, statusB14 = false, statusB15 = false, statusC1 = false, statusC2 = false, statusC3 = false, statusC4 = false, statusC5 = false, statusC6 = false, statusC7 = false, statusC8 = false, statusC9 = false, statusC10 = false, statusC11 = false, statusC12 = false, statusC13 = false, statusC14 = false, statusC15 = false;
    HiloCajon A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15;

    public GUICajones() {
        super();
        initComponents();
    }

    private void initComponents() {
        int DerechaIzquierda = 20;
        int ArribaAbajoB = 58;
        int ArribaAbajoA = 110;
        int filaC = 50;
        this.setTitle("Cajones");
        this.setSize(1320, 680);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel PanelCajon = new javax.swing.JPanel();
        PanelCajon.setSize(1300, 637);
        this.add(PanelCajon);

        JLabel LBLNombreAlumno = new JLabel("Pino Martin Vargas Marquez.");

        LBLNombreAlumno.setBounds(500, 620, 180, 20);
        PanelCajon.add(LBLNombreAlumno);

        JLabel LBLMatricula = new JLabel("ES172005165");
        LBLMatricula.setBounds(680, 620, 180, 20);
        PanelCajon.add(LBLMatricula);

        JLabel LBLTituloPrincipal = new JLabel("ESTACIONAMIENTO");
        LBLTituloPrincipal.setFont(new Font("Helvetica", Font.PLAIN, 18));
        LBLTituloPrincipal.setBounds(550, 30, 180, 20);
        PanelCajon.add(LBLTituloPrincipal);

        JLabel LBLLogo = new javax.swing.JLabel();
        LBLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/logo.png")));
        LBLLogo.setBounds(400, 10, 100, 100);
        PanelCajon.add(LBLLogo);

        JLabel LBLSubTitulo = new JLabel("En Buenas Manos");
        LBLSubTitulo.setFont(new Font("Helvetica", Font.PLAIN, 18));
        LBLSubTitulo.setBounds(560, 60, 180, 20);
        PanelCajon.add(LBLSubTitulo);

        JLabel LBL1 = new JLabel("1");
        LBL1.setBounds(DerechaIzquierda + 70, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL1);

        JLabel LBL2 = new JLabel("2");
        LBL2.setBounds(DerechaIzquierda + 150, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL2);

        JLabel LBL3 = new JLabel("3");
        LBL3.setBounds(DerechaIzquierda + 230, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL3);

        JLabel LBL4 = new JLabel("4");
        LBL4.setBounds(DerechaIzquierda + 310, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL4);

        JLabel LBL5 = new JLabel("5");
        LBL5.setBounds(DerechaIzquierda + 390, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL5);

        JLabel LBL6 = new JLabel("6");
        LBL6.setBounds(DerechaIzquierda + 470, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL6);

        JLabel LBL7 = new JLabel("7");
        LBL7.setBounds(DerechaIzquierda + 550, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL7);

        JLabel LBL8 = new JLabel("8");
        LBL8.setBounds(DerechaIzquierda + 630, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL8);

        JLabel LBL9 = new JLabel("9");
        LBL9.setBounds(DerechaIzquierda + 710, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL9);

        JLabel LBL10 = new JLabel("10");
        LBL10.setBounds(DerechaIzquierda + 790, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL10);

        JLabel LBL11 = new JLabel("11");
        LBL11.setBounds(DerechaIzquierda + 870, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL11);

        JLabel LBL12 = new JLabel("12");
        LBL12.setBounds(DerechaIzquierda + 950, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL12);

        JLabel LBL13 = new JLabel("13");
        LBL13.setBounds(DerechaIzquierda + 1030, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL13);

        JLabel LBL14 = new JLabel("14");
        LBL14.setBounds(DerechaIzquierda + 1110, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL14);

        JLabel LBL15 = new JLabel("15");
        LBL15.setBounds(DerechaIzquierda + 1190, ArribaAbajoA + 25, 15, 20);
        PanelCajon.add(LBL15);

        JLabel LBLA = new JLabel("A");
        LBLA.setFont(new Font("Helvetica", Font.PLAIN, 12));
        LBLA.setBounds(DerechaIzquierda + 10, ArribaAbajoA + 70, 180, 20);
        PanelCajon.add(LBLA);

        JButton BTNa1 = new JButton("A1");
        BTNa1.setBounds(DerechaIzquierda + 30, ArribaAbajoA + 45, 80, 75);
        BTNa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa1);

        JButton BTNa2 = new JButton("A2");
        BTNa2.setBounds(DerechaIzquierda + 110, ArribaAbajoA + 45, 80, 75);
        BTNa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa2);

        JButton BTNa3 = new JButton("A3");
        BTNa3.setBounds(DerechaIzquierda + 190, ArribaAbajoA + 45, 80, 75);
        BTNa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa3);

        JButton BTNa4 = new JButton("A4");
        BTNa4.setBounds(DerechaIzquierda + 270, ArribaAbajoA + 45, 80, 75);
        BTNa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa4);

        JButton BTNa5 = new JButton("A5");
        BTNa5.setBounds(DerechaIzquierda + 350, ArribaAbajoA + 45, 80, 75);
        BTNa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa5);

        JButton BTNa6 = new JButton("A6");
        BTNa6.setBounds(DerechaIzquierda + 430, ArribaAbajoA + 45, 80, 75);
        BTNa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa6);

        JButton BTNa7 = new JButton("A7");
        BTNa7.setBounds(DerechaIzquierda + 510, ArribaAbajoA + 45, 80, 75);
        BTNa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa7);

        JButton BTNa8 = new JButton("A8");
        BTNa8.setBounds(DerechaIzquierda + 590, ArribaAbajoA + 45, 80, 75);
        BTNa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa8);

        JButton BTNa9 = new JButton("A9");
        BTNa9.setBounds(DerechaIzquierda + 670, ArribaAbajoA + 45, 80, 75);
        BTNa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa9);

        JButton BTNa10 = new JButton("A10");
        BTNa10.setBounds(DerechaIzquierda + 750, ArribaAbajoA + 45, 80, 75);
        BTNa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa10);

        JButton BTNa11 = new JButton("A11");
        BTNa11.setBounds(DerechaIzquierda + 830, ArribaAbajoA + 45, 80, 75);
        BTNa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa11);

        JButton BTNa12 = new JButton("A12");
        BTNa12.setBounds(DerechaIzquierda + 910, ArribaAbajoA + 45, 80, 75);
        BTNa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa12);

        JButton BTNa13 = new JButton("A13");
        BTNa13.setBounds(DerechaIzquierda + 990, ArribaAbajoA + 45, 80, 75);
        BTNa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa13);

        JButton BTNa14 = new JButton("A14");
        BTNa14.setBounds(DerechaIzquierda + 1070, ArribaAbajoA + 45, 80, 75);
        BTNa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa14);

        JButton BTNa15 = new JButton("A15");
        BTNa15.setBounds(DerechaIzquierda + 1150, ArribaAbajoA + 45, 80, 75);
        BTNa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNa15);

        JLabel LBLB = new JLabel("B");
        LBLB.setFont(new Font("Helvetica", Font.PLAIN, 12));
        LBLB.setBounds(DerechaIzquierda + 10, ArribaAbajoB + 230, 180, 20);
        PanelCajon.add(LBLB);

        JButton BTNb1 = new JButton("B1");
        BTNb1.setBounds(DerechaIzquierda + 30, ArribaAbajoB + 195, 80, 75);
        BTNb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb1);

        JButton BTNb2 = new JButton("B2");
        BTNb2.setBounds(DerechaIzquierda + 110, ArribaAbajoB + 195, 80, 75);
        BTNb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb2);

        JButton BTNb3 = new JButton("B3");
        BTNb3.setBounds(DerechaIzquierda + 190, ArribaAbajoB + 195, 80, 75);
        BTNb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb3);

        JButton BTNb4 = new JButton("B4");
        BTNb4.setBounds(DerechaIzquierda + 270, ArribaAbajoB + 195, 80, 75);
        BTNb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb4);

        JButton BTNb5 = new JButton("B5");
        BTNb5.setBounds(DerechaIzquierda + 350, ArribaAbajoB + 195, 80, 75);
        BTNb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb5);

        JButton BTNb6 = new JButton("B6");
        BTNb6.setBounds(DerechaIzquierda + 430, ArribaAbajoB + 195, 80, 75);
        BTNb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb6);

        JButton BTNb7 = new JButton("B7");
        BTNb7.setBounds(DerechaIzquierda + 510, ArribaAbajoB + 195, 80, 75);
        BTNb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb7);

        JButton BTNb8 = new JButton("B8");
        BTNb8.setBounds(DerechaIzquierda + 590, ArribaAbajoB + 195, 80, 75);
        BTNb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb8);

        JButton BTNb9 = new JButton("B9");
        BTNb9.setBounds(DerechaIzquierda + 670, ArribaAbajoB + 195, 80, 75);
        BTNb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb9);

        JButton BTNb10 = new JButton("B10");
        BTNb10.setBounds(DerechaIzquierda + 750, ArribaAbajoB + 195, 80, 75);
        BTNb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb10);

        JButton BTNb11 = new JButton("B11");
        BTNb11.setBounds(DerechaIzquierda + 830, ArribaAbajoB + 195, 80, 75);
        BTNb11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb11);

        JButton BTNb12 = new JButton("B12");
        BTNb12.setBounds(DerechaIzquierda + 910, ArribaAbajoB + 195, 80, 75);
        BTNb12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb12);

        JButton BTNb13 = new JButton("B13");
        BTNb13.setBounds(DerechaIzquierda + 990, ArribaAbajoB + 195, 80, 75);
        BTNb13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb13);

        JButton BTNb14 = new JButton("B14");
        BTNb14.setBounds(DerechaIzquierda + 1070, ArribaAbajoB + 195, 80, 75);
        BTNb14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb14);

        JButton BTNb15 = new JButton("B15");
        BTNb15.setBounds(DerechaIzquierda + 1150, ArribaAbajoB + 195, 80, 75);
        BTNb15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNb15);

        JLabel LBLC = new JLabel("C");
        LBLC.setFont(new Font("Helvetica", Font.PLAIN, 12));
        LBLC.setBounds(DerechaIzquierda + 10, 380, 180, 20);
        PanelCajon.add(LBLC);

        JButton BTNc1 = new JButton("C1");
        BTNc1.setBounds(DerechaIzquierda + 30, filaC + 300, 80, 75);
        BTNc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc1);

        JButton BTNc2 = new JButton("C2");
        BTNc2.setBounds(DerechaIzquierda + 110, filaC + 300, 80, 75);
        BTNc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc2);

        JButton BTNc3 = new JButton("C3");
        BTNc3.setBounds(DerechaIzquierda + 190, filaC + 300, 80, 75);
        BTNc3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc3);

        JButton BTNc4 = new JButton("C4");
        BTNc4.setBounds(DerechaIzquierda + 270, filaC + 300, 80, 75);
        BTNc4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc4);

        JButton BTNc5 = new JButton("C5");
        BTNc5.setBounds(DerechaIzquierda + 350, filaC + 300, 80, 75);
        BTNc5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc5);

        JButton BTNc6 = new JButton("C6");
        BTNc6.setBounds(DerechaIzquierda + 430, filaC + 300, 80, 75);
        BTNc6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc6);

        JButton BTNc7 = new JButton("C7");
        BTNc7.setBounds(DerechaIzquierda + 510, filaC + 300, 80, 75);
        BTNc7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc7);

        JButton BTNc8 = new JButton("C8");
        BTNc8.setBounds(DerechaIzquierda + 590, filaC + 300, 80, 75);
        BTNc8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc8);

        JButton BTNc9 = new JButton("C9");
        BTNc9.setBounds(DerechaIzquierda + 670, filaC + 300, 80, 75);
        BTNc9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc9);

        JButton BTNc10 = new JButton("C10");
        BTNc10.setBounds(DerechaIzquierda + 750, filaC + 300, 80, 75);
        BTNc10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc10);

        JButton BTNc11 = new JButton("C11");
        BTNc11.setBounds(DerechaIzquierda + 830, filaC + 300, 80, 75);
        BTNc11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc11);

        JButton BTNc12 = new JButton("C12");
        BTNc12.setBounds(DerechaIzquierda + 910, filaC + 300, 80, 75);
        BTNc12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc12);

        JButton BTNc13 = new JButton("C13");
        BTNc13.setBounds(DerechaIzquierda + 990, filaC + 300, 80, 75);
        BTNc13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc13);

        JButton BTNc14 = new JButton("C14");
        BTNc14.setBounds(DerechaIzquierda + 1070, filaC + 300, 80, 75);
        BTNc14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc14);

        JButton BTNc15 = new JButton("C15");
        BTNc15.setBounds(DerechaIzquierda + 1150, filaC + 300, 80, 75);
        BTNc15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
        PanelCajon.add(BTNc15);

        JButton BTNAdministrador = new JButton();
        JButton BTNBoleto = new javax.swing.JButton();
        JButton BTNCajonDisponible = new JButton();
        JButton BTNNomina = new JButton();
        JButton BTNEmpleados = new JButton();
        JButton BTNSalidas = new JButton("Salida");

        //JLabel LBLLogo = new javax.swing.JLabel();
        JLabel LBLBoleto = new javax.swing.JLabel("EnConstruccion");
        JLabel LBLAdministrador = new javax.swing.JLabel("REPORTES");
        JLabel LBLCajon = new javax.swing.JLabel("EnConstruccion");
        JLabel LBLNomina = new javax.swing.JLabel("NOMINA");
        JLabel LBLChat = new javax.swing.JLabel("EMPLEADOS");

        BTNBoleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/Control.png")));
        BTNNomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/Dolares.png")));
        BTNCajonDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/Control.png")));
        BTNEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/Chat.png")));
        BTNAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/Administracion.png")));
        LBLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/logo.png")));

        BTNBoleto.setBounds(430, 500, 80, 75);
        PanelCajon.add(BTNBoleto);

        LBLBoleto.setBounds(440, 575, 150, 20);
        PanelCajon.add(LBLBoleto);

        BTNNomina.setBounds(526, 500, 80, 75);
        PanelCajon.add(BTNNomina);

        LBLNomina.setBounds(536, 575, 150, 20);
        PanelCajon.add(LBLNomina);

        BTNCajonDisponible.setBounds(622, 500, 80, 75);
        PanelCajon.add(BTNCajonDisponible);

        LBLCajon.setBounds(632, 575, 150, 20);
        PanelCajon.add(LBLCajon);

        BTNEmpleados.setBounds(718, 500, 80, 75);
        PanelCajon.add(BTNEmpleados);

        LBLChat.setBounds(728, 575, 150, 20);
        PanelCajon.add(LBLChat);

        BTNAdministrador.setBounds(814, 500, 80, 75);
        PanelCajon.add(BTNAdministrador);

        LBLAdministrador.setBounds(824, 575, 150, 20);
        PanelCajon.add(LBLAdministrador);

        BTNSalidas.setBounds(795, 595, 100, 30);
        PanelCajon.add(BTNSalidas);
// #CajonesEstacionamiento
        JLabel LBLA1 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA2 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA3 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA4 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA5 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA6 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA7 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA8 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA9 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA10 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA11 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA12 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA13 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA14 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLA15 = new javax.swing.JLabel(Hilo.Horas);

        JLabel LBLB1 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB2 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB3 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB4 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB5 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB6 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB7 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB8 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB9 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB10 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB11 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB12 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB13 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB14 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLB15 = new javax.swing.JLabel(Hilo.Horas);

        JLabel LBLC1 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC2 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC3 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC4 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC5 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC6 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC7 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC8 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC9 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC10 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC11 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC12 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC13 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC14 = new javax.swing.JLabel(Hilo.Horas);
        JLabel LBLC15 = new javax.swing.JLabel(Hilo.Horas);

        LBLA1.setBounds(DerechaIzquierda + 30, ArribaAbajoA + 120, 120, 20);
        LBLA2.setBounds(DerechaIzquierda + 110, ArribaAbajoA + 120, 120, 20);
        LBLA3.setBounds(DerechaIzquierda + 190, ArribaAbajoA + 120, 120, 20);
        LBLA4.setBounds(DerechaIzquierda + 270, ArribaAbajoA + 120, 120, 20);
        LBLA5.setBounds(DerechaIzquierda + 350, ArribaAbajoA + 120, 120, 20);
        LBLA6.setBounds(DerechaIzquierda + 430, ArribaAbajoA + 120, 120, 20);
        LBLA7.setBounds(DerechaIzquierda + 510, ArribaAbajoA + 120, 120, 20);
        LBLA8.setBounds(DerechaIzquierda + 590, ArribaAbajoA + 120, 120, 20);
        LBLA9.setBounds(DerechaIzquierda + 670, ArribaAbajoA + 120, 120, 20);
        LBLA10.setBounds(DerechaIzquierda + 750, ArribaAbajoA + 120, 120, 20);
        LBLA11.setBounds(DerechaIzquierda + 830, ArribaAbajoA + 120, 120, 20);
        LBLA12.setBounds(DerechaIzquierda + 910, ArribaAbajoA + 120, 120, 20);
        LBLA13.setBounds(DerechaIzquierda + 990, ArribaAbajoA + 120, 120, 20);
        LBLA14.setBounds(DerechaIzquierda + 1070, ArribaAbajoA + 120, 120, 20);
        LBLA15.setBounds(DerechaIzquierda + 1150, ArribaAbajoA + 120, 120, 20);
        LBLB1.setBounds(DerechaIzquierda + 30, ArribaAbajoB + 270, 120, 20);
        LBLB2.setBounds(DerechaIzquierda + 110, ArribaAbajoB + 270, 120, 20);
        LBLB3.setBounds(DerechaIzquierda + 190, ArribaAbajoB + 270, 120, 20);
        LBLB4.setBounds(DerechaIzquierda + 270, ArribaAbajoB + 270, 120, 20);
        LBLB5.setBounds(DerechaIzquierda + 350, ArribaAbajoB + 270, 120, 20);
        LBLB6.setBounds(DerechaIzquierda + 430, ArribaAbajoB + 270, 120, 20);
        LBLB7.setBounds(DerechaIzquierda + 510, ArribaAbajoB + 270, 120, 20);
        LBLB8.setBounds(DerechaIzquierda + 590, ArribaAbajoB + 270, 120, 20);
        LBLB9.setBounds(DerechaIzquierda + 670, ArribaAbajoB + 270, 120, 20);
        LBLB10.setBounds(DerechaIzquierda + 750, ArribaAbajoB + 270, 120, 20);
        LBLB11.setBounds(DerechaIzquierda + 830, ArribaAbajoB + 270, 120, 20);
        LBLB12.setBounds(DerechaIzquierda + 910, ArribaAbajoB + 270, 120, 20);
        LBLB13.setBounds(DerechaIzquierda + 990, ArribaAbajoB + 270, 120, 20);
        LBLB14.setBounds(DerechaIzquierda + 1070, ArribaAbajoB + 270, 120, 20);
        LBLB15.setBounds(DerechaIzquierda + 1150, ArribaAbajoB + 270, 120, 20);
        LBLC1.setBounds(DerechaIzquierda + 30, 430, 120, 20);
        LBLC2.setBounds(DerechaIzquierda + 110, 430, 120, 20);
        LBLC3.setBounds(DerechaIzquierda + 190, 430, 120, 20);
        LBLC4.setBounds(DerechaIzquierda + 270, 430, 120, 20);
        LBLC5.setBounds(DerechaIzquierda + 350, 430, 120, 20);
        LBLC6.setBounds(DerechaIzquierda + 430, 430, 120, 20);
        LBLC7.setBounds(DerechaIzquierda + 510, 430, 120, 20);
        LBLC8.setBounds(DerechaIzquierda + 590, 430, 120, 20);
        LBLC9.setBounds(DerechaIzquierda + 670, 430, 120, 20);
        LBLC10.setBounds(DerechaIzquierda + 750, 430, 120, 20);
        LBLC11.setBounds(DerechaIzquierda + 830, 430, 120, 20);
        LBLC12.setBounds(DerechaIzquierda + 910, 430, 120, 20);
        LBLC13.setBounds(DerechaIzquierda + 990, 430, 120, 20);
        LBLC14.setBounds(DerechaIzquierda + 1070, 430, 120, 20);
        LBLC15.setBounds(DerechaIzquierda + 1150, 430, 120, 20);

        PanelCajon.add(LBLA1);
        PanelCajon.add(LBLA2);
        PanelCajon.add(LBLA3);
        PanelCajon.add(LBLA4);
        PanelCajon.add(LBLA5);
        PanelCajon.add(LBLA6);
        PanelCajon.add(LBLA7);
        PanelCajon.add(LBLA8);
        PanelCajon.add(LBLA9);
        PanelCajon.add(LBLA10);
        PanelCajon.add(LBLA11);
        PanelCajon.add(LBLA12);
        PanelCajon.add(LBLA13);
        PanelCajon.add(LBLA14);
        PanelCajon.add(LBLA15);
        PanelCajon.add(LBLB1);
        PanelCajon.add(LBLB2);
        PanelCajon.add(LBLB3);
        PanelCajon.add(LBLB4);
        PanelCajon.add(LBLB5);
        PanelCajon.add(LBLB6);
        PanelCajon.add(LBLB7);
        PanelCajon.add(LBLB8);
        PanelCajon.add(LBLB9);
        PanelCajon.add(LBLB10);
        PanelCajon.add(LBLB11);
        PanelCajon.add(LBLB12);
        PanelCajon.add(LBLB13);
        PanelCajon.add(LBLB14);
        PanelCajon.add(LBLB15);
        PanelCajon.add(LBLC1);
        PanelCajon.add(LBLC2);
        PanelCajon.add(LBLC3);
        PanelCajon.add(LBLC4);
        PanelCajon.add(LBLC5);
        PanelCajon.add(LBLC6);
        PanelCajon.add(LBLC7);
        PanelCajon.add(LBLC8);
        PanelCajon.add(LBLC9);
        PanelCajon.add(LBLC10);
        PanelCajon.add(LBLC11);
        PanelCajon.add(LBLC12);
        PanelCajon.add(LBLC13);
        PanelCajon.add(LBLC14);
        PanelCajon.add(LBLC15);
// #AccionBotones
        BTNa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA1 == false) {
                    BTNa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A1 = new HiloCajon(LBLA1);
                    A1.start();
                    statusA1 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A1");
                    guiRecepcion.setVisible(true);
                } else if (statusA1 == true) {
                    A1.stop();
                    LBLA1.setText("0");
                    statusA1 = false;
                    GUISalida salida = new GUISalida("A1");
                    salida.setVisible(true);
                    BTNa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA2 == false) {
                    BTNa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A2 = new HiloCajon(LBLA2);
                    A2.start();
                    statusA2 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A2");
                    guiRecepcion.setVisible(true);
                } else if (statusA2 == true) {
                    A2.stop();
                    LBLA2.setText("0");
                    statusA2 = false;
                    GUISalida salida = new GUISalida("A2");
                    salida.setVisible(true);
                    BTNa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA3 == false) {
                    BTNa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A3 = new HiloCajon(LBLA3);
                    A3.start();
                    statusA3 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A3");
                    guiRecepcion.setVisible(true);
                } else if (statusA3 == true) {
                    A3.stop();
                    LBLA3.setText("0");
                    statusA3 = false;
                    GUISalida salida = new GUISalida("A3");
                    salida.setVisible(true);
                    BTNa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA4 == false) {
                    BTNa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A4 = new HiloCajon(LBLA4);
                    A4.start();
                    statusA4 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A4");
                    guiRecepcion.setVisible(true);
                } else if (statusA4 == true) {
                    A4.stop();
                    LBLA4.setText("0");
                    statusA4 = false;
                    GUISalida salida = new GUISalida("A4");
                    salida.setVisible(true);
                    BTNa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA5 == false) {
                    BTNa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A5 = new HiloCajon(LBLA5);
                    A5.start();
                    statusA5 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A5");
                    guiRecepcion.setVisible(true);
                } else if (statusA5 == true) {
                    A5.stop();
                    LBLA5.setText("0");
                    statusA5 = false;
                    GUISalida salida = new GUISalida("A5");
                    salida.setVisible(true);
                    BTNa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA6 == false) {
                    BTNa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A6 = new HiloCajon(LBLA6);
                    A6.start();
                    statusA6 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A6");
                    guiRecepcion.setVisible(true);
                } else if (statusA6 == true) {
                    A6.stop();
                    LBLA6.setText("0");
                    statusA6 = false;
                    GUISalida salida = new GUISalida("A6");
                    salida.setVisible(true);
                    BTNa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA7 == false) {
                    BTNa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A7 = new HiloCajon(LBLA7);
                    A7.start();
                    statusA7 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A7");
                    guiRecepcion.setVisible(true);
                } else if (statusA7 == true) {
                    A7.stop();
                    LBLA7.setText("0");
                    statusA7 = false;
                    GUISalida salida = new GUISalida("A7");
                    salida.setVisible(true);
                    BTNa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA8 == false) {
                    BTNa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A8 = new HiloCajon(LBLA8);
                    A8.start();
                    statusA8 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A8");
                    guiRecepcion.setVisible(true);
                } else if (statusA8 == true) {
                    A8.stop();
                    LBLA8.setText("0");
                    statusA8 = false;
                    GUISalida salida = new GUISalida("A8");
                    salida.setVisible(true);
                    BTNa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA9 == false) {
                    BTNa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A9 = new HiloCajon(LBLA9);
                    A9.start();
                    statusA9 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A9");
                    guiRecepcion.setVisible(true);
                } else if (statusA9 == true) {
                    A9.stop();
                    LBLA9.setText("0");
                    statusA9 = false;
                    GUISalida salida = new GUISalida("A9");
                    salida.setVisible(true);
                    BTNa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA10 == false) {
                    BTNa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A10 = new HiloCajon(LBLA10);
                    A10.start();
                    statusA10 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A10");
                    guiRecepcion.setVisible(true);
                } else if (statusA10 == true) {
                    A10.stop();
                    LBLA10.setText("0");
                    statusA10 = false;
                    GUISalida salida = new GUISalida("A10");
                    salida.setVisible(true);
                    BTNa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA11 == false) {
                    BTNa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A11 = new HiloCajon(LBLA11);
                    A11.start();
                    statusA11 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A11");
                    guiRecepcion.setVisible(true);
                } else if (statusA11 == true) {
                    A11.stop();
                    LBLA11.setText("0");
                    statusA11 = false;
                    GUISalida salida = new GUISalida("A11");
                    salida.setVisible(true);
                    BTNa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA12 == false) {
                    BTNa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A12 = new HiloCajon(LBLA12);
                    A12.start();
                    statusA12 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A12");
                    guiRecepcion.setVisible(true);
                } else if (statusA12 == true) {
                    A12.stop();
                    LBLA12.setText("0");
                    statusA12 = false;
                    GUISalida salida = new GUISalida("A12");
                    salida.setVisible(true);
                    BTNa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA13 == false) {
                    BTNa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A13 = new HiloCajon(LBLA13);
                    A13.start();
                    statusA13 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A13");
                    guiRecepcion.setVisible(true);
                } else if (statusA13 == true) {
                    A13.stop();
                    LBLA13.setText("0");
                    statusA13 = false;
                    GUISalida salida = new GUISalida("A13");
                    salida.setVisible(true);
                    BTNa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA14 == false) {
                    BTNa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A14 = new HiloCajon(LBLA14);
                    A14.start();
                    statusA14 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A14");
                    guiRecepcion.setVisible(true);
                } else if (statusA14 == true) {
                    A14.stop();
                    LBLA14.setText("0");
                    statusA14 = false;
                    GUISalida salida = new GUISalida("A14");
                    salida.setVisible(true);
                    BTNa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNa15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusA15 == false) {
                    BTNa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    A15 = new HiloCajon(LBLA15);
                    A15.start();
                    statusA15 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("A15");
                    guiRecepcion.setVisible(true);
                } else if (statusA15 == true) {
                    A15.stop();
                    LBLA15.setText("0");
                    statusA15 = false;
                    GUISalida salida = new GUISalida("A15");
                    salida.setVisible(true);
                    BTNa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB1 == false) {
                    BTNb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B1 = new HiloCajon(LBLB1);
                    B1.start();
                    statusB1 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B1");
                    guiRecepcion.setVisible(true);
                } else if (statusB1 == true) {
                    B1.stop();
                    LBLB1.setText("0");
                    statusB1 = false;
                    GUISalida salida = new GUISalida("B1");
                    salida.setVisible(true);
                    BTNb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB2 == false) {
                    BTNb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B2 = new HiloCajon(LBLB2);
                    B2.start();
                    statusB2 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B2");
                    guiRecepcion.setVisible(true);

                } else if (statusB2 == true) {
                    B2.stop();
                    LBLB1.setText("0");
                    statusB2 = false;
                    GUISalida salida = new GUISalida("B2");
                    salida.setVisible(true);
                    BTNb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB3 == false) {
                    BTNb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B3 = new HiloCajon(LBLB3);
                    B3.start();
                    statusB3 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B3");
                    guiRecepcion.setVisible(true);

                } else if (statusB3 == true) {
                    B3.stop();
                    LBLB3.setText("0");
                    statusB3 = false;
                    GUISalida salida = new GUISalida("B3");
                    salida.setVisible(true);
                    BTNb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB4 == false) {
                    BTNb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B4 = new HiloCajon(LBLB4);
                    B4.start();
                    statusB4 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B4");
                    guiRecepcion.setVisible(true);

                } else if (statusB4 == true) {
                    B4.stop();
                    LBLB4.setText("0");
                    statusB4 = false;
                    GUISalida salida = new GUISalida("B4");
                    salida.setVisible(true);
                    BTNb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB5 == false) {
                    BTNb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B5 = new HiloCajon(LBLB5);
                    B5.start();
                    statusB5 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B5");
                    guiRecepcion.setVisible(true);

                } else if (statusB5 == true) {
                    B5.stop();
                    LBLB5.setText("0");
                    statusB5 = false;
                    GUISalida salida = new GUISalida("B5");
                    salida.setVisible(true);
                    BTNb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB6 == false) {
                    BTNb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B6 = new HiloCajon(LBLB6);
                    B6.start();
                    statusB6 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B6");
                    guiRecepcion.setVisible(true);

                } else if (statusB6 == true) {
                    B6.stop();
                    LBLB6.setText("0");
                    statusB6 = false;
                    GUISalida salida = new GUISalida("B6");
                    salida.setVisible(true);
                    BTNb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB7 == false) {
                    BTNb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B7 = new HiloCajon(LBLB7);
                    B7.start();
                    statusB7 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B7");
                    guiRecepcion.setVisible(true);

                } else if (statusB7 == true) {
                    B7.stop();
                    LBLB7.setText("0");
                    statusB7 = false;
                    GUISalida salida = new GUISalida("B7");
                    salida.setVisible(true);
                    BTNb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB8 == false) {
                    BTNb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B8 = new HiloCajon(LBLB8);
                    B8.start();
                    statusB8 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B8");
                    guiRecepcion.setVisible(true);

                } else if (statusB8 == true) {
                    B8.stop();
                    LBLB8.setText("0");
                    statusB8 = false;
                    GUISalida salida = new GUISalida("B8");
                    salida.setVisible(true);
                    BTNb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB9 == false) {
                    BTNb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B9 = new HiloCajon(LBLB9);
                    B9.start();
                    statusB9 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B9");
                    guiRecepcion.setVisible(true);

                } else if (statusB9 == true) {
                    B9.stop();
                    LBLB9.setText("0");
                    statusB9 = false;
                    GUISalida salida = new GUISalida("B9");
                    salida.setVisible(true);
                    BTNb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB10 == false) {
                    BTNb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B10 = new HiloCajon(LBLB10);
                    B10.start();
                    statusB10 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B10");
                    guiRecepcion.setVisible(true);

                } else if (statusB10 == true) {
                    B10.stop();
                    LBLB10.setText("0");
                    statusB10 = false;
                    GUISalida salida = new GUISalida("B10");
                    salida.setVisible(true);
                    BTNb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB11 == false) {
                    BTNb11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B11 = new HiloCajon(LBLB11);
                    B11.start();
                    statusB11 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B11");
                    guiRecepcion.setVisible(true);

                } else if (statusB11 == true) {
                    B11.stop();
                    LBLB11.setText("0");
                    statusB11 = false;
                    GUISalida salida = new GUISalida("B11");
                    salida.setVisible(true);
                    BTNb11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB12 == false) {
                    BTNb12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B12 = new HiloCajon(LBLB12);
                    B12.start();
                    statusB12 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B12");
                    guiRecepcion.setVisible(true);

                } else if (statusB12 == true) {
                    B12.stop();
                    LBLB12.setText("0");
                    statusB12 = false;
                    GUISalida salida = new GUISalida("B12");
                    salida.setVisible(true);
                    BTNb12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB13 == false) {
                    BTNb13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B13 = new HiloCajon(LBLB13);
                    B13.start();
                    statusB13 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B13");
                    guiRecepcion.setVisible(true);

                } else if (statusB13 == true) {
                    B13.stop();
                    LBLB13.setText("0");
                    statusB13 = false;
                    GUISalida salida = new GUISalida("B13");
                    salida.setVisible(true);
                    BTNb13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB14 == false) {
                    BTNb14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B14 = new HiloCajon(LBLB14);
                    B14.start();
                    statusB14 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B14");
                    guiRecepcion.setVisible(true);

                } else if (statusB14 == true) {
                    B14.stop();
                    LBLB14.setText("0");
                    statusB14 = false;
                    GUISalida salida = new GUISalida("B14");
                    salida.setVisible(true);
                    BTNb14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNb15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusB15 == false) {
                    BTNb15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    B15 = new HiloCajon(LBLB15);
                    B15.start();
                    statusB15 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("B15");
                    guiRecepcion.setVisible(true);

                } else if (statusB15 == true) {
                    B15.stop();
                    LBLB15.setText("0");
                    statusB15 = false;
                    GUISalida salida = new GUISalida("B15");
                    salida.setVisible(true);
                    BTNb15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC1 == false) {
                    BTNc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C1 = new HiloCajon(LBLC1);
                    C1.start();
                    statusC1 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C");
                    guiRecepcion.setVisible(true);

                } else if (statusC1 == true) {
                    C1.stop();
                    LBLC1.setText("0");
                    statusC1 = false;
                    GUISalida salida = new GUISalida("C1");
                    salida.setVisible(true);
                    BTNc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC2 == false) {
                    BTNc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C2 = new HiloCajon(LBLC2);
                    C2.start();
                    statusC2 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C2");
                    guiRecepcion.setVisible(true);

                } else if (statusC2 == true) {
                    C2.stop();
                    LBLC2.setText("0");
                    statusC2 = false;
                    GUISalida salida = new GUISalida("C2");
                    salida.setVisible(true);
                    BTNc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC3 == false) {
                    BTNc3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C3 = new HiloCajon(LBLC3);
                    C3.start();
                    statusC3 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C3");
                    guiRecepcion.setVisible(true);

                } else if (statusC3 == true) {
                    C3.stop();
                    LBLC3.setText("0");
                    statusC3 = false;
                    GUISalida salida = new GUISalida("C3");
                    salida.setVisible(true);
                    BTNc3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC4 == false) {
                    BTNc4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C4 = new HiloCajon(LBLC4);
                    C4.start();
                    statusC4 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C4");
                    guiRecepcion.setVisible(true);

                } else if (statusC4 == true) {
                    C4.stop();
                    LBLC4.setText("0");
                    statusC4 = false;
                    GUISalida salida = new GUISalida("C4");
                    salida.setVisible(true);
                    BTNc4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC5 == false) {
                    BTNc5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C5 = new HiloCajon(LBLC5);
                    C5.start();
                    statusC5 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C5");
                    guiRecepcion.setVisible(true);

                } else if (statusC5 == true) {
                    C5.stop();
                    LBLC5.setText("0");
                    statusC5 = false;
                    GUISalida salida = new GUISalida("C5");
                    salida.setVisible(true);
                    BTNc5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC6 == false) {
                    BTNc6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C6 = new HiloCajon(LBLC6);
                    C6.start();
                    statusC6 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C6");
                    guiRecepcion.setVisible(true);

                } else if (statusC6 == true) {
                    C6.stop();
                    LBLC6.setText("0");
                    statusC6 = false;
                    GUISalida salida = new GUISalida("C6");
                    salida.setVisible(true);
                    BTNc6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC7 == false) {
                    BTNc7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C7 = new HiloCajon(LBLC7);
                    C7.start();
                    statusC7 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C7");
                    guiRecepcion.setVisible(true);

                } else if (statusC7 == true) {
                    C7.stop();
                    LBLC7.setText("0");
                    statusC7 = false;
                    GUISalida salida = new GUISalida("C7");
                    salida.setVisible(true);
                    BTNc7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC8 == false) {
                    BTNc8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C8 = new HiloCajon(LBLC8);
                    C8.start();
                    statusC8 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C8");
                    guiRecepcion.setVisible(true);

                } else if (statusC8 == true) {
                    C8.stop();
                    LBLC8.setText("0");
                    statusC8 = false;
                    GUISalida salida = new GUISalida("C8");
                    salida.setVisible(true);
                    BTNc8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC9 == false) {
                    BTNc9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C9 = new HiloCajon(LBLC9);
                    C9.start();
                    statusC9 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C9");
                    guiRecepcion.setVisible(true);

                } else if (statusC9 == true) {
                    C9.stop();
                    LBLC9.setText("0");
                    statusC9 = false;
                    GUISalida salida = new GUISalida("C9");
                    salida.setVisible(true);
                    BTNc9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC10 == false) {
                    BTNc10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C10 = new HiloCajon(LBLC10);
                    C10.start();
                    statusC10 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C10");
                    guiRecepcion.setVisible(true);

                } else if (statusC10 == true) {
                    C10.stop();
                    LBLC10.setText("0");
                    statusC10 = false;
                    GUISalida salida = new GUISalida("C10");
                    salida.setVisible(true);
                    BTNc10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC11 == false) {
                    BTNc11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C11 = new HiloCajon(LBLC11);
                    C11.start();
                    statusC11 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C11");
                    guiRecepcion.setVisible(true);

                } else if (statusC11 == true) {
                    C11.stop();
                    LBLC11.setText("0");
                    statusC11 = false;
                    GUISalida salida = new GUISalida("C11");
                    salida.setVisible(true);
                    BTNc11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC12 == false) {
                    BTNc12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C12 = new HiloCajon(LBLC12);
                    C12.start();
                    statusC12 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C12");
                    guiRecepcion.setVisible(true);

                } else if (statusC12 == true) {
                    C12.stop();
                    LBLC12.setText("0");
                    statusC12 = false;
                    GUISalida salida = new GUISalida("C12");
                    salida.setVisible(true);
                    BTNc12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC13 == false) {
                    BTNc13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C13 = new HiloCajon(LBLC13);
                    C13.start();
                    statusC13 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C13");
                    guiRecepcion.setVisible(true);

                } else if (statusC13 == true) {
                    C13.stop();
                    LBLC13.setText("0");
                    statusC13 = false;
                    GUISalida salida = new GUISalida("C13");
                    salida.setVisible(true);
                    BTNc13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC14 == false) {
                    BTNc14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C14 = new HiloCajon(LBLC14);
                    C14.start();
                    statusC14 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C14");
                    guiRecepcion.setVisible(true);

                } else if (statusC14 == true) {
                    C14.stop();
                    LBLC14.setText("0");
                    statusC14 = false;
                    GUISalida salida = new GUISalida("C14");
                    salida.setVisible(true);
                    BTNc14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });
        BTNc15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (statusC15 == false) {
                    BTNc15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilPequeno.png")));
                    C15 = new HiloCajon(LBLC15);
                    C15.start();
                    statusC15 = true;
                    GUIRecepcion guiRecepcion = new GUIRecepcion("C15");
                    guiRecepcion.setVisible(true);

                } else if (statusC15 == true) {
                    C15.stop();
                    LBLC15.setText("0");
                    statusC15 = false;
                    GUISalida salida = new GUISalida("C15");
                    salida.setVisible(true);
                    BTNc15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_ea_pivm/img/troncomobilvacio.png")));
                }
            }
        });

        
        BTNCajonDisponible.addActionListener((ActionEvent ae) -> {

        });

        BTNBoleto.addActionListener((ActionEvent ae) -> {
            
        });

        BTNEmpleados.addActionListener((ActionEvent ae) -> {
            GUIEmpleados empleado = new GUIEmpleados();
            empleado.setVisible(true);
        });

        BTNAdministrador.addActionListener((ActionEvent ae) -> {
            GUIReportes administracion = new GUIReportes();
            administracion.setVisible(true);

        });
        BTNNomina.addActionListener((ActionEvent ae) -> {
            GUINomina Nomina = new GUINomina();
            Nomina.setVisible(true);
        });

        BTNSalidas.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });

        PanelCajon.setLayout(null);
        PanelCajon.setVisible(true);
        PanelCajon.setBorder(BorderFactory.createLineBorder(Color.red, 1));
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
