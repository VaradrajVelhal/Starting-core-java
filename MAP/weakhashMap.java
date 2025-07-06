import java.util.WeakHashMap;

public class weakhashMap {
    public static void main(String[] args) {
        
        WeakHashMap<String, image> imagecache=new WeakHashMap<>();
        //String key1=new String("img1");
        //String key2=new String("img2");
        
        imagecache.put(  new String("img1"), new image("image 1"));
        imagecache.put( new String("img2") , new image("image 2"));

        System.out.println(imagecache);
        //key1=null;
        //key2=null;


        System.gc();
        try {
            Thread.sleep(10000);//just waiting for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after ruuning some entries maybe cleared..."+imagecache);
         
    }
}
class image{
    private String name;

    @Override
    public String toString() {
        return "image [name=" + name + "]";
    }

    public image(String name) {
        this.name = name;
    }
     
}
