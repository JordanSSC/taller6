public class EmpleadoPorHoras extends Empleado {
    private String genero;
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento);
        this.tarifaHora = tarifaHora;
        this.genero = genero;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getNombre());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * tarifaHora;
    }

    // Más metodos
}