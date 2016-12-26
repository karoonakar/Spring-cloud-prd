package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RefreshScope
@RestController
public class ProjectNameRestController {

	@Value("${configuration.authName}")
	private String authName;

	@RequestMapping(value="/authname",  method=RequestMethod.GET)
	public String authName() {
		return this.authName;
	}

	@Value("${configuration.projectName}")
	private String projectName;

	@RequestMapping(value="/projectname",  method=RequestMethod.GET)
	public String projectName() {
		return this.projectName;
	}

	

}
