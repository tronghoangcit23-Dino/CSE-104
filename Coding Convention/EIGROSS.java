import java.util.Scanner;

public class EIGROSS {

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu
        Scanner scanner = new Scanner(System.in);
        int employeeCount = scanner.nextInt();

        // Mảng lưu thu nhập sau thuế của từng nhân viên
        double[] afterTaxIncomes = new double[employeeCount];

        // Nhập thu nhập sau thuế cho từng nhân viên
        for (int i = 0; i < employeeCount; i++) {
            afterTaxIncomes[i] = scanner.nextDouble();
        }

        // Tính và in ra số tiền thuế công ty phải trả cho từng nhân viên
        for (int i = 0; i < employeeCount; i++) {
            double tax = (afterTaxIncomes[i] / 0.9) * 0.1;
            System.out.printf("%.2f\n", tax);
        }

        // Đóng Scanner để giải phóng tài nguyên
        scanner.close();
    }
}
