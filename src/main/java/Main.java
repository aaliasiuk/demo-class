public class Main {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.title = "Vacuum";
        card1.url = "https://www.google.com";

        Description description1 = new Description();
        description1.price = 100;
        description1.description = "Dyson. The best suction.";

        card1.description = description1;

    }
}
