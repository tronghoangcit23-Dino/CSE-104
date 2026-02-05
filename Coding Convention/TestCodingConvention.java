import java.util.Scanner;

public class TestCodingConvention {
    public static void main(String[] args) {
        // Khai báo biến 
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        // Logic kiểm tra kết quả 
        if (score >= 5) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Tính điểm trung bình
        // Ép kiểu double để kết quả chia chính xác
        double averageScore = (double) score / 3;

        System.out.println("Average Score: " + averageScore);

        scanner.close();
    }
}
