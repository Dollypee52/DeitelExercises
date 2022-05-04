package Chapter8;

public enum Region {
    NE("Ajegunle", "Ikeja","Abuja"),
    SE("VI","BI"),
    SW("Mushin","Ketu","Ipaja"),
    NC("Ibadan","Ekiti","Ijebu"),
    SS("Sabo","Bariga","Somolu"),
    NW("Challenge","Molete","Mowe");



    private String[] states;

     Region(String... states) {
        this.states = states;
    }

}
