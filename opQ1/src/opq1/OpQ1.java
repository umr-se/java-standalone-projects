package opq1;
interface IntputStreamInterface{
void convert();
class InputStream{
  }
}
interface OutputSreamInterface{
void convert();
class OutputStream{
  }
}
class IntoStringouttoString implements IntputStreamInterface,OutputSreamInterface{
    public void convert(){
    }
  }  
    public class OpQ1 {
    public static void main(String[] args) {
    IntoStringouttoString myobj = new  IntoStringouttoString();
    myobj.convert(); 
    }
}
