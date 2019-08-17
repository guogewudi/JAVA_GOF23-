package com.guoge.Ch1_SimpleFactory;

public class Test {
    public static void main(String[] args) {
        //Video video = new JavaVideo();
        //Video video = new PythonVideo();
        //现在Test只依赖工厂，不依赖上面两个类
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getType("java");
        if(video==null){
            return;
            }
        video.produce();
    }
}
