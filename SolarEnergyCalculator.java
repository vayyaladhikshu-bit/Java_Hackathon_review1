import java.util.Scanner;
class SolarEnergyCalculator 
{
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
    return morningEnergy + eveningEnergy;
    }
        public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter morning energy generation (kWh): ");
        double morningEnergy = in.nextDouble();

        System.out.print("Enter evening energy generation (kWh): ");
        double eveningEnergy = in.nextDouble();
        
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total Energy Generated: " + totalEnergy + " kwh");

        
    }
}