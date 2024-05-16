

import java.util.ArrayList;

public class StoreGerenericTypeInField<T> {
    private T myT = null;
    private ArrayList<T> list = new ArrayList<>();

    private void setT(final T aT) { 
        myT = aT; 
    }

    public StoreGerenericTypeInField(){
        StringBuilder builderType = new StringBuilder();
        StringBuffer bufferType = new StringBuffer();
        this.list.add((T)builderType);
        this.list.add((T)bufferType);
        System.out.println(this.list.get(0).getClass().getName());
        System.out.println(this.list.get(1).getClass().getName());

        setT((T)builderType);
        System.out.println(this.myT.getClass().getName());
        setT((T)bufferType);
        System.out.println(this.myT.getClass().getName());
    }

    public static void main(String[] args){
        StoreGerenericTypeInField<Integer> s = new StoreGerenericTypeInField<>();
    }
}