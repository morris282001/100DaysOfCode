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

 
