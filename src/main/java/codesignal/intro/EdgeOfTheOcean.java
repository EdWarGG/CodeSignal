package codesignal.intro;

import java.util.Arrays;

public class EdgeOfTheOcean {
	
	
	
	int adjacentElementProducts(int[] inputArray) {

	    if (inputArray.length == 1) return 0;
	    
	    int maximo = inputArray[0] * inputArray[1];
	    
	    for(int i = 0; i < inputArray.length - 1; i++) {
	        if(inputArray[i] * inputArray[i+1] > maximo) {
	            maximo = inputArray[i] * inputArray[i+1];
	        }
	    }
	    return maximo;
	}    
	
	
	
	int shapeArea(int n) {
	    int sol=(n*n)+((n-1)*(n-1));
	    return sol;
	}
	
	
	
	int makeArrayConsecutive2(int[] statues) {
	    
	    Arrays.sort(statues);
	    
	    int estatuasRestantes=0;

	    for(int i = 0; i < statues.length - 1; i++) {
	        if(statues[i+1] - statues[i] > 1) {
	            estatuasRestantes += (statues[i+1] - statues[i])-1;  
	        }
	    }
	    return estatuasRestantes;
	}
	
	
	
	boolean almostIncreasingSequence(int[] sequence) {
	    
	    int elemEliminar=0;
	    if (sequence.length==2){
	        return true;
	    }
	     for(int i = 0; i < sequence.length - 1; i++) {
	        if(sequence[i+1] <= sequence[i]) {
	            elemEliminar ++;
	            boolean saltarSig=i+2<sequence.length&&sequence[i+2]<=sequence[i];
	            boolean saltarAtras=i-1>=0&&sequence[i+1]<=sequence[i-1];
	            if(saltarSig&&saltarAtras||elemEliminar>=2){
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	
	
	int matrixElementsSum(int[][] matrix) {
	    int coste=0;
	    for(int lateral=0; lateral<matrix[0].length; lateral++){
	        for(int vertical=0; vertical<matrix.length; vertical++){
	            if(matrix[vertical][lateral]==0){
	                break;
	            }
	            coste+=matrix[vertical][lateral];
	        }
	    }
	    return coste;
	}
}
