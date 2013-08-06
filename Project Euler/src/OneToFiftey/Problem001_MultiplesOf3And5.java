class Problem001_MultiplesOf3And5 {
    
    /* Challange
     * Find the sum of all the multiples of 3 or 5 below 1000 */
    
    public static void main(String[] args) {
        int testNumber = 0, total = 0;
        boolean both = false;
        
        while ( 999 > testNumber ) { // Tests all numbers below 1000
            testNumber++; // Generates the next number to be tested
            both = false; // Restets if the number was divisible by three and five
            
            if ( ( testNumber % 3 ) == 0 ) // We dont want to add the same number 
                if ( ( testNumber % 5 ) == 0 ) // more then once so if the number
                    both = true; // is divisible by both we will use this bool to only add it once
           if ( ( testNumber % 3 ) == 0 ) // Checks to see if a number is divisible by three
                    total = total + testNumber; // If so it adds it to the total
           if ( ( testNumber % 5 ) == 0 ) // Checks to see if the number is divisible by five 
               if ( both == false ) // Then checks to see if we added it already
                   total = total + testNumber; // Now we add it to the total
        }
        System.out.println(total);
    }
}