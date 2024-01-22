
abstract class Instrumentos {
    protected String nombre;
    protected double precio;
    protected int tipoInstrumento;

    public Instrumentos (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        tipoInstrumento=0;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public Integer gettipoInstrumento() {

        return tipoInstrumento;

    }

    public abstract void tocar();

    public String toString() {

        return "El instrumento " +nombre+ " con un precio de " +precio+ "€ ";
    }
}
