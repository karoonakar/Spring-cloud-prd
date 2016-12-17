package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
