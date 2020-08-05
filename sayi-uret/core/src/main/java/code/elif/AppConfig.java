package code.elif;

import code.elif.game.Game;
import code.elif.game.MessageGenerator;
import code.elif.game.NumberGenerator;
import code.elif.game.impl.GameImpl;
import code.elif.game.impl.MessageGeneratorImpl;
import code.elif.game.impl.NumberGeneratorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "code.elif")
public class AppConfig {

    @Bean("numberGenerator")
    public NumberGenerator numberGenerator() {
        return new NumberGeneratorImpl();
    }

    @Bean("game")
    public Game game() {
        return new GameImpl();
        
    }

    @Bean("message")
    public MessageGenerator messageGenerator() {
        return new MessageGeneratorImpl();
    }
}
