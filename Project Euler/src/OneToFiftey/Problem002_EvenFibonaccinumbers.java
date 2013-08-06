class Problem002_EvenFibonaccinumbers {
    
    /*Challange
    By considering the terms in the Fibonacci sequence whose values 
    do not exceed four million, find the sum of the even-valued terms*/
    
    public static void main(String[] args) {
        int total = 2, fibOne = 1, fibTwo = 2; int fibNew;
        boolean overFourMill = false;
        
        while (overFourMill == false)
        {
            fibNew = fibTwo + fibOne; // Calculates the next Fibonacci number
            fibOne = fibTwo; // Prepares the numbers for the next cycle
            fibTwo = fibNew; // Prepares the numbers for the next cycle
              
            if ( fibNew < 4000000 ) { // Tests weather to add the new number or exit the while loop       
                if ( ( fibNew % 2 ) == 0) // Tests if the current fibNew number is even
                    total = total + fibNew; // If so it adds it to the total
            }
            else 
                overFourMill = true; // Once the fibNew number is over four million; The progeam will exit the while loop and display the aanswer
        }
        System.out.print(total); // Displayes the answer
    }
}