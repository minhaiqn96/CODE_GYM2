package com.hai.service;

import com.hai.entity.Province;

import java.util.List;

public interface ProvinceService {

    List<Province> showProvince();

    public void addProvince(Province province);

    public void deleteProvince(int id);

    public Province editProvince(int id);
}
