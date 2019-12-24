package com.blankj.study.corejava;

/**
 * 枚举类
 */
enum Size{
    //example
    SMALL("s"),
    MEDIUM("m"),
    LARGE("l"),
    EXTRA_LARGE("xl");

    private Size(String abbreviation){
        this.abbreviation = abbreviation;
    }

    private String abbreviation;
    public String getAbbreviation(){
        return abbreviation;
    }
}

public class Test03 {
    public static void main(String[] args) {

    }
}
