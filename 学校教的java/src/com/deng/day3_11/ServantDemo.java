package com.deng.day3_11;

public class ServantDemo {
//    描述菲佣的类
//    创建属性、特征、字段、成员变量（同一
    String name;
    int age;

//    创建行为
    void shopping(){
        System.out.println("购物");
    }
    void cook(){
        System.out.println("做饭");
    }
    public static void main(String[] args) {
        //创建对象
        ServantDemo s = new ServantDemo();
        System.out.println(s);
//        给属性
        s.name = "sili";
        s.age = 12;
        System.out.println("name:"+s.name + ", age:"+s.age);
    }
}
