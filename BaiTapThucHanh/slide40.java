import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay: ");
        int ngay = sc.nextInt();
        switch (ngay) {
            case 1:
                System.out.println("Chu Nhat");
                break;
            case 2:
                System.out.println("Thu Hai");
                break;
            case 3:
                System.out.println("Thu Ba");
                break;
            case 4:
                System.out.println("Thu Tu");
                break;
            case 5:
                System.out.println("Thu Nam");
                break;
            case 6:
                System.out.println("Thu Sau");
                break;
            case 7:
                System.out.println("Thu Bay");
                break;
            default:
                System.out.println("Nhap sai ngay");
        }
    }
}