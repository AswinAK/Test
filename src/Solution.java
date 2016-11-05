import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static PriorityQueue<Integer> higherNumbers  = new PriorityQueue<Integer>(new Comparator<Integer>(){
        public int compare(Integer a, Integer b){
            return -1* a.compareTo(b);
        }
    });
    
    public static PriorityQueue<Integer> lowerNumbers = new PriorityQueue<Integer>();
        
    public static void addToHeap(Integer incoming){
        if(lowerNumbers.size()==0||incoming<lowerNumbers.peek())
            lowerNumbers.add(incoming);
        else
            higherNumbers.add(incoming);
    }
    
    public static void balance(){ 
        if(lowerNumbers.size() == higherNumbers.size())
            return;
        
        PriorityQueue<Integer> bigger = lowerNumbers.size() > higherNumbers.size()?  lowerNumbers : higherNumbers;
        PriorityQueue<Integer> smaller = lowerNumbers.size() > higherNumbers.size()? higherNumbers : lowerNumbers;
        
        if(bigger.size()-smaller.size()>=2)
            smaller.add(bigger.poll());       
            
    }
    
        
    public static double getMedian(){
        
        PriorityQueue<Integer> bigger = lowerNumbers.size() > higherNumbers.size()?  lowerNumbers : higherNumbers;
        PriorityQueue<Integer> smaller = lowerNumbers.size() > higherNumbers.size()? higherNumbers : lowerNumbers;
        
        if(bigger.size()==smaller.size()){
        	double sum = bigger.peek()+smaller.peek();
        	return sum/2;
        	
        }
           
        else
            return bigger.peek();
    }
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++)
        	a[a_i]=in.nextInt();
        for(int a_i =0;a_i<n;a_i++){
            addToHeap(a[a_i]);
            balance();
            System.out.println(getMedian());
        }
        
//        lowerNumbers.add(120);
//        lowerNumbers.add(32);
//        lowerNumbers.add(-2);
//        lowerNumbers.add(1);
//        lowerNumbers.add(126);
//        System.out.println(lowerNumbers.peek());
        
    }
    
    
    
}
