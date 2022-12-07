package com.p6.pattern.memento;

import java.util.Stack;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.memento
 * @className DraftsBox
 * @author: zhuyf
 * @Date:2022/12/07 17:57
 * @Description: //
 */
public class DraftsBox {
    private final Stack<ArticleMemento> STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento) {
        STACK.push(articleMemento);
    }
}
