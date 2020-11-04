package tech.sishodiyology.verbtile_endpoints.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {

	@GetMapping("/test")
	public String test() {
		return "Hey there i am from test method";
	}
	
}
