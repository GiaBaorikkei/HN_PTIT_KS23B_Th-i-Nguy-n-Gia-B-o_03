package ra.entity;

import java.util.Scanner;

public class Employee implements IApp {
    private String employeeId;
    private String employeeName ;
    private String birthday;
    private String phoneNumber;
    private boolean sex;
    private float coefficient ;
    private int allowanceSalary ;
    private String department ;
    private byte status = 1;

    public Employee() {}

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getcoefficient() {
        return coefficient;
    }

    public void setcoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public int getallowanceSalary() {
        return allowanceSalary;
    }

    public void setallowanceSalary(int allowanceSalary) {
        this.allowanceSalary = allowanceSalary;
    }

    public String getdepartment() {return department;}

    public void setdepartment(String department) {
        this.department = department;
    }

    public byte getStatus() {
        return status;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập mã nhân viên (Ký tự, bắt đầu bằng NV): ");
        this.employeeId = sc.nextLine().trim();

        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = sc.nextLine();

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        this.birthday = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = sc.nextLine();

        System.out.print("Nhập giới tính (true - Nam, false - Nữ): ");
        this.sex = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Nhập hệ số lương: ");
        this.coefficient  = sc.nextFloat();

        System.out.print("Nhập phụ cấp lương: ");
        this.allowanceSalary = sc.nextInt();

        System.out.print("Nhập phòng ban làm việc: ");
        this.department  = sc.nextLine();
        sc.nextLine();
    }

    @Override
    public void displayData() {
        float totalSalary =  BASE_SALARY * coefficient + allowanceSalary;

        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Ngày Sinh: " + birthday);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Tổng Lương: " + totalSalary);
        System.out.println("Tên phòng ban: " + department);
        System.out.println("Trạng thái: " + (status == 1 ? "Đang làm việc" : status == 2 ? "đang nghỉ phép" : "Đã nghỉ việc"));
    }
}

