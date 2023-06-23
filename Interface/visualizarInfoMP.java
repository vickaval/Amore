package Interface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Datos.Conexion;

import java.awt.*;
import java.sql.*;

public class visualizarInfoMP extends JFrame{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabla de las materias primas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        try {
        	
    		Conexion con =  new Conexion();
    		
       		Connection conexion = con.conectar();
            String query = "SELECT * FROM materiaprima";
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            JTable table = new JTable(buildTableModel(rs));
            JScrollPane scrollPane = new JScrollPane(table);

            frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
            frame.setVisible(true);

            rs.close();
            stmt.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

       
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i - 1] = metaData.getColumnName(i);
        }

        
        Object[][] data = new Object[0][columnCount];
        while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = rs.getObject(i);
            }
            data = addRowToData(data, row);
        }

        return new DefaultTableModel(data, columnNames);
    }

    public static Object[][] addRowToData(Object[][] data, Object[] row) {
        int numRows = data.length;
        int numColumns = row.length;

        Object[][] newData = new Object[numRows + 1][numColumns];
        System.arraycopy(data, 0, newData, 0, numRows);

        newData[numRows] = row;

        return newData;
    }
}
