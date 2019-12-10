package datastructure.hashtable;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashTableTest {

    private HashTable hashTable;

    @Before
    public void setUp() throws Exception {
        hashTable = new HashTable();
    }

    @Test
    public void putAndGet() {
        hashTable.put("Batman", "521-1234");
        hashTable.put("Deadpool", "521-8976");
        hashTable.put("Ironman", "521-5030");
        hashTable.put("Flash", "418-4165");

        Assert.assertEquals("521-1234", hashTable.get("Batman"));
        Assert.assertEquals("521-8976", hashTable.get("Deadpool"));
        Assert.assertEquals("521-5030", hashTable.get("Ironman"));
        Assert.assertEquals("418-4165", hashTable.get("Flash"));

        System.out.println(hashTable.toString());
    }

    @Test
    public void collision() {
        hashTable.put("Batman", "521-1234");
        hashTable.put("Superman", "521-9655");

        Assert.assertEquals("521-1234", hashTable.get("Batman"));
        Assert.assertEquals("521-9655", hashTable.get("Superman"));
    }
}
