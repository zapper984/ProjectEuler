class Problem014_LongestCollatzSequence {
    
    /* Challange
     * The following iterative sequence is defined for the set of positive integers:
     * n → n/2 (n is even); n → 3n + 1 (n is odd) 
     * Which starting number, under one million, produces the longest chain?*/
    
    public static void main(String[] args) {
        long startingNumber = 1, currentNumber, chainLength = 0 , longestChain = 0, longestChainStartingNumber = 0;
        boolean finished = false;
        
        while ( startingNumber < 999999 ) {
            startingNumber ++;
            currentNumber = startingNumber; 
            finished = false;
            chainLength = 0;
            
            while ( finished == false ) { 
                if ( ( currentNumber % 2 ) == 0 ) 
                    currentNumber = currentNumber / 2;
                else
                    currentNumber = ( currentNumber * 3) + 1;
                
                chainLength++;
                
                if ( currentNumber == 1)
                    finished = true;
            }
            
            chainLength ++;
            
            if (chainLength > longestChain) {
                longestChain = chainLength; 
                longestChainStartingNumber = startingNumber;
            }
        }
        
        System.out.println( longestChainStartingNumber + " : " + longestChain );
    }
}