package com.hai.service;

import com.hai.entity.Province;
import com.hai.exception.ResourceNotFoundException;

import java.util.List;

public interface ProvinceService {

    List<Province> showProvince();

    public void addProvince(Province province);

    public void deleteProvince(Long id);

    public Province editProvince(Long id) throws ResourceNotFoundException;
}
