单例模式的关键特性
1. 唯一性：确保一个类只有一个实例。
2. 全局访问点：提供一个全局访问点来获取该实例。

1. 饿汉式（Eager Initialization）
饿汉式在类加载时就创建了单例实例。
 public class Singleton {
    // 在类加载时创建实例
    private static final Singleton instance = new Singleton();

    // 私有构造函数，防止外部实例化
    private Singleton() {}

    // 提供全局访问点
    public static Singleton getInstance() {
        return instance;
    }
}

优点：实现简单，无需考虑线程安全问题。
缺点：即使没有使用到单例实例，也会在类加载时创建，可能浪费资源。


2. 懒汉式（Lazy Initialization）
懒汉式在需要时才创建实例，延迟实例化。
public class Singleton {
    // 静态变量保存实例
    private static Singleton instance;

    // 私有构造函数，防止外部实例化
    private Singleton() {}

    // 提供全局访问点，并确保线程安全
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

优点：只有在需要时才创建实例，节省资源。
缺点：需要加锁，性能开销较大。

3. 双重检查锁定（Double-Checked Locking）
这种方法结合了懒汉式的延迟加载和饿汉式的线程安全，优化了性能。
public class Singleton {
    // 使用 volatile 修饰防止指令重排序
    private static volatile Singleton instance;

    // 私有构造函数，防止外部实例化
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

优点：在第一次调用时初始化，且只加锁一次，性能较高。
缺点：实现相对复杂，可能出现潜在的代码维护问题。


4. 静态内部类（Static Inner Class）
利用类加载机制实现懒加载，同时又是线程安全的。
public class Singleton {
    // 私有构造函数，防止外部实例化
    private Singleton() {}

    // 静态内部类，只有在调用 getInstance() 时才会加载
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供全局访问点
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

优点：利用 JVM 类加载机制保证线程安全，且实现了懒加载。
缺点：实现相对简单，但依赖于静态内部类特性。


5. 枚举（Enum）
使用枚举类型实现单例是最简单和有效的方法之一，保证了序列化机制的单例性。
public enum Singleton {
    INSTANCE;

    public void someMethod() {
        // 方法实现
    }
}

优点：实现简单，天然支持序列化机制，绝对防止多次实例化。
缺点：不能延迟加载实例，如果需要懒加载则不适用。