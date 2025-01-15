class Dimension{
    public void getDimension(){
        System.out.println("Getting a dimension ");
    }
}
class TwoD extends Dimension{
    @Override
    public void getDimension(){
        System.out.println("Getting 2d dimension ");
    }
}

public class TestOverriding {
public static void main(String[] args){
    Dimension d = new Dimension();
        d.getDimension();

        TwoD t = new TwoD();
        t.getDimension();

        Dimension dim = new TwoD(); 
        dim.getDimension();
}
    
}
