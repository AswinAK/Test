public class ChildClass extends ParentClass{

	@Override
	public boolean equals(Object obj){
		System.out.println("Child equals called");
		return false;
		
	}
	
}
