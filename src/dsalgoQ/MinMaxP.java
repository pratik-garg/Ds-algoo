package dsalgoQ;

public class MinMaxP {
	
	static class Pair{
		int max;
		int min;
	}
	
	public static void main(String args[]) {
		int arr[] = {234,-52,24,50004,86};
		Pair p;
		int s = arr.length;
		p = rGetMinmax(arr,0,s-1);
		System.out.print(p.max + "  " + p.min);
	}
	
	/*public static Pair getMinMax(int a[],int s) {
		Pair minmax = new Pair();
		if(s==1) {
			minmax.min = a[0];
			minmax.min  = a[0];
		}
		
		else{
			if(a[0]>a[1]) {
				minmax.max = a[0];
				minmax.min = a[1];
			}
			else {
				minmax.max = a[1];
				minmax.min = a[2];
			}
			
			if(s>2) {
				int i=2;
				for(i=2;i<s;i++) {
					if(a[i]>minmax.max) {
						minmax.max = a[i];
					}
					if(a[i]<minmax.min) {
						minmax.min = a[i];
					}
				}
			}
		}
		return minmax;
	}
	*/
	public static Pair rGetMinmax(int a[],int s,int h) {
		Pair minmax = new Pair();
		Pair mmr =  new Pair();
		Pair mml = new Pair();
		int mid;
		if(s==h) {
			minmax.min = a[s];
			minmax.max = a[s];
			return minmax;
		}
		
		if(h==s+1) {
			if(a[s]>a[h]) {
				minmax.max = a[s];
				minmax.min = a[h];
			}
			else {
				minmax.max = a[h];
				minmax.min = a[s];
			}
			return minmax;
		}
		
		mid = (s+h)/2;
		mml = rGetMinmax(a, s, mid);
		mmr = rGetMinmax(a, mid+1, h);
		
		if(mmr.max>mml.max) {
			minmax.max = mmr.max;
		}else {
			minmax.max = mml.max;
		}
		

		if(mmr.min<mml.min) {
			minmax.min = mmr.min;
		}else {
			minmax.min = mml.min;
		}
		
		return minmax;
	}

}
