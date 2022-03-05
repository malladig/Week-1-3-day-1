package Week3.day1;

public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Testleaf is located in Teynampet and above a taccobell";
	     String text1 =text.toLowerCase();
	     System.out.println("Lowercase text is"+text1);
	    String[] text2=text1.split(" ");
	    
	    for(int i=0;i<text2.length;i++) {
	    	if(text2[i].startsWith("t")) {
	    		System.out.println(text2[i]);
	    		
	    	}
	    	
	    }
	     
	}

}
