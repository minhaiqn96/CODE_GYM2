package com.hai.service;

import com.hai.entity.Province;
import com.hai.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> showProvince() {
        return provinceRepository.findAll();
    }

    @Override
    public void addProvince(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void deleteProvince(Long id) {
        provinceRepository.delete(id);
    }

    @Override
    public Province editProvince(Long id) {
        return provinceRepository.findOne(id);
    }
}
