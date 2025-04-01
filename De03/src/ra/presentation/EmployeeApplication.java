package ra.presentation;

import ra.bussiness.EmployeeBusiness;

import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ra.bussiness.EmployeeBusiness employeeBusiness = new EmployeeBusiness();
        int choice;
        do {
            System.out.println("----------------------------Employee Menu----------------------------");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm mới nhân viên");
            System.out.println("3. Chỉnh sửa thông tin nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Tìm kiếm nhân viên");
            System.out.println("6. Sắp xếp");
            System.out.println("7. Thoát chương trình");
            System.out.println("--------------------------------------------------------------------------");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    employeeBusiness.displayEmployee();
                    break;
                case 2:
                    employeeBusiness.addEmployee(sc);
                    break;
                case 3:
                    employeeBusiness.editEmployee(sc);
                    break;
                case 4:
                    employeeBusiness.deleteEmployee(sc);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Thoát chương trình");
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 7);
    }
}
