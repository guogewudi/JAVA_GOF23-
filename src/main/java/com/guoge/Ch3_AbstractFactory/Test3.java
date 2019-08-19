package com.guoge.Ch3_AbstractFactory;

//这样想去java视频和java手记结合的课程可以直接去具体java课程工厂去拿

/**
 * 不用担心拿错 需要什么去工厂拿就好了  依赖关系减弱
 *
 * 同一品牌属于同一产品族  比如美的空调 美的冰箱 都是美的的 这两个产品是同一产品族
 *同一种产品属于同一产品等级 比如美的空调 苏宁空调 都是空调
 * 抽象工厂把横向问题，纵向问题都给解决掉了
 *
 * 抽象工厂的优点：应用层不和具体的产品产生依赖关系  只和工厂产生依赖关系
 * 扩展性好，直接增加就可以 符合开闭原则
 *
 * 缺点：新增产品等级比较麻烦，需要进行较大修改 比如要视频 文章 基础上增加其他 需要写很多
 * 需要修改CourseFactory里的方法，增加或者删除，不符合开闭原则
 * 不适合用于频繁修改产品等级的场景
 *
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
