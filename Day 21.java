public static void levelOrder(Node node) {

// remove print and add algorithm
Queue q = new ArrayDeque<>();
q.add(node);
while(q.size()>0)
{
int count = q.size();
for(int i=0;i {
node = q.remove();
System.out.print(node.data+" ");

if(node.left != null)
{
q.add(node.left);
}
if(node.right != null)
{
q.add(node.right);
}
}
System.out.println();
}


}

