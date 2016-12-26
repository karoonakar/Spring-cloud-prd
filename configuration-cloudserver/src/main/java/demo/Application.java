package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@EnableConfigServer
@ComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

//command to execute on config client
//curl -X POST http://localhost:8080/refresh
//http://localhost:8080/env/configuration.authName
//http://localhost:8080/env/



//command to execute on config client
//http://localhost:8888/config-client/default
//http://localhost:8888/config-client/<profileName>


// to read
// http://kubecloud.io/guide-spring-cloud-config/
// https://www.iancollington.com/centralised-configuration-using-spring-boot/

// https://bushkarl.gitbooks.io/spring-cloud/content/spring_cloud_config/spring_cloud_config_server.html