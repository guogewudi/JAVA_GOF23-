package com.guoge.Ch1_SimpleFactory;

/**
 *
 * 简单工厂：只需要传入一个正确的参数，就可以获取所需要的对象，并不需要知道其中的细节
 * 适用条件：(1) 需要的对象较少 （2）知道传入工厂的参数
 * 缺点：工厂的职责相对过重，增加类可能需要修改工厂源码，违背开闭原则
 *
 *典型应用： Calender类（并不需要扩展）
 *
 * VideoFactory方法一
 * 如果想要可以生成更多的video类，就要修改工厂的源代码。
 * 这并不符合开闭原则：对扩展开放，对修改关闭
 *
 * VideoFactory方法二
 * 当然可以通过反射，来增强扩展，符合开闭原则
 *
 *
 * 简单工厂不属于GOF23但是，它是演化基础
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        //Video video = new JavaVideo();
        //Video video = new PythonVideo();
        //现在Test只依赖工厂，不依赖上面两个类
        VideoFactory videoFactory = new VideoFactory();
       // Video video = videoFactory.getType("java");
        //VideoFactory第二个方法
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video==null){
            return;
            }
        video.produce();
    }
}
