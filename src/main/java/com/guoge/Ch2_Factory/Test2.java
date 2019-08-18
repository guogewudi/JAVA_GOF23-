package com.guoge.Ch2_Factory;

//工厂方法有一个抽象的工厂
//工厂方法让实例化推迟到子类
//加入新产品符合开闭原则，提高可扩展性   简单工厂之上，多了一个抽象的工厂类，具体工厂继承这个抽象工厂类
//缺点：类个数过多增加复杂度。增加了系统的抽象性和复杂度
//添加新的类不仅要写新的类，而且要写该类的具体工厂，所以还是比较复杂
public class Test2 {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
