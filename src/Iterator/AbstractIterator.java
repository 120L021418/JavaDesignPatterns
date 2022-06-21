package Iterator;

/*
@author HIT_Why 120L021418
@create 2022-06-09 20:41
*/
public interface AbstractIterator {
    public void next();
    public boolean isLast();
    public void previous();
    public boolean isFirst();
    public Object getNextItem();
    public Object getPreviousItem();
}
