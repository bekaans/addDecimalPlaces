import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pub = new Scanner(System.in);
        int result =0;
        System.out.println("Entry Number :"); int nmr = pub.nextInt();

            while(nmr>0)
        {
            int newnmr = nmr%10;
            
            nmr = nmr/10;

            result = result + newnmr;

        }  System.out.println(result);



    }}