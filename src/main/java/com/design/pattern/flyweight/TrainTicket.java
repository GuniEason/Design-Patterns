package com.design.pattern.flyweight;

import java.util.Random;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.flyweight
 * @className TrainTicket
 * @author: zhuyf
 * @Date:2022/11/27 08:53
 * @Description: //
 */
public class TrainTicket implements ITicket {

    private String from;

    private String to;

    private int price;

    public TrainTicket(){
    }

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(from +"->" +to +":"+bunk+"价格是"+price);

    }
}
