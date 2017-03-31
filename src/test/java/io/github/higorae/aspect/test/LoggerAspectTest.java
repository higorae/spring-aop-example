package io.github.higorae.aspect.test;

import io.github.higorae.App;
import io.github.higorae.businessLogic.BusinessLogic01;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = App.class)
public class LoggerAspectTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Autowired
	private BusinessLogic01 item01;
	
	@Before
	public void setUp() {
	    System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	@Test
	public void testAspect(){
		item01.anotherThing();
		Assert.assertTrue(outContent.toString().contains("io.github.higorae.businessLogic.BusinessLogic01"));
	}
}
