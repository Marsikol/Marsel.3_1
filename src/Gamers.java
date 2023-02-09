public class Gamers {
    public static void main(String[] args) {
        int[] nums = {1, -4, 3, -6, 5, 9, 7, 2, -9, 10};
        int sum = 0;

        for (int x : nums) sum += x;
        System.out.println("3ий способ = " + sum);
    }
}
