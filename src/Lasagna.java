public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        return expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int countOfLayers) {
        return 2 * countOfLayers;
    }

    public int totalTimeInMinutes(int countOfLayers, int numberOfMinutesTheLasaniaHasBeenInOven) {
        return preparationTimeInMinutes(countOfLayers) + numberOfMinutesTheLasaniaHasBeenInOven;
    }

}
