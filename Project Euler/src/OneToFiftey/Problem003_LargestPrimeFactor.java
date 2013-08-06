class Problem003_LargestPrimeFactor {

/* Challange
 * What is the largest prime factor of the number 600851475143 ?  */

    public static void main(String[] args) {
        long  number = 600851475143L;
        int count = 1;
        boolean done = false;
        while ( done == false) {
            count++;
            if ( ( number % count ) == 0 ) {
                number = number / count;
                count = 1;
            }
            if ( ( count + 1 ) == number )
                done = true;
        }
        System.out.println(number);
    }
}