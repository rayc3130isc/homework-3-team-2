/*Zhu JiaMing*/
import java.util.ArrayList;
import java.util.Iterator;

public class BMain {

    public static void main(String[] args) {

        ArrayList<Box<String>> names = new ArrayList<Box<String>>();
        ArrayList<Box<Integer>> ids = new ArrayList<Box<Integer>>();

        names.add(new Box<String>("Ace"));
        names.add(new Box<String>("Bob"));
        names.add(new Box<String>("Charlie"));
        names.add(new Box<String>("David"));
        names.add(new Box<String>("Emma"));

        ids.add(new Box<Integer>(101));
        ids.add(new Box<Integer>(102));
        ids.add(new Box<Integer>(103));
        ids.add(new Box<Integer>(104));
        ids.add(new Box<Integer>(105));

        Iterator<Box<String>> nameIterator = names.iterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

        Iterator<Box<Integer>> idIterator = ids.iterator();
        while (idIterator.hasNext()) {
            System.out.println(idIterator.next());
        }
    }
}
/* Why is Box<T>reusable?
    Box<T> is reusable because it can store any type of object,
    Instead of creating separate classes for each data type,
    one generic class can handle all types safely.

    Why does the Iterator not need casting?
    The Iterator does not need casting because generics provide type safety at compile time.
    When we declare something like Iterator<Box<String>>,
    Java already knows that the iterator will return Box<String> objects.

    How are Generics and ArrayList related internally?
    Generics and ArrayList are related because ArrayList is a generic class
    written as ArrayList<T>. This allows it to store any type safely.
    The generic type is checked at compile time and removed at runtime,
    helping prevent type errors.

 */