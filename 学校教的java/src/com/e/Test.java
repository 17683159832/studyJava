package com.e;

public class Test {
    public static void main(String[] args) {
        Class c = new Class();
        c.className = "7班";
        c.begin();

        Teacher t = new Teacher();
        t.name = "lisi";
        t.ziwojieshao();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "lili";
        s2.name = "xiix";
        s3.name = "weire";

        s1.ziwojieshao();
        s2.ziwojieshao();
        s3.ziwojieshao();
    }
}
