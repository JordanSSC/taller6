public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, String departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    
    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Genero: " + getNombre());
        System.out.println("Salario: " + getSalarioBase());
        System.out.println("Horas trabajadas: " + getHorasTrabajadas());
        System.out.println("Departamento: " + getDepartamento());
    }
    public double calcularSalario() {
        if(salarioBase <= 0){
            throw new IllegalArgumentException("El salario debe ser mayor a 0");
        }
        if(horasTrabajadas <= 0){
            throw new IllegalArgumentException("Las horas trabajadas deben ser amyor a 0");
        }
        double salarioTotal = salarioBase;
       if(horasTrabajadas >= 40){
        salarioTotal += (horasTrabajadas - 40) * 50;
       }
       if("Sistemas".equals(departamento)){
        salarioTotal += 20;
       }else if ("Contabilidad".equals(departamento)){
        salarioTotal +=10;
       }
       return salarioTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Más metodos
}
