/**
 * Created by Zalisekile on 2017/03/26.
 */
import java.util.*;

public class Lists
{
    public static void main(String[] args)
    {
        Collection<String> shinobi = new ArrayList<String>();
        shinobi.add("Naruto");
        shinobi.add("Sakura");
        shinobi.add("Sasuke");
        shinobi.remove("Sakura");

        List<String> sensei = new LinkedList<String>();
        sensei.add("Jiraya");
        sensei.add("Orichimaru");
        sensei.add("Tsunade");

        Set<String> ninjas = new TreeSet<String>(sensei);
        ninjas.addAll(shinobi);


        Set<String> leafVillage = new HashSet<String>(ninjas);
        leafVillage.add("Tsunade");
        leafVillage.removeAll(sensei);

        System.out.println(leafVillage);

    }
}
