package com.augbatch.augfirstbatch.controller;

import com.augbatch.augfirstbatch.impl.ImplCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhi on 29/07/18.
 */

@RestController
public class CheckController {

    @Autowired
    ImplCheck implCheck;

    @RequestMapping(value="/check")
    public String getData(){

        String data=implCheck.checkData();

        return data;
    }
}
