package hlf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {

        System.out.println("version: " + System.getProperty("java.version"));

        List<Integer> ints = new ArrayList<Integer>();
        for (int i = 0; i > 10; i++) {
            ints.add(i);
        }

        Iterator<Integer> it = ints.iterator();

        Collections.sort(ints);

//        for (Integer element: ints) {
//            System.out.println(element);
//            if (element > 5) {
//                ints.add(0, 0);
//            }
//        }

//        for (Iterator<Integer> it = ints.iterator(); it.hasNext(); ) {
//            Integer element = it.next();
//            System.out.println(element);
//            if (element > 5) {
//                ints.add(0, 0);
//            }
//        }


        while(it.hasNext()) {
            Integer element = it.next();
            System.out.println(element);
            if (element > 5) {
                ints.add(0,0);
            }
        }

//        for (int i = 0; i < ints.size(); i++) {
//            Integer element = ints.get(i);
//            System.out.println(element);
//            if (element > 5) {
//                ints.remove(0);
//            }
//        }

    }

}
