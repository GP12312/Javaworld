package PsU.TransferObject;

public class StudentVO {
	
	String name;
	int RollNo;

	public StudentVO(String s, int n ) {
		this.name = s;
		this.RollNo = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		this.name = s;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	
	@Override   // If this method is not present then the String representation of the object is not available and some hashcode will be returned 
	public String toString() {
		return name + "|||" + RollNo;
	}

}
