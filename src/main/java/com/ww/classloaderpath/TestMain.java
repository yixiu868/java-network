package com.ww.classloaderpath;

/**
 * Class.getClassLoader（）.getResource(String path)
 * path不能以’/'开头时；
 * path是从ClassPath根下获取；
 */
public class TestMain {

    public static void main(String[] args) {
        TestMain t = new TestMain();
        // class com.ww.classloaderpath.TestMain
        System.out.println(t.getClass());

        // sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(t.getClass().getClassLoader());

        // file:/D:/workplaces/actualCombat/javaknowledge/target/classes/
        System.out.println(t.getClass().getClassLoader().getResource(""));

        // null
        System.out.println(t.getClass().getClassLoader().getResource("/"));

        // file:/D:/workplaces/actualCombat/javaknowledge/target/classes/1.properties
        System.out.println(t.getClass().getClassLoader().getResource("1.properties"));

        // file:/D:/workplaces/actualCombat/javaknowledge/target/classes/com/ww/resourcepath/2.properties
        System.out.println(t.getClass().getClassLoader().getResource("com/ww/resourcepath/2.properties"));

        // file:/D:/workplaces/actualCombat/javaknowledge/target/classes/com/ww/resourcepath/sub/3.properties
        System.out.println(t.getClass().getClassLoader().getResource("com/ww/resourcepath/sub/3.properties"));
    }
}
