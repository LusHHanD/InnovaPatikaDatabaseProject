package com.innova.main;

import com.innova.controller.AdminController;
import com.innova.dto.AdminDto;

public class AdminMainTest {
    public static void main(String[] args) {
        AdminController adminController=new AdminController();
        AdminDto adminDto=new AdminDto();
        adminDto.setAdminName("test");
        adminDto.setAdminSurname("testSurname");
        adminController.create(adminDto);
    }
}
