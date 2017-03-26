
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Zalisekile on 2017/03/26.
 */
class ListsTest extends Lists
{
    List<String> ninja = new ArrayList<String>();
    @Test
    void TestArrayListAdd()
    {
        ninja.add("Naruto");

        assertTrue(ninja.contains("Naruto"),"Naruto aint in your ArrayList homie");
    }

    Collection<String> shinobi = new LinkedList<String>();

    @Test
    void TestLinkedListCollectionAdd()
    {
        shinobi.add("Gara");
        String message = "Gara is not in your Collection";
        assertTrue(shinobi.contains("Gara"),message);
    }


    @Test
    void TestSetInitialisationWithLinkedList()
    {
        shinobi.add("Gara");
        Set<String> nin = new TreeSet<String>(shinobi);
        assertTrue(nin.containsAll(shinobi),"Does not contain shinobi");
    }

    @Test
    void TestAddAll()
    {
        ninja.add("Orichimaru");
        ninja.add("Sarutobi");
        ninja.add("Minato");
        Set<String> leafVillage = new HashSet<String>();
        leafVillage.addAll(ninja);
        assertTrue(ninja.containsAll(ninja),"ninja list was not successfully added to  leafVillage Set");
    }

    @Test
    void testRemove()
    {
        shinobi.add("Naruto");
        shinobi.add("Sakura");
        shinobi.add("Sasuke");
        shinobi.add("Sai");
        shinobi.remove("Sai");

        assertFalse(shinobi.contains("Sai"),"Sai is still there when he shouldn't");
    }

    @Test
    void testRemoveAll()
    {
        shinobi.add("Naruto");
        shinobi.add("Sakura");
        shinobi.add("Sasuke");
        shinobi.add("Sai");

        ninja.addAll(shinobi);
        ninja.add("Gara");
        ninja.add("Jireaya");
        ninja.add("Orichimaru");
        ninja.add("Sakura");

        ninja.removeAll(shinobi);
        assertFalse(ninja.containsAll(shinobi),"ninja still contains elements of shinobi");
    }

    @Test
    void testRetainAll()
    {
        shinobi.add("Naruto");
        shinobi.add("Sakura");
        shinobi.add("Sasuke");
        shinobi.add("Sai");

        ninja.add("Gara");
        ninja.add("Sasuke");
        ninja.add("Naruto");
        ninja.add("Sakura");

        ninja.retainAll(shinobi);
        assertTrue(ninja.contains("Gara"),"It didnt work");

    }

}