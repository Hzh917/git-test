package com.design.abstractfactory;

public class JavaCourseFctory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new  JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
