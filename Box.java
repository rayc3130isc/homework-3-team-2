import java.util.ArrayList;
import java.util.Iterator;

public class Box<T>{
    private T thing;
    public Box (T thing) {this.thing = thing;}
    public T getThing() {return thing;}
    public void setThing(T thing) {this.thing = thing;}
    public static void main(String [] args) {
        ArrayList<Box<String>> names = new ArrayList<>();
        ArrayList<Box<Integer>> ids = new ArrayList<>();
        Box<String> name1 = new Box<String>("Annie");
        Box<String> name2 = new Box<String>("Betty");
        Box<String> name3 = new Box<String>("Carol");
        Box<String> name4 = new Box<String>("Dima");
        Box<String> name5 = new Box<String>("Emma");
        Box<Integer> id1 = new Box<Integer>(100);
        Box<Integer> id2 = new Box<Integer>(122);
        Box<Integer> id3 = new Box<Integer>(324);
        Box<Integer> id4 = new Box<Integer>(421);
        Box<Integer> id5 = new Box<Integer>(504);
        names.add(name1); names.add(name2); names.add(name3); names.add(name4); names.add(name5);
        ids.add(id1); ids.add(id2); ids.add(id3); ids.add(id4); ids.add(id5);

        Iterator<Box<String>> nameit = names.iterator();
        Iterator<Box<Integer>> idit = ids.iterator();

        while (nameit.hasNext()) {
            Box<String> name = nameit.next();
            Box<Integer> id = idit.next();
            String s = name.getThing();
            int i = id.getThing();
            System.out.println(s+"\t"+i);
        }
    }
    // Box<T> is reusable, but shouldn't without generics because it can create errors
    // due to the loss in type safety.
    // Iterators do not need to be casted because Java already knows what is inside it.
}
