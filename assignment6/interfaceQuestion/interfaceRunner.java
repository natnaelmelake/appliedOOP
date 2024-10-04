package assignment6.interfaceQuestion;
import java.util.ArrayList;

public class interfaceRunner {
    public static void main(String[] args) {
        ObjectBehaviour t1 = new Type1("this is type 1 object", 100);
        ObjectBehaviour t2 = new Type2("this is type 2 object", 200);
        ObjectBehaviour t3 = new Type3("this is type 3 object", 300);

        ArrayList<ObjectBehaviour> list = new ArrayList<ObjectBehaviour>();

        list.add(t1);
        list.add(t2);
        list.add(t3);


        for (ObjectBehaviour obj : list) {
            System.out.println("--------------------------------------------");
            System.out.println(obj.getType());
            obj.performAction();
            System.out.println(obj.getAttribute());
        }

    }
}
