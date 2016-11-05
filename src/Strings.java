import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Strings {
	
	 public static int numberNeeded(String first, String second) {
         
	        char fs[] = first.toCharArray();
	        char ss[] =second.toCharArray(); 
         int freq[] = new int[26];
	        
	        int l_first = first.length();
	        int l_second = second.length();
	        int count =0;
	        System.out.println(" After s1");
        for(int i = 0;i<l_first;i++){
            
            freq[fs[i]-'a']++;
        }
        
        for(int i = 0;i<l_first;i++){
            
           System.out.print(freq[i]);
        }
        System.out.println(" After s2");
        for(int i = 0;i<l_second;i++){
            freq[ss[i]-'a']--;
        }
        for(int i = 0;i<l_first;i++){
            
            System.out.print(freq[i]);
         }
         int sum = 0;
        for(int i =0;i<26;i++){ 
            sum += Math.abs(freq[i]);
        } 
	        
	       
	       // System.out.println("count: "+count);
	        return sum;
	    }
	
	
	public static void main(String args[])
	{
		
		
		String a = "abc";
        String b = "cde";
        //System.out.println("NN is "+numberNeeded(a, b));
		
       int result = '0'-'0';
       System.out.println("Result "+result+"   )");
       
		
		
		String s1 = "abcd";
		String s2 = "123499999999";
		int i,j;
		int l1 = s1.length();
		int l2 = s2.length();
		StringBuffer output= new StringBuffer();
		
		for(i=0, j=0;i<l1&&j<l2;i++,j++){
			output.append(s1.charAt(i));
			output.append(s2.charAt(j));
		}
		if(l1<l2){
			
			output.append(s2.substring(j));
		}
		else{
			
			output.append(s1.substring(i));
		}
		System.out.println(s1.substring(i));
		System.out.println(output);
		
		
		int value =51,d;
		int steps[]= {18,6};
		
		for(i=0;i<2;i++){
			d= value/steps[i];
			if(d>=1){
				value = value - (d*steps[i]);
				for(j = 0;j<d;j++)
					System.out.println(steps[i]);
			}
			
		}
		if(value>0)
			System.out.println(value);
		
		int t;
		int array[] = {0,0,9,0,0,2,1,0,4,5,0,0,6};
		
		for(i=0;i<array.length;i++){
			if(array[i]!=0){
				for(j=0;j<i;j++){
					if(array[j]==0){
						t = array[i];
						array[i]= array[j];
						array[j]=t;
					}
				}
			}
		}
		System.out.println(" ");
		for(i=0;i<array.length;i++)
			System.out.print(array[i]);
		
	
		int count[] = {34, 22,10,60,30,22,22,60,1,2};
		
	    Set<Integer> set = new HashSet<Integer>();
	    Set<Character> cset = new HashSet<Character>();
	
    try {
       for(i = 0; i < count.length; i++) {
          set.add(count[i]);
       }
       System.out.println("SET is "+set);

       TreeSet sortedSet = new TreeSet<Integer>(set);
       System.out.println("The sorted list is:");
       System.out.println(sortedSet);

       System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
       System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
    }
    catch(Exception e) {}
 }
	
	

}
