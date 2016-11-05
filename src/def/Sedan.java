package def;

class Sedan extends SmallCar{ 
	  public void printDescription(Car object) { 
	    System.out.println("This is a Sedan Car object"); 
	  } 
	  public void printDescription(SmallCar object) { 
	    System.out.println("This is a Sedan Small Car object"); 
	  } 
	  public void printDescription(Sedan object) { 
	    System.out.println("This is a Sedan object"); 
	  } 
	}