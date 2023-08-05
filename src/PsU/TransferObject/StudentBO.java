package PsU.TransferObject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	
	List<StudentVO> svoL; // This List operates as like a database

	public StudentBO() {
		svoL = new ArrayList<>();
		
		StudentVO s1 = new StudentVO( "Robert", 122312);
		StudentVO s2 = new StudentVO( "Thomas", 134896);
		
		svoL.add(s1);
		svoL.add(s2);		
	}
	
	public void deleteStudent(StudentVO SV) {
		svoL.remove(SV.getRollNo());
		System.out.println("Student: Roll No " + SV.getRollNo() + ", deleted from database");
	}
	
	public List<StudentVO> getAllStudents() {
		return svoL;
	}
	
	 public StudentVO getStudent(int rollNo) {
	      return svoL.get(rollNo);
	   }
	
	public void updateStudentName(StudentVO svo) { // This method has no effect 
		
		System.out.println(svo.getRollNo());
		System.out.println(">>>>>>>  "+svoL.get(svoL.indexOf(svo)));
//		System.out.println(getStudent(svo.getRollNo()));
//		svoL.get(svo.getRollNo()).setName(svo.getName());
//		System.out.println("Student: Roll No " + svo.getRollNo() + ", name updated  new name :" + getStudent(svo.getRollNo()));	
	}

}
