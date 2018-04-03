package com.springboot.servlettest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServletTestApplicationTests {

	@Autowired
	private ServletConfig.TestServlet testServlet;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testPropertySet(){
		assertThat("test property must be set to ADR", testServlet.getValue(), is("ADR"));
	}

}
