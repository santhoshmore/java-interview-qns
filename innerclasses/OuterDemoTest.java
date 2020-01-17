package com.innerclasses;

class OuterDemoTest{
	public static void main(String[] args) {
		OuterDemo outer = new OuterDemo();
//		OuterDemo.InnerDemo inner =outer.new InnerDemo();
//		inner.display_inner();
		
		outer.display_inner();
	}
}