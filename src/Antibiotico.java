public class Antibiotico extends Medicamento{
    private int dosisIntramuscular;
    public Antibiotico(String nombre, String laboratorio, int fechaDeCaducidad, int dosisIntramuscular){
        super(nombre, laboratorio, fechaDeCaducidad);
        setCapsula(dosisIntramuscular);
    }
    public int getDosisIntramuscular(){
        return dosisIntramuscular;
    }
    public void setCapsula(int dosisIntramuscular){
        this.dosisIntramuscular = dosisIntramuscular;
    }
    @Override
    public String toString() {
        return "La dosis intramuscular del antibiotico es " + getDosisIntramuscular() + " mL.";
    }

}
