public class Problem007_10001stPrime {
    
    /* Challange
    *  What is the 10,001st prime number?*/
    
    public static void main(String[] args) {
        long primeCount = 1, primeTestCycle, newTestNumber = 1;
        boolean primeFail;
        
        while (primeCount <= 10000) {  // Once we find 10,001 primes we can print the last prime that was generated found
            newTestNumber++; // Current number to be checked if it is prime
            primeTestCycle = 1; // Resets the cycle to divide the test numebr
            primeFail = false;// Resets the loop so the next prime can be tested
            
            if (newTestNumber % 2 == 0) // By eliminateing the even numbers right away the program runs faster
                primeFail = true; // Stops the cuurnt test to try the next number 

            while (primeFail == false) {
                primeTestCycle++; // Generates next number to be tested           
                
                if ( newTestNumber == primeTestCycle + 1 ) { // If every number except the number it self have been tried we knwo it is a prime number
                    primeFail = true; // Stops the cuurnt test to try the next number
                    primeCount++; // becuase the number is prime we add it to the total numebr we have found so far
                }
                 
                if ( ( newTestNumber % primeTestCycle ) == 0) // If a numebr is divisible by one of are cycle numbers we know its not prime
                    primeFail = true; // Stops the cuurnt test to try the next number
            } 
        }
        System.out.println(newTestNumber);
    }
}
