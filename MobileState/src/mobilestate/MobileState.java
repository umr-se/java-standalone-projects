package mobilestate;
interface MobileAlertState 
{
    public void alert(AlertStateContext ctx);
} 
class AlertStateContext 
{
    private MobileAlertState currentState;
  
    public AlertStateContext() 
    {
        currentState = new Vibration();
    }
  
    public void setState(MobileAlertState state) 
    {
        currentState = state;
    }
  
    public void alert() 
    {
        currentState.alert(this);
    }
}
class Vibration implements MobileAlertState 
{
    @Override
    public void alert(AlertStateContext ctx) 
    {
         System.out.println("vibration...");
    }  
} 
class Silent implements MobileAlertState
{
    @Override
    public void alert(AlertStateContext ctx) 
    {
        System.out.println("silent...");
    } 
}
public class MobileState {
    public static void main(String[] args) {
         AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
    }
}
