import java.util.Random;
public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int sum = 0;
    System.out.println("Wylosowane liczby:");
    for (int i = 0; i < 5; i++) {
      int num = random.nextInt(100); // Generates a random number between 0 and 99
      System.out.println(num);
      sum += num;
    }
    System.out.println("Suma wylosowanych liczb: " + sum);
  }
}