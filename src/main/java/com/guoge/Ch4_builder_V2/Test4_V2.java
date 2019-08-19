package com.guoge.Ch4_builder_V2;

//链式调用
public class Test4_V2 {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("JAVA")
                .buildCoursePPT("javappt")
                .buildCourseVideo("javavideo")
                .buildCourseArticle("javaarticle")
                .buildCourseQA("javaQA").build();

        System.out.println(course);
    }
}
