package io.github.higorae.service;

import java.util.Date;

public class Logger {
	
	public static void log(String item){
        System.out.println("Log: " +  item + " at "+new Date());
    }
}
