import java.util.Scanner;

/**
 *
 * @author zack
 */
public class RunMyMethod
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // RunMenu rm = new RunMenu();//reference var
        MyMethod mm = new MyMethod();
        Scanner sc = new Scanner(System.in);//reference var
        int input = 0;
        do
        {
            System.out.println("1) Find The Product (No Negatives)");
            System.out.println("2) Find 12");
            System.out.println("3) Find Max, Min, and Average");
            System.out.println("4) Calculate Grades");
            System.out.println("5) Beer Song");
            System.out.println("6) Find Your Golf Differential");
            System.out.println("7) Exit") ;

            input = sc.nextInt();
            switch (input) {
                case 1:
                    mm.FindTheProduct();
                    break;
                case 2:
                    mm.Find12();
                    break;
                case 3:
                    mm.FindMaxMin();
                    break;
                case 4:
                    mm.CalculateGrades();
                    break;
                case 5:
                    mm.BeerSong();
                    break;
                case 6:
                    mm.GolfHandicap();
                    break;
                default:
                    break;
            }

        }while(input != 7);
    }

    public static class RunMenu
    {
    }
}


   