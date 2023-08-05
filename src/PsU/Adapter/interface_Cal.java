package PsU.Adapter;

public interface interface_Cal {
	
	
	public void op_add_num_by_5(int n );
	public void op_subtract_num_by_5(int n );
	public void op_multiply_num_by_5(int n );
	public void op_divide_num_by_5(int n );
}


// This is adapter pattern . In the interface all the to be implemented method signatures are maintained . As many 
// Where ever this interface is implemented then all these methods have to be implemented - which is a serious problem
// So a class with empty implementations of all these methods is created called as Adapter_Cal
// Where required only those methods that are relevant and required will be implemented . which solves the serious problem 
// As can be seen in the Adapted.java file only add and subtract methods are implement5ed 
//  An adapter class in java should be used when a developer needs to implement an interface but only wants to override a subset of the interface’s methods.
// There are two type class a adapter ( as is above ) . Another is object adapter where the adaptee class (Adapter_Cal in this case ) is implemented as used 