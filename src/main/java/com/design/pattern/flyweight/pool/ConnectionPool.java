package com.design.pattern.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.flyweight.pool
 * @className ConnectionPool
 * @author: zhuyf
 * @Date:2022/11/27 09:20
 * @Description: //
 */
public class ConnectionPool {

    Vector<Connection> pool= new Vector<>(POOLSIZE);

    private static final int POOLSIZE = 10;

    public static final String url = "jdbc:mysql://localhost:3306/test";

    public static final String username = "root";

    public static final String password  = "a123.b123";

    private static final String className = "com.mysql.jdbc.Driver";

    public ConnectionPool(){
        try {
            Class.forName(className);
            for (int i = 0; i < POOLSIZE; i++) {
                Connection connection = DriverManager.getConnection(url, username, password);
                pool.add(connection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection(){
        if (pool.size() > 0) {
            System.out.println("获取Connection");
            return pool.get(0);
        }
        System.out.println("连接池不存在");
        return null;
    }

    public synchronized boolean release(Connection connection){
        System.out.println("释放connection");
        return pool.remove(connection);
    }

}
