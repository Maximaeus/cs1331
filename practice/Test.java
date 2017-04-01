public class Test {
    public static void main(String[] args) {
        Tuple<String, Integer> d = new Tuple<>("bruh", 5);

        System.out.println(d);
        System.out.println(d.getFirst() + " " + d.getSecond());
    }
}
