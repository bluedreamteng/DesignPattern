package iteratorpattern.chapter1;


import java.util.Iterator;
import java.util.Stack;

/**
 * @author zhangtf
 * @date 2019-09-15 22:22
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    /**
     * 将我们要遍历的顶层组合的迭代器传入，我们把它抛进一个堆栈数据结构中
     * @param iterator
     */
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        //想要知道是否还有下一个元素，我们检查堆栈是否被清空，
        //如果已经被清空了，就表示没有下一个元素了
        if (stack.empty()) {
            return false;
        } else {
            //否则，我们就从堆栈的顶层中取出迭代器，看看是否还有下一个元素，如果它没有元素，我们将它弹出堆栈，‘
            //然后递归调用hasNext()
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        //当客户想要取得下一个元素的时候，我们先调用hasNext()来确定是否还有下一个
        if (hasNext()) {
            //如果还有下一个元素，我们就从堆栈中取出目前的迭代器，然后取得它的下一个元素
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                //如果元素是一个菜单，我们就有了另一个需要被包含进遍历中的组合，所以我们将它丢进
                //堆栈中，不管是不是菜单，我们都返回该组件
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }

    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
