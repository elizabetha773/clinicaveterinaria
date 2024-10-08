package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;


public class LeonTest {
    private static final Logger LOG = Logger.getLogger(LeonTest.class.getName());


    @Test
    public void testTipoMelena() {
        Leon leon = new Leon("Reynildo", 16, 72.0, 8.0, 8.0, "Selva", tipoMelena.MEDIA, tipoAnimal.SALVAJE);
        assertEquals(tipoMelena.MEDIA, leon.getTipoMelena()); 
    }

        @Test
    void testSetHabitat() {
        Leon leon = new Leon("Claudio", 3, 9.0, 4.0, 8.0, "Selva",tipoMelena.MEDIA, tipoAnimal.SALVAJE);
        leon.setHabitat("Selva");
        assertTrue(leon.getHabitat().equals("Selva"));
    }

       @Test
    public void edadNegativa() {
        LOG.info("Iniciado test edadNegativa");
        assertThrows(Throwable.class, ()-> new Leon("Claudio", -3, 9.0, 4.0, 8.0, "Selva",tipoMelena.MEDIA, tipoAnimal.SALVAJE));
        LOG.info("Finalizando test edadNegativa");
    }




}
