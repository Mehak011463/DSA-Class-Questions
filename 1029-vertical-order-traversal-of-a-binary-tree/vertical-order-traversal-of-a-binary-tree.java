/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple curr = q.poll();
            TreeNode node = curr.node;
            int row = curr.row;
            int col = curr.col;
            map.putIfAbsent(col,new TreeMap<>());
            map.get(col).putIfAbsent(row,new PriorityQueue<>());
            map.get(col).get(row).add(node.val);
            if(node.left!=null){
                q.add(new Tuple(node.left,row+1,col-1));
            }
            if(node.right!=null){
                q.add(new Tuple(node.right,row+1,col+1));
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> col : map.values()){
            List<Integer> vertical = new ArrayList<>();
            for(PriorityQueue<Integer> nodes : col.values()){
                while(!nodes.isEmpty()){
                    vertical.add(nodes.poll());
                }
            }
            ans.add(vertical);
        }
        return ans;

        
    }

}
class Tuple{
    TreeNode node;
    int row;
    int col;
    Tuple(TreeNode node , int row , int col){
        this.node=node;
        this.row=row;
        this.col=col;
    }
}