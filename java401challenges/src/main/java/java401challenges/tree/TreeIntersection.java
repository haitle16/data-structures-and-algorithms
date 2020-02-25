package java401challenges.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeIntersection {


    public static Integer[] preOrder(Node node) {
        List<Integer> result = new ArrayList<>();
        if(node != null) {
            result.add(node.value); // Root
            result.addAll(Arrays.asList(preOrder(node.left))); // Left
            result.addAll(Arrays.asList(preOrder(node.right))); // Right
        }
        return result.toArray(new Integer[result.size()]);
    }

    public static List<Integer> tree_intersection(Node tree1, Node tree2) {
        Integer[] list1 = preOrder(tree1);
        Integer[] list2 = preOrder(tree2);
//        Integer[] data = new Integer[]{};
        List<Integer> data = new ArrayList<>();
        for(int i = 0; i < list1.length; i++) {
            if(Arrays.asList(list2).contains(list1[i])) {
                System.out.println("If list2 contains list 1 at index");
                data.add(list1[i]);
            }
        }
        return data;


    }


}
