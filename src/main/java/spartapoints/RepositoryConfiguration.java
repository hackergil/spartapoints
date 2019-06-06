package spartapoints;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

    public RepositoryConfiguration() {
        super();
    }

    @Bean
    OrderEventHandler orderEventHandler(){
        return new OrderEventHandler();
    }
}
