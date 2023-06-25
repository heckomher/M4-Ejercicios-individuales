public class Trabajadores {
    private String nombres;
    private String apellidos;
    private String run;
    private double telefono;
    private int edad;

    public Trabajadores() {
    }

    /**
     * @param nombres corresponde a los nombres del trabajador como cadena.
     * @param apellidos Corresponde a los apellidos del trabajador como cadena.
     * @param run Corresponde al run del trabajador como cadena.
     * @param telefono Corresponde al teléfono como entero grande.
     * @param edad Corresponde a la edad del trabajador como entero.
     */
    public Trabajadores(String nombres, String apellidos, String run, double telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Trabajadores{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }

    /**
     * @return concatenado de nombres y apellidos
     */
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    /**
     * @return Parte numérica de run
     */
    public int descomponerRun() {
        String[] partes = run.split("-");
        return Integer.parseInt(partes[0]);
    }
}
