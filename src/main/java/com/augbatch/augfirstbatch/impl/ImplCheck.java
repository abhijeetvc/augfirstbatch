package com.augbatch.augfirstbatch.impl;

import com.augbatch.augfirstbatch.repository.InterfaceCheck;
import org.springframework.stereotype.Service;

/**
 * Created by abhi on 29/07/18.
 */

@Service
public class ImplCheck implements InterfaceCheck {

    @Override
    public String checkData() {

        return "checking di and ioc";
    }
}
