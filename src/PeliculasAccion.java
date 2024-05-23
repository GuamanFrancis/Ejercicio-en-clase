public class PeliculasAccion extends Peliculas{
    String Genero;

    public PeliculasAccion (String Nombre, int año, String Genero){
        super(Nombre, año);
        this.Genero = Genero;

    }

    public void mostrarinformacion(){
        System.out.println("El nombre de la pelicula es "+Nombre+", el año en el que salio es "+año+" y por ultimo es de genero "+Genero);

    }




}
