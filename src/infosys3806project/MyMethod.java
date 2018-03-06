/*
 * To change this license header, choose License Headers in Project Properties.  
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys3806project;

import java.util.Scanner;
import java.util.StringTokenizer;
import static javax.management.Query.value;

/**
 *
 * @author zack
 */
public class MyMethod 
{

    void FindTheProduct() 
    {
        Scanner in = new Scanner(System.in);
        
                System.out.print("Input first number: ");
                int num1 = in.nextInt();

                System.out.print("Input second number: ");
                int num2 = in.nextInt();

                System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
     
     }

    void Find12() 
    {
       boolean ft = false;
               
        int firstindex = 0;
        int lastindex = 0;
        int twelvecounter = 0;
        int counter = 0;
        
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter your set of numbers and the occurances of 12: ");
        String stringinput = sc.nextLine();
        StringTokenizer st = new StringTokenizer(stringinput);
                
                while(st.hasMoreTokens())
                { int input = Integer.parseInt(st.nextToken());
                    counter++;
                    if(input == 12 && ft == false)
			{
					firstindex = counter;
					lastindex = counter;
                                        twelvecounter++;
					ft = true;


			}
                    
                    else if (input == 12 && ft == true)
                    {
                        lastindex = counter;
                        twelvecounter++;        
                    }
                        
                    
                }

                System.out.println ("your first occurrence of twelve is at index " + firstindex);
                System.out.println ("your last occurrence of twelve is at index " + lastindex);
                System.out.println ("your total number of twelves are " + twelvecounter);
        
        

    }

    float FindMaxMin() 
    {//Start Max Min Method
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int num = 0, count = 0, total = 0;
    
        
    Scanner sc = new Scanner(System.in);
    
            do
        {
            System.out.print("Enter a whole number, and -99 to quit: ");
            num = sc.nextInt(); // accept input

            if(num != -99)
        {
            count++; // increment counter
            total += num; //accumulate the sum
            
            if (num == -99) 
            {
                break;
            }
            
            if (num < min) 
            {
                min = num;
            }
            
            if (num > max) 
            {
               max = num;
            }
            
        }
            
        }

            while (num != -99); // test the condition

            float average = (float) total/count;

    System.out.println("The max is: " + max);
    System.out.println("The min is: " + min);
    System.out.println("The average  is: " + new Float(average));
    return(average);
    
  }// End Max Min Method

    

    void CalculateGrades() 
    {
        int  input, sumA, sumB, sumC, sumD, sumF;
                sumA=sumB=sumC=sumD=sumF=0;

                 String stringinput;

                 Scanner sc = new Scanner(System.in);

        System.out.println("Enter a series of numeric grades");

                stringinput = sc.nextLine();

        StringTokenizer st = new StringTokenizer(stringinput);

        input = Integer.parseInt(st.nextToken());

                while(st.hasMoreTokens())
        {

            if(input>=90)
            {

                sumA++;

                System.out.println(new Integer(input) + "      A");

            }

            else if(input >= 80)
            {

                sumB++;

                System.out.println(new Integer(input) + "      B");

            }

            else if(input >= 70)
            {

                sumC++;

                System.out.println(new Integer(input) + "      C");

            }

            else if(input >= 60){

                sumD++;

                System.out.println(new Integer(input) + "      D");

            }

            else{

                sumF++;
 
                System.out.println(new Integer(input) + "      F");

            }

            input = Integer.parseInt(st.nextToken());

        }

        System.out.println("The total number of A's is " + new Integer(sumA ));

        System.out.println("The total number of B's is " + new Integer(sumB ));

        System.out.println("The total number of C's is " + new Integer(sumC ));

        System.out.println("The total number of D's is " + new Integer(sumD ));

        System.out.println("The total number of F's is " + new Integer(sumF ));
    }

    void BeerSong() 
    {
            int beerNum = 99;
            String word = "bottles";
        
                while (beerNum > 0) 
                {
                    if (beerNum == 1)
                    {
                        word = "bottle"; // singular as in one bottle
                    }

                    System.out.println(beerNum + " " + word + " of beer on the wall" );
                    System.out.println(beerNum + " " + word + " of beer" );
                    System.out.println("Take one down.");
                    System.out.println("Pass it around.");

                    beerNum = beerNum - 1;

                    if (beerNum > 0)
                    {
                        System.out.println(beerNum + " " + word + " of beer on the well");
                    }
                    else
                    {System.out.println("No more bottles of beer on the wall");

                    }  
                }
    }

    void GolfHandicap() 
    {
        Scanner in = new Scanner(System.in);
        
                System.out.print("Please enter your golf score: ");
                double num1 = in.nextDouble();

                System.out.print("Please enter your course rating: ");
                double num2 = in.nextDouble();
                
                System.out.print("Please enter your course slope rating: ");
                double num3 = in.nextDouble();
                
                double z = 113;

                System.out.println(" Your handicap differential is "  + (num1 - num2) * (z / num3));
        
        
    }

    public static class RunMenu 
    {

        public RunMenu() 
        {
            
        }

    }
}

    