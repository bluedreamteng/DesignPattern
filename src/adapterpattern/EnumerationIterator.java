package adapterpattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 因为我们将枚举适配成迭代器，适配器需要实现迭代器接口。
 * 适配器必须看起来像一个迭代器
 * @author zhangtf
 * @date 2019-08-31 12:13
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    /**
     * 利用组合的方式，将枚举结合进入适配器中，所以用一个实例变量记录枚举
     * @param enumeration
     */
    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * 迭代器的hasNext()方法其实是委托给枚举的hasMoreElements()方法
     * @return
     */
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    /**
     * 代器的next()方法其实是委托给枚举的nextElement()方法
     * @return
     */
    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    /**
     * 由于不能支持迭代器的remove()方法，所以必须放弃，在这里我们的做法是抛出一个异常
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
