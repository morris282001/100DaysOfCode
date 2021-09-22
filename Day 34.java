public static boolean find(Node node, int data){

if(node == null)
{
return false;
}
else if(data < node.data)
{
return find(node.left, data);

}
else if(data > node.data)
{
return find(node.right, data);

}
else{
return true;
}

}

