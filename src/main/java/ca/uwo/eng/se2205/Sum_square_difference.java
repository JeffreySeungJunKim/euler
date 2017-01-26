package ca.uwo.eng.se2205;

/**
 * Created by kim on 1/26/2017.
 */
public class Sum_square_difference {
    public int first_term(int n) {
        return ((n*(n+1)*(2*n+1))/6);
    }
    public int second_term(int n){

        return (int)Math.pow(((n*(n+1))/2),2);
    }


    public void main(String []args){
        int range = 100;
        int ans = second_term(range) - first_term(range);
    }

}
