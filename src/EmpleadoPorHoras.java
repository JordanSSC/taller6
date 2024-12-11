public class EmpleadoPorHoras extends Empleado {
    
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento, genero);
        this.tarifaHora = tarifaHora;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
    }
    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * tarifaHora;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }


    // Más metodos
}