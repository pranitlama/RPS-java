import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputobj=new Scanner(System.in);
        System.out.println("enter r or p or s");
        System.out.println("1:rock 2:paper 3:scissor");
        int usermove=inputobj.nextInt();
        System.out.println("your input>>"+usermove);
        int random =(int)(Math.random() * 3 + 1 );
//        char[] arr={'s','p','r'};
        System.out.println("computer choice>>"+random);
        if(usermove==random){
            System.out.println("draw");
        } else if (usermove== 1 && random==3 || usermove==2 && random==1 ||usermove==3 && random==2) {
            System.out.println("you win");
        }
        else {
            System.out.println("you lose");
        }

    }
}