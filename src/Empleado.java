public class Empleado extends Persona{

    private String tipoContrato;
    private int sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String documento, int edad, String tipoContrato, int sueldo) {
        super(nombre, apellido, documento, edad);
        this.tipoContrato = tipoContrato;
        this.sueldo = sueldo;
    }


    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }


    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "tipoContrato='" + tipoContrato + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }


    @Override
    public String mostrarInfo(){
        return "SOY UN EMPLEADO: " + "Nombre: " + nombre + "Apellido: " + apellido + " Documento: " + documento + " Edad: " + edad +
                " Tipo de Contrato: " + tipoContrato + " Sueldo: " + sueldo ;

    }
}
