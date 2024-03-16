public class Main {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("How many minutes I need to cook lasagna? \n" + lasagna.expectedMinutesInOven() + " minutes");
        int actualMinutes = 10;
        System.out.println("I cooked the lasagna for " +actualMinutes+ " minutes. How many minutes do I have to cook yet? \n" +
                "You have to cook for next " +lasagna.remainingMinutesInOven(actualMinutes) + " minutes");
        int countOfLayers = 2;
        System.out.println("I have total layers of " +countOfLayers+ ". How many minutes I need to add for cooking?\n" +
                "You need to spend for cooking next " +lasagna.preparationTimeInMinutes(countOfLayers) + " minutes");
        System.out.println("Taking the cooking time and the number of layers, what will be the total cooking time of the lasagna? \n" +
                "The total time will be " + lasagna.totalTimeInMinutes(countOfLayers, lasagna.expectedMinutesInOven()) +
                "\" minutes\"");

    }
}