import com.hillel.homeWork.lesson14.practicum.MyHashMap;
import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {

    @Test
    public void testPut() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(3204, "Kyiv");
        Assert.assertEquals("Kyiv", myHashMap.get(3204));
    }

    @Test
    public void testGetWithCollision() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(3204, "Kyiv");
        myHashMap.put(3104, "Lviv");
        myHashMap.put(3004, "Dnepr");
        myHashMap.put(4, "Harkiv");
        Assert.assertEquals("Dnepr", myHashMap.get(3004));
    }

    @Test
    public void testGetNull() {
        MyHashMap myHashMap = new MyHashMap();
        Assert.assertNull(myHashMap.get(3004));
    }

    @Test
    public void testPutWithSameKeys() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(3204, "Kyiv");
        myHashMap.put(3204, "Lviv");
        myHashMap.put(3204, "Dnepr");
        Assert.assertNotEquals("Kyiv", myHashMap.get(3204));
        Assert.assertNotEquals("Lviv", myHashMap.get(3204));
        Assert.assertEquals("Dnepr", myHashMap.get(3204));
    }

    @Test
    public void testRedistribute() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, "Kyiv");
        myHashMap.put(11, "Kyiv");
        myHashMap.put(2, "Lviv");
        myHashMap.put(12, "Lviv");
        myHashMap.put(3, "Dnepr");
        myHashMap.put(13, "Dnepr");
        myHashMap.put(19, "Dnepr");
        myHashMap.put(4, "Harkiv");
        myHashMap.put(5, "Doneck");
        myHashMap.put(6, "Luhansk");
        myHashMap.put(7, "Zaporizhya");
        myHashMap.put(8, "Mykolaiv");
        System.out.println(myHashMap.getNodeLists().length);
        Assert.assertTrue(myHashMap.getNodeLists().length == 20);
        System.out.println(myHashMap);
    }


}
