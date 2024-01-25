public class Main {
    public static void main(String[] args) {

    String city="columbus";
    int zipCode = 43215;

    double[] weather = {32, 25, 27, 40, 45};

    double sum = 0;

        for (int i = 0; i < weather.length; i++) {
            sum += weather[i];

        }

        double average = sum / weather.length;
        System.out.println(city + "|" + zipCode + "|" + average);



    }
}