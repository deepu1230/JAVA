import java.util.Scanner;
public class main5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("a is big");
        }
        else if(b>a&&b>c){

            System.out.println("B is big");
        }else{
            System.out.println("C is big");
        }
       }
}

