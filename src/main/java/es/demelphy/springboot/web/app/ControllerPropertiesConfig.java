package es.demelphy.springboot.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpat:controller.properties")
})
public class ControllerPropertiesConfig {

}
