package dpo3_u2_ea_pivm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUINomina extends JFrame implements ActionListener {

    public GUINomina() {
        super();

        initComponents();
    }
    SQLConexion con = new SQLConexion();

    private void initComponents() {

        this.setTitle("Nomina");
        this.setSize(550, 510);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panelNomina = new javax.swing.JPanel();
        panelNomina.setSize(533, 470);
        this.add(panelNomina);

        // GUI
        //creacion de Objetos
        JLabel LBLTituloPrincipal = new JLabel("NOMINA");
        JLabel LBLSubTitulo = new JLabel("EMPLEADOS");

        JTable TablalistaEmpleados = new JTable(con.obt_TablaVehiculosPorCajon2());
        JDateChooser JDTfechaInicial = new JDateChooser();

        JLabel LBLFechaInicial = new JLabel("Fecha Inicial");
        JLabel LBLFechaFinal = new JLabel("Fecha Final");
        JLabel LBLNombreEmpleado = new JLabel("Nombre Empleado");
        JLabel LBLSueldo = new JLabel("Sueldo");
        JLabel LBLBono = new JLabel("Bono");
        JLabel LBLTotal = new JLabel("Su Pago");

        JDateChooser JDTfechaFinal = new JDateChooser();

        JTextField TXTNombreEmpleado = new javax.swing.JTextField();
        JTextField TXTSueldo = new javax.swing.JTextField();
        JTextField TXTPago = new javax.swing.JTextField();

        JButton BTNBuscar = new JButton("...");
        JButton BTNGenerar = new JButton("Generar");
        String elementos2[] = {"0", "10", "15"};
        JComboBox jcb2 = new JComboBox(elementos2);

        //colocacion Objetos
        LBLTituloPrincipal.setFont(new Font("Helvetica", Font.PLAIN, 18));
        LBLTituloPrincipal.setBounds(200, 10, 180, 20);

        LBLSubTitulo.setFont(new Font("Helvetica", Font.PLAIN, 18));
        LBLSubTitulo.setBounds(200, 30, 180, 20);

        LBLFechaInicial.setBounds(270, 60, 180, 20);
        LBLFechaFinal.setBounds(370, 60, 180, 20);

        LBLNombreEmpleado.setBounds(270, 100, 180, 20);
        LBLSueldo.setBounds(270, 140, 50, 20);
        LBLBono.setBounds(270, 180, 50, 20);
        LBLTotal.setBounds(270, 200, 50, 20);

        JDTfechaInicial.setBounds(270, 80, 100, 20);
        JDTfechaFinal.setBounds(370, 80, 100, 20);

        TablalistaEmpleados.setBounds(10, 60, 260, 310);

        TXTNombreEmpleado.setBounds(270, 120, 260, 20);
        TXTSueldo.setBounds(270, 160, 260, 20);
        TXTPago.setBounds(380, 200, 150, 20);

        BTNBuscar.setBounds(470, 80, 50, 20);
        BTNGenerar.setBounds(470, 220, 50, 20);
        jcb2.setBounds(380, 180, 150, 20);

        // se anexa al panel
        panelNomina.add(LBLTituloPrincipal);
        panelNomina.add(LBLSubTitulo);
        panelNomina.add(LBLFechaInicial);
        panelNomina.add(LBLFechaFinal);
        panelNomina.add(LBLNombreEmpleado);
        panelNomina.add(LBLBono);
        panelNomina.add(LBLTotal);

        panelNomina.add(JDTfechaInicial);
        panelNomina.add(JDTfechaFinal);
        panelNomina.add(LBLSueldo);
        panelNomina.add(TablalistaEmpleados);
        panelNomina.add(TXTNombreEmpleado);
        panelNomina.add(TXTSueldo);
        panelNomina.add(BTNBuscar);
        panelNomina.add(BTNGenerar);
        panelNomina.add(TXTPago);

        panelNomina.add(jcb2);

        // Acciones de Botones
        
                
        panelNomina.setLayout(null);
        panelNomina.setVisible(true);
        panelNomina.setBorder(BorderFactory.createLineBorder(Color.black, 1));

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
