package unit17.pratice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FXpratice3<T> {
    public void doSomething(FXpratice3<? extends List<Object>> a) {
        System.out.println(a.getClass().getName());
    }

    public static void main(String[] args) {
        FXpratice3<? extends List<Object>> a = new FXpratice3<ArrayList<Object>>();
        a.doSomething(new FXpratice3<ArrayList<Object>>());
        a.doSomething(new FXpratice3<LinkedList<Object>>());
        FXpratice3<? super List<Object>> a2 = null;
        a2 = new FXpratice3<Object>();
    }
}
