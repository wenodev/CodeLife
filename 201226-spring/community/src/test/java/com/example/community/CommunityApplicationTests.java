package com.example.community;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@Configuration
@SpringBootTest
class CommunityApplicationTests {


	@Value("${property.test.name}")
	private String propertyTestName;

	@Value("${propertyTest")
	private String propertyTest;

	@Value("${noKey:default value}")
	private String defaultValue;

	@Value("${propertyTestList}")
	private String[] propertyTestArray;

	@Value("#{'${propertyTestList'.split(',')}")
	private List<String> propertyTestList;


	@Test
	void testValue() {
		assertThat(propertyTestName, is("property depth test"));
	}

	@Test
	void test(){
		System.out.println("aa");
	}


}
