public class Power {
    boolean power = false;

    public void setPower(boolean b) {
        this.power=b;
    }

    public void power(){
        System.out.println(power ? "온" : "오프");
    }
}
