package ca.uwo.eng.se2205;

/**
 * Created by kim on 1/26/2017.
 */
public class Even_Fibonacci_numbers {
    public long fibonacci(){
        long num =2;
        long total_even=0;
        while (num <= 4000000) {
            long previous_term =1;
           if (num %2 == 0)
               total_even+=num;
           num += previous_term;
           previous_term = num -previous_term;
        }
        return total_even;
    }

    public static void main(String[] args){

    }
}
