package com.example.demo.controller2

import com.example.demo.model.JHLIM

class Grov{
	public static String version() {
		return "1.0.0"
	}
	
	public String getName(JHLIM jhlim) {
		return jhlim.getName()
	}
}