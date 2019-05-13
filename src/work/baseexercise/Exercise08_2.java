package work.baseexercise;

/*

 *
 **
 ***
 ****
 *****

*/
public class Exercise08_2 {
    public static void main(String[] args) {
        final int N = 5;

        for (int line=1; line<=N; line++){
            for (int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
