package SingleTon;
class coffeeMachine{
    private float coffee;
    private float sugar;
    private float water;
    static private coffeeMachine my = null;
    private coffeeMachine(){
        coffee = 5;
        sugar = 10;
        water = 1;
    }
    public void fillWater( float qtr){
        water = qtr;
    }
    public void fillSugar( float qtr){
        sugar = qtr;
    }
    public float getCoffee(){
        return 0.23f;
    }
    static coffeeMachine getInstance(){
        if(my == null)
            my = new coffeeMachine();
        return my;
    }
}
public class singleton {
    public static void main(String[] args) {
        coffeeMachine m1 = coffeeMachine.getInstance();
        coffeeMachine m2 = coffeeMachine.getInstance();
        coffeeMachine m3 = coffeeMachine.getInstance();

        System.out.println(m1 + " "+ m2+" "+m3);
        if(m1 == m2 && m1 == m3)
            System.out.println("same");
    }
}
