package com.company;

import java.io.*;
import java.util.*;

public class CountryLeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            in.nextLine();
            List<String> names = new ArrayList<String>();
            for (int j = 0; j < n; ++j) {
                names.add(in.nextLine());
            }
//            System.out.println(names);
            System.out.println("Case #" + i + ": " + findLeader(names));
        }

    }

    public static String findLeader(List<String> names) {
        String leader = "";
        int maxCount = 0;

        for (String name : names) {
            String current = name.replaceAll(" ","");;
            char[] charArr = current.toCharArray();
            int counter = 0;
            Map<Character, Boolean> charMap = new HashMap<Character, Boolean>();

            for (Character ch : charArr) {
                if (charMap.containsKey(ch))  {
                    continue;
                } else {
                    charMap.put(ch, true);
                    counter++;
                }
            }

            if (maxCount < counter) {
                leader = name;
                maxCount = counter;
            }
        }

        return leader;
    }
}
