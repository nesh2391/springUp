package com.testSpring.functionality;

import org.springframework.stereotype.Component;

@Component
public class SimpleFun implements SimpleFunRules{

	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 6+1;
	}

}
