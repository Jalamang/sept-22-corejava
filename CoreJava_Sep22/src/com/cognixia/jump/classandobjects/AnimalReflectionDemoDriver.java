package com.cognixia.jump.classandobjects;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnimalReflectionDemoDriver {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		
		AnimalReflectionDemo animal = new AnimalReflectionDemo();
		animal.move();
		animal.move2("Jackson", 7);
		
		Class<? extends AnimalReflectionDemo> c = animal.getClass();
		
		
		Field[] fields = c.getDeclaredFields();
		
		
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		
		
		Method[] methods = c.getDeclaredMethods();
		
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		Method mth2 = c.getDeclaredMethod("move2");
		mth2.invoke(c);
		mth2.setAccessible(true);
	}
}





class AnimalReflectionDemo {
	
	private String name;
	private int id;
	private boolean isMale;
	
	
	public String getName() {
		return name;
	}




	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}


	public AnimalReflectionDemo(){
		this.id  = 0;
		this.isMale = false;
		this.name = null;
		
	}
	
	
	void move() {
		System.out.println("Move mth");
	}

	 void move2(String name, int id) {
		System.out.println("This animal is called " + name + " and the id is " + id);
	}
	@SuppressWarnings("unused")
	private String move3() {
		return "7";
	}
}

