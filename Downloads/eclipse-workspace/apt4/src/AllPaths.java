import java.util.*;
public class AllPaths {
	List<String> paths = new ArrayList<String>();
    public String[] paths(TreeNode t) {
    	if (t != null) {
    		doPaths(t, "");
    	}
    	Collections.sort(paths);
    	return paths.toArray(new String [0]);
    }
    public void doPaths(TreeNode root, String path) {
    	if (root == null) {
    		return;
    	}
    	if (root.left == null && root.right == null) {
    		path += root.info;
    		paths.add(path);
    	}
    	path = path + root.info + "->";
    	doPaths(root.left, path);
    	doPaths(root.right, path);
    }
}
