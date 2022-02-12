class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top =0, left =0, bottom = matrix.length -1, right = matrix[0].length -1;
        List<Integer> outputList = new ArrayList<Integer>();
        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                outputList.add(matrix[top][i]);                
            }
            top++;
            for(int i=top; i<=bottom; i++){
                outputList.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    outputList.add(matrix[bottom][i]);
                }
                bottom--;
            
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    outputList.add(matrix[i][left]);
                }
                left++;
            }
        }
        return outputList;
        
    }
}
