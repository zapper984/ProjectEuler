class Problem006_SumSquareDifference
{
    /*Challange
     * Find the difference between the sum of the squares of the first 
     * one hundred natural numbers and the square of the sum.*/
    
    static public void main( String[] args )
    {
        int current = 0;
        long sumOfTheSquares = 0;
        long squareOfTheSums = 0;
        long answer = 0;
        
        while ( current < 100 )
        {
            current++;
            sumOfTheSquares = sumOfTheSquares + ( current * current);
            squareOfTheSums = squareOfTheSums + current;
        }
        
        squareOfTheSums = squareOfTheSums * squareOfTheSums;
        answer = squareOfTheSums - sumOfTheSquares;
        System.out.println(answer);
    }
}