package za.ac.cput.project;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
//import java.util.ArrayList;
//import java.util.List;


/**
 * Created by student on 2015/02/19.
 */
public class TestMyCollection  extends TestCase {

    MyCollections coll = new MyCollections();
    MyCollections tColl = new MyCollections();


    @Test
    public void testGetNames() throws Exception
    {
        Assert.assertEquals("Sin", coll.myNames().get(0));
    }



    @Test
    public void testMyFriends()
    {
        Assert.assertEquals(tColl.myFriends(),"Mina");
    }
}
