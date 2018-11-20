
public class FullComplete {
    public TreeNode create(int n) {
    	if (n == 1) {
    		return new TreeNode(2, null, null);
    	}
    	return new TreeNode(2, create(n - 1), create(n - 1));
    }
}
