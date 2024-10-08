package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class ClinicaVeterinaria {
    private String nombre;
    LinkedList<Perro>perros;
    LinkedList<Gato>gatos;
    LinkedList<Canario>canarios;
    LinkedList<Leon>leones;
    LinkedList<Aguila>aguilas;

    public ClinicaVeterinaria(String nombre) {
        this.nombre = nombre;
        perros=new LinkedList<>();
        gatos=new LinkedList<>();
        canarios=new LinkedList<>();
        leones=new LinkedList<>();
        aguilas=new LinkedList<>();
    }



    
    public LinkedList<Perro> getPerros() {
        return perros;
    }




    public void setPerros(LinkedList<Perro> perros) {
        this.perros = perros;
    }




    public LinkedList<Gato> getGatos() {
        return gatos;
    }




    public void setGatos(LinkedList<Gato> gatos) {
        this.gatos = gatos;
    }




    public LinkedList<Canario> getCanarios() {
        return canarios;
    }




    public void setCanarios(LinkedList<Canario> canarios) {
        this.canarios = canarios;
    }




    public LinkedList<Leon> getLeones() {
        return leones;
    }




    public void setLeones(LinkedList<Leon> leones) {
        this.leones = leones;
    }




    public LinkedList<Aguila> getAguila() {
        return aguilas;
    }




    public void setAguila(LinkedList<Aguila> aguila) {
        this.aguilas = aguila;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //agregar perro
    public void agregarPerro(Perro perro){
        perros.add(perro);
    }


    //agregar gato

    public void agregarGato(Gato gato){
        gatos.add(gato);
    }

    //agregar Canario

    public void agregarCanario(Canario canario){
        canarios.add(canario);
    }

    //agregar Leon

    public void agregarLeon(Leon leon){
        leones.add(leon);
    }

    //agregar Aguila

    public void agregarAguila(Aguila aguila){
        aguilas.add(aguila);
    }




    @Override
    public String toString() {
        return "El nombre de la clínica es:\n " + nombre + "\nLa lista de perros es:\n " + perros + "\nLa lista de gatos es:\n " + gatos + "\nLa lista de canarios es:\n "+ canarios + "\nLa lista de leones es:\n " + leones + "\nLa lista de aguilas es:\n " + aguilas;
    }


    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
