package app;

public class teste4 {
    static int x = 3, y = 1;
        public static int sub(int x, int y) {
            return x-y;

}       

public static int sum(int x, int y) {
    return x + y;

}

public static void main(String[] args) {
    System.out.println(x + ", " + y);
    System.out.println("sum = " + sum(x, y));
    System.out.println("sub = " + sub(x, y));
    System.out.println(x + ", " + y);
  }
}

