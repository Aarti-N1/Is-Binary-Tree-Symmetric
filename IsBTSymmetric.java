package easy;

import general.TreeNode;

public class IsBTSymmetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean isSymmetric(TreeNode root) {
	        if(root== null)
	            return true;
	        return checkSymmetry(root.left, root.right);
	        
	    }
	    public static boolean checkSymmetry(TreeNode leftSubtree, TreeNode rightSubtree){
	        if(leftSubtree == null && rightSubtree == null){
	            return true;
	        }else if(leftSubtree != null && rightSubtree != null){
	            //check the val
	            if(leftSubtree.val != rightSubtree.val)
	                return false;
	            //checksym for leftSubtree.left with rightSubtree.right
	            //checksym for leftSubtree.right with rightSubtree.left
	            return(checkSymmetry(leftSubtree.left,rightSubtree.right) 
	                   && checkSymmetry(leftSubtree.right,rightSubtree.left));
	        }else{
	            return false;
	        }
	    }
}
