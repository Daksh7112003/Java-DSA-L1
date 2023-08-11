	//span of a array.
	int n =  sc.nextInt();
	int[] arr = new int[n]; 
		for(int i = 0; i <arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		 int max = arr[0];
		 int min =  arr[0];
		 for(int i  = 1 ; i <arr.length; i++) {
			 
			 if(arr[i]>max) {
				 max= arr[i];
			 }
			 
			 if(arr[i]<min) {
				 min = arr[i];
				 
			 }
			 
		 }
		
		int span = max - min;
		System.out.println(span);
		
		
	//	find element in  array...........
		  
		  
		 int n =  sc.nextInt();
		 int  [] arr = new int[n];
		 for(int i = 0 ; i <arr.length ; i++) {
			 arr[i] = sc.nextInt();
			 
		 }
		 
		 int data = sc.nextInt();
		  
		 int idx = -1 ;
		 for(int i = 0 ; i <arr.length; i++) {
			 if(arr[i] == data) {
				 idx=1;
				 break;
						
			 }
		 }

		System.out.println(idx);
		
		
		
		
		
	//	bar chart of an array
		
    
		int n  = sc.nextInt();
		int[] arr = new int[n]; 
		for(int i  = 0 ; i <arr.length ; i++) {
			arr[i] =  sc.nextInt();
		}
		
		int max = arr[0];
		for(int i = 1 ; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		
		for(int floor = max; floor>=1 ;floor-- ) {
			for(int i = 0 ; i <arr.length; i++) {
				if(arr[i] >= floor) {
					
					System.out.print("*\t");
				} else {
					System.out.println("\t");
				}
				System.out.println();
			}
			
		}
		
		
		
	//	sum of arrays 
		
		int n1 =  sc.nextInt();
		int[]a1 = new int[n1];
		for(int i = 0; i <a1.length ; i++) {
			a1[i] = sc.nextInt();
			
		}
		int n2 = sc.nextInt();
		int[]a2 = new int[n2];
		for(int i = 0 ; i < a2.length ; i++) {
			a2[i] =sc.nextInt();
		}
		
		int [] sum =  new int [n2>n2 ? n1:n2];
		int c = 0; 
		int i = a1.length - 1;
		int j = a2.length -1 ;
		int k  =  sum.length -1;
		
		
		while(k>=0) {
			int d = c ; 
			if (i>=0) {
				d+=a1[i];
				
			}
			if(j>=0) {
				d+=a2[j];
				
			}
			
			c = d/10;
			d = d%10;
			sum[k] = d ;
			i--; 
			j--;
			k--;
		}
		
		if(c!=0) {
			System.out.println(c);
		}
		
		for(int val  : sum ) {
			System.out.println(val);
		}
		
		
		
	//	diff of arrays 
		
		
		
		
		
		
		
	int n1 =  sc.nextInt();
	int[] a1 = new int [n1];
	for(int i = 0 ; i<a1.length; i++) {
		a1[i] = sc.nextInt();
		
	}
	 int n2  = sc.nextInt();
	 int[]a2 = new int [n2];
	 for(int i =0 ; i<a2.length; i++) {
		 a2[i] = sc.nextInt();
	 }
		
		
		int[] diff = new int[n2];
		int c=0;
		int i =  a1.length -1 ;
		int j  =  a2.length -1;
		int k  =  diff.length - 1;
		
	while(k>=0) {
		int d = 0;
		int a1v  = i>= 0 ?a1[i]:0;
		
		if(a2[j] + c >= a1v) {
			d = a2[j] +c - a1v;
			c= 0 ; 
			
		}else {
			d = a2[j] + c +10 - a1v;
			c=-1;
			
		}
		diff[k] = d ;
				i-- ; 
		j--;
		k--;
		
	}
	int idx = 0;
	while(idx<diff.length) {
		if(diff[idx] == 0) {
			idx++;
			
			
		} else {
			break;
			
		}
		
	}
		while(idx < diff.length) {
			System.out.println(diff[idx]);
			
		}
		
		
		
		
	//	reverse an array 

		
		
  	 
 	  public static void display(int[] a){
 		    StringBuilder sb = new StringBuilder();

 		    for(int val: a){
 		      sb.append(val + " ");
 		    }
 		    System.out.println(sb);
 		  }
 	 
 	 
 	 
 	 
 	  public static void reverse(int[] a){
 		  
 			int i = 0 ; 
 			
 			int j = a.length -1;
 			 
 			while(i<j) {
 				int temp = a[i];
 				a[i] = a[j];

 				a[j] = temp;
 				i++;
 				
 				j--;
 			}
 				
 		    
 		  }

 		public static void main(String[] args) throws Exception {/
 		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 		    int n = Integer.parseInt(br.readLine());
 		    int[] a = new int[n];
 		    for(int i = 0; i < n; i++){
 		       a[i] = Integer.parseInt(br.readLine());
 		    }

 		    reverse(a);
 		    display(a);
 		 

 		}
 	 
