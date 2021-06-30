package Arrays;




import java.util.HashSet;
 class UnionAndIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int arr1[] = { 7, 1, 5, 2, 3, 6 };
	        int arr2[] = { 3, 8, 6, 20, 7 };
	        
	        HashSet<Integer>  union = new HashSet<>();
	        
	        
	        //UNION
	        
	        for(int i=0;i<arr1.length;i++) 
	        	union.add(arr1[i]);
	        
	        for(int i=0;i<arr2.length;i++)
	        	union.add(arr2[i]);
	        
	        System.out.println("Union is "+union);
	        
	        
	        //INTERSECTION
	        
	        HashSet<Integer> hs = new HashSet<>();
	        HashSet<Integer> inter = new HashSet<>();
	        
	        for(int i=0;i<arr1.length;i++) {
	        	hs.add(arr1[i]);
	        }
	        
	        for(int i=0;i<arr2.length;i++) {
	        	if(hs.contains(arr2[i])) {
	        		inter.add(arr2[i]);
	        		
	        	}
	        }
	        
	        System.out.println("Intersection is "+inter);
		
		
	}

}
