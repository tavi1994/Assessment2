import java.util.Scanner;

public class App {

    public static void main(String[] args){
        //Grid grid = new Grid(2,3);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns: ");
        int coll = sc.nextInt();
        sc.close();

        Grid grid = new Grid(rows,coll);

        Player player =new Player();
        System.out.println(player.spawn().toString());
       // System.out.println(grid);



        //System.out.println(grid);




    }
}
