public class Bart {
    static int div(int a, int b) throws Throwable {
        if (b == 0) {
            throw new Exception("Can't divide by 0.");
        }
        System.out.println("Lisa");
        return a / b;
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        try {
            div(x,y);
        } catch (Exception t) {
            System.out.println("Gotcha!");
        }
        System.out.println("Bart");
    }
}