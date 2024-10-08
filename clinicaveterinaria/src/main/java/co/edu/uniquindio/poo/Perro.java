package co.edu.uniquindio.poo;

public class Perro extends Animal {
    private String raza;
    private tipoAnimal tipoAnimal;
    public Perro(String nombre, int edad, double peso, double comidaPorDia, double horaSueñoDiario, String raza,
            tipoAnimal tipoAnimal) {
        super(nombre, edad, peso, comidaPorDia, horaSueñoDiario);
        this.raza = raza;
        this.tipoAnimal = tipoAnimal;

        assert !nombre.isBlank();
        assert !raza.isBlank();
        assert tipoAnimal!=null;
        assert edad>0;
        assert peso>0;
        assert comidaPorDia>0;
        assert horaSueñoDiario>0;
    

    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public tipoAnimal getTipoaAnimal() {
        return tipoAnimal;
    }
    public void setTipoaAnimal(tipoAnimal tipoaAnimal) {
        this.tipoAnimal = tipoaAnimal;
    }

    @Override
    public String toString() {
        return "----------------Perro----------------\nNombre: " + nombre + "\nRaza: " + raza + "\nEdad: " + edad + " años\nPeso: " + peso+ " kgs\nTipo de animal: " + tipoAnimal + "\nComida por dia: " + comidaPorDia + " kgs\nHoras de sueño diario: "+ horaSueñoDiario + " hrs\n\n";
    }
    
}
