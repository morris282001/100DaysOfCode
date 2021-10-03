public static int diameter1(Node node) {
// write your code here
int d1= depth(node.left);
int d2 = depth(node.right);

return d1+d2+2;
}

public static int depth(Node node)
{
if(node == null)
{
return -1;
}
int h1 = depth(node.left);
int h2 = depth(node.right);

int h3 = Math.max(h1,h2);

return h3+1;
}
