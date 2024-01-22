class Cuerda extends Instrumentos {


    public Cuerda(String nombre, double precio) {
        super(nombre, precio);
        tipoInstrumento=1;
    }

    public void tocar() {
        System.out.println("Está sonando un instrumento de cuerda");
    }



}
