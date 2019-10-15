package com.hai.entity;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "employee")
@Component
public class Employee implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotEmpty(message = "Ma Nhan Vien khong de trong")
    @Column(name = "ma_nv")
    private String ma_nv;

    @NotEmpty(message = "Nhom Nhan Vien khong de trong")
    @Size(min = 2, max = 20, message = "Nhom Nhan Vien phai tu 2 den 20 ky tu")
    @Column(name = "nhom_nv")
    private String nhom_nv;

    @NotEmpty(message = "Ho Ten khong de trong")
    @Size(min = 2, max = 20, message = "Ho Ten phai tu 2 den 20 ky tu")
    @Column(name = "ho_ten")
    private String name;

    @NotEmpty(message = "Gioi tinh khong de trong")
    @Size(min = 2, max = 20, message = "Gioi tinh phai tu 2 den 20 ky tu")
    @Column(name = "gioi_tinh")
    private String gioi_tinh;

    @Column(name = "phone_number")
    private String phoneNumber;

    @NotEmpty(message = "CMND khong de trong")
    @Size(min = 2, max = 50, message = "CMND phai tu 2 den 20 ky tu")
    @Column(name = "cmnd")
    private String cmnd;

    @Pattern(regexp = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+$", message = "Email khong hop le")
    @Column(name = "email")
    private String email;

    @NotEmpty(message = "Dia Chi khong de trong")
    @Size(min = 2, max = 50, message = "Dia Chi phai tu 2 den 50 ky tu")
    @Column(name = "dia_chi")
    private String address;

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public String getNhom_nv() {
        return nhom_nv;
    }

    public void setNhom_nv(String nhom_nv) {
        this.nhom_nv = nhom_nv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //    @Override
//    public String toString() {
//        return "Employee [id=" + id + ", Name=" + name + ", Age=" + age + ", Position=" + position + "]";
//    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;
        String phoneNumber = employee.getPhoneNumber();
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "phoneNumber.empty");
        if (phoneNumber.length() > 11 || phoneNumber.length() < 10) {
            errors.rejectValue("phoneNumber", "phoneNumber.length");
        }
        if (!phoneNumber.startsWith("0")) {
            errors.rejectValue("phoneNumber", "phoneNumber.startsWith");
        }
        if (!phoneNumber.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phoneNumber", "phoneNumber.matches");
        }
    }
}
