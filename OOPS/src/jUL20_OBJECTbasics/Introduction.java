		                       //Object Oriented Programming System
		//Object--(Everything in this real world which acuire some space is called object.)
//		    1. Objects have some state and behaviour.
//		2. An object can be defined as an instance of a class.
//		3. An object contains an adress and takes up some space in memory.
//      eg:  
//		LET, Animal-Class
//		cat-object

package jUL20_OBJECTbasics;

class Cat{                                        //this is a class for cat(the factory(class) "Class name-Cat" will produduce many objects(variety cats)
	boolean hasFur;                                    //here we declare the states and properties OF OBJECT in the form of boolean,string,int etc.
	String color,breed;                                    
	int legs,eyes;
	
	public void walk() {                                    //this is the function for the object cat
			System.out.println("Cat is Walking");                
	}
	public void eat() {
		System.out.println("Cat is Eating");
	}
}

class Dog{
	//Etc...
}
                         //HOW TO MAKE OBJECTS of/from a CLASS
//[SYNTAX-> ClassName objectName=new ClassName();]    eg: Cat cat1=new Cat();

public class Introduction {

}
