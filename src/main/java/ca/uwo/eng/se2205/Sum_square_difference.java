package ca.uwo.eng.se2205;

/**
 * Created by kim on 1/26/2017.
 */
public class Sum_square_difference {
    public int first_term(int range) {
        int num = 0;
        for (int i =1; i <=range ;i++)
            num+=i*i;
        return num;
    }
    public int second_term(int range){
        int num = 0;
        for (int i =1; i <=range ;i++)
            num+=i;
        num*=num;
        return num;
    }


    public void main(String []args){
        int range = 100;
        int ans = second_term(range) - first_term(range);
    }

}
