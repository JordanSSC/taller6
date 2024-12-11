import java.util.List;

//Extract Method
public class BuscadorEmpleado {
    public static Empleado buscarEmpleadoPorNombre(String nombre, List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            if (esEmpleado(empleado,nombre)) { //linea cambiada con un call del nuevo metodo esEmpleado
                return empleado;
            }
        }
        return null;
    }
    
    private static boolean esEmpleado(Empleado empleado, String nombre) {
        return empleado.getNombre().equals(nombre); //linea original
    }

    // Más metodos
}
