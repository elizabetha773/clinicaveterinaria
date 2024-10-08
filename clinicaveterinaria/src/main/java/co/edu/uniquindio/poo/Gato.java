package co.edu.uniquindio.poo;

public class Gato extends Animal {
    private String colorPelaje;
    private tipoAnimal tipoAnimal;
    public Gato(String nombre, int edad, double peso, double comidaPorDia, double horaSueñoDiario, String colorPelaje,
            co.edu.uniquindio.poo.tipoAnimal tipoAnimal) {
        super(nombre, edad, peso, comidaPorDia, horaSueñoDiario);
        this.colorPelaje = colorPelaje;
        this.tipoAnimal = tipoAnimal;
        assert !nombre.isBlank();
        assert ! colorPelaje.isBlank();
        assert !colorPelaje.isBlank();
        assert tipoAnimal !=null;


    }
    public String getColorPelaje() {
        return colorPelaje;
    }
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    public tipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(tipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    @Override
    public String toString() {
        return "----------------Gato----------------\nNombre: " + nombre + "\nColor de pelaje: " + colorPelaje + "\nEdad: " + edad + " años\nPeso: " + peso+ "kgs\nTipo de animal: " + tipoAnimal + "\nComida por dia: " + comidaPorDia + " kgs\nHoras de sueño diario: "+ horaSueñoDiario + " hrs\n\n";
    }

    
    
    

    
}
