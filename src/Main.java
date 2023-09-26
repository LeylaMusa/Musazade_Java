import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter number");
        int a= sc.nextInt();
        if(a>7){
            System.out.println("Привет");
        }
        else if (a<7){
            System.out.println("Пока");
        }
        else{
            System.out.println("Это не 7");
        }
    }
    }
