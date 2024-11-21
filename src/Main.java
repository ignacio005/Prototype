public class Main {
    public static void main(String[] args) throws Exception{
        Antibiotico antibiotico1 = new Antibiotico("Gentamicina", "Vitalis", 2025, 2);
        Analgesico analgesico1 = new Analgesico("Paracetamol", "Normon", 2027, 1);

        System.out.println("\nOriginales:");
        System.out.println("Especificaciones del medicamento:\n - Nombre: " + antibiotico1.getNombre() +"\n - Laboratorio: " + antibiotico1.getLaboratorio() + "\n - Fecha de caducidad: " + antibiotico1.getFechaDeCaducidad());
        System.out.println(antibiotico1.toString());
        System.out.println("Especificaciones del medicamento:\n - Nombre: " + analgesico1.getNombre() +"\n - Laboratorio: " + analgesico1.getLaboratorio() + "\n - Fecha de caducidad: " + analgesico1.getFechaDeCaducidad());
        System.out.println(analgesico1.toString());

        // Usamos .clone() para clonar el objeto.
        Medicamento antibioticoCopia1 = antibiotico1.clone();
        antibioticoCopia1.setFechaDeCaducidad(2003);
        System.out.println("\nClones:");
        System.out.println("Especificaciones del medicamento:\n - Nombre: " + antibioticoCopia1.getNombre() +"\n - Laboratorio: " + antibioticoCopia1.getLaboratorio() + "\n - Fecha de caducidad: " + antibioticoCopia1.getFechaDeCaducidad());
        System.out.println(antibioticoCopia1.toString());

        Medicamento analgesicoCopia1 = analgesico1.clone();
        System.out.println("Especificaciones del medicamento:\n - Nombre: " + analgesicoCopia1.getNombre() +"\n - Laboratorio: " + analgesicoCopia1.getLaboratorio() + "\n - Fecha de caducidad: " + analgesicoCopia1.getFechaDeCaducidad());
        System.out.println(analgesicoCopia1.toString());
    }
}