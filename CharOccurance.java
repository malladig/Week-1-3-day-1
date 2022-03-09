package Week3.day1;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count=0;
		char[] ch=str.toCharArray();
		System.out.println("the length of the array is"+ch.length);
		for(int i=0;i<ch.length;i++) {
		
			if(ch[i]=='n') {
				count++;
				System.out.println("count is"+count);
				
			}
			
		}
	}

}
