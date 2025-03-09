package Assignments.SecondSemester.Assignment1;


// got a better way to do this, but I'm too lazy to change it now


public class Q4 {
	public static boolean check(int i, int j, int k, int l, int m, int n) {
		int[] comparelist = {i,j,k,l,m,n};
		boolean isunique = true;
		
		for (int idx=0; idx<comparelist.length; idx++) {
			for (int idx1=idx+1; idx1<comparelist.length; idx1++) {
				if (comparelist[idx] == comparelist[idx1]) {
					isunique = false;
				}
			}
		}
		
		if (isunique) return true;
		else return false;
	}
	public static void main(String[] args) {
		String[] input = {"c","a","r","b","o","n"};
		
		int count = 0;
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				for(int k=0; k<6; k++) {
					for(int l=0; l<6; l++) {
						for(int m=0; m<6; m++) {
							for(int n=0; n<6; n++) {
								if (check(i, j, k, l, m, n)) {
									System.out.println(input[i]+input[j]+input[k]+input[l]+input[m]+input[n]);
									count++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Total Combinations: "+count);
		
	}
}

