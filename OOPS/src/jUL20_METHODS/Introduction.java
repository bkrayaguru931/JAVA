package jUL20_METHODS;

public class Introduction {
	static int maxOf(int a,int b) {                           
		if(a>b) 
		return a;
		else 
	    return b;
	}
	
	static float maxOf(float c,float d) {
		return (c>d) ? c:d;
		
	}
	
	static void sayHi(){                                      //void method does'nt return anything(it just helps in printing something)
		System.out.println("Hi dambu");
		System.out.println("Hello");
		System.out.println("you are a gadha");
	}
	
	public static void main(String[] args) {
		
          int firstNumber=34;
          int secondNumber=23;
          int result=maxOf(firstNumber,secondNumber); 
          System.out.println(result);
          
          float fNumber=34.2f;
          float sNumber=23.9f;
          float res=maxOf(fNumber,sNumber); 
          System.out.println(res);
           
          sayHi();
          sayHi();
	}
	
	

}
