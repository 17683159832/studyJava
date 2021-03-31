package com.deng.day3_11;

public class Student {
    String name;
    boolean isFee;

    void fees(){
        System.out.println("交费成功");
        this.isFee = true;
    }

    public static void main(String[] args) {

//        学生数及存放数组
        int count = 5;
        Student[] arr = new Student[count];
//        初始化
        for (int i = 0; i < count; i++) {
            arr[i] =  new Student();
        }
//        缴费
        for (int i = 0; i < count; i++) {
            arr[i].fees();
        }
    }
}
