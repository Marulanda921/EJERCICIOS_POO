package RegistroEmpleados;

public class Empleado extends Persona {

    private int idEmpleado;
    private  double salario;

    public Empleado(int id, String nombre, int idEmpleado, double salario) {
        super(id, nombre);
        this.idEmpleado = idEmpleado;
        this.salario = salario;

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
