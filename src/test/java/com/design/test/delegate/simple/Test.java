package com.design.test.delegate.simple;

import com.design.pattern.delegate.simple.Boss;
import com.design.pattern.delegate.simple.Leader;

public class Test {
    public static void main(String[] args) {
        new Boss().command("海报图", new Leader());
        new Boss().command("爬虫", new Leader());
        new Boss().command("卖手机", new Leader());
    }
}
