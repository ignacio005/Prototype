public class Analgesico extends Medicamento {
    private int dosisComprimidos;
    public Analgesico(String nombre, String laboratorio, int fechaDeCaducidad, int dosisComprimidos){
        super(nombre, laboratorio, fechaDeCaducidad);
        setDosisComprimidos(dosisComprimidos);
    }
    public int getDosisComprimidos(){
        return dosisComprimidos;
    }
    public void setDosisComprimidos(int dosisComprimidos){
        this.dosisComprimidos = dosisComprimidos;
    }
    @Override
    public String toString() {
        return "La dosis del analgésico es " + getDosisComprimidos() + " g.";
    }
}
