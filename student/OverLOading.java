package org.student;

public class OverLOading {
	
	public void StudentInfo(int id) {
		System.out.println("the id is "+id);
	}
	public void StudentInfo(String emailid,int id1) {
		System.out.println("email id is" +emailid);
		System.out.println("Student id is "+id1);
	}
	public void StudentInfo(double phonenumber,String email) {
		
		System.out.println("phone number is "+phonenumber);
		System.out.println("email id is "+email);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLOading ol=new OverLOading();
		ol.StudentInfo(100);
		ol.StudentInfo("sri@123.com", 21);
		ol.StudentInfo(7878787, "abc@gmail.com");
       
       
	}

}
