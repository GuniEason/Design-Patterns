# Design-Patterns 设计模式



## 单例模式知识重点总结

```text 
    优点
     - 在内存中只有一个实例，减少了内存开销
     - 可以避免对资源的多重占用
     - 设置全局访问点，严格控制访问
    缺点
     - 没有接口，扩展困难。
     - 如果要扩展单例对象，只有修改代码，没有其它途径。 
```

1. 私有化构造器
2. 保证线程安全
3. 延迟加载
4. [防止序列化和反序列化破坏单例](./src/test/java/com/p6/test/singleton/SerializableTest.java)
5. [防御反射攻击单例](./src/test/java/com/p6/test/singleton/ReflectTest.java)

- [饿汉式单例](./src/main/java/com/p6/pattern/singleton/hungry/HungrySingleton.java)
- [饿汉式单例static代码块写法](./src/main/java/com/p6/pattern/singleton/hungry/HungryStaticSingleton.java)
- [懒汉式单例](./src/main/java/com/p6/pattern/singleton/lazy/LazySimpleSingleton.java)
- [懒汉式双重检查锁](./src/main/java/com/p6/pattern/singleton/lazy/LazyDoubleCheckSingleton.java)
- [懒汉式静态代码块单例](./src/main/java/com/p6/pattern/singleton/lazy/LazyStaticInnerClassSingleton.java)
- [注册式单例（容器式）](./src/main/java/com/p6/pattern/singleton/register/ContainerSingleton.java)
- [枚举式单例](./src/main/java/com/p6/pattern/singleton/register/EnumSingleton.java)
- [threadLocal单例](./src/main/java/com/p6/pattern/singleton/threadLocal/ThreadLocalSingleton.java)