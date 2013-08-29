class Problem019_CountingSundays{

    // 0 - M, 1 - T, 2 - W, 3- Th,4 - F, 5 - Su, 6 - S
    
    public static void main (String[] args) {
        int dayOfWeek = 0, dayOfYear = 0, year = 0, numberOfSundays = 0;
        boolean centuary = true;
        
        while (centuary == true) {
            dayOfWeek++;
            dayOfYear++;
            if (year == 100)
                centuary = false;
            if (dayOfWeek == 7)
                dayOfWeek = 0;
            if (dayOfYear >= 365){
                if ((year % 4) == 0)
                    break;
                else {
                    dayOfYear = 1;
                    year++;
                }
            }
            if (dayOfYear <= 31) {
                if (dayOfWeek == 5) {
                    numberOfSundays ++;
                }
            }
            System.out.println( numberOfSundays + ":" + year );
        }
    }
}
