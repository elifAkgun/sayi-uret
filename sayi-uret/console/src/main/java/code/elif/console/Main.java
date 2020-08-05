package code.elif.console;

import code.elif.AppConfig;
import code.elif.game.Game;
import code.elif.game.MessageGenerator;
import code.elif.game.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // create context (container)
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);


        //get numbergenerator bean from the context
        NumberGenerator numberGenerator
                = context.getBean("numberGenerator", NumberGenerator.class);

        // call method next() to get a random number
        int number = numberGenerator.next();

        // log generated number
        log.info("number = {}", number);

        //get game bean from the context
        Game game
                = context.getBean("game", Game.class);

        MessageGenerator messageGenerator
                = context.getBean("message", MessageGenerator.class);

        String mainMessage = messageGenerator.getMainMessage();

        log.info(mainMessage);
        String resultMessage = messageGenerator.getResultMessage();

        log.info(resultMessage);

        // close context (container)
        context.close();


    }
}
