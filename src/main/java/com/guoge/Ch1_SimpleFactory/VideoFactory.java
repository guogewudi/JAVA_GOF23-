package com.guoge.Ch1_SimpleFactory;

public class VideoFactory {

    public Video getType(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)) {
            return new PythonVideo();

        }
        return null;
    }
}
