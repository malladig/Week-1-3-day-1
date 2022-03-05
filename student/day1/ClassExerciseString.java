package Week3.day1;

public class ClassExerciseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String text="Education";
     String text1 =text.toLowerCase();
     System.out.println("Lowercase text is"+text1);
     int count=0;
     for(int i=0;i<text1.length();i++) {
    	 if(text1.charAt(i)=='a'||text1.charAt(i)== 'e'||text1.charAt(i)=='i'||text1.charAt(i)=='o'||text1.charAt(i)=='u') {
    		 System.out.println("the vowels are"       +text1.charAt(i));
    		 count++;
     }
     
     
     
	}
    System.out.println("Total no of vowels are"  +count);
}
}
