package Lab6;

public class FuzzyLogic {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        System.out.println(temp.cold(9));
        System.out.println(temp.ok(22));
        System.out.println(temp.hot(38));

    }
}
