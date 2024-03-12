package RegistroEmpleados;

public class EmpleadoTemporal extends Empleado {

    private  boolean estado;

    public EmpleadoTemporal(int id, String nombre, int idEmpleado, double salario) {
        super(id, nombre, idEmpleado, salario);
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
