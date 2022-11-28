# Design-Patterns 设计模式


## 工厂模式


### [简单工厂](./src/main/java/com/p6/pattern/factory/SimpleFactory.java)

#### 定义
> 简单工厂是指由一个工厂对象决定创建出哪一种产品类的实例

#### 优点
只需要传入一个正确的参数，就可以获取你所需要的对象，无需知道其创建的细节

#### 缺点
- 工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则
- 不易于扩展过于复杂的产品结构。

### [工厂方法模式](./src/main/java/com/p6/pattern/factory/methodfactory/MethodFactoryTest.java)

#### 定义
> 工厂方法模式是指定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行。

#### 适用场景
- 创建对象需要大量重复的代码
- 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
- 一个类通过其子类来制定创建哪个对象

#### 优点
- 用户只需关心所需产品对应的工厂，无需关心创建细节
- 加入新产品符合开闭原则，提高了系统的可扩展性

#### 缺点
类的数量容易过多，增加了代码结构的复杂度
增加了系统的抽象性和系统难度

### [抽象工厂模式]()

#### 定义

> 是指提供一个创建一系列相关或相互依赖对象的接口，无需指定他们具体的类

#### 优点
1. 具体产品在应用层代码隔离，无需关心创建细节
2. 将一个系列的产品族统一到一起创建

#### 缺点
1. 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
2. 增加了系统的抽象性和理解的难度

#### 适用场景
- 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
- 强调一系列相关的产品对象（属于统一产品族）一起适用创建对象需要大量重复代码
- 提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现

## 单例模式

### 优点

- 在内存中只有一个实例，减少了内存开销
- 可以避免对资源的多重占用
- 设置全局访问点，严格控制访问

### 缺点

- 没有接口，扩展困难。
- 如果要扩展单例对象，只有修改代码，没有其它途径。

### 重点

1. 私有化构造器
2. 保证线程安全
3. 延迟加载
4. [防止序列化和反序列化破坏单例](./src/test/java/com/p6/test/singleton/SerializableTest.java)
5. [防御反射攻击单例](./src/test/java/com/p6/test/singleton/ReflectTest.java)


### 写法

- [饿汉式单例](./src/main/java/com/p6/pattern/singleton/hungry/HungrySingleton.java)
- [饿汉式单例static代码块写法](./src/main/java/com/p6/pattern/singleton/hungry/HungryStaticSingleton.java)
- [懒汉式单例](./src/main/java/com/p6/pattern/singleton/lazy/LazySimpleSingleton.java)
- [懒汉式双重检查锁](./src/main/java/com/p6/pattern/singleton/lazy/LazyDoubleCheckSingleton.java)
- [懒汉式静态代码块单例](./src/main/java/com/p6/pattern/singleton/lazy/LazyStaticInnerClassSingleton.java)
- [注册式单例（容器式）](./src/main/java/com/p6/pattern/singleton/register/ContainerSingleton.java)
- [枚举式单例](./src/main/java/com/p6/pattern/singleton/register/EnumSingleton.java)
- [threadLocal单例](./src/main/java/com/p6/pattern/singleton/threadLocal/ThreadLocalSingleton.java)

## [原型模式](./src/test/java/com/p6/test/prototype/PrototypeTest.java)

> - 是指原型实例制定创建对象的种类，并且通过拷贝这些原型创建新的对象
> - 调用者不需要知道任何创建细节，不调用构造函数
> - 属于创建型模式

### 适用场景

1. 类的初始化消耗资源较多
2. new产生的一个对象需要非常繁碎的过程（数据准备、访问权限等）
3. 构造函数比较复杂
4. 循环体中产生大量对象时

### 缺点

- 必须配备克隆(或者可拷贝)方法
- 对克隆复杂对象或对克隆出的对象惊醒复杂改造时，易带来风险。
- 深拷贝、浅拷贝要运用得当

## [建造者模式](./src/main/java/com/p6/pattern/builder/chain/ChainBuilder.java)

### 适用场景

- 适用于创建对象需要很多步骤，但是步骤的顺序不一定固定
- 如果一个对象有非常复杂的内部结构（很多属性）
- 把复杂对象的创建和使用分离

### 优点
- 封装性好，创建和使用分离
- 拓展性好，建造类之间独立、一定程度上解耦

### 缺点
- 产生多余的Builder对象
- 产品内部上发生变化，建造者都要修改，成本较大

### 建造者模式和工厂模式的区别
1. 建造者模式更加注重方法的调用顺序，工厂模式注重于创建对象。
2. 创建对象的力度不同，建造者模式创建复杂的对象，由各种复杂的部件组成，工厂模式创建出来的都一样。
3. 关注点：工厂模式只需要把对象创建出来就可以了，而建造者模式中不仅要创建出这个对象，还要知道这个对象由哪些部件组成。
4. 建造者模式根据建造过程中的顺序不一样，最终的对象部件组成也不一样。

## 代理模式

### 定义
> 代理模式（Proxy Pattern）是指为其他对象提供一种代理，以控制对这个对象的访问。
> 
> 代理对象在客户端和目标对象之间起到中介作用
> 
> 属于结构型设计模式

### 重点
1. 掌握代理模式的应用场景和实现原理
2. 了解静态代理和动态代理的区别。
3. 了解CGLib和JDK Proxy的根本区别
4. 手写实现定义的动态代理

### 模式
- [静态代理(显式声明被代理对象)](./src/main/java/com/p6/pattern/proxy/statics/TeachProxy.java)
- 动态代理(动态配置和替换被代理对象)
  - [JDK代理(采用实现的方式，必须要求代理的目标对象实现一个接口)](./src/main/java/com/p6/pattern/proxy/jdk/TeacherJdkProxy.java)
  - [CG Lib代理(采用继承、覆盖父类的方法)](./src/main/java/com/p6/pattern/proxy/cglib/CglibProxy.java)
  > 思想：都是通过生成字节码，重组成一个新的类
  ```markdown
   - JDK Proxy 对于用户而言，依赖更强，调用也更复杂
   - CGLib 对于目标类没有任何的要求
   - CGLib 效率更高，性能也更高，底层没有用到反射
   - JDK Proxy 生成逻辑较为简单，执行效率要低，每次都要用反射
   - CGLib 有个坑，目标代理不能有Final修饰的方法，会被忽略
  ```
  
### 优点
- 代理模式能将代理对象与真是被调用的目标对象分离
- 一定程度上降低了系统的耦合程度，易于扩展。
- 代理可以起到保护目标对象的作用
- 增强目标对象的职责

### 缺点
- 代理模式会造成系统设计中累的树木增加
- 在客户端和目标对象之间增加了一个代理对象，请求处理速度变慢。
- 增加了系统的复杂度。

### Srping中的代理选择原则
1. 当Bean有实现接口时，Spring就会用JDK的动态代理。
2. 当Bean没有实现接口时，Spring选择CGLib。
3. Spring可以通过配置强制使用CGLib，只需要在Spring的配置文件中加入如下代码：

```xml
    <aop:aspectj-autoproxy proxy-target-class="true"/>
```

## [门面模式](./src/test/java/com/p6/test/FacedTest.java)

### 定义

> 门面模式又叫外观模式，提供了一个统一的接口，用来访问子系统中的一群接口。
> 特征：门面模式定义了一个高层接口，让子系统更容易使用。
> 属于结构型模式。

### 优点
1. 简化了调用过程，无需深入了解子系统，以防给子系统带来风险。
2. 减少系统依赖、松散耦合
3. 更好地划分层次，提高了安全性
4. 遵循迪米特法则


### 缺点
1. 当增加子系统和扩展子系统行为时，可能容易带来未知风险
2. 不符合开闭原则
3. 某些情况下可能违背单一职责原则

### 适用场景

- 子系统越来越复杂，增加门面模式童工简单接口
- 构建多层系统结构，利用门面对象作为每层的入口，简化层间调用

### 门面模式与代理模式的区别

- 门面模式就是特殊的静态代理模式
- 门面模式重点在于封装
- 代理模式重点在于增强


## [装饰器模式](./src/test/java/com/p6/test/decorator/DecoratorTest.java)

### 定义

> 装饰器模式(Decorator Pattern)也叫做包装模式(Wrapper Pattern)，是指在不改变原油对象的基础上，将功能附加到对象上，提供了比继承更有弹性的替代方案(扩展原有对象的功能)。

### 适用场景
1. 用于扩展一个类的功能或给一个类添加附加职责
2. 动态的给一个对象添加功能，这些功能可以再动态的撤销

### 优点
1. 装饰器时继承的有力补充，比继承灵活，不改变原有对象的情况下动态地给一个对象扩展功能，即插即用。
2. 通过适用不同装饰类以及这些装饰类的排列组合，可实现不同效果。
3. 装饰器完全遵守开闭原则。

### 缺点
1. 会出现更多的代码，更多的类，增加程序复杂性
2. 动态装饰时，多层装饰时会更复杂

### 装饰器模式和代理模式对比
1. 装饰器模式就是一种特殊的代理模式。
2. 装饰器模式强调自身的功能扩展。
3. 代理模式强调代理过程的控制。

### 构成
1. 抽象组件，可以是一个接口或者抽象类，其充当被装饰器的原始对象，规定了被装饰对象的行为
2. 具体组件（component）：实现继承的一个具体对象，也即被装饰对象。
3. （ConCreateComponent）抽象装饰器：通用的装饰器，其内部必然又一个属性只想抽象组建，其实现一般时一个抽象类，主要时为了让其子类按照其构造形式传入一个抽象组件，这是一个强制的通用行为。
4. 具体装饰器（ConCreateDecorator）：装饰器的具体实现类，理论上每个ConcreateDecorator都扩展了Component对象的一种功能。

## [享元模式](./src/test/java/com/p6/test/flyweight/FlyWeightTest.java)

### 定义

> 又称为轻量级模式，是对象池的一种实现。类似于线程池，线程池可以避免不停的创建和销毁多个对象消耗性能。提供了减少对象数量从而改善应用所需的对象结构的方式。
> 宗旨：共享细粒度对象，将多个对同一对象的访问集中起来

### 使用场景

- 常常应用于系统底层的开发，以便解决系统的性能问题。
- 系统有大量相似对象、需要缓冲池的场景。

### 优点

- 减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
- 较少内存之外的其它资源占用

### 缺点

- 关注内、外部状态、关注线程安全问题
- 使系统、程序的逻辑复杂化

## 组合模式

### 定义

> 也称为整体-部分模式，它的宗旨是通过将单个对象和组合对象用相同的接口进行标识
> 作用：使客户端对单个对象和组合对象保持一致的方式处理

### 适用场景

1. 希望客户端可以忽略组合对象与单个对象的差异时。
2. 对象层次具备整体和部分，呈树形结构（如树形菜单，操作系统目录结构，公司组织架构等。

### 优点

1. 清楚地定义分层次的负责对象，表示对象的全部或部分层次
2. 让客户端忽略了层次的差异，方便对整个层次结构进行控制
3. 简化客户端代码
4. 符合开闭原则

### 缺点

1. 限制类型时会较为复杂
2. 使设计变得更加抽象

### 写法

- [透明模式](./src/test/java/com/p6/test/composite/transparent/TransparentTest.java)
- [安全模式](./src/test/java/com/p6/test/composite/safe/SafeTest.java)

## 适配器模式

### 定义

> 适配器模式又叫做变压器模式，它的功能是将一个类的接口编程客户端所期望的另一种接口，从而使原来因接口不匹配儿导致无法在一起工作的两个类能够一起工作

### 使用场景

1. 已经存在的类，它的方法和需求不铺配(方法结果相同或相似)的情况
2. 适配器模式不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同产品、不同厂家造成功能类似儿接口不相同情况下的解决方案

### 写法

- [类适配器](./src/test/java/com/p6/test/general/classadapter/ClassAdapter.java)
- [接口适配器](./src/test/java/com/p6/test/general/integerfaceadapter/InterfaceTest.java)
- [对象适配器](./src/test/java/com/p6/test/general/objectadapter/ObjectTest.java)

### 优点

1. 能提高类的透明性和复用，现有类复用但不需要改变
2. 目标类和适配器类解耦，提高程序的扩展性
3. 在很多业务场景中符合开闭原则

### 缺点

1. 适配器便携过程需要全面考虑，可能会增加系统的复杂性
2. 增加代码阅读难度，降低代码可读性，过多使用适配器会是系统代码变得凌乱