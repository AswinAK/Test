package def;

class Coupe extends SmallCar{ 
	  public void printDescription(Car object) { 
	    System.out.println("This is a Coupe Car object"); 
	  } 
	  public void printDescription(SmallCar object) { 
	    System.out.println("This is a Coupe SmallCar object"); 
	  } 
	  public void printDescription(Coupe object) { 
	    System.out.println("This is a Coupe object"); 
	  } 
	} 