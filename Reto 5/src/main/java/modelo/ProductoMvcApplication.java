package modelo;

import controlador.Controlador;
import java.util.List;
import vista.VentanaProducto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductoMvcApplication {

    @Autowired
    ProductoRepositorio repositorio;

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ProductoMvcApplication.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
    }

    @Bean
    ApplicationRunner applicationRunner() {
        return args -> {
            /*
             * Incluir código definitivo aqui 
             */
            VentanaProducto ventana = new VentanaProducto();
            Controlador controlador = new Controlador(ventana, repositorio);
            List<Producto> listadoProductos = (List<Producto>) repositorio.findAll();
            controlador.getVista().asigarModelo(listadoProductos);

        };
    }
}
