package programmerzamannow.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import programmerzamannow.spring.core.data.Bar;
import programmerzamannow.spring.core.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    @DependsOn({
        "bar"
    })
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }

}
