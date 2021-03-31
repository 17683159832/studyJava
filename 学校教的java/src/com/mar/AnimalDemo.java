package com.mar;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.run();

        Bird bird = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();
        bird.fly();
    }
}
class Bird{
    public Bird() {
        System.out.println("鸟的默认构造器");
    }
    void fly(){
        System.out.println("飞了一千米");
    }
}
class Animal{
    String name;
    int age;

    public Animal() {
    }
    public Animal(int a){}
//    带两个参数
    public Animal(int a ,int b){}
//    带三个参数
    public Animal(int a,int b , int c){}
    void run(){
        System.out.println("跑了一百米");
    }
    /**
     * 构造器
     * 主要用于创建对象并返回初始化对象的数据
     * 其实我们在创建对象的时候，都是调用的构造方法，
     * 构造函数，构造器，构造子
     * -------------------
     * 构造器的特点：
     * 类都有一个默认的构造器，当不显示的定义构造器的时候
     * 编译器会在编译时，提供一个默认的构造器
     *
     * 构造器的名字必须和当前所在的类名相同
     * 不需要定义返回值的类型，更不能使用void 返回构造器
     *
     * 目的是创建和返回当前类的对象。
     * 默认构造器
     * 无参数，无方法体
     * 构造器的访问权限修饰符和当前类的修饰符相同
     * 一旦在类中显示的提供了构造器，则默认的构造器就不存在了。
     *
     * 推论:一个类至少有一个构造器
     *
     * 方法的重载：
     * 在同一个类中，方法名相同，参数列表不同
     * 相同的功能方法，因为参数列表不同，而带来的参数名的不同的问题
     *
     * 构造器的重载：
     * 不同类的构造器是不相同的，对于构造器重载来说，肯定是在同一个类中，并且构造器都是和类名相同的
     * 所以在同一个类中的多个构造器就必须参数列表不同
     */
}