import java.math.BigInteger;

class Problem016_PowerDigitSum {
    
    /* Challange
    *  What is the sum of the digits of the number 2^1000? */
    
    public static void main(String[] args) {
        int place = -1, tempOne, sum= 0;
        String power = BigInteger.valueOf(2).pow(1000).toString();
        System.out.println(power);
        char[] theArrary = power.toCharArray();
        String[] array = new String[10];
        int size = theArrary.length;
        while ( size > ( place + 1 ) ) {
            place++;
            tempOne = Character.getNumericValue(theArrary[place]);
            sum = sum + tempOne;
        }
        System.out.println(sum);
    }
}