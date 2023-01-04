package com.design.pattern.chain;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.chain
 * @className Handler
 * @author: zhuyf
 * @Date:2022/12/07 12:44
 * @Description: //
 */
public abstract class Handler<T> {

    protected Handler next;

    public void next(Handler next) {
        this.next = next;
    }

    public abstract void doHandler(Member member);


    public static class Builder<T> {

        private Handler<T> head;
        private Handler<T> tail;

        public Handler<T> build() {
            return this.head;
        }

        public Builder<T> addHandler(Handler handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

    }

}
