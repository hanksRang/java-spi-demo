package com.hanksrang.spi;

import com.hanksrang.common.interf.IPeople;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SpiInvoker {

    public static void main(String[] args) {
        ServiceLoader<IPeople> load = ServiceLoader.load(IPeople.class);
        Iterator<IPeople> iterator = load.iterator();
        while (iterator.hasNext()) {
            IPeople next = iterator.next();
            next.say();
        }
    }

}
