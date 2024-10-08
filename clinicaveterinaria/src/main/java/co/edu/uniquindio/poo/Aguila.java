package co.edu.uniquindio.poo;

public class Aguila extends Animal {
    private String habitat;
    private tipoAnimal tipoAnimal;
    public Aguila(String nombre, int edad, double peso, double comidaPorDia, double horaSueñoDiario, String habitat,
            tipoAnimal tipoAnimal) {
        super(nombre, edad, peso, comidaPorDia, horaSueñoDiario);
        this.habitat = habitat;
        this.tipoAnimal = tipoAnimal;

        assert edad>0;
        assert peso>0;
        assert comidaPorDia>0;
        assert horaSueñoDiario>0;
        assert tipoAnimal !=null;
        assert !habitat.isBlank();
        
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public tipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(tipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    @Override
    public String toString() {
        return "----------------Águilas----------------\nNombre: " + nombre + "\nHábitat: " + habitat + "\nEdad: " + edad + " años\nTipo de animal: " + tipoAnimal+ "\nPeso: " + peso + " kgs\nComida por día: " + comidaPorDia + " kgs\nHoras de sueño diario: " + horaSueñoDiario+" hrs\n\n";
    }

    
}
