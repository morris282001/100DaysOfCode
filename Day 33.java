public static int min(Node node) {

if(node.left !=null)
{
return min(node.left);
}
else{
return node.data;
}
}
