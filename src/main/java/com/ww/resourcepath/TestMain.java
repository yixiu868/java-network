package com.ww.resourcepath;

public class TestMain {

    /*Class.getResource(String path)
    path不以'/'开头时，默认是从此类所在的包下取资源；
    path以'/'开头时，则是从ClassPath根下获取；*/
    public static void main(String[] args) {
        // 当前类型(class文件非java文件)所在的包目录
        // file:/D:/workplaces/actualCombat/javaknowledge/target/classes/com/ww/resourcepath/
        System.out.println(TestMain.class.getResource(""));

        // class path根目录
        // file:/D:/workplaces/actualCombat/javaknowledge/target/classes/
        System.out.println(TestMain.class.getResource("/"));

        // 2.properties在当前包目录下
        // file:/D:/workplaces/actualCombat/javaknowledge/target/classes/com/ww/resourcepath/2.properties
        System.out.println(TestMain.class.getResource("2.properties"));

        // 3.properties在sub包中
        // file:/D:/workplaces/actualCombat/javaknowledge/target/classes/com/ww/resourcepath/sub/3.properties
        System.out.println(TestMain.class.getResource("sub/3.properties"));

        // 1.properties在根目录
        // file:/D:/workplaces/actualCombat/javaknowledge/target/classes/1.properties
        System.out.println(TestMain.class.getResource("/1.properties"));
    }
}
