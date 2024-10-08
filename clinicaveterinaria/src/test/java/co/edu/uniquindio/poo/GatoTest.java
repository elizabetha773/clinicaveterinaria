package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class GatoTest {
     private static final Logger LOG = Logger.getLogger(GatoTest.class.getName());


    @Test
    public void testColorPelaje() {
        Gato gato = new Gato("Pepe", 1, 2.0, 5.0, 9.0, "Amarillo", tipoAnimal.DOMESTICO);
        assertEquals("Amarillo", gato.getColorPelaje());
    }
    
    @Test
    public void testDatosVacios(){
        LOG.info("iniciando test datos vacios ");
        assertThrows(Throwable.class,()-> new Gato(" ", 0, 0.0, 0.0, 0.0, " ", null));
        LOG.info("Finalizando test datos vacios");

    }

    @Test
    public void testSetColorPelaje() {
        Gato gato = new Gato("Pepe", 1, 2.0, 5.0, 9.0, "Amarillo", tipoAnimal.DOMESTICO);
        gato.setColorPelaje("Blanco");
        assertTrue(gato.getColorPelaje().equals("Blanco"));
    }
    
}
