package ra.bussiness;

import ra.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeBusiness {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Scanner sc) {
        Employee employee = new Employee();
        employee.inputData(sc);
        employees.add(employee);
        System.out.println("Thêm nhân viên thành công!");
    }

    public void displayEmployee() {
        if (employees.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
        } else {
            for (Employee employee : employees) {
                employee.displayData();
            }
        }
    }

    public void editEmployee(Scanner sc) {
        System.out.print("Nhập mã nhân viên cần chỉnh sửa: ");
        String employeeId = sc.nextLine();
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                employee.inputData(sc);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên");
    }

    public void deleteEmployee(Scanner sc) {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String employeeId = sc.nextLine();
        employees.removeIf(employee -> employee.getEmployeeId().equals(employeeId));
        System.out.println("Xóa thành công!");
    }
}

