package com.example.demo.service.Distribution;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DistributionService {
    public List<String> showMyDistributions(String id);
}
