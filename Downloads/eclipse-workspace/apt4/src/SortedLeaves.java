import java.util.*;
public class SortedLeaves {
	private String[] chars;
	private int index = 0;
	  public String[] values(TreeNode tree) {
		  chars = new String[findNumLeaves(tree)];
		  if (tree.left == null && tree.right == null) {
			  char letter = tree.info;
			  chars[index] = String.valueOf(letter);
			  index++;
		  }
		  if (index == chars.length-1) {
			  Arrays.asList(chars);
			  Arrays.sort(chars);
			  return chars;
		  }
		  return values(tree.left) + values(tree.right);
		  
	  }
	  public int findNumLeaves(TreeNode tree) {
		  if (tree.left == null && tree.right == null) {
			  return 1;
		  }
		  return findNumLeaves(tree.left) + findNumLeaves(tree.right);  
	  }
}
