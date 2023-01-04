# Design-Patterns 设计模式


## 工厂模式


### [简单工厂](src/main/java/com/design/pattern/factory/SimpleFactory.java)

#### 定义
> 简单工厂是指由一个工厂对象决定创建出哪一种产品类的实例

#### 优点
只需要传入一个正确的参数，就可以获取你所需要的对象，无需知道其创建的细节

#### 缺点
- 工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则
- 不易于扩展过于复杂的产品结构。

### [工厂方法模式](src/main/java/com/design/pattern/factory/methodfactory/MethodFactoryTest.java)

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
4. [防止序列化和反序列化破坏单例](./src/test/java/com/design/test/singleton/SerializableTest.java)
5. [防御反射攻击单例](./src/test/java/com/design/test/singleton/ReflectTest.java)


### 写法

- [饿汉式单例](src/main/java/com/design/pattern/singleton/hungry/HungrySingleton.java)
- [饿汉式单例static代码块写法](src/main/java/com/design/pattern/singleton/hungry/HungryStaticSingleton.java)
- [懒汉式单例](src/main/java/com/design/pattern/singleton/lazy/LazySimpleSingleton.java)
- [懒汉式双重检查锁](src/main/java/com/design/pattern/singleton/lazy/LazyDoubleCheckSingleton.java)
- [懒汉式静态代码块单例](src/main/java/com/design/pattern/singleton/lazy/LazyStaticInnerClassSingleton.java)
- [注册式单例（容器式）](src/main/java/com/design/pattern/singleton/register/ContainerSingleton.java)
- [枚举式单例](src/main/java/com/design/pattern/singleton/register/EnumSingleton.java)
- [threadLocal单例](src/main/java/com/design/pattern/singleton/threadLocal/ThreadLocalSingleton.java)

## [原型模式](./src/test/java/com/design/test/prototype/PrototypeTest.java)

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

## [建造者模式](src/main/java/com/design/pattern/builder/chain/ChainBuilder.java)

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

- [静态代理(显式声明被代理对象)](src/main/java/com/design/pattern/proxy/statics/TeachProxy.java)
- 动态代理(动态配置和替换被代理对象)
  - [JDK代理(采用实现的方式，必须要求代理的目标对象实现一个接口)](src/main/java/com/design/pattern/proxy/jdk/TeacherJdkProxy.java)
  - [CG Lib代理(采用继承、覆盖父类的方法)](src/main/java/com/design/pattern/proxy/cglib/CglibProxy.java)
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

## [门面模式](./src/test/java/com/design/test/faced/FacedTest.java)

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

## [装饰器模式](./src/test/java/com/design/test/decorator/DecoratorTest.java)

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

## [享元模式](./src/test/java/com/design/test/flyweight/FlyWeightTest.java)

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

- [透明模式](./src/test/java/com/design/test/composite/transparent/TransparentTest.java)
- [安全模式](./src/test/java/com/design/test/composite/safe/SafeTest.java)

## 适配器模式

### 定义

> 适配器模式又叫做变压器模式，它的功能是将一个类的接口编程客户端所期望的另一种接口，从而使原来因接口不匹配儿导致无法在一起工作的两个类能够一起工作

### 使用场景

1. 已经存在的类，它的方法和需求不铺配(方法结果相同或相似)的情况
2. 适配器模式不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同产品、不同厂家造成功能类似儿接口不相同情况下的解决方案

### 写法

- [类适配器](./src/test/java/com/design/test/general/classadapter/ClassAdapter.java)
- [接口适配器](./src/test/java/com/design/test/general/integerfaceadapter/InterfaceTest.java)
- [对象适配器](./src/test/java/com/design/test/general/objectadapter/ObjectTest.java)

### 优点

1. 能提高类的透明性和复用，现有类复用但不需要改变
2. 目标类和适配器类解耦，提高程序的扩展性
3. 在很多业务场景中符合开闭原则

### 缺点

1. 适配器便携过程需要全面考虑，可能会增加系统的复杂性
2. 增加代码阅读难度，降低代码可读性，过多使用适配器会是系统代码变得凌乱

## 桥接模式

### 定义

1. 也称为桥梁模式、接口模式或柄体模式。是将抽象部分与它的具体实现部分分离，是他们都可以独立地变化。
2. 通过组合方式建立两个类之间的联系，而不是继承

### 适用场景

1. 在抽象和具体实现之间需要增加更多的灵活性的场景
2. 一个类存在两个独立变化的纬度，而这两个纬度都需要独立进行扩展
3. 不希望适用继承，或因为多层继承导致系统类的个数剧增

### 优点

1. 分离抽象部分及其具体实现部分
2. 提高了系统的扩展性
3. 符合开闭原则
4. 符合合成复用原则

### 缺点

1. 增加了系统的理解与设计难度
2. 需要正确地识别系统中两个独立变化的纬度

## [策略模式](./src/test/java/com/design/test/strategy/StrategyTest.java)

### 定义

> - 又叫做政策模式，它是将定义的算法家族、分别封装起来，让他们之间可以互相替换，从而让算法的变化不回影响到使用算法的用户
> - 可以避免多重分支的if……else……和switch语句

### 适用场景

1. 加入系统中有很多类，而他们的区别仅仅在于他们的行为不同
2. 一个系统需要动态地在集中算法中选择一种
3. 需要屏蔽算法规则

### 优点

1. 策略模式符合开闭原则。
2. 避免使用多重条件转移语句，如if...else...语句、switch语句
3. 使用策略模式可以提高算法的保密性和安全性

### 缺点

1. 客户端必须知道所有的策略，并且自行决定使用哪一个策略类。
2. 代码中会产生非常多策略类，增加维护难度。

## [责任链模式](./src/test/java/com/design/test/chain/ChainTest.java)

### 定义

> 是将链中每一个节点看作是一个对象，每个节点处理的请求均不同，且内部自动维护一个下一节点对象。当一个请求从链式的首端发出时，会沿着链的路径一次传递给每一个节点对象，直至有对象处理这个请求为止。

### 适用场景

1. 多个对象可以处理同一请求，但具体由哪个对象处理则在运行时动态决定
2. 在不明确指定接受者的情况下，向多个对象中的一个提交一个请求
3. 可动态制定一组对象处理请求

### 优点

1. 将请求与处理解耦。
2. 请求处理者(节点对象)只需要关注自己感兴趣的请求进行处理即可，对于不感兴趣的请求，直接转发给下一级节点对象；
3. 具备链式传递处理请求功能，请求发送者无需知晓链路结构，只需等待请求处理结果。
4. 链路结构灵活，可以通过改变链路结构动态地新增或删减职责。
5. 易于扩展新的请求处理类，符合开闭原则

### 缺点

1. 责任链太长或者处理时间过长，会影响整体性能。
2. 如果节点对象存在循环引用时，会造成死循环，导致系统崩溃。

## [迭代器模式](./src/test/java/com/design/test/iterator/IteratorTest.java)

### 定义

> 又称为游标模式，它提供一种顺序访问集合/容器对象元素的方法，而又无需暴露集合内部表示。
>
> 本质：抽离集合对象迭代行为到迭代器中，提供一致访问接口

### 适用场景

1. 访问一个集合对象的内容而无需暴露它的内部表示
2. 为遍历不同的结合结构提供一个统一的访问接口

### 优点

1. 多态迭代：为不同的聚合结构提供一致的遍历接口，即一个迭代接口可以访问不同的聚集对象；
2. 简化集合对象接口：迭代器模式将集合对象本身应该提供的元素迭代接口抽取到了迭代器中，使集合对象无需关心具体迭代行为；
3. 元素迭代功能多样化：每个集合对象都以提供一个或多个不同的迭代器，使得同种元素聚合结构可以有不同的迭代行为；
4. 解耦迭代与集合：迭代器模式封装了具体的迭代算法，迭代算法的变化不会影响到集合对象的架构。

### 缺点

1. 对于比较简单的遍历（像数组或者有序列表），使用迭代器方式遍历较为繁琐。

## 命令模式

### 定义

> 是对命令的封装，每一个命令都是一个操作：请求的一方发出请求执行一个操作；接受的一方收到请求并执行操作。命令模式解耦了请求方和接收方，请求方只需要请求执行命令，不用关心命令是怎样被接受，怎样被操作以及是否被执行…等
>
> 本质：解耦命令请求与处理

### 适用场景

1. 现实语义中具备"命令"的操作
2. 请求调用者和请求的接受者需要解耦，使得调用者和接受者不直接交互。
3. 需要抽象出等待执行的行为，比如撤销操作和恢复操作。
4. 需要支持命令宏（即命令组合操作）。

### 优点

1. 通过引入中间件（抽象接口），解耦了命令请求与实现
2. 扩展性良好，可以很容易地增加新命令；
3. 支持组合命令，支持命令队列；
4. 可以在现有命令的基础上，增加额外功能（比如日志记录…结合装饰器模式更好）

### 缺点

1. 具体命令类可能过多
2. 增加了程序的复杂度，理解更加困难

## 备忘录模式

### 定义

> 又称为快找模式或令牌模式，是指在不破坏封装的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
>
> 特征：后悔药

### 适用场景

1. 需要保存历史快找的场景
2. 希望在对象之外保存状态，切除了自己其他类对象无法访问状态保存具体内容。

### 优点

1. 简化发起人实体类职责，隔离状态存储与获取，实现了信息的封装，客户端无需关心状态的保存细节。
2. 提供状态回滚功能。

### 缺点

1. 消耗资源：如果需要保存的状态过多时，每一次保存都会消耗很多内存。

## [状态模式](./src/test/java/com/design/test/state/StateTest.java)

### 定义

> 也称为状态机模式，是允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。

### 适用场景

1. 行为随状态改变而改变的场景
2. 一个操作中含有庞大的多分支结构，并且这些分支取决与对象的状态。

### 优点

1. 结构清晰：将状态独立为类，消除了冗余的if……else或switch……case语句，使代码更加简洁，提高系统可维护性。
2. 将状态转换显示化：通常对象内部都是使用数值类型来定义状态，状态的切换是通过赋值进行表现，不够直观，而适用状态类，在切换状态时，是一不同的类进行表示，转换目的更加明确；
3. 状态类职责明确切具备扩展性。

### 缺点

1. 类膨胀：如果一个事物具备很多状态，则会造成状态类太多。
2. 状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱。
3. 状态模式对开闭原则的支持并不友好，对于可以切换状态的状态模式，增加新的状态类需要修改哪些负责状态转换的源代码，否则无法切换到新增状态，而且修改某个状态类的行为也需修改对应类的源代码。

## [中介者模式](./src/test/java/com/design/test/mediator/MediatorTest.java)

### 定义

> 又称为调节者模式或调停者模式。用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其解耦松散，而且可以独立地改变他们之间的交互。
>
> 核心：通过中介者解耦系统各层次对象的直接耦合，层次对象的对外依赖通信系统统交由中介者转发

### 适用场景

1. 系统中对象之间存在复杂的饮用关系，产生的相互依赖关系结构混乱切难以理解
2. 交互的公共行为，如果需要改变行为则可以增加新的中介者类。

### 优点

1. 减少类间依赖，将多对多依赖转化成了一对多，降低了类间耦合
2. 类间各司其职，符合迪米特法则。

### 缺点

1. 中介者模式中将原本多个对象直接的相互依赖变成了中介者和多个同事类的依赖关系。当同事类越多时，中介者就会越臃肿，变得复杂且难以维护。

## [解释器模式](./src/test/java/com/design/test/interpreter/InterpreterTest.java)

### 定义

> 给定一个语言，定义他的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语音中的橘子
>
> 特征：为了解释一种语言，而为语言创建的解释器。

### 适用场景

1. 一些重复出现的问题可以用一种简单的语言来进行表达。
2. 一个简单愈发需要解释的场景。

### 优点

1. 扩展性强：在解释器模式中由于语法是由很多类表示的，当语法规则更改时，只需修改相应的废终结符表达式即可；若扩展语法时，只需添加相应废终结符类即可；
2. 增加了新的解释表达式的方式；
3. 已于实现文法：解释器模式对应的文法应当是比较简单且易于实现的，过于复杂的语法并不合适使用解释器模式。

### 缺点

1. 语法规则比较复杂时，会引起类膨胀；
2. 执行效率比较低。

## [访问者模式](./src/test/java/com/design/test/visitor/VisitorTest.java)

### 定义

> 访问者模式是一种间数据结构与数据操作分离的设计模式。是指封装一些作用与某种数据结构中的个元素的操作。
>
> 特征：可以在不改变数据结构的前提下定义作用与这些元素的新的操作。

### 适用场景

1. 数据结构稳定，作用与数据结构的操作经常变化的场景。
2. 需要数据结构与数据操作分离的场景。
3. 需要对不同数据类型进行操作，而不实用分支判断具体类型的场景。

### 优点

1. 解耦了数据结构与数据操作，使得操作集合可以独立变化；
2. 扩展性好：可以通过扩展访问者角色，实现对数据机的不同操作；
3. 元素具体类型并非单一，访问者均可操作；
4. 个角色职责分离，符合单一职责原则。

### 缺点

1. 无法增加元素类型：若系统数据结构对象抑郁变化，经常有新的数据对象增加进来，则访问者类必须增加对应元素类型的操作，违背了开闭原则。
2. 具体元素变更困难：具体元素增加属性，删除属性等操作会导致对应的访问者类需要进行相应的修改，尤其当有大量访问者类时，修改范围太大；
3. 违背依赖导致原则：为了达到"区别对待"，访问者依赖的是具体元素类型，而不是抽象。

## [观察者模式](./src/test/java/com/design/test/observer/general/Test.java)

### 定义

> 观察者模式又叫发布-订阅模式、模型-试图模式、源-监听器模式或从属者模式。定义一种一对多的依赖关系，一个主题对象可被多个观察者对象同时监听，使得每当主题对象状态发生变化时，所有依赖于它的对象都会得到通知并被自动更新

### 适用场景

1. 当一个抽象模型包含两个方面内容，其中一个方面依赖于另一个方面；
2. 其他一个或多个对象的变化依赖于另一个对象的变化；
3. 实现蕾丝广播机制的功能，无需知道具体收听者，只需分发广播，系统中感兴趣的对象会自动接收该广播。
4. 多层级嵌套使用，形成一种链式触发机制，使得事件具备跨域（跨越两种观察者类型通知）。

### 优点

1. 观察者和被观察者是松耦合（抽象耦合）的，符合依赖倒置原则。
2. 分离了表示层（观察者）和数据逻辑层（被观察者），并且建立了一套触发机制，使得数据的变化可以响应到多个表示层上。
3. 实现了一对多的通讯机制，支持时间注册机制，支持兴趣分发机制，当被观察者触发事件时，只有感兴趣的观察者可以接收到通知。

### 缺点

1. 如果观察者数量过多，则时间通知会耗时较长。
2. 时间通知成线性关系，如果其中一个观察者处理时间卡壳，会影响后续的观察者接收该事件。
3. 如果观察者和被观察者之间存在循环依赖，则可能造成两者之间的循环调用，导致系统崩溃。