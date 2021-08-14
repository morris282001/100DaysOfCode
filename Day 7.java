public static void levelOrderLinewise(Node node){
    
    Queue<Node> q = new ArrayDeque<>();
    Queue<Node> c = new ArrayDeque<>();
    q.add(node);
    System.out.println(node.data);
while(q.size()>0)
{
    while(q.size()>0)
    {
   node=  q.remove();
   for(Node child : node.children)
   {
       c.add(child);
       
   }
    }
    
   if(c.size()>0)
   {
   while(c.size()>0)
   {
       q.add(c.element());
       System.out.print(c.element().data+" ");
       
       c.remove();
   }
   System.out.println();
   }
