import java.util.Scanner;

public class sta {
    public static void main(String[] args) {
        Scanner po=new Scanner(System.in);
        System.out.print("Enter a name ");
        String name=po.next();
        System.out.print("Enter an number ");
        int num=po.nextInt();
        if (num==4 && name.equals("Lasi")){
            System.out.print("kollo");
        }else {
            System.out.print("ewww");
        }
        po.close();
    }
}