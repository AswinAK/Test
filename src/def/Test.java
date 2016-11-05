package def;

public class Test { 
	  public static void main(String[] args) { 
	      
	Object car1 = new SmallCar(); 
	      
	SmallCar car2 = new Coupe(); 
	      
	Car  car3 = new Coupe(); 
	      
	Object car4 = new Sedan(); 
	    ((SmallCar) car1).printDescription(  car1
	 ); 
	    ((SmallCar) car2).printDescription(  car2
	 ); 
	    ((SmallCar) car2).printDescription(  car3
	 ); 
	    ((Sedan) car4).printDescription(car4); 
	    ((Sedan) car4).printDescription((  Car
	 ) car4); 
	  
 (  car2).printDescription((SmallCar) car4); 
	  } 
	}