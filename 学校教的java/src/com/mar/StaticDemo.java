package com.mar;

// static修饰符
public class StaticDemo {
    /**
     *  类是用来描述，多个对象共同的状态和行为
     *  为了表示一类事物的状态和行为，不是某一个个体对象的
     *
     *  此时，为了解决该问题，使用修饰符：static
     *
     *  static修饰符，可以修饰成员变量，可以修饰方法等
     *  就是表名该字段或该方法属于类，而不属于某一个对象
     *
     *  类成员和实例成员的访问：
     *  类成员：使用static修饰的成员变量/方法
     *  属于类，所以可以直接使用类名访问。
     *
     *  实例成员：没有使用static修饰的成员变量/方法
     *  属于对象，必须使用对象来访问
     *
     *  类成员变量的特点：
     *  随着类被加载进jvm同时也初始化和内存中分配空间
     *  优先于对象存在
     *  被该类的所有对象所共享
     *  直接使用类名调用即可
     *
     *  访问规则：
     *  静态方法：只能访问静态的成员变量/方法
     *  不能访问非静态的成员变量，方法
     *
     *  非静态方法可以访问非静态成员变量，方法
     *  也可以访问静态的成员变量，方法
     *
     *  对象可以访问静态成员，但是不推荐（底层仍是类调用
     *  类可以访问静态成员，类不能访问非静态成员
     *
     *  一般在开发中类成员如何使用：
     *  在开发中，工具类的方法都用static修饰
     *  好处是，直接使用，不要创建对象
     *
     *  一般的，如果静态方法需要访问一个成员变量
     *  此时才把成员变量用static修饰
     */
    String msg = "非static成员";
    static String staticMsg = "static成员";
    static boolean flag;

    void doWork(){
        System.out.println(msg);
        System.out.println(staticMsg);
    }

    static void staticDoWork(){
        System.out.println("staticDoWork");
    }

    static String info; //默认null
    static int a; //默认0
//  static不能使用在方法体中

    public static void main(String[] args) {
        StaticDemo s = new StaticDemo();
        s.doWork();

        new StaticDemo().doWork();

        System.out.println(a);
//        System.out.println(msg);
        StaticDemo.staticDoWork(); //静态方法掉用


    }
}
