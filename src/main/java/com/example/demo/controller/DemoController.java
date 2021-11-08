package com.example.demo.controller;

import com.example.demo.controller2.Grov;
import com.example.demo.model.JHLIM;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	@GetMapping("/home")
	public String home() {
		return "HOME";
	}
	
	@GetMapping("/version")
	public String version() {
		return Grov.version();
//		return "0.0.1";
	}
	
	@GetMapping("/name")
	public String name() {
		return new Grov().getName(new JHLIM("jh-lim"));
	}
}
