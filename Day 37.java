
public static Node add(Node node, int data) {
// write your code here
if(node == null)
{
Node temp = new Node(data,null,null);
return temp;
}
else if(data < node.data)
{
Node t = add(node.left,data);
node.left = t;
return node;
}
else if( data > node.data)
{
Node t = add(node.right,data);
node.right = t;
return node;
}
else {
return node;
}


}
