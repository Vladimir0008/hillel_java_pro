import com.hillel.homeWork.lesson14.practicum.MyHashMap;
import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {

    @Test
    public void testAdd() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(3204, "Kyiv");
        Assert.assertEquals("Kyiv", myHashMap.get(3204));
    }
}
