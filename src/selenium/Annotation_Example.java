package selenium;

import org.testng.annotations.Test;

public class Annotation_Example {
	@Test
	public void starting() {
		System.out.println("This is starting point");
	}
	
	@Test(groups= {"demo1abc"})
	public void checkTitle() {
		System.out.println("Expected is equal to actual title");
	}
	
	@Test(groups= {"demo2xyz"})
	public void click_element() {
		System.out.println("Submit Button Clicked");
	
	

}}
