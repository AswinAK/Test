package def;

class SmallCar implements Car{ 
	  public void printDescription(Object object) { 
	    System.out.println("This is an object"); 
	  } 
	  public void printDescription(Car object) { 
	    System.out.println("This is a Car object"); 
	  } 
	  public void printDescription(SmallCar object) { 
	    System.out.println("This is a Small Car object"); 
	  } 
	} 