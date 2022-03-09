package Week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1="stops";
		String text2="potss";
		int count=0;
	    int l1=text1.length();
	    int l2=text2.length();
	    if(l1==l2) {
	    
			
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]==ch2[i]) {
					count++;
				}
				if(count==l1 && count==l2) {
					System.out.println("both are having same length");
				}
			
			
			else {
				System.out.println("both are not havng same length");
			}
		}
	}
	}
}





				
					
				
			
			
		
		
	


