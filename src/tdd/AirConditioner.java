package tdd;

public class AirConditioner {
    private boolean power;
    private int temperature;
    
    public void setSwitch(String turn) {
        if(turn == "on")power = true;
        if (turn == "off")power = false;
        
    }

    public boolean getOnOff() {
        return power;
    }

    public void increaseTemperature() {
       if (temperature >= 30)temperature = 30;


    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature < 16)temperature= 16;
        if(temperature > 16)temperature = temperature - 1;

    }

    public void setTemperature(int setTo) {
        temperature =temperature + setTo;
    }




    /*public void setSwitch() {
    }
*/
}
