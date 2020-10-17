/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo3_u2_a2_pivm;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class SQLConexion {

    String url = "jdbc:sqlite:src/dpo3_u2_a2_pivm/data/BaseDatos.db";
    Connection conn;

    public SQLConexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);

            if (conn != null) {
                JOptionPane.showMessageDialog(null, "Base de datos Conectada");
            }
        } catch (Exception e) {
            System.out.println("Error en conexion" + e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public ResultSet consulta(String sql) {
        ResultSet res = null;
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            res = pstm.executeQuery();
        } catch (SQLException e) {
            System.err.println("Error de consulta : " + e.getMessage());

        }
        return res;

    }
//Empleados

    public DefaultComboBoxModel obt_Empleado() {
        DefaultComboBoxModel ListaEmpleados = new DefaultComboBoxModel();
        //ListaEmpleados.addElement("seleccione una clave");
        ResultSet res = this.consulta("SELECT * FROM empleados order by Nombre");
        try {
            while (res.next()) {
                ListaEmpleados.addElement(res.getString("Nombre"));
            }

            res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return ListaEmpleados;
    }

    public void InsrtarEmplado(String Nombre, String Domicilio, String Colonia, String Ciudad, String Celular, String Email, String Sueldo, String Contrasena, String Puesto, String Status) {
        try {
            JOptionPane.showMessageDialog(null, "Estado de la conexión " + conn.toString());
            try ( PreparedStatement agrega = conn.prepareStatement("INSERT INTO  `empleados` ( `Id`,`nombre`, `direccion`, `colonia`,`ciudad`,`celular`,`email`, `sueldo`, `contrasena`,`puesto`, `Status`) VALUES (null,?,?,?,?,?,?)")) {
                agrega.setString(1, Nombre);
                agrega.setString(2, Domicilio);
                agrega.setString(3, Colonia);
                agrega.setString(4, Ciudad);
                agrega.setString(5, Celular);
                agrega.setString(6, Email);
                agrega.setString(7, Sueldo);
                agrega.setString(8, Contrasena);
                agrega.setString(9, Puesto);
                agrega.setString(10, Status);

                System.out.println(agrega);

                agrega.executeUpdate();
                JOptionPane.showMessageDialog(null, "El registro se agregó con éxito.");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No conectado. No se pudo guardar el registro.");
        }
    }

    public boolean EdicionEmpleado(String Ids, String Nombre, String direccion, String Colonia, String Ciudad, String Celular, String Email, String Sueldo, String Contrasena, String Puesto, String Status) {
        //System.out.println("impresion");

        String sSQL = "UPDATE `empleados` SET "
                + "`id` = ? "
                + ",`nombre` = ? "
                + ",`direccion` = ? "
                + ",`colonia` = ? "
                + ",`ciudad` = ? "
                + ",`celular` = ? "
                + ",`email` = ? "
                + ",`Sueldo` = ? "
                + ",`Contrasena` = ? "
                + ",`puesto` = ? "
                + ",`Status` = ? "
                + "WHERE `Id` = ?";

        boolean resultado = true;

        try ( PreparedStatement pstm = conn.prepareStatement(sSQL)) {
            int Id = Integer.parseInt(Ids);
            //int IdSucursal = Integer.parseInt(IdSucursals);
            //int Telefono = Integer.parseInt(Telefonos);
            //int Sueldo = Integer.parseInt(Sueldos);

            pstm.setInt(1, Id);
            pstm.setString(2, Nombre);
            pstm.setString(3, direccion);
            pstm.setString(3, Colonia);
            pstm.setString(3, Ciudad);
            pstm.setString(4, Celular);
            pstm.setString(5, Sueldo);
            pstm.setString(6, Email);
            pstm.setString(7, Sueldo);
            pstm.setString(8, Contrasena);
            pstm.setString(9, Puesto);
            pstm.setString(10, Status);
            pstm.setInt(11, Id);
            pstm.executeUpdate();
            resultado = true;

            JOptionPane.showMessageDialog(null, "El registro se Actualizo con éxito.");
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No conectado. No se pudo Editar el registro.");
        }
        return resultado;
    }

    public DefaultComboBoxModel obt_TablaEmpleado() {
        DefaultComboBoxModel ListaMenu = new DefaultComboBoxModel();
        //ListaMenu.addElement("seleccione una clave");
        ResultSet res = this.consulta("SELECT * FROM empleados order by nombre");
        try {
            while (res.next()) {
                ListaMenu.addElement(res.getString("nombre"));
            }

            res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return ListaMenu;
    }

    public String[] obt_BusquedaNombreEmpleado(String nombre) {
        String[] modelo = new String[7];

        //Statement  statement = null;
        //System.out.println(Producto);
        try {
            Statement statement = conn.createStatement();
            try ( ResultSet res = statement.executeQuery("SELECT * FROM `empleados`")) {
                while (res.next()) {
                    //System.out.println("impresion");
                    //System.out.println(res.getString(4));
                    String IdEncontrado = res.getString(2);
                    //System.out.printf("%s \tPrecio: %s\tProducto: ", Precio,Producto);
                    if (IdEncontrado.equals(nombre)) {
                        //String Ide = res.getString(1);
                        modelo[0] = res.getString(1);
                        //modelo.add(res.getString(1));
                        //String Producto = res.getString(2);
                        //modelo.add(res.getString(2));
                        modelo[1] = res.getString(2);
                        //String Cantidad = res.getString(3);
                        //modelo.add(res.getString(3));
                        modelo[2] = res.getString(3);
                        //String Precio = res.getString(4);
                        //modelo.add(res.getString(4));
                        modelo[3] = res.getString(4);
                        //String Sucursal = res.getString(5);
                        //modelo.add(res.getString(5));
                        modelo[4] = res.getString(5);
                        //String Marca = res.getString(6);
                        //modelo.add(res.getString(6));
                        modelo[5] = res.getString(6);
                        //String Proveedor = res.getString(7);
                        //modelo.add(res.getString(7));
                        //modelo[6]=res.getString(7);
                        //System.out.printf(modelo[2]);
                        modelo[6] = res.getString(7);
                        //String Proveedor = res.getString(7);
                        //modelo.add(res.getString(7));
                        //modelo[6]=res.getString(7);
                        //System.out.printf(modelo[2]);
                        modelo[7] = res.getString(8);
                        modelo[8] = res.getString(9);
                        modelo[9] = res.getString(10);
                        break;
                    }

                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return modelo;
    }

    public String[] obt_BusquedaIdEmpleado(String Id) {
        String[] modelo = new String[10];

        //Statement  statement = null;
        //System.out.println(Producto);
        try {
            Statement statement = conn.createStatement();
            try ( ResultSet res = statement.executeQuery("SELECT * FROM `empleados`")) {
                while (res.next()) {
                    //System.out.println("impresion");
                    //System.out.println(res.getString(4));
                    String IdEncontrado = res.getString(1);
                    //System.out.printf("%s \tPrecio: %s\tProducto: ", Precio,Producto);
                    if (IdEncontrado.equals(Id)) {
                        //String Ide = res.getString(1);
                        modelo[0] = res.getString(1);
                        //modelo.add(res.getString(1));
                        //String Producto = res.getString(2);
                        //modelo.add(res.getString(2));
                        modelo[1] = res.getString(2);
                        //String Cantidad = res.getString(3);
                        //modelo.add(res.getString(3));
                        modelo[2] = res.getString(3);
                        //String Precio = res.getString(4);
                        //modelo.add(res.getString(4));
                        modelo[3] = res.getString(4);
                        //String Sucursal = res.getString(5);
                        //modelo.add(res.getString(5));
                        modelo[4] = res.getString(5);
                        //String Marca = res.getString(6);
                        //modelo.add(res.getString(6));
                        modelo[5] = res.getString(6);
                        //String Proveedor = res.getString(7);
                        //modelo.add(res.getString(7));
                        modelo[6] = res.getString(7);
                        //System.out.printf(modelo[2]);
                        modelo[7] = res.getString(8);
                        modelo[8] = res.getString(9);
                        modelo[9] = res.getString(10);

                        break;
                    }

                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return modelo;
    }
// Registro Auto    

    public void InsrtarRegistroAuto(String Fecha, String Hora, String Marca, String Modelo, String Color, String Placas, String Estado, String Acomodador, String Ubicacion, String Status) {
        try {
            JOptionPane.showMessageDialog(null, "Estado de la conexión " + conn.toString());
            try ( PreparedStatement agrega = conn.prepareStatement("INSERT INTO  `recepcionautos` (`id`, `Fecha`, `Hora`, `Marca`, `Modelo`, `Color`, `Placas`, `Estado`, `Acomodador`, `Ubicacion`) VALUES (null,?,?,?,?,?,?,?,?,?)")) {
                agrega.setString(1, Fecha);
                agrega.setString(2, Hora);
                agrega.setString(3, Marca);
                agrega.setString(4, Modelo);
                agrega.setString(5, Color);
                agrega.setString(6, Placas);
                agrega.setString(7, Estado);
                agrega.setString(8, Acomodador);
                agrega.setString(9, Ubicacion);
                System.out.println(agrega);

                agrega.executeUpdate();
                JOptionPane.showMessageDialog(null, "El registro se agregó con éxito.");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No conectado. No se pudo guardar el registro.");
        }
    }

    public boolean EdicionRegistroAuto(String Ids, String Fecha, String Hora, String Marca, String Modelo, String Color, String Placas, String Estado, String Acomodador, String Ubicacion) {
        //System.out.println("impresion");

        String sSQL = "UPDATE `recepcionautos` SET "
                + "`id` = ? "
                + ",`Fecha` = ? "
                + ",`Hora` = ? "
                + ",`Marca` = ? "
                + ",`Modelo` = ? "
                + ",`Color` = ? "
                + ",`Placas` = ? "
                + ",`Estado` = ? "
                + ",`Acomodador` = ? "
                + ",`Ubicacion` = ? "
                + "WHERE `Id` = ?";

        boolean resultado = true;

        try ( PreparedStatement pstm = conn.prepareStatement(sSQL)) {
            int Id = Integer.parseInt(Ids);
            //int IdSucursal = Integer.parseInt(IdSucursals);
            //int Telefono = Integer.parseInt(Telefonos);
            //int Sueldo = Integer.parseInt(Sueldos);

            pstm.setInt(1, Id);
            pstm.setString(2, Fecha);
            pstm.setString(3, Hora);
            pstm.setString(4, Marca);
            pstm.setString(5, Modelo);
            pstm.setString(6, Color);
            pstm.setString(7, Placas);
            pstm.setString(7, Estado);
            pstm.setString(7, Acomodador);
            pstm.setString(7, Ubicacion);
            pstm.setInt(8, Id);
            pstm.executeUpdate();
            resultado = true;

            JOptionPane.showMessageDialog(null, "El registro se Actualizo con éxito.");
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No conectado. No se pudo Editar el registro.");
        }
        return resultado;
    }

    public String[] obt_BusquedaRegistroAuto(String Id) {
        String[] modelo = new String[10];

        //Statement  statement = null;
        //System.out.println(Producto);
        try {
            Statement statement = conn.createStatement();
            try ( ResultSet res = statement.executeQuery("SELECT * FROM `recepcionautos`")) {
                while (res.next()) {
                    //System.out.println("impresion");
                    //System.out.println(res.getString(4));
                    String IdEncontrado = res.getString(1);
                    //System.out.printf("%s \tPrecio: %s\tProducto: ", Precio,Producto);
                    if (IdEncontrado.equals(Id)) {
                        //String Ide = res.getString(1);
                        modelo[0] = res.getString(1);
                        //modelo.add(res.getString(1));
                        //String Producto = res.getString(2);
                        //modelo.add(res.getString(2));
                        modelo[1] = res.getString(2);
                        //String Cantidad = res.getString(3);
                        //modelo.add(res.getString(3));
                        modelo[2] = res.getString(3);
                        //String Precio = res.getString(4);
                        //modelo.add(res.getString(4));
                        modelo[3] = res.getString(4);
                        //String Sucursal = res.getString(5);
                        //modelo.add(res.getString(5));
                        modelo[4] = res.getString(5);
                        //String Marca = res.getString(6);
                        //modelo.add(res.getString(6));
                        modelo[5] = res.getString(6);
                        //String Proveedor = res.getString(7);
                        //modelo.add(res.getString(7));
                        modelo[6] = res.getString(7);
                        //System.out.printf(modelo[2]);
                        modelo[7] = res.getString(8);
                        //System.out.printf(modelo[2]);
                        modelo[8] = res.getString(9);
                        //System.out.printf(modelo[2]);
                        modelo[9] = res.getString(10);
                        //System.out.printf(modelo[2]);

                        break;
                    }

                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return modelo;
    }

    public DefaultTableModel obt_TablaVehiculosPorVehiculo() {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet res = this.consulta("SELECT * FROM recepcionautos order by Placas");
        modelo.addColumn("Id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Placas");
        modelo.addColumn("Estado");
        modelo.addColumn("Acomodoador");
        modelo.addColumn("Ubicacion");
        try {
            while (res.next()) {
                Object[] fila = new Object[10];
                for (int i = 0; i < 9; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                modelo.addRow(fila);
            }

            res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return modelo;
    }

    public String obt_Nregistros() {
        int total;
        total = 0;
        DefaultComboBoxModel NumeroRegistros = new DefaultComboBoxModel();
        //NumeroRegistros.addElement("seleccione una clave");
        ResultSet res = this.consulta("SELECT * FROM recepcionautos order by id");
        try {

            while (res.next()) {
                NumeroRegistros.addElement(res.getString("id"));
                total++;
            }

            res.close();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        String enteroString = Integer.toString(total);
        return enteroString;

    }

    public DefaultTableModel obt_TablaVehiculosPorAcomodador() {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet res = this.consulta("SELECT * FROM recepcionautos order by Acomodador");
        modelo.addColumn("Id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Placas");
        modelo.addColumn("Estado");
        modelo.addColumn("Acomodoador");
        modelo.addColumn("Ubicacion");
        try {
            while (res.next()) {
                Object[] fila = new Object[10];
                for (int i = 0; i < 9; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                modelo.addRow(fila);
            }

            res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return modelo;
    }

    public DefaultTableModel obt_TablaVehiculosPorFecha() {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet res = this.consulta("SELECT * FROM recepcionautos order by Fecha");
        modelo.addColumn("Id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Placas");
        modelo.addColumn("Estado");
        modelo.addColumn("Acomodoador");
        modelo.addColumn("Ubicacion");
        try {
            while (res.next()) {
                Object[] fila = new Object[10];
                for (int i = 0; i < 9; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                modelo.addRow(fila);
            }

            res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return modelo;
    }

    public DefaultTableModel obt_TablaVehiculosPorCajon() {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet res = this.consulta("SELECT * FROM recepcionautos order by Ubicacion");
        modelo.addColumn("Id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Placas");
        modelo.addColumn("Estado");
        modelo.addColumn("Acomodoador");
        modelo.addColumn("Ubicacion");
        try {
            while (res.next()) {
                Object[] fila = new Object[10];
                for (int i = 0; i < 9; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                modelo.addRow(fila);
            }

            res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return modelo;
    }

    public boolean EdicionRegistroCajon(String Cajon, String Estado) {
        String sSQL = "UPDATE `ocupados` SET "
                + "`Estado` = ? "
                + "WHERE `Cajon` = ?";

        boolean resultado = true;

        try ( PreparedStatement pstm = conn.prepareStatement(sSQL)) {

            //int IdSucursal = Integer.parseInt(IdSucursals);
            //int Telefono = Integer.parseInt(Telefonos);
            //int Sueldo = Integer.parseInt(Sueldos);
            pstm.setString(1, Estado);
            pstm.setString(2, Cajon);

            pstm.executeUpdate();
            resultado = true;

            JOptionPane.showMessageDialog(null, "El registro se Actualizo el Cajon con éxito.");
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No conectado. No se pudo Editar en el Cajon registro.");
        }
        return resultado;
    }

    public String[][] obt_BusquedaRegistroAutoEmpleado() {
        String[][] modelo = new String[2][1000];

        //Statement  statement = null;
        //System.out.println(Producto);
        try {
            Statement statement = conn.createStatement();
            try ( ResultSet res = statement.executeQuery("SELECT Acomodador, Fecha FROM `recepcionautos`")) {
                int a = 0;
                while (res.next()) {

                    modelo[0][a] = res.getString(1);

                    modelo[1][a] = res.getString(2);

                    a = a + 1;

                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        }
        return modelo;
    }

    public String[] obt_BusquedaIdCajon(String Id) {
        String[] modelo = new String[3];
        try {
            Statement statement = conn.createStatement();
            try ( ResultSet res = statement.executeQuery("SELECT * FROM `Cajon`")) {
                while (res.next()) {
                    String IdEncontrado = res.getString(1);
                    if (IdEncontrado.equals(Id)) {
                        modelo[0] = res.getString(1);
                        modelo[1] = res.getString(2);
                        modelo[2] = res.getString(3);

                        break;
                    }

                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return modelo;
    }

}
