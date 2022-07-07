package com.hanksrang.chinese;

import com.hanksrang.common.interf.IPeople;

public class Chinese implements IPeople {

    @Override
    public void say() {
        System.out.println("I am a Chinese");
    }

}
