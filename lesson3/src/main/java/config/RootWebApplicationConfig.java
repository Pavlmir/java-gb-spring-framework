package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.gb.CartConfiguration;

@Configuration
@Import(CartConfiguration.class)
public class RootWebApplicationConfig{
}
