package com.guoge.Ch3_AbstractFactory;

/**
 *
 * 两个方法 获取视频 获取手记
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
