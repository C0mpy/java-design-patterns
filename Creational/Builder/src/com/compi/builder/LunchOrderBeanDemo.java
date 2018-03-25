package com.compi.builder;

public class LunchOrderBeanDemo {

    public static void main(String[] args) {

        LunchOrderBean lunchOrederBean = new LunchOrderBean();

        lunchOrederBean.setBread("Wheat");
        lunchOrederBean.setCondiments("Lettuce");
        lunchOrederBean.setDressing("Mustard");
        lunchOrederBean.setMeat("Ham");

        System.out.println(lunchOrederBean.getBread());
        System.out.println(lunchOrederBean.getCondiments());
        System.out.println(lunchOrederBean.getDressing());
        System.out.println(lunchOrederBean.getMeat());

    }
}
