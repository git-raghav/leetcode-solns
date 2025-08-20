// Last updated: 8/20/2025, 10:27:35 PM
class Solution {
    int maxSum=0;


    public int maxSumBST(TreeNode root) {
        dfs(root);
        return maxSum;
        
    }

    private int[] dfs(TreeNode node){
        if(node==null){
            return new int[]{1,Integer.MAX_VALUE,Integer.MIN_VALUE,0};
        }

        int[] left=dfs(node.left);
        int[] right=dfs(node.right);

        //checking if the current subtree is bst or not
        if(left[0]==1 && right[0]==1 && node.val>left[2] && node.val<right[1]){
            int sum=left[3]+right[3]+node.val;
            maxSum=Math.max(maxSum,sum);
            return new int[]{
                1, //isBST
                Math.min(left[1],node.val), //minVal
                Math.max(right[2],node.val), //maxVal
                sum
            };
        }else{
            return new int[]{0,0,0,0}; //not a bst
        }
    }
}