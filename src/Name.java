import java.util.Scanner;

public class Name {  public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
    System.out.print("Enter name");
    String name= sc.next();
    if(name.equals("Вячеслав")){
        System.out.println("Привет,Вячеслав");
    }
    else{
        System.out.println("Нет такого имени");
    }
}
}
