package tddClass;

public class Bike {
    private boolean power;
    private int gearType;

    
    public void setBikePower(String status) {
        if (status == "on") power = true;
        if (status == "off") power = false;
    }

    public boolean getBikePower() {
        return power;



    }

    public void Speed1()
    { gearType = gearType + 1;
    }

    public int getSpeed() {
        return gearType;
    }

    public void Speed2() {
        gearType = gearType + 2;
    }

    public void Speed3() {
        gearType = gearType + 3;
    }

    public void Speed4() {
        gearType = gearType + 4;
    }

    public void limitSpeed4() {
        gearType = gearType - 4;
    }

    public void limitSpeed3() {
        gearType = gearType - 3;
    }

    public void limitSpeed2() {
        gearType = gearType - 2;
    }

    public void limitSpeed1() {
        gearType = gearType - 1;
    }

    public int getLimitSpeed() {
        return gearType;
    }

}

