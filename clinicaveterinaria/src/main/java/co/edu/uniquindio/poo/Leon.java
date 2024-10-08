package co.edu.uniquindio.poo;

public class Leon extends Animal {
    private String habitat;
    private tipoMelena tipoMelena;
    private tipoAnimal tipoAnimal;
    public Leon(String nombre, int edad, double peso, double comidaPorDia, double horaSueñoDiario, String habitat,
            co.edu.uniquindio.poo.tipoMelena tipoMelena, co.edu.uniquindio.poo.tipoAnimal tipoAnimal) {
                
        super(nombre, edad, peso, comidaPorDia, horaSueñoDiario);
        this.habitat = habitat;
        this.tipoMelena = tipoMelena;
        this.tipoAnimal = tipoAnimal;
        assert edad>0;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public tipoMelena getTipoMelena() {
        return tipoMelena;
    }
    public void setTipoMelena(tipoMelena tipoMelena) {
        this.tipoMelena = tipoMelena;
    }
    public tipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(tipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    @Override
    public String toString() {
        return "----------------Leon----------------\nNombre: " + nombre + "\nHábitat: " + habitat + "\nEdad: " + edad + " años\nTipo de melena: " + tipoMelena+ "\nPeso: " + peso + " kgs\nComida por día: " + comidaPorDia + " kgs\nTipo de animal: " + tipoAnimal+ "\nHoras de sueño diario: " + horaSueñoDiario + " hrs\n\n";
    }
   
    

}
