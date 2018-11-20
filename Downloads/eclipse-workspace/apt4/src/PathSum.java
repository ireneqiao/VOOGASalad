import java.util.*;
public class PathSum {
	private ArrayList<Integer> sums = new ArrayList<Integer>();
    public int hasPath(int target, TreeNode tree){
        pathSums(tree, 0);
        if(sums.contains(target)) {
        	return 1;
        }
        return 0;
    }
    public int pathSums(TreeNode tree, int sum) {
    	if (tree == null) {
    		sums.add(sum);
    		return 0;
    	}
    	sum += tree.info;
    	return pathSums(tree.left, sum) + pathSums(tree.right, sum);
    }
}
