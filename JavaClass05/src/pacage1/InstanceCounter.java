
package pacage1;


public class InstanceCounter {
    
    static {
        System.out.println("class InstanceCounter is loading....");
        
    }
    static final long ONE_DAY_IN_MILLIS =24 * 60 * 60 * 1000;
    
     int instanceCounter;
    
    static {
        System.out.println("ONE_DAY_IN_MILLIS " +ONE_DAY_IN_MILLIS
         + " InstanceCounter " + new InstanceCounter().instanceCounter);
    }
    
    {
        instanceCounter++;
        System.out.println("InstanceCounter" +instanceCounter);
    }
    
    public static void main(String[] args) {
        System.out.println("starting InstanceCounter");
        
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        System.out.println("InstanceCounter is main =" + new InstanceCounter().instanceCounter );
        
}
    static {
        System.out.println("class InstanceCounter loaded");
    }
}
