public static int size(Node node) {
    
   if(node== null)
   {
       return 0; 
   }
   int s1=size(node.left);
   int s2=size(node.right);
   int s3= s1+s2+1;
   return s3;
  }

  public static int sum(Node node) {
    
    if(node == null)
    {
        return 0;
    }
    int s1= sum(node.left);
    int s2= sum(node.right);
    int s3= s1+s2+node.data;
    return s3;
  }

  public static int max(Node node) {
    
    if(node == null)
    {
        return 0;
        
    }
    int m1 = max(node.left);
    int m2 = max(node.right);
    int m3 = Math.max(m1,m2);
    int m4= Math.max(m3,node.data);
    return m4;
  }

  public static int height(Node node) {
   
    if(node == null)
    {
        return -1;
        
    }
    int h1 = height(node.left);
    int h2= height(node.right);
    
    int h3 = Math.max(h1,h2);
    return h3+1;
  }
