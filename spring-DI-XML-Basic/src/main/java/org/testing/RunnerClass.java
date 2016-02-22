package org.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerClass {
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/org/testing/Beans.xml");
		
		policyViewer pv = (policyViewer) context.getBean("policyPrinter");
		pv.showSelectedPolicy();
	}
}
