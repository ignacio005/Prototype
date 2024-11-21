public abstract class Medicamento implements Cloneable{
    private String nombre;
    private String laboratorio;
    private int fechaDeCaducidad;
    public String getNombre(){
        return nombre;
    }
    public Medicamento(String nombre, String laboratorio, int fechaDeCaducidad){
        setNombre(nombre);
        setLaboratorio(laboratorio);
        setFechaDeCaducidad(fechaDeCaducidad);
    }
    public String getLaboratorio(){
        return laboratorio;
    }
    public int getFechaDeCaducidad(){
        return fechaDeCaducidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setLaboratorio(String laboratorio){
        this.laboratorio = laboratorio;
    }
    public void setFechaDeCaducidad(int fechaDeCaducidad){
        this.fechaDeCaducidad = fechaDeCaducidad;
    }
    @Override
    protected Medicamento clone() throws CloneNotSupportedException{
        return (Medicamento) super.clone();
    }
}
