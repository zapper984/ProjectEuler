import java.math.BigInteger;
class Problem020_FactorialDigitSum {
    
    /* Challange
     * Find the sum of the digits in the number 100! */
    
    //Does not work yet
    public static void main(String[] args) {
        BigInteger total = new BigInteger("0");
        
        for (int i=1; i<100; i++) {
            total =  total.multiply(BigInteger.valueOf(i));
        }
        
        String wat = String.valueOf(total);
        System.out.println(wat);
    }
}