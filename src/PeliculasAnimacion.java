public class PeliculasAnimacion extends Peliculas {
    double puntuacion;
    int Numerodeactores;
    String idioma;

    public PeliculasAnimacion(String Nombre, int año, String locaciones, double Presupuesto, int Premios, double puntuacion,int Numerodeactores,String idioma){
        super(Nombre,  año,  locaciones,  Presupuesto,  Premios);
        this.puntuacion =  puntuacion;
        this.Numerodeactores = Numerodeactores;
        this.idioma = idioma;

    }

    public void Imformacionpeliculaanimada(){
        System.out.println("----------------------------------------\n");
        System.out.println("Detalles de la pelicula\n");
        System.out.println("Nombre: "+Nombre+"\n");
        System.out.println("Localizaciones: "+año+"\n");
        System.out.println("Presupuesto: "+Presupuesto+"\n");
        System.out.println("Premios: "+Premios+"\n");
        System.out.println("Puntuacion: "+puntuacion+"\n");
        System.out.println("N de actores: "+Numerodeactores+"\n");
        System.out.println("Idioma: "+idioma+"\n");
        System.out.println("--------------------------------------------\n");



    }




}




public class PeliculasAnimacionEEUU extends PeliculasAnimacion{
    String EstudiodeAnimacion;
    double Precio;

    public PeliculasAnimacionEEUU(double  puntuacion, int Numerodeacotores, String idioma , String EstudiodeAnimacion, double Precio ){
        super (puntuacion,Numerodeacotores, idioma);
        this.EstudiodeAnimacion = EstudiodeAnimacion;
        this.Precio = Precio;



    }

    public void  imformacionanimada(){
        System.out.println("----------------------------------------\n");
        System.out.println("Detalles de la pelicula\n");
        System.out.println("Puntuacion: "+puntuacion+"\n");
        System.out.println("N de actores: "+Numerodeactores+"\n");
        System.out.println("Idioma: "+idioma+"\n");
        System.out.println("Estudio de animacion: "+EstudiodeAnimacion+"\n");
        System.out.println("Precio de entrada: "+Precio+"\n");
        System.out.println("--------------------------------------------\n");



    }




}
