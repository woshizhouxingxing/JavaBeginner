package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


/*
思路
标签：深度优先遍历

终止条件与返回值：

当两棵树的当前节点都为 null 时返回 true

当其中一个为 null 另一个不为 null 时返回 false

当两个都不为空但是值不相等时，返回 false

执行过程：当满足终止条件时进行返回，不满足时分别判断左子树和右子树是否相同，其中要注意代码中的短路效应

时间复杂度：O(n)O(n)，nn 为树的节点个数

代码

 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

/**
 * 解法二
 */
//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if (isSameNode(p, q)) {
//            boolean result=true;
//            if (hasNextNode(p, 0) && hasNextNode(q, 0)) {
//                result=result&&isSameTree(p.left, q.left);
//            }
//            if (hasNextNode(p, 1) && hasNextNode(q, 1)) {
//                result=result&&isSameTree(p.right, q.right);
//            }
//            return result;
//        }else{
//            return false;
//        }
//
//
//
//    }
//
//    boolean isSameNode(TreeNode p, TreeNode q) {
//        if (p == null && q == null) {
//            return true;
//        }
//        if (p == null ^ q == null) {
//            return false;
//        }
//        if (p.val != q.val) {
//            return false;
//        }
//        if (hasNextNode(p, 0) != hasNextNode(q, 0)) {
//            return false;
//        }
//        if (hasNextNode(p, 1) != hasNextNode(q, 1)) {
//            return false;
//        }
//        return true;
//    }
//
//    boolean hasNextNode(TreeNode p, int n) {
//        try {
//            if (n == 0) {
//                return null != p.left;
//            } else {
//                return null != p.right;
//            }
//        }catch (Exception e){
//            return false;
//        }
//
//    }
//}

public class SameTree {
    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!"null".equals(item)) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode p = stringToTreeNode(line);
            line = in.readLine();
            TreeNode q = stringToTreeNode(line);

            boolean ret = new Solution().isSameTree(p, q);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}


// * Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
