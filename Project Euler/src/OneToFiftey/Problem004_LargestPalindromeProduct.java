class Problem004_LargestPalindromeProduct {
  
    /* Challange
     * Find the largest palindrome made from the product of two 3-digit numbers. */
    
    public static void main(String[] args) {
        int a = 999, b = 1000, c, answer = 0;
        boolean exit = false;
        String test;
        
        // This program brute forsees multiplaying every three digit number by every other three digit number
        // then it  checks each to see if its a palindrome and saves the biggest one 
        while ( exit == false) {
            b--; // Gets the next b value ready to be tested
            c = a * b; // Genrates the new number to be tested
            int length = String.valueOf(c).length();  // We get the length because we dont need to care about numebrs shorter then 6 digits
            test = String.valueOf(c); // To use  .toChararray we need to convert are int into a string
            
            if ( length == 6 ) { // If the number is not 6 digits we can skip it 
                char[] mfl = test.toCharArray(); // We split the number into char for easy testing
                if (mfl[0] == mfl[5]) //Tests to see if the first number = the last number
                    if (mfl[1] == mfl[4]) //Tests to see if the secound number = the fith number
                        if (mfl[2] == mfl[3]) //Tests to see if the third number = the fith number
                            if ( c > answer) // We know know c is a palndrome so now we see if its the biggest we ahve found so far 
                                answer = c; // If we found a new bigger palindrome it sets it as the answer
            }
            
            if (a == 100 ) { // Once a hits 100 we know we have tested every number
                System.out.println( answer );// Now we print the answer 
                exit = true; // and exit the loop
            } 
            
            if ( b == 100 ) {  // We dont need to test 2-Digit and 1-Digit numbers
                b = 1000;  // Resets the b value; it is 1000 becuase the first thing that happens in the loop is b--
                a--; // Genrates the new a value to be tested
            }
        }
    }
}