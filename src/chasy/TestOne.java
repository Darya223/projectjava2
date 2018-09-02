package chasy;

public class TestOne {
    public static void main(String[] args) {
        int t = 1865;
        int s = 24;
        int y = t%s;
        int x = (t-y)/s;
        System.out.println("Было дано 1865 часов." + "Это равно" + x + "дней и" + y + "часов");
    }
}
