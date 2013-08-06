class Problem009_SpecialPythagoreanTriplet {
    
    /*Challange
     *There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     *Find the product abc.*/
    
    public static void main(String[] args) {
        double a = 1, b = 0, c = 0; // doubles are used becuase we need to work with square roots
        int x, y, z, answer; // int are used becuase the double is to small to hold the final answer
        boolean soultionFound = false; //Bollean to control when the loop ends
        
        while ( soultionFound == false ) { // This progeam brute forces by checking every value of a^2 + b^2 untill it is right
            b++; //Gets the new b value ready to be tested
            c = ( a * a ) + ( b * b ); //Finds what a^2 + b^2 is
            c = Math.sqrt(c); //Finds what the c in c^2 to be used in the addtion phase
            
            if ( a + b + c == 1000 ) {  // Checks if the sum of the three numbers are 1000 
                x = (int)Math.round(a); // Converts the double to int because the double is to small when we get the product
                y = (int)Math.round(b);
                z = (int)Math.round(c);
                answer = x*y*z;
                System.out.println(a + " + " + b + " = " + c);
                System.out.println(answer);
                soultionFound = true;
            }         
            if ( (a + b + c) > 1000 ) { // If the sum over 1000 it resets b and tries the next a value
                b = 0; // Resets to b value to retry with the new a value
                a++; // Gets the new a value to be tested
            }
        }
    }
}