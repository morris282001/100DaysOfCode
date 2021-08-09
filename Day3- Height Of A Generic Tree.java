ublic static int height(Node node) {
  
    int h= -1;
    
    for(Node child : node.children)
    {
        int ch= height(child); 
        h= Math.max(h,ch);
        
    }
    
    return h+1;
    
  }
