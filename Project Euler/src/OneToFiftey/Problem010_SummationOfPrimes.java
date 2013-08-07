class Problem010_SummationOfPrimes {
    
    /*challange
     * Find the sum of all the primes below two million*/
    
    public static void main(String[] args)
    {
        long primeTestCycle;
        long newTestNumber = 1;
        long total = 2; //Starts with a value of two becuase how this program genrates primes the eliminates even numbers
        boolean primeFail;
        boolean underTwoMillion = true;
        
        //Once we find the sum of all primes under two million we can exit the loop 
        while ( underTwoMillion == true ) {
            newTestNumber++; //Current number to be checked if it is prime
            primeTestCycle = 1; //Resets the cycle to divide the test numebr
            primeFail = false;//Resets the loop so the next prime can be tested
            
            /*If a number is divisble by anything we can eliminate it and by
            eliminateing the even numbers right away the program runs faster*/
            if (newTestNumber % 2 == 0) {
                primeFail = true; //Stops the cuurnt test to try the next number
            }
            
            /*Divides the number we are testing by every other number untill
            all posible number have been tried or it divides evenly*/
            while (primeFail == false) {
                primeTestCycle++;
                
                /*If every number except the number it self have been tried
                we know that it is a prime number*/
                if ( newTestNumber == primeTestCycle + 1 ) {
                    total = total + newTestNumber;
                    System.out.println(total + " : " + newTestNumber );
                    primeFail = true; //Stops the current test to try the next number
                  
                    //Checks if the last prime added put the total over two million
                    if ( newTestNumber > 2000000) {
                        total = total - newTestNumber; // Undoes the number that caused it to go over two million
                        underTwoMillion = false; // Exits the main loop to stop primes being calculated
                        System.out.println();
                        System.out.println(total);
                    }
                }
                
                //If a numebr is divisible by one of are cycle numbers we know its not prime
                if ( ( newTestNumber % primeTestCycle ) == 0) {
                    primeFail = true; //Stops the cuurnt test to try the next number
                }
            }  
        }
    }
}
//output
//142913828922
//BUILD SUCCESSFUL (total time: 26 minutes 1 second)