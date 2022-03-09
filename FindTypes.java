package Week3.day1;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
        char[] ch=test.toCharArray();
        for(int i=0;i<ch.length;i++) {
        	if(Character.isAlphabetic(ch[i])) {
        		letter++;
        	}
        	else if(Character.isDigit(ch[i])) {
        		num++;
        		
        	}
        	else if(Character.isSpace(ch[i])) {
        		space++;
        		
        	}
        	else {
        		specialChar++;
        }
        	
        }
        System.out.println("the letter are"+letter);
        System.out.println("the num are"+num);
        System.out.println("the space are"+space);
        System.out.println("the specialchar are"+specialChar);
        	

	}

}
