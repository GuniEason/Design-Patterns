package com.design.pattern.delegate.simple;

public class Boss {

    public void command(String task, Leader leader) {
        new Leader().doingWork(task);
    }
}
