package com.example.demo.service.Distribution;

import com.example.demo.dao.DistributionMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DistributionServiceImpl implements DistributionService{
    @Autowired
    DistributionMapper distributionMapper;
    @Override
    public List<String> showMyDistributions(String id) {
        return null;
    }
}
