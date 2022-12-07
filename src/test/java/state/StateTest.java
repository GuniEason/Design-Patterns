package state;

import com.p6.pattern.state.AppContext;

/**
 * @project Design-Patterns
 * @package state
 * @className StateTest
 * @author: zhuyf
 * @Date:2022/12/07 18:17
 * @Description: //
 */
public class StateTest {
    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("评论：好文章 +1");
    }
}
