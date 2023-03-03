package untitled.common;


import untitled.NotifyApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotifyApplication.class })
public class CucumberSpingConfiguration {
    
}
