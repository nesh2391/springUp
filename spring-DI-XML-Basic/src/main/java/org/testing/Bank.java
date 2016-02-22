package org.testing;

public class Bank implements Policy {

	String policy="This is a really useless policy";
	
	public void setPolicy(String policy)
	{this.policy=policy;}
	
	public String getPolicy()
	{return policy;}
	
	@Override
	public String currentPolicy() {
		// TODO Auto-generated method stub
		return policy;
	}
}
