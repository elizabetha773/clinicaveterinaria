package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class PerroTest {
     private static final Logger LOG = Logger.getLogger(PerroTest.class.getName());
     
     
    @Test
    public void testDatosVacios(){
        LOG.info("iniciando test datos vacios ");
        assertThrows(Throwable.class,()-> new Perro(" ", 0, 0, 0, 0, null, null));
        LOG.info("Finalizando test datos vacios");

    }

    @Test
    public void tesRaza() {
        Perro perro = new Perro("Lucas", 2, 3, 5, 4,"Labrador", tipoAnimal.DOMESTICO);
        assertEquals("Labrador", perro.getRaza());
    }

    
    @Test
    public void numerosNegativos() {
        LOG.info("Iniciado test numeros negativos");
        assertThrows(Throwable.class,()-> new Perro("Lucas", -2, -3, -5, -4,"Labrador", tipoAnimal.DOMESTICO));
        LOG.info("Finalizando test numeros negativos");
    }

    


    
}

