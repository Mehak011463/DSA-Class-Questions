class Solution {


    public void dfsHelper(int[][] image , int row , int col , int c , int nc){
        int rows = image.length;
        int cols = image[0].length;
        if(row>=rows || row<0 || col>=cols || col<0){
            return;

        }
        if(image[row][col]!=c){
            return;
        }
        image[row][col]=nc;
        dfsHelper(image,row+1,col,c,nc);
        dfsHelper(image,row-1,col,c,nc);
        dfsHelper(image,row,col+1,c,nc);
        dfsHelper(image,row,col-1,c,nc);
    }

    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int c= image[sr][sc];
        if(c==color){
            return image;
        }
        dfsHelper(image,sr,sc,c,color);
        return image;
        
    }

}