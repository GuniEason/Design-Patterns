package com.design.test.flyweight;

import com.design.pattern.flyweight.pool.ConnectionPool;

import java.sql.Connection;

/**
 * @project Design-Patterns
 * @package com.p6.test.flyweight
 * @className FlyWeightTest
 * @author: zhuyf
 * @Date:2022/11/27 09:03
 * @Description: //
 */
public class FlyWeightTest {

    public static void main(String[] args) {
//        ITicket ticket = TicketFactory.queryTicket("北京西","长沙");
//        ticket.showInfo("硬座");
//        ticket = TicketFactory.queryTicket("北京西","长沙");
//        ticket.showInfo("软座");
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
        if (null != connection) {
            pool.release(connection);
        }
    }
}
