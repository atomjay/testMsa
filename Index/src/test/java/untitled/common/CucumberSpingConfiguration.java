package untitled.common;


import untitled.IndexApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { IndexApplication.class })
public class CucumberSpingConfiguration {
    
}
