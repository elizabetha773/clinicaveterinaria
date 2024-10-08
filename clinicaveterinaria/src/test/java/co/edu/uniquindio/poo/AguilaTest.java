package co.edu.uniquindio.poo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class AguilaTest {
    private static final Logger LOG = Logger.getLogger(AguilaTest.class.getName());


    @Test
    public void testDatosVacios(){
        LOG.info("iniciando test datos vacios ");
        assertThrows(Throwable.class,()-> new Aguila(" ", 0, 0, 0, 0, " ",null));
        LOG.info("Finalizando test datosVacios");

    }
    
    @Test
    public void edadNegativa() {
        LOG.info("Iniciado test edadNegativa");
        assertThrows(Throwable.class, ()-> new Aguila("Pepe", -4, 15, 3, 6, "Desierto", tipoAnimal.SALVAJE));
        LOG.info("Finalizando test edadNegativa");
    }


    @Test
    public void testHabitat() {
        Aguila aguila = new Aguila("Claudio", 3, 9.0, 4.0, 8.0, "Desierto", tipoAnimal.SALVAJE);
        assertEquals("Desierto", aguila.getHabitat());
    }




}


