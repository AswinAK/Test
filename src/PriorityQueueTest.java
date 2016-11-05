import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	

	
	public static void main(String[] args) {
		PriorityQueue<Car> carsQueue = new PriorityQueue<Car>();
		
		//adding the elements
//		for(int i =0; i<100; i++){
//			Car c = new Car("H-"+i);
//			c.setPrice((int)(Math.random()*100)+1);
//			carsQueue.offer(c);
//		}
		Car c1 = new Car("BMW",500);
		carsQueue.offer(c1);
		Car c2 = new Car("Audi",400);
		carsQueue.offer(c2);
		Car c3 = new Car("Cadilac",350);
		carsQueue.offer(c3);
		
		//peek()
		System.out.println(carsQueue.peek());
		
	//Iterating through the elements
		Iterator<Car> carIterator = carsQueue.iterator();
		while(carIterator.hasNext()){
			Car c = carIterator.next();
			System.out.println(c+" Price -"+c.getPrice());
		}
		
	//Contains
		Car x = new Car("H-9");
		System.out.println(carsQueue.contains(x));
		
		//poll
		
		Car cp = carsQueue.peek();
		System.out.println("Peek car is "+cp.getRegistrationNumber());
		
		while(carsQueue.size()>0){
			Car c = carsQueue.poll();
			System.out.println(c+" Price:"+c.getPrice());
		}
		
		System.out.println("SIZE:"+carsQueue.size());
		//Thread safe priority queue
		//PriorityQueue<Car> tsafeQueue = (PriorityQueue<Car>)Collections.synchronizedCollection(new PriorityQueue<Car>());
	}
}


