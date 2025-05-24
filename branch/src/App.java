public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int score = 85; // Example score
        if (score >= 80) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }

        if (score >= 90) {
            System.out.println("優");
        } else if (score >= 80) {
            System.out.println("良");
        } else if (score >= 70) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

        if (score >= 0 && score <= 100) {
            System.out.println("有効なスコアです");
        } else {
            System.out.println("無効なスコアです");
        }

        int month = 2; // Example month
        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            days = 31;
            break;
            case 4: case 6: case 9: case 11:
            days = 30;
            break;
            case 2:
            days = 28; // Assuming it's not a leap year
            break;
            default:
            days = -1; // Invalid month
        }

        if (days != -1) {
            System.out.println(month + "月は" + days + "日あります");
        } else {
            System.out.println("無効な月です");
        }
    }
}
