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
import javax.swing.JComboBox;

public class GUIEmpleados extends JFrame implements ActionListener {

    javax.swing.JPanel PanelEmpleados;
    javax.swing.JLabel LBLTituloPrincipal, LBLId, LBLNombre, LBLDomicilio, LBLColonia, LBLCiudad, LBLCelular, LBLEmail, LBLSueldo, LBLContrasena, LBLAcomodador;
    javax.swing.JTextField TXTId, TXTNombre, TXTDomicilio, TXTColonia, TXTCiudad, TXTCelular, TXTEmail, TXTSueldo, TXTContraseña, TXTPuesto;

    public GUIEmpleados() {
        super();
        initComponente();
    }

    private void initComponente() {
        this.setTitle("Empleados");
        this.setSize(550, 510);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        SQLConexion con = new SQLConexion();

        PanelEmpleados = new javax.swing.JPanel();
        PanelEmpleados.setSize(533, 470);
        this.add(PanelEmpleados);

        LBLTituloPrincipal = new JLabel("EMPLEADOS");
        LBLId = new javax.swing.JLabel("Id:");
        LBLNombre = new javax.swing.JLabel("Nombre:");
        LBLDomicilio = new javax.swing.JLabel("Domicilio:");
        LBLColonia = new javax.swing.JLabel("Colonia:");
        LBLCiudad = new javax.swing.JLabel("Ciudad:");
        LBLCelular = new javax.swing.JLabel("Celular:");
        LBLEmail = new javax.swing.JLabel("Email:");
        LBLSueldo = new javax.swing.JLabel("Sueldo:");
        LBLContrasena = new javax.swing.JLabel("Contraseña");
        LBLAcomodador = new javax.swing.JLabel("Acomodador");
        TXTId = new javax.swing.JTextField("0");
        TXTNombre = new javax.swing.JTextField();
        TXTDomicilio = new javax.swing.JTextField();
        TXTColonia = new javax.swing.JTextField();
        TXTCiudad = new javax.swing.JTextField();
        TXTCelular = new javax.swing.JTextField();
        TXTEmail = new javax.swing.JTextField();
        TXTSueldo = new javax.swing.JTextField();
        TXTContraseña = new javax.swing.JTextField();
        TXTPuesto = new javax.swing.JTextField();

        JButton BTNAvanzar = new javax.swing.JButton(">>");
        JButton BTNRegresar = new javax.swing.JButton("<<");
        JButton BTNEditar = new javax.swing.JButton("Editar");
        JButton BTNGuardar = new javax.swing.JButton("Guardar");
        JButton BTNBorrar = new javax.swing.JButton("Borrar");
        JButton BTNSalida = new javax.swing.JButton("Salida");

        LBLTituloPrincipal.setFont(new Font("Helvetica", Font.PLAIN, 18));
        LBLTituloPrincipal.setBounds(230, 10, 180, 20);

        LBLId.setBounds(100, 80, 180, 20);
        LBLNombre.setBounds(100, 100, 180, 20);
        LBLDomicilio.setBounds(100, 120, 180, 20);
        LBLColonia.setBounds(100, 140, 180, 20);
        LBLCiudad.setBounds(100, 160, 180, 20);
        LBLCelular.setBounds(100, 180, 180, 20);
        LBLEmail.setBounds(100, 200, 180, 20);
        LBLSueldo.setBounds(100, 220, 180, 20);
        LBLContrasena.setBounds(100, 240, 180, 20);
        LBLAcomodador.setBounds(100, 260, 180, 20);

        TXTId.setBounds(200, 80, 180, 20);
        TXTNombre.setBounds(200, 100, 180, 20);
        TXTDomicilio.setBounds(200, 120, 180, 20);
        TXTColonia.setBounds(200, 140, 180, 20);
        TXTCiudad.setBounds(200, 160, 180, 20);
        TXTCelular.setBounds(200, 180, 180, 20);
        TXTEmail.setBounds(200, 200, 180, 20);
        TXTSueldo.setBounds(200, 220, 180, 20);
        TXTContraseña.setBounds(200, 240, 180, 20);
        TXTPuesto.setBounds(200, 260, 180, 20);

        BTNAvanzar.setBounds(140, 350, 50, 30);
        BTNRegresar.setBounds(80, 350, 50, 30);
        BTNEditar.setBounds(200, 350, 90, 30);
        BTNGuardar.setBounds(300, 350, 90, 30);
        BTNBorrar.setBounds(400, 350, 90, 30);
        BTNSalida.setBounds(400, 400, 90, 30);

        PanelEmpleados.add(LBLTituloPrincipal);
        PanelEmpleados.add(LBLId);
        PanelEmpleados.add(LBLNombre);
        PanelEmpleados.add(LBLDomicilio);
        PanelEmpleados.add(LBLColonia);
        PanelEmpleados.add(LBLCiudad);
        PanelEmpleados.add(LBLCelular);
        PanelEmpleados.add(LBLEmail);
        PanelEmpleados.add(LBLSueldo);
        PanelEmpleados.add(LBLContrasena);
        PanelEmpleados.add(LBLAcomodador);

        PanelEmpleados.add(TXTId);
        PanelEmpleados.add(TXTNombre);
        PanelEmpleados.add(TXTDomicilio);
        PanelEmpleados.add(TXTColonia);
        PanelEmpleados.add(TXTCiudad);
        PanelEmpleados.add(TXTCelular);
        PanelEmpleados.add(TXTEmail);
        PanelEmpleados.add(TXTSueldo);
        PanelEmpleados.add(TXTContraseña);
        PanelEmpleados.add(TXTPuesto);
        TXTPuesto.setVisible(false);

        PanelEmpleados.add(BTNAvanzar);
        PanelEmpleados.add(BTNRegresar);
        PanelEmpleados.add(BTNEditar);
        PanelEmpleados.add(BTNGuardar);
        PanelEmpleados.add(BTNBorrar);
        PanelEmpleados.add(BTNSalida);
        String elementos2[] = {"Administrador", "Acomodador"};
        JComboBox jcb2 = new JComboBox(elementos2);
        jcb2.setBounds(200, 260, 150, 20);
        PanelEmpleados.add(jcb2);

        BTNSalida.addActionListener((ActionEvent ae) -> {
            //GUIMenu menu = new GUIMenu();
            //menu.setVisible(true);
            this.dispose();
        });
        BTNEditar.addActionListener((ActionEvent ae) -> {
            String Id, Nombre, Direccion, Colonia, Ciudad, Celular, Email, Sueldo, Contrasena, Puesto, Status;
            Status = "";
            //if (jrb0.isSelected()) {
            Status = "Activo";
            //}

            Id = TXTId.getText();
            Nombre = TXTNombre.getText();
            Direccion = TXTDomicilio.getText();
            Colonia = TXTColonia.getText();
            Ciudad = TXTCiudad.getText();
            Celular = TXTCelular.getText();
            Email = TXTEmail.getText();
            Sueldo = TXTSueldo.getText();
            Contrasena = TXTContraseña.getText();
            TXTPuesto.setVisible(true);
            Puesto = jcb2.getSelectedItem().toString();
            con.EdicionEmpleado(Id, Nombre, Direccion, Colonia, Ciudad, Celular, Email, Sueldo, Contrasena, Puesto, Status);
        });

        BTNGuardar.addActionListener((ActionEvent ae) -> {
            String Id, Nombre, Domicilio, Colonia, Ciudad, Celular, Email, Puesto, Sueldo, Contrasena, Status;
            //if (jrb0.isSelected()) {
            Status = "True";
            //} else {
            //    Status = "False";
            //}

            //Status = jrb0.getText();
            Nombre = TXTNombre.getText();
            Domicilio = TXTDomicilio.getText();
            Colonia = TXTColonia.getText();
            Ciudad = TXTCiudad.getText();
            Celular = TXTCelular.getText();
            Email = TXTEmail.getText();
            Sueldo = TXTSueldo.getText();
            Contrasena = TXTContraseña.getText();
            jcb2.setVisible(true);
            Puesto = jcb2.getSelectedItem().toString();
            con.InsrtarEmplado(Nombre, Domicilio, Colonia, Celular, Ciudad, Email, Puesto, Sueldo, Contrasena, Status);
            
        });

        BTNAvanzar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String[] modelo = new String[9];
                //Id = LabelID.getText();
                int numEntero = Integer.parseInt(TXTId.getText());

                numEntero = numEntero + 1;
                String Id = Integer.toString(numEntero);
                TXTId.setText(Id);
                modelo = con.obt_BusquedaIdEmpleado(Id);
                TXTPuesto.setVisible(true);
                jcb2.setVisible(false);

                TXTNombre.setText(modelo[1]);
                TXTDomicilio.setText(modelo[2]);
                TXTColonia.setText(modelo[3]);
                TXTCiudad.setText(modelo[4]);
                TXTCelular.setText(modelo[5]);
                TXTEmail.setText(modelo[6]);
                TXTSueldo.setText(modelo[7]);
                TXTContraseña.setText(modelo[8]);
                TXTPuesto.setText(modelo[9]);
                String Status = "Activo";
                //if ("Activo".equals(modelo[6])) {
                //    jrb0.setSelected(minimiza);
                //}
                BTNRegresar.setEnabled(true);
                BTNEditar.setEnabled(true);
                BTNGuardar.setEnabled(false);
            }
        });
        BTNRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String[] modelo = new String[7];
                //Id = LabelID.getText();
                int numEntero = Integer.parseInt(TXTId.getText());

                numEntero = numEntero - 1;
                if (numEntero == 0) {
                    BTNRegresar.setEnabled(false);
                    BTNEditar.setEnabled(false);
                    BTNGuardar.setEnabled(true);
                    TXTPuesto.setVisible(false);
                    jcb2.setVisible(true);
                }
                String Id = Integer.toString(numEntero);
                TXTId.setText(Id);
                modelo = con.obt_BusquedaIdEmpleado(Id);
                //TXTPuesto.setVisible(true);
                //jcb2.setVisible(false);

                TXTNombre.setText(modelo[1]);
                TXTDomicilio.setText(modelo[2]);
                TXTColonia.setText(modelo[3]);
                TXTCiudad.setText(modelo[4]);
                TXTCelular.setText(modelo[5]);
                TXTEmail.setText(modelo[6]);
                TXTSueldo.setText(modelo[7]);
                TXTContraseña.setText(modelo[8]);
                TXTPuesto.setText(modelo[9]);

                //if ("Activo".equals(modelo[6])) {
                //  jrb0.setSelected(true);
            }
        });

        PanelEmpleados.setLayout(null);
        PanelEmpleados.setVisible(true);
        PanelEmpleados.setBorder(BorderFactory.createLineBorder(Color.red, 1));
    }

    @Override

    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
