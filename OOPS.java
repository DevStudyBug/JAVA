//java oops basics class and objects 
class lamp {
    boolean isOn;
    void turnOn(){
        isOn=true;
        System.out.println("the light is on"+isOn);
    }
    void turnOff(){
        isOn=false;
        System.out.println("the light is off"+isOn);
    }
    
}

class Main{
    public static void main(String[] agrs){
    lamp led = new lamp();
    lamp halogene = new lamp();
    led.turnOn();
    halogene.turnOff();
    
}
}
