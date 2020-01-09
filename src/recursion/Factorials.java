package recursion;

public class Factorials {

    // a factorial is a recursive mathematical function that E.g. factorial 4 (4!) => 4*3*2*1

    public Factorials(int num){
        System.out.println(calc(num));
    }

    private int calc(int num){
        //break for when recursive calculation reaches 1
        if(num == 1){
            return 1;
        }

        //multiplies number that is put back into the function by 1 less than itself until 1 is returned
        return calc(num-1)*num;
    }
}
