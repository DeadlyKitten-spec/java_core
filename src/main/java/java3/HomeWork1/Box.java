package java3.HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;

    public List<T> getList(){
        return list;
    }

    public Box(){
        list = new ArrayList<T>();
    }

    public Box(T... thing) {
        list = Arrays.asList(thing);
    }

    void add(T thing){
        list.add(thing);
    }

    float getWeight(){
        if(list.isEmpty()){
            return 0;
        }else{
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box){
        return this.getWeight() == box.getWeight();
    }

    void sprinkle(Box<T> box){
        box.getList().addAll(list);
        list.clear();
    }
}
