package dAY1;

public class Aug7_stringConverter {
	
	public static String convert(String S) {
		
		StringBuffer sb=new StringBuffer(S);
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)<48 && sb.charAt(i)>57)
				sb.deleteCharAt(i);
			
		}
		
		return S;
	}

	public static void main(String[] args) {
		
		String str="97#sf417>. 98";
		str = convert(str);
		System.out.println(str);

	}

}
