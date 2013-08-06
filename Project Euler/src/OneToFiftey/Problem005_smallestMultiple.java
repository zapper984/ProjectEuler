class Problem005_smallestMultiple {
   /* Problem 
   *  What is the smallest positive number that is evenly 
   *  divisible by all of the numbers from 1 to 20?*/
    
    public static void main(String[] args) {
        boolean success = false;
        int count = 0;
        
        while ( success == false) {   
            count ++; // Generates a new number to test
           
            if ( ( count % 2 ) == 0 ) // Tests if the current count number satifies all 20 numbers
                if ( ( count % 3 ) == 0 )
                    if ( ( count % 4 ) == 0 )
                        if ( ( count % 5 ) == 0 )
                            if ( ( count % 6 ) == 0 )
                                if ( ( count % 7 ) == 0 )
                                    if ( ( count % 8 ) == 0 )
                                        if ( ( count % 9 ) == 0 )
                                            if ( ( count % 10 ) == 0 )
                                                if ( ( count % 11 ) == 0 )
                                                    if ( ( count % 12 ) == 0 )
                                                        if ( ( count % 13 ) == 0 )
                                                            if ( ( count % 14 ) == 0 )
                                                                if ( ( count % 15 ) == 0 )
                                                                    if ( ( count % 16 ) == 0 )
                                                                        if ( ( count % 17 ) == 0 )
                                                                            if ( ( count % 18 ) == 0 )
                                                                                if ( ( count % 19 ) == 0 )
                                                                                    if ( ( count % 20 ) == 0 )
                                                                                        success = true; // Stops the loop if all 20 number can be divided evenly 
        }
        System.out.println ( count ); //Prints out answer
    }
}