package com.p6.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.flyweight
 * @className TicketFactory
 * @author: zhuyf
 * @Date:2022/11/27 08:56
 * @Description: //
 */
public class TicketFactory {

    private static Map<String, ITicket> pool =new ConcurrentHashMap<>();

    public  static  ITicket queryTicket(String from,String to){
        String key = from + "->" +to;
        if (pool.containsKey(key)) {
            System.out.println("适用缓存"+key);
            return pool.get(key);
        }
        System.out.println("首次查询，创建对象:"+key);
        ITicket ticket = new TrainTicket(from,to);
        pool.put(key,ticket);
        return ticket;
    }
}
