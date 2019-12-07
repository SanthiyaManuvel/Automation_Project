package org.college;

public class College {
	
	private void collegeName() {
		// TODO Auto-generated method stub
System.out.println("College Name is PSNA");
	}
public void collegeCode() {
	// TODO Auto-generated method stub
	System.out.println("College Code is 123");

}

public void collegeRank() {
	// TODO Auto-generated method stub
System.out.println("College Rank is 25th");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College c= new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Student s=new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		Hostel h=new Hostel();
		h.hostelName();
		Dept d=new Dept();
		d.deptName();

	}

}
