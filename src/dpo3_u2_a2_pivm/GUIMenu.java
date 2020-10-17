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

public class GUIMenu extends JFrame implements ActionListener {

    JLabel LBLTituloPrincipal, LBLSubTitulo, LBLNombreAlumno, LBLMatricula, LBLLogo, LBLBoleto, LBLAdministrador, LBLCajon, LBLNomina, LBLChat;
    JPanel Panelmenu;

    public GUIMenu() {
        super();

        initComponents();
    }

    private void initComponents() {

        this.setTitle("Menu");
        this.setSize(550, 510);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panelmenu = new javax.swing.JPanel();
        Panelmenu.setSize(533, 470);
        this.add(Panelmenu);

        LBLTituloPrincipal = new JLabel("ESTACIONAMIENTO");
        LBLSubTitulo = new JLabel("PINOTRONIC");
        JButton BTNAdministrador = new JButton();
        JButton BTNBoleto = new javax.swing.JButton();
        JButton BTNCajonDisponible = new JButton();
        JButton BTNNomina = new JButton();
        JButton BTNEmpleados = new JButton();
        JButton BTNSalidas = new JButton("Salida");
        LBLNombreAlumno = new JLabel("Pino Martin Vargas Marquez.");
        LBLMatricula = new JLabel("ES172005165");
        LBLLogo = new javax.swing.JLabel();
        LBLBoleto = new javax.swing.JLabel("RECEPCION");
        LBLAdministrador = new javax.swing.JLabel("REPORTES");
        LBLCajon = new javax.swing.JLabel("SALIDA");
        LBLNomina = new javax.swing.JLabel("NOMINA");
        LBLChat = new javax.swing.JLabel("EMPLEADOS");

        BTNBoleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_a2_pivm/img/Control.png")));
        BTNNomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_a2_pivm/img/Dolares.png")));
        BTNCajonDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_a2_pivm/img/Control.png")));
        BTNEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_a2_pivm/img/Chat.png")));
        BTNAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_a2_pivm/img/Administracion.png")));
        LBLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_u2_a2_pivm/img/logo.png")));

        LBLLogo.setBounds(170, 10, 300, 300);
        Panelmenu.add(LBLLogo);

        int componentWidth = this.getWidth() - 20;

        LBLTituloPrincipal.setFont(new Font("Helvetica", Font.PLAIN, 18));
        LBLTituloPrincipal.setBounds(200, 10, 180, 20);
        Panelmenu.add(LBLTituloPrincipal);

        LBLTituloPrincipal.setFont(new Font("Helvetica", Font.PLAIN, 18));
        LBLSubTitulo.setBounds(250, 30, 150, 20);
        Panelmenu.add(LBLSubTitulo);

        BTNBoleto.setBounds(30, 300, 80, 75);
        Panelmenu.add(BTNBoleto);

        LBLBoleto.setBounds(40, 375, 150, 20);
        Panelmenu.add(LBLBoleto);

        BTNNomina.setBounds(126, 300, 80, 75);
        Panelmenu.add(BTNNomina);

        LBLNomina.setBounds(136, 375, 150, 20);
        Panelmenu.add(LBLNomina);

        BTNCajonDisponible.setBounds(222, 300, 80, 75);
        Panelmenu.add(BTNCajonDisponible);

        LBLCajon.setBounds(232, 375, 150, 20);
        Panelmenu.add(LBLCajon);

        BTNEmpleados.setBounds(318, 300, 80, 75);
        Panelmenu.add(BTNEmpleados);

        LBLChat.setBounds(328, 375, 150, 20);
        Panelmenu.add(LBLChat);

        BTNAdministrador.setBounds(414, 300, 80, 75);
        Panelmenu.add(BTNAdministrador);

        LBLAdministrador.setBounds(424, 375, 150, 20);
        Panelmenu.add(LBLAdministrador);

        BTNSalidas.setBounds(395, 395, 100, 30);
        Panelmenu.add(BTNSalidas);

        LBLNombreAlumno.setBounds(150, 440, 180, 20);
        Panelmenu.add(LBLNombreAlumno);

        LBLMatricula.setBounds(350, 440, 150, 20);

        BTNCajonDisponible.addActionListener((ActionEvent ae) -> {
            GUISalida salida = new GUISalida();
            salida.setVisible(true);
            this.dispose();
        });

        BTNBoleto.addActionListener((ActionEvent ae) -> {
            GUIRecepcion recepcion = new GUIRecepcion();
            recepcion.setVisible(true);
            this.dispose();
        });
        
        BTNEmpleados.addActionListener((ActionEvent ae) -> {
            GUIEmpleados empleado = new GUIEmpleados();
            empleado.setVisible(true);
            this.dispose();
        });

        BTNAdministrador.addActionListener((ActionEvent ae) -> {
            GUIEmpleados administracion = new GUIEmpleados();
            administracion.setVisible(true);
            this.dispose();
        });
        BTNSalidas.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });

        Panelmenu.add(LBLMatricula);
        Panelmenu.setLayout(null);
        //this.getContentPane().add(Panelmenu);
        Panelmenu.setVisible(true);
        Panelmenu.setBorder(BorderFactory.createLineBorder(Color.red, 1));

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
