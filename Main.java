import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankManagement bank = new BankManagement();
        int n;
        do {
            
            int id;
            String name;
            double balance;
            System.out.println("1. Them tai khoang");
            System.out.println("2. Xoa Tai khoang");
            System.out.println("3. Thuc hien giao dich");
            System.out.println("4. Xem danh sach");
            System.out.println("5. Thoat");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Nhap id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap ten: ");
                    name = scanner.nextLine();
                    
                    System.out.print("Nhap so tien: ");
                    balance = scanner.nextDouble();

                    Account account = new Account(id, name, balance);
                    bank.themAcc(account);
                    break;
            
                case 2:
                    System.out.print("Nhap id tai khoan: ");
                    id = scanner.nextInt();

                    bank.xoaAcc(id);
                    break;
                case 3:
                    int i;
                    
                    System.out.println("1. Nap Tien");
                    System.out.println("2. Rut Tien");
                    i = scanner.nextInt();
                    switch (i) {
                        case 1:
                            double tien;
                            System.out.print("Nhap id: ");
                            id = scanner.nextInt();
                            System.out.print("Nhap so tien: ");
                            tien = scanner.nextDouble();
                            bank.themGD(id, "Nap Tien", tien);
                            break;
                        
                        case 2:
                    
                            System.out.print("Nhap id: ");
                            id = scanner.nextInt();
                            System.out.print("Nhap so tien: ");
                            tien = scanner.nextDouble();
                            bank.themGD(id, "Rut Tien", tien);
                            break;
                    }
                    break;
                case 4 : 
                    bank.sapXepList();
                    bank.danhSachAcc();
                    break;
            }

        } while (n != 5);
        scanner.close();
    }
}