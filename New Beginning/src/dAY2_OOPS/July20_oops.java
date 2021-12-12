		                       //Object Oriented Programming System
		//Object--(Everything in this real world which acuire some space is called object.)
//		    1. Objects have some state and behaviour.
//		2. An object can be defined as an instance of a class.
//		3. An object contains an adress and takes up some space in memory.
//      eg:  
//		LET, Animal-Class
//		cat-object

package dAY2_OOPS;

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
	public void description() {
		System.out.println("Cat has "+legs+" legs and "+eyes+" eyes.");
		System.out.println("Cat is "+color+" color and "+breed+" bread.");
		if(hasFur==true) {
		System.out.println("Cat has Fur.");
		}
	}
	
}

class Dog{
	int legs,eyes;
	public void bark() {
		System.out.println("Dog with "+legs+" legs and "+eyes+"eyes is barking");
	}
}
                         //HOW TO MAKE OBJECTS of/from a CLASS
// ClassName objectName=new ClassName();          

public class July20_oops{
	public static void main(String[] args) {

		Cat cat1=new Cat();
		Cat cat2=new Cat();
		Dog tommy=new Dog();
		
		cat1.legs=4;
		cat1.eyes=1;
		cat1.breed="indian";
		cat1.color="white";
		cat1.hasFur=false;
	    cat1.description();
		cat1.walk();
		System.out.println();
		cat2.legs=2;
		cat2.eyes=2;
		cat2.breed="UK";
		cat2.color="Black";
		cat2.hasFur=true;
		cat2.description();
		cat2.eat();
		System.out.println();
		tommy.legs=4;
		tommy.eyes=2;
		tommy.bark();

		
		
		
	}

}
