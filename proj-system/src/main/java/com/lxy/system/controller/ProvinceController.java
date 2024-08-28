package com.org.mollcol.controller;

import com.org.mollcol.model.po.ProvincePO;
import com.org.mollcol.service.ProvinceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Service
@RestController
@RequestMapping("/province")
public class ProvinceController {
    private static final Logger logger = LoggerFactory.getLogger(ProvinceController.class);
   @Resource
    private ProvinceService provinceService;
    @RequestMapping(value = "/selectTree", method = RequestMethod.POST)
    public int selectTree(@RequestBody ProvincePO request) {
        logger.info("selectTree city");

        return 0;
    }
}
