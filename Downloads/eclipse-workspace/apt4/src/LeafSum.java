import java.util.*;
public class LeafSum {
	private int lsum = 0;
    public int sum(TreeNode t) {
    	return getLeaf(t);
    }
    
    public int getLeaf(TreeNode t) {
    	if (t == null) {
    		return 0;
    	}
        if (t.left == null && t.right == null) {
        	return t.info;
        }
        return getLeaf(t.left) + getLeaf(t.right);
    }
}
