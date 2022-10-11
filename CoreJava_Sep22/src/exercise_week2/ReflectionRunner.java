package exercise_week2;

import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionRunner {

	public static void main(String[] args) {
		
		//SETUP: Let's instantiate a Student class object we will use in the following examples
		Student student = new Student("Foo Bar", "foobar@email.com", 3.52);
		
		try {
			//First, we will create a Class object for our defined Student class to utilize in the following examples as well
			// We add the <?> due to the raw type for Class
			Class<?> rClass = Class.forName("exercise_week2.Student");
			
			
			//EXAMPLE #1:
			// Analyzing class structure and member definition
			System.out.println("<--- REFLECTION: Declared Fields --->");
			Field fieldList[] = rClass.getDeclaredFields();
			for (int idx = 0; idx< fieldList.length; idx++) {
				Field f = fieldList[idx];
				System.out.println("Declared Field Name: " + f.getName());
				System.out.println("Data Type: " + f.getType());
				int fieldMods = f.getModifiers();
	            System.out.println("Access Modifiers = " + Modifier.toString(fieldMods));
	            System.out.println("-----------");
			}
			System.out.println("\n<--- REFLECTION: DECLARED METHODS --->");
			Method methodList[] = rClass.getDeclaredMethods();
			
			for (int idx = 0; idx< methodList.length; idx++) {
				Method m = methodList[idx];
				System.out.println("Declared Field Name: " + m.getName());
				Class mParams[] = m.getParameterTypes();
				for (int x = 0; x < mParams.length; x++)
	                  System.out.println("Parameter #" + x + " " + mParams[x]);
	            System.out.println("Return Type: " + m.getReturnType());
	            System.out.println("-----------");
			}
			
			
			
			// EXAMPLE #2: 
			// Invoking defined class methodology
			System.out.println("\n\n<--- REFLECTION: INVOKING METHODOLOGY --->");
			Class<?> partypes[] = new Class[2];
			partypes[0] = String.class;
			partypes[1] = String.class;
			Method mtd = rClass.getMethod("sayHello", partypes);

			Object argList[] = new Object[2];
			argList[0] = new String("John/Jane Doe");
            argList[1] = new String("Tuesday");
            
            Object retrnObj = mtd.invoke(student, argList);
            String retrnValue = retrnObj.toString();
            System.out.println(retrnValue);
            
			
            
			// EXAMPLE #3: 
			// Manipulate Internal Properties
			System.out.println("\n\n<-- REFLECTION: MANIPULATING INTERNAL PROPERTIES -->");
			Field modFieldGPA = rClass.getField("publishedGPA");
			System.out.println(student.getName() + "'s Current GPA is: " + student.getPublishedGPA());
			modFieldGPA.setDouble(student, 4.0);
			System.out.println(student.getName() + "'s Modified GPA through Reflection is: " + student.getPublishedGPA());
		} catch (Throwable e) {
			System.out.println(e);
		}
		
		
		//SETUP: Let's instantiate an animal class object we will use in the following examples
		
		System.out.println(" <------------ animal object details ------------>");
		Animal animal = new Animal(75,"Goat");
		try {	
	Class<? > cl =  Class.forName("exercise_week2.Animal");
		
	Field[] fields = cl.getDeclaredFields();
	System.out.println("REFLECTION: Declared Fields --->");
	
	for(Field field  : fields) {
		System.out.println(field.getName());
	}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
