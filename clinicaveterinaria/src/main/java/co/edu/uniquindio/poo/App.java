package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        //crear clinica
        ClinicaVeterinaria clinicaVeterinaria= new ClinicaVeterinaria("Ukumari");

        //agregar animales a clinica
        

        //crear perro
        Perro perro=new Perro("Firulais Jr", 2, 5, 1, 5, "Pitbull", tipoAnimal.DOMESTICO);
        //agregarlo
        clinicaVeterinaria.agregarPerro(perro);


        //crear gato
        Gato gato = new Gato("Pepe", 1, 2, 5, 9, "Amarillo", tipoAnimal.DOMESTICO);
        //agregarlo
        clinicaVeterinaria.agregarGato(gato);
        
        //crear Canario
        Canario canario = new Canario("Piolin", 3, 2, 3, 5, "Azul", tipoAnimal.DOMESTICO);
        //agregarlo
        clinicaVeterinaria.agregarCanario(canario);

        //Crear Leon
        Leon leon=new Leon("Reynildo", 16, 72, 8, 8, "Selva", tipoMelena.MEDIA, tipoAnimal.SALVAJE);
        //agregarlo
        clinicaVeterinaria.agregarLeon(leon);   

        //Crear Aguila
        Aguila aguila = new Aguila("Claudio", 3, 9, 4, 8, "Desierto", tipoAnimal.SALVAJE);
        //agregarlo
        clinicaVeterinaria.agregarAguila(aguila);   


        clinicaVeterinaria.mostrarMensaje(clinicaVeterinaria.toString());
        
    }

}
