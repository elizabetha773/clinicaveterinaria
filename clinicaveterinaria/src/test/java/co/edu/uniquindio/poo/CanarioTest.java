package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CanarioTest {
     private static final Logger LOG = Logger.getLogger(CanarioTest.class.getName());
    
    
    @Test
    public void testColorPlumas() {
        Canario canario = new Canario("Piolin", 3, 2.0, 3.0, 5.0, "Azul", tipoAnimal.DOMESTICO);
        assertEquals("Azul", canario.getColorPlumas());
    }
    
    @Test
    public void testDatosVacios(){
        LOG.info("iniciando test datos vacios ");
        assertThrows(Throwable.class,()-> new Canario(" ", 0, 0, 0, 0, " ",null));
        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void numerosNegativos() {
        LOG.info("Iniciado test numeros negativos");
        assertThrows(Throwable.class,()-> new Canario("Piolin", -3, -2.0, -3.0, -5.0, "Azul", tipoAnimal.DOMESTICO));
        LOG.info("Finalizando test numeros negativos");
    }
}
