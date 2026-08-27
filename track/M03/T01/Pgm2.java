import java.util.Scanner;
public class Pgm2{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size");
    int n = sc.nextInt();
    int c1 = 0;
    int c2 = 0;
    for(int i = 1;i <= n;i++){
        int  num = sc.nextInt();
        if(num % 2 == 0){
            c1++;
        }else{
             c2++;
        }

    }
    System.out.println(c1 + " " + c2);
    sc.close();
    }
}