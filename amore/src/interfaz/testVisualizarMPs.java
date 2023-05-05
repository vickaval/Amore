package interfaz;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import logica.Deposito;
import logica.MateriaPrima;
import logica.Produccion;

public class testVisualizarMPs {

	public static void main(String[] args) {
		Produccion prod = new Produccion(1, null);
		
		MateriaPrima materia1 = new MateriaPrima(1001, "Tomate", "España", 1.50, 500);
		MateriaPrima materia2 = new MateriaPrima(1002, "Cebolla", "México", 0.75, 300);
		MateriaPrima materia3 = new MateriaPrima(1003, "Ajo", "China", 2.20, 200);
		MateriaPrima materia4 = new MateriaPrima(1004, "Aceite de oliva", "Italia", 4.50, 100);
		MateriaPrima materia5 = new MateriaPrima(1005, "Sal", "Francia", 0.30, 1000);
		
		prod.agregarMateriasPrimas(materia1);
		prod.agregarMateriasPrimas(materia2);
		prod.agregarMateriasPrimas(materia3);
		prod.agregarMateriasPrimas(materia4);
		prod.agregarMateriasPrimas(materia5);
		
		// Preguntar al usuario si quiere ver o agregar materias primas
        int opcion = JOptionPane.showOptionDialog(null, "Inicio",
                "Depto. Produccion / Stock de materias primas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { "Ver materias primas" }, null);
        //new Object[] { "Ver materias primas", agregar materias primas" }, null);

        if (opcion == JOptionPane.YES_OPTION) {
            // Ver materias primas
            ArrayList<MateriaPrima> materias = prod.getListaMPs();
            String mensaje = "Listado de Materias Primas: \n\n";
            for (MateriaPrima mp : materias) {
            	mensaje += "Código: " + mp.getCodigoMp() + " - " + "Nombre: " + mp.getNombre() +  " - " + "Stock: " + mp.getStockDisponible() + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }/* else if (opcion == JOptionPane.NO_OPTION) {
            // Agregar materias primas
            int codigoMp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la materia prima"));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la materia prima");
            String procedencia = JOptionPane.showInputDialog("Ingrese la procedencia de la materia prima");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la materia prima"));
            int stockDisponible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock disponible de la materia prima"));
            MateriaPrima nuevaMateria = new MateriaPrima(codigoMp, nombre, procedencia, precio, stockDisponible);
            prod.agregarMateriasPrimas(nuevaMateria);
            JOptionPane.showMessageDialog(null, "Materia prima agregada con éxito");
            
            // Mostrar el listado actualizado de materias primas
            ArrayList<MateriaPrima> materias = prod.getListaMPs();
            String mensaje = "Listado de Materias Primas: \n\n";
            for (MateriaPrima mp : materias) {
                mensaje += "Código: " + mp.getCodigoMp() + " - " + "Nombre: " + mp.getNombre() +  " - " + "Stock: " + mp.getStockDisponible() + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
*/

	}

}

