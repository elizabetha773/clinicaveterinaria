package co.edu.uniquindio.poo;

public class Canario extends Animal {
    private String colorPlumas;
    private tipoAnimal tipoAnimal;
    public Canario(String nombre, int edad, double peso, double comidaPorDia, double horaSueñoDiario,
            String colorPlumas, co.edu.uniquindio.poo.tipoAnimal tipoAnimal) {
        super(nombre, edad, peso, comidaPorDia, horaSueñoDiario);
        this.colorPlumas = colorPlumas;
        this.tipoAnimal = tipoAnimal;
        assert !colorPlumas.isBlank();
        assert tipoAnimal !=null;
        assert edad>0;
        assert peso>0;
        assert comidaPorDia>0;
        assert horaSueñoDiario>0;

    }
    public String getColorPlumas() {
        return colorPlumas;
    }
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    public tipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(tipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    @Override
    public String toString() {
        return "----------------Canario----------------\nNombre: " + nombre + "\nColor de plumas: " + colorPlumas + "\nEdad: " + edad + " años\nPeso: " + peso+ "kgs\nTipo de animal: " + tipoAnimal + "\nComida por dia:" + comidaPorDia + " kgs\nHoras de sueño diario: "+ horaSueñoDiario + " hrs\n\n";
    }

    

}
