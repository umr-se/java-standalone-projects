package opq3;
interface LcmInterface{
void commonnumber();
}
interface GcdInterface{
void commonnumber();
}
class Gcdlcm implements LcmInterface, GcdInterface{
public void commonnumber(){
 int x = 12, y = 8, gcd = 1;   
for(int i = 1; i <= x && i <= y; i++)  
{    
if(x%i==0 && y%i==0)   
gcd = i;  
}    
System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
 }

 {
  int n1 = 72, n2 = 120, lcm;
    lcm = (n1 > n2) ? n1 : n2;
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
 }
}
public class OpQ3 {
    public static void main(String[] args) {
    Gcdlcm g = new Gcdlcm();
    g.commonnumber();
    }
    
}
