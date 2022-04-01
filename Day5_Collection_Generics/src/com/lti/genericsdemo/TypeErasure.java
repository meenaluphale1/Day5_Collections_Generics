package com.lti.genericsdemo;

public class TypeErasure {

	public static void main(String[] args) {
		
	}
}
/*
Generic <T> Operations, Erasure
• In the source code implementing the generic class, T may be used to declare variables and return types,
and may be used to declare local generic variables, such as a List<T>. Essentially, T behaves like a 
real type such as String or Integer. 
• At a later stage in the compilation, T is replaced by Object. So at run-time, the notion of T is gone -- it's 
just Object by then. This is known as the "erasure" system, where T plays its role to check the sources 
early in compilation, but is then erased down to just plain Object. 
• Remember: where you see T, it is just replaced by Object to produce the code for runtime. So the 
ArrayList<String> code and the ArrayList<Integer> code … those two are actually just the 
ArrayList<Object> code at runtime. 
• The erasure system provides basic generic type checking at compile time. The erasure approach is a 
compromise that adds generics to Java while remaining compatible with pre Java 5 systems.

*/