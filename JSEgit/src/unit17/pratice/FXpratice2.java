package unit17.pratice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FXpratice2<T extends List> {

    public static void main(String[] args) {
        FXpratice2<ArrayList> p1 = new FXpratice2<ArrayList>();
        FXpratice2<LinkedList> p2 = new FXpratice2<LinkedList>();
        // LimitClass<HashMap> l3=new LimitClass<HashMap>();
    }

}
