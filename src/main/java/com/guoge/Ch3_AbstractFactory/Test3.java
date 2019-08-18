package com.guoge.Ch3_AbstractFactory;

//这样想去java视频和java手记结合的课程可以直接去具体java课程工厂去拿

/**
 * 不用担心拿错 需要什么去工厂拿就好了  依赖关系减弱
 *
 * 同一品牌属于同一产品族  比如美的空调 美的冰箱 都是美的的 这两个产品是同一产品族
 *同一种产品属于同一产品等级 比如美的空调 苏宁空调 都是空调
 * 抽象工厂把横向问题，纵向问题都给解决掉了
 */
public class Test3 {
    public static void main(String[] args) {
       CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produceVideo();
        article.produceArticle();

    }
}
