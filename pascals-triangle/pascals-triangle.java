class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
        
        List<Integer> previous= null;
        
        for(int i=0;i<numRows;++i){
            
            List<Integer> inner= new ArrayList<>();
            
            for(int j=0;j<=i;++j){
                
                if(j==0 || j==i){
                    inner.add(1);
                }else{
                    inner.add(previous.get(j-1)+previous.get(j));
                }
                
            }
            
            previous = inner;
            outer.add(inner);
        }
        
        return outer;
    }
}