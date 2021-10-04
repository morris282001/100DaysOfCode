static int tilt = 0;
public static int tilt(Node node){
// write your code here to set the tilt data member
if(node == null)
{
return 0;
}
int tl =tilt(node.left);
int tr =tilt(node.right);

int s1= sum(node.left);
int s2= sum(node.right);

int T = Math.abs(s1 -s2);

tilt = T+tl+tr;

return tilt;


}
