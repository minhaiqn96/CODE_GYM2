package com.hai;

import com.hai.entity.Villa;
import com.hai.service.VillaService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        VillaService villaService = new VillaService();
        List<Villa> villas = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Villa villa = villaService.addNewService();
            villas.add(villa);
        }
        for (Villa a : villas) {
            System.out.println(a.toString());
        }
    }
}
