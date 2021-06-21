package com.design.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory =new PythonCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
        CourseFactory courseFactory2 = new JavaCourseFctory();
        Article article1 = courseFactory2.getArticle();
        article1.produce();
        Video video1 = courseFactory2.getVideo();
        video1.produce();
        video.produce();

    }
}
