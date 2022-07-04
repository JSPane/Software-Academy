
public class Task5 {

	public static void main(String[] args) {
		System.out.println("Task (i):");
		
		String iHolder = "";
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				iHolder += "*";
				
			}
			
			System.out.println(iHolder);
			iHolder = "";
			
		}
		
		System.out.println("");
		System.out.println("Task (ii):");
		
		String iiHolder = "";
		
		for (int k = 0; k < 5; k++) {
			iiHolder += "*";
			
			System.out.println(iiHolder);
			
		}
		
		System.out.println("");
		System.out.println("Task (iii):");
		
		String iiiHolder[][] = {{" ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " "}, {" ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " "}, {" ", " ", " ", " ", " "}};
		
		int aCounter = 4;
		int aProgressor;
		
		for (int m = 0; m < iiiHolder.length; m++) {
			aProgressor = m + 1;
			
			for (int n = iiiHolder[m].length - 1; n >= 0; n--) {
				if (n == aCounter) {
					iiiHolder[m][n] = "*";
					
				}
				
				if (aProgressor != 5) {
					iiiHolder[aProgressor][n] = iiiHolder[m][n];
					
				}

			}
			
			aCounter -= 1;
			
		}
		
		for (String[] aArray: iiiHolder) { 
	        
	        for (String o: aArray) {  
	          System.out.print(o);
	          
	        }
	        
	        System.out.println();
	        
	    }
		
		System.out.println("");
		System.out.println("Task (iv):");
		
		String ivHolder[][] = {{" ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " "}, {" ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " "}, {" ", " ", " ", " ", " ", " ", " ", " ", " "}};
		
		int aMin = 4;
		int aMax = 4;
		
		for (int p = 0; p < ivHolder.length; p++) {
			for (int q = ivHolder[p].length - 1; q >= 0; q--) {
				if (q >= aMin & q <= aMax) {
					ivHolder[p][q] = "*";
					
				}

			}
			
			aMin -= 1;
			aMax += 1;
			
		}
		
		for (String[] bArray: ivHolder) { 
	        
	        for (String r: bArray) {  
	          System.out.print(r);
	          
	        }
	        
	        System.out.println();
	        
	    }
		
		System.out.println("");
		System.out.println("Task (v):");
		
		String vHolder[][] = {{" ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " "}, {" ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " "}, {" ", " ", " ", " ", " ", " ", " ", " ", " "}};
		
		int bMin = 4;
		int bMax = 4;
		int bCounter = 1;
		String bString;
		
		for (int s = 0; s < vHolder.length; s++) {
			for (int t = vHolder[s].length - 1; t >= 0; t--) {
				if (t >= bMin & t <= bMax) {
					bString = String.valueOf(bCounter);
					vHolder[s][t] = bString;
					
				}

			}
			
			bMin -= 1;
			bMax += 1;
			
			bCounter += 1;
			
		}
		
		for (String[] cArray: vHolder) { 
	        
	        for (String u: cArray) {  
	          System.out.print(u);
	          
	        }
	        
	        System.out.println();
	        
	    }
		
		System.out.println("");
		System.out.println("Task (vi):");
		
		String viHolder[][] = {{" ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " "}, {" ", " ", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " ", " ", " ", " "}, {" ", " ", " ", " ", " ", " ", " ", " ", " "}};
		
		int cMin = 4;
		int cMax = 4;
		int cCounter = 1;
		String cString;
		int bProgressor;
		
		for (int v = 0; v < viHolder.length; v++) {
			bProgressor = v + 1;
			
			for (int w = viHolder[v].length - 1; w >= 0; w--) {
				if (w >= cMin & w <= cMax) {
					cString = String.valueOf(cCounter);
					viHolder[v][cMin] = cString;
					viHolder[v][cMax] = cString;
					
				}
				
				if (bProgressor != 5) {
					viHolder[bProgressor][w] = viHolder[v][w];
					
				}

			}
			
			cMin -= 1;
			cMax += 1;
			
			cCounter += 1;
			
		}
		
		for (String[] dArray: viHolder) { 
	        
	        for (String x: dArray) {  
	          System.out.print(x);
	          
	        }
	        
	        System.out.println();
	        
	    }

	}

}
