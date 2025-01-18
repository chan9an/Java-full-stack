package CollectionFramework;
import java.util.Vector;
import java.util.Enumeration;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.addElement(12);
        v.add(23);
        v.add(13);
        //v.add("Sjjsadk");
        Enumeration<Integer> en =v.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
            
        }

    }

}
