package ejemploWEBClase;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import ejemploWEBClase.aplicaciones.AplicacionConfiguracionContexto;
import ejemploWEBClase.web.WebConfiguracionContexto;

/**
 * @author Talamino
 */
public class EnrutadorEjemploWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { AplicacionConfiguracionContexto.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfiguracionContexto.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
