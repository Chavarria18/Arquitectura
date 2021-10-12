
package com.ventas.ventas;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.RedirectView;

public class TelefonoTest extends VentasApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;
    @Autowired(required = true)
    private Dao dao; 
    
    @Autowired(required = true)
    Dao mockdao = mock(Dao.class); 
    



    public Telefono tel = new Telefono(); 
    
    @Test
	void TestTelefono() throws Exception {

       
        tel.setNombret("NombrePrueba");
        tel.setAlmacenamiento(80);
        tel.setCodigo_modelo("a7");
        tel.setColor("Rojo");
        tel.setExistencia(10);
        tel.setDescripcion("Descripcion de prueba");
        tel.setNombre_marca("Marca");
        tel.setRam(8);
        tel.setPrecio_lista(85);
        tel.setProcesador("Snap-prueba");
        tel.setId_dispositivo(1);
        tel.setNumero_serie("55AA");
        tel.setNumero_cores(8);        
   

       


        assertSame(       "NombrePrueba"     ,tel.getNombret());
        assertSame(   80   ,tel.getAlmacenamiento());
        assertSame(    "a7"  ,tel.getCodigo_modelo());
        assertSame(  "Rojo"    ,tel.getColor());
        assertSame(  10    ,tel.getExistencia());
        assertSame(  "Descripcion de prueba"    ,tel.getDescripcion());
        assertSame(  "Marca"    ,tel.getNombre_marca());
        assertSame(  8    ,tel.getRam());
        assertSame(    "Snap-prueba"  ,tel.getProcesador());
        assertSame(   1 ,tel.getId_dispositivo());
        assertSame(   "55AA"     ,tel.getNumero_serie());
        assertSame(   8   ,tel.getNumero_cores());
     
        
        


    
        
        
		
					

	}




	

}