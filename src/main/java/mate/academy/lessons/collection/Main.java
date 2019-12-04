package mate.academy.lessons.collection;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String, TreeMap<String, Integer>> map = new TreeMap<>();

        while (in.hasNextLine()) {
            String s = in.nextLine();
            if (s.isEmpty()) break;
            String[] ss = s.split(" ");
            String name = ss[0];
            String sername = ss[1];
            String tov = ss[2];
            String pay = ss[3];
            String nameSerName = name + " " + sername;

            add(map, nameSerName, tov, pay);

        }


        for (String name : map.keySet()) {
            System.out.println(name + ":");

            TreeMap<String, Integer> map2 = map.get(name);

            for (String s : map2.keySet()) {
                System.out.println("    " + s +" " + map2.get(s));
            }

        }
    }

    public static void add(TreeMap<String, TreeMap<String, Integer>> map, String nameSerName, String tov, String pay) {
        if (map.containsKey(nameSerName)) {
            TreeMap<String, Integer> map2 = map.get(nameSerName);

            if (map2.containsKey(tov)) {
                Integer cena = Integer.parseInt(pay);
                   Integer d =  map2.get(tov) + cena;
                   map2.put(tov, d);

            } else {
                Integer cena = Integer.parseInt(pay);
                map2.put(tov, cena);
            }
        } else {
            TreeMap<String, Integer> treeMap = new TreeMap<>();
            Integer cena = Integer.parseInt(pay);
            treeMap.put(tov, cena);
            map.put(nameSerName, treeMap);
        }
    }
}