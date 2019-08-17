package com.guoge.Ch1_SimpleFactory;

public class VideoFactory {
//最初的方法
//    public Video getType(String type){
//        if("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//
//        }
//        return null;
//    }

    //反射来创建对象 比上面的更加满足开闭原则
    public Video getVideo(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Video video = null;
        video = (Video) Class.forName(c.getName()).newInstance();
        return video;
    }
}
