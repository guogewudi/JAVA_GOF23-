package com.guoge.Ch4_builder;

//建造者设计模式

/**
 * 建造细节掩盖
 *
 * 适用：对象有很多属性，创建使用分离
 * 扩展性好，建造类之间独立，一定程度解耦
 *
 * 缺点：产生了多余builder对象  产品内部发生变换，建造者也要修改
 *
 */
public class Test4 {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("JAVA","JAVAPPT",
                "javaVideo","javaArticel","javaQA");
        System.out.println(course);
    }
}
