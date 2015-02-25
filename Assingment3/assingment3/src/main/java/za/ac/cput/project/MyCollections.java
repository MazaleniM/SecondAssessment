package za.ac.cput.project;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 * Created by student on 2015/02/19.
 */
public class MyCollections {

    static List<String> names;
    static Set<String>  friends;

    /*public void addNames()
    {
       String name  = "Sino";
        names.add("Sino");
        names.add("Masi");

    }*/


    public Set<String> myFriends()
    {
        friends = new HashSet();


        friends.add("Mina");
        
        return friends;
    }

    public List<String> myNames()
    {
        names = new ArrayList<String>();
        String name  = "Sino";
        names.add("Sino");
        names.add("Masi");

        return names;
    }

    public String  getNames()
    {

       return  names.get(0);
    }
}
