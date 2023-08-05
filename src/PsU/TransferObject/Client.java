package PsU.TransferObject;

public class Client {
	


 

	public static void main(String[] args) {
		
		StudentBO sbo = new StudentBO();	 
		
		 System.out.println("<------------------- Student Details-------------->");
//		 System.out.println(sbo.getAllStudents());
		 for (StudentVO svo1 : sbo.getAllStudents()) {			  
			
		  System.out.println( "Roll Number :  " + svo1.getRollNo() + "   |  Name:  " + svo1.getName() );
		 }

		 
		 //update student
	      StudentVO student = sbo.getAllStudents().get(0);
	      student.setName("Michael");
	      System.out.println( "Asdfasda" + student.toString());
	     // sbo.updateStudentName(student);


	    //get student
	      student = sbo.getAllStudents().get(0);
	      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");

	}

}
