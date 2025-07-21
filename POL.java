import java.util.Scanner;
public class POL{
    public static void main(String[] args) {
        for (int i=1;i<=10;i+=2){
            if (i ==3){
                continue;
            }

            System.out.println(i);
        }
        Scanner name=new Scanner(System.in);
        System.out.print("Enter your name buddy");
        System.out.print("Your name "+name);
        name.close();
    }

}

