package ProblemSolvings;

public class PatternsProblems {


    //print star pyramid
    public static void pyramid(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n+i-1 ; j++){

                if(j<=n-i){
                    System.out.print("-");
                }
                else System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    pyramid(5);
    }
}
