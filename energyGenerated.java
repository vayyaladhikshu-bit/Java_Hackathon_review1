import java.util.Scanner;
class energyGenerated
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount of energy generated : ");
        double energyGenerated = in.nextDouble();

        if(energyGenerated >= 10)
        {
            System.out.println("Good Energy Generation");
        }
        else 
        {
            System.out.println("Low Energy Generation");
        }
    }
}