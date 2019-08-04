#### 关于Class.getResource和ClassLoader.getResource路径问题

##### Class.getResource(String path)
* path不以'/'开头时，默认是从此类所在的包下取资源；
* path以'/'开头时，则是从ClassPath根下获取；
* Class.getResource和Class.getResourceAsStream在使用时，路径选择上是一样的；

##### Class.getClassLoader().getResource(String path)
* path不能以'/'开头！（请注意！！！）；
* path是从ClassPath根下获取；
* Class.getClassLoader（）.getResource和Class.getClassLoader（）.getResourceAsStream在使用时，路径选择上也是一样的；

#### 从结果来看【类.class.getResource("/") == 对象.getClass().getClassLoader().getResource("")】
