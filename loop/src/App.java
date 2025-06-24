public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        int N = 100; // 任意の自然数N
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("1から" + N + "までの総和は: " + sum);

        int quotient = N;
        int quotientSum = 0;
        while (quotient != 0) {
            quotient = quotient / 2;
            quotientSum += quotient;
        }
        System.out.println("Nを2で割った商が0になるまでの商の総和は: " + quotientSum);

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int inputSum = 0;
        int num;
        do {
            System.out.print("数値を入力してください（0で終了）: ");
            num = scanner.nextInt();
            inputSum += num;
        } while (num != 0);
        System.out.println("入力した数の総和は: " + inputSum);
        scanner.close();

        String[] eto = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
        System.out.println("干支の一覧:");
        for (String e : eto) {
            System.out.println(e);
        }

        System.out.println("干支の配列をfor文で順番に表示:");
        for (int i = 0; i < eto.length; i++) {
            System.out.println(eto[i]);
        }
    }
}
