package dAY1;

public class July18_string {

	public static void main(String[] args) {
		                          
		                            //** STRING ADVANCED CONCEPT BY ANUJBHAIYA **//(NOTE)
		
		//Storage location for string 1.Heap area 2.string pool area(SPA)            (string pool area is the subset of heap area)
      
//		String animal1= new String("Dog");        //here dog stored in heap area and a copy of it will be stored in SPA too 
//		String animal2="cat";                     //here cat stored in only SPA
//		String animal3="cat";                     //already there in SPA
//		System.out.println(animal1);                 //will extract from SPA (Dog from heap area will not be extracted)
		
		
//		String name="Baby";
//		String othername="Baby"; 
//		System.out.println(name==othername); //true bcz both belongs to SPA
//		String anothername=new String("Baby");      
//		System.out.println(name!=anothername); //true bcz both from different area
 		
		
		//STRINGS ARE IMMUTABLE.(reason->Once a literal assigned to a string that can't be changed)
//		String name="baby";
//		name="krishna";
//		System.out.println(name);  //it will give krishna BCZ WE ADDED TO IT [but IT DOES'NT MEAN that string name changed to krishna...
//	                            	//baby is still there in the SPA(in form of garbage)
		
		      
		//FUNCTIONS IN STRING:
		String name="baby";
		String name2=" krishna";
		System.out.println(name.concat(name2));

//IMP**		//SPLIT FUN:(With example)
		String cars="baby krishna divya jyoti sachin kumar";              //store this in array form
//		String allcars[]=cars.split(" ");
		String allcars[]=cars.split("k");
		for(String element:allcars) {
			System.out.println(element);
		}
		
	}

}
