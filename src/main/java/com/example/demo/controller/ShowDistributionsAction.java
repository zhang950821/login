package com.example.demo.controller;

import com.example.demo.service.distribution.DistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/showDistributionAction",method={RequestMethod.GET})
public class ShowDistributionsAction {

    @Autowired
    DistributionService distributionService;

}
