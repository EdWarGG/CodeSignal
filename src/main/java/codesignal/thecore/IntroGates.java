package codesignal.thecore;

public class IntroGates {
	
	
	
	int addTwoDigits(int n) {
	    int res=0;
	    
	    while(n>0){
	        res+=n%10;
	        n=n/10;
	    }
	    return res;
	}
	
	
	
	int largestNumber(int n) {
	    int res=1;
	    while(n!=0){
	        res=res*10;
	        n--;
	    }
	    res--;
	    return res;
	}
	
	
	
	int candies(int n, int m) {
	    int res=m/n;
	    res=res*n;
	    return res;
	}
	
	
	
	int seatsInTheatre(int nCols, int nRows, int col, int row) {
		int tCols=(nCols+1)-col;
		int tRows=nRows-row;
		int total=tCols*tRows;
		return total;
		}
	
}
