package co.edu.uniquindio.poo;

public class Animal {
    public String nombre;
    public int edad;
    public double peso;
    public double comidaPorDia;
    public double horaSueñoDiario;


    public Animal(String nombre, int edad, double peso, double comidaPorDia, double horaSueñoDiario) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.comidaPorDia = comidaPorDia;
        this.horaSueñoDiario = horaSueñoDiario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getComidaPorDia() {
        return comidaPorDia;
    }
    public void setComidaPorDia(double comidaPorDia) {
        this.comidaPorDia = comidaPorDia;
    }
    public double getHoraSueñoDiario() {
        return horaSueñoDiario;
    }
    public void setHoraSueñoDiario(double horaSueñoDiario) {
        this.horaSueñoDiario = horaSueñoDiario;
    }


    
    
}
