package com.wyssmann.sampleapps.simpleconsole;

import org.junit.Assert;
import org.junit.Test;

public class SimpleConsoleTests {

	@Test
	public void returnExitOnExitCommand() {
		String  retval = SimpleConsole.parse_input("exit test");
		Assert.assertEquals("exit", retval);
	}
	
	@Test
	public void returnEchoOnEchoCommand() {
		String retval = SimpleConsole.parse_input("echo test");
		Assert.assertEquals("echo",  retval);
	}
}
