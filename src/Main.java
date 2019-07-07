import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao chuoi ky tu: ");
        text = sc.nextLine();
        char x;
        System.out.println("nhap vao ky tu can kiem tra: ");
        x = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (x == text.charAt(i)) {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("khong co ky tu nhap vao trong chuoi!");
        } else {
            System.out.println("Ky tu " + x + " xuat hien " + count + " lan");
        }

    }
}
