import utils.SameTree;
import utils.TreeNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SameTreeTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode p = SameTree.stringToTreeNode(line);
            line = in.readLine();
            TreeNode q = SameTree.stringToTreeNode(line);

            boolean ret = new SameTree().isSameTree(p, q);

            String out = SameTree.booleanToString(ret);

            System.out.print(out);
        }
    }
}
