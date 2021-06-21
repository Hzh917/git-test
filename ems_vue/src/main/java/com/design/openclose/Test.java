package com.design.openclose;

public class Test {

    public static void main(String[] args) {
        ICourse java = new Java(96,"zhangsan",25.0);
        System.out.println("编号"+java.getId()+"名字"+java.getName()+"价格 "+java.getPrice());

    }
}
