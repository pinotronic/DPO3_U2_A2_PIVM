package dpo3_u2_ea_pivm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;

public class GUIReportes extends JFrame implements ActionListener {

    public GUIReportes() {
        super();
        initComponents();
    }
    SQLConexion con = new SQLConexion();

    private void initComponents() {
        this.setTitle("Reportes");
        this.setSize(700, 510);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panelReportes = new javax.swing.JPanel();
        panelReportes.setSize(700, 470);
        this.add(panelReportes);

        JLabel LBLTituloPrincipal = new JLabel("NOMINA");
        JRadioButton jrbPorFecha = new JRadioButton("Por Fecha", true);
        JRadioButton jrbPorAcomodador = new JRadioButton("Por Acomodador", true);
        JRadioButton jrbPorCajon = new JRadioButton("Por Cajon", true);
        JRadioButton jrbPorVehiculo = new JRadioButton("Por Vehiculo", true);

        JTable PorVehiculo = new JTable(con.obt_TablaVehiculosPorVehiculo());
        JTable PorCajon = new JTable(con.obt_TablaVehiculosPorCajon());
        JTable PorAcomodador = new JTable(con.obt_TablaVehiculosPorAcomodador());
        JTable PorFecha = new JTable(con.obt_TablaVehiculosPorFecha());

        LBLTituloPrincipal.setFont(new Font("Helvetica", Font.PLAIN, 18));
        LBLTituloPrincipal.setBounds(300, 10, 180, 20);

        jrbPorVehiculo.setBounds(480, 40, 100, 20);
        jrbPorCajon.setBounds(380, 40, 100, 20);
        jrbPorAcomodador.setBounds(250, 40, 140, 20);
        jrbPorFecha.setBounds(110, 40, 100, 20);

        PorFecha.setBounds(10, 80, 650, 310);
        PorAcomodador.setBounds(10, 80, 650, 310);
        PorCajon.setBounds(10, 80, 650, 310);
        PorVehiculo.setBounds(10, 80, 650, 310);

        panelReportes.add(LBLTituloPrincipal);

        jrbPorFecha.setSelected(true);
        jrbPorAcomodador.setSelected(false);
        jrbPorCajon.setSelected(false);
        jrbPorVehiculo.setSelected(false);

        PorVehiculo.setVisible(false);
        PorCajon.setVisible(false);
        PorFecha.setVisible(true);
        PorAcomodador.setVisible(false);

        JButton BTNSalidas = new JButton("Salida");
        BTNSalidas.setBounds(500, 400, 100, 50);
        panelReportes.add(BTNSalidas);

        panelReportes.add(jrbPorVehiculo);
        panelReportes.add(jrbPorCajon);
        panelReportes.add(jrbPorAcomodador);
        panelReportes.add(jrbPorFecha);
        panelReportes.add(PorFecha);
        panelReportes.add(PorAcomodador);
        panelReportes.add(PorCajon);
        panelReportes.add(PorVehiculo);

        panelReportes.setLayout(null);
        panelReportes.setVisible(true);
        panelReportes.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        jrbPorFecha.addActionListener((ActionEvent ae) -> {
            jrbPorFecha.setSelected(true);
            jrbPorAcomodador.setSelected(false);
            jrbPorCajon.setSelected(false);
            jrbPorVehiculo.setSelected(false);
            PorFecha.setVisible(true);
            PorAcomodador.setVisible(false);
            PorCajon.setVisible(false);
            PorVehiculo.setVisible(false);
        });
        jrbPorAcomodador.addActionListener((ActionEvent ae) -> {
            jrbPorFecha.setSelected(false);
            jrbPorAcomodador.setSelected(true);
            jrbPorCajon.setSelected(false);
            jrbPorVehiculo.setSelected(false);
            PorFecha.setVisible(false);
            PorAcomodador.setVisible(true);
            PorCajon.setVisible(false);
            PorVehiculo.setVisible(false);
        });

        jrbPorCajon.addActionListener((ActionEvent ae) -> {
            jrbPorFecha.setSelected(false);
            jrbPorAcomodador.setSelected(false);
            jrbPorCajon.setSelected(true);
            jrbPorVehiculo.setSelected(false);
            PorFecha.setVisible(false);
            PorAcomodador.setVisible(false);
            PorCajon.setVisible(true);
            PorVehiculo.setVisible(false);
        });

        jrbPorVehiculo.addActionListener((ActionEvent ae) -> {
            jrbPorFecha.setSelected(false);
            jrbPorAcomodador.setSelected(false);
            jrbPorCajon.setSelected(false);
            jrbPorVehiculo.setSelected(true);
            PorFecha.setVisible(false);
            PorAcomodador.setVisible(false);
            PorCajon.setVisible(false);
            PorVehiculo.setVisible(true);
        });
        BTNSalidas.addActionListener((ActionEvent ae) -> {
        this.dispose();
            
        });

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
