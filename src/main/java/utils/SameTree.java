package utils;

import java.util.LinkedList;
import java.util.Queue;

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
            if (!"null".equals(item)) {
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

    /**
     * 思路
     * 标签：深度优先遍历
     * <p>
     * 终止条件与返回值：
     * <p>
     * 当两棵树的当前节点都为 null 时返回 true
     * <p>
     * 当其中一个为 null 另一个不为 null 时返回 false
     * <p>
     * 当两个都不为空但是值不相等时，返回 false
     * <p>
     * 执行过程：当满足终止条件时进行返回，不满足时分别判断左子树和右子树是否相同，其中要注意代码中的短路效应
     * <p>
     * 时间复杂度：O(n)O(n)，nn 为树的节点个数
     * <p>
     * 代码
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result = false;
        if (p == null && q == null) {
            result = true;
        } else if (p != null && q != null) {
            if (p.val == q.val) {
                result = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }
        return result;
    }

}





