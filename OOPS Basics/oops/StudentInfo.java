package oops;
public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1;
		s1=new Student();
		Student s2=new Student();
		
		System.out.println(s1);  // s1 is only reference
		
		System.out.println(s1.name+" "+s1.rollnumber);   //default values are null and 0 resp.
		
		s2.name= "Sandip";
        s2.rollnumber= 7;
        System.out.println(s2.name + " " + s2.rollnumber);
	}

}