package org.testing;

import java.beans.ConstructorProperties;

public class policyViewer {
	
	Policy bankInstance;
	Printer printer;
	@ConstructorProperties({"bankInstance"})
	public policyViewer(Policy bankInstance)
	{
		this.bankInstance = bankInstance;
	}
	
	public void setPrinter(Printer printer)
	{this.printer =printer;}
	
	public Printer getPrinter()
	{return printer;}
	
	public void showSelectedPolicy()
	{
		printer.printFunction(bankInstance.currentPolicy());
	}
}
