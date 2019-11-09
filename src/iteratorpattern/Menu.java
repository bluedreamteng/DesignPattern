package iteratorpattern;

import java.util.Iterator;

public interface Menu {
    /**
     * 这是一个简单接口，让客户能够取得一个菜单项迭代器
     * @return
     */
    public Iterator createIterator();
}
