 public static void linearize(Node node){
   
    for(Node child : node.children)
  {
      linearize(child);
  }
while(node.children.size()>1)
{
    Node l = node.children.remove(node.children.size()-1);
    Node sl = node.children.get(node.children.size()-1);
    
    Node tail= getTail(sl);
    tail.children.add(l);
}
  
    
  }
  private static Node getTail(Node node)
  {
      while(node.children.size()>0)
      {
          node= node.children.get(0);
      }
      return node;
      
  }
