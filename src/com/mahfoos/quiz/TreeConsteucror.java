package com.mahfoos.quiz;

import java.util.*;

public class TreeConsteucror {


        public static String TreeConsteucror(String[] strArr) {
            Set<String> children = new HashSet<>();
            Map<String, Integer> parents = new HashMap<>();

            for (String node : strArr) {
                String[] values = node.replaceAll("[^0-9,]", "").split(",");
                children.add(values[0]);
                Integer count = parents.get(values[1]);

                if (count != null && count + 1 > 2) {
                    return "false";
                } else {
                    parents.put(values[1], (count == null ? 1 : ++count));
                }
            }
            return "" + (children.size() == strArr.length);
        }

        public static void main (String[] args) {
            // keep this function call here
//            Scanner s = new Scanner(System.in);
//            System.out.print(TreeConstructor(s.nextLine()));
            System.out.print(TreeConsteucror(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));
        }

    }

