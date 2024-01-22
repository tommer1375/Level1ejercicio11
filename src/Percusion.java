
class Percusion extends Instrumentos {


    public Percusion(String nombre, double precio) {
        super(nombre, precio);
        tipoInstrumento=3;
    }

    public void tocar() {
        System.out.println("Está sonando un instrumento de percusión");
    }



}
