// package Chapter8;
//
//public class Time {
//    private int hour;
//    private int minute;
//    private int second;
//
//    public void setTime(int hour, int minute, int second){
//        validate(hour, minute, second);
//
//
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//
//        public Time(int hour, int minute, int second) {
//            validate(hour,minute,second);
//
//            this.hour = hour;
//            this.minute = minute;
//            this.second = second;
//
//    }
//       public Time () {
//            this(hour:0, minute:0, second:0)
//        }
//
//        }
//        public Time(int second){
//            validateSecondsWith(second);
//            this.second = 0;
//        }
//        public Time(int minute, int second) {
//            this.hour = 0;
//            this.minute = minute;
//            this.second = second;
//        }
//    private void validate(int hour, int minute, int second){
//        validate(hour,minute,second);
//
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//
//    }
////    public double calculateTakeHomePay(double basicSalary){
////        double takeHomePay = basicSalary;
////        final double TEN_PERCENT = 10 / (100 * 1.0);
////        double transportAllowance = TEN_PERCENT * basicSalary;
////        final double THREE_PERCENT = 0.03;
////        double feedingAllowance = THREE_PERCENT * basicSalary;
////        takeHomePay += feedingAllowance;
////        final double TWO_PERCENT = 0.02;
////        double tax = TEN_PERCENT * basicSalary;
////        takeHomePay -= tax;
////        return takeHomePay;
//
//    private void validateHourWith(int hour) {
//        boolean hourIsInvalid = hour < 0 || hour >= 24;
//        if(hourIsInvalid) throw new IllegalArgumentException("Invalid hour");
//
//
//
//    }
//    private void validateMInuteWith(int minute){
//        boolean minuteIsValid = minute < 0 || minute >= 60;
//        if(minuteIsValid) throw new IllegalArgumentException("Invalid minute");
//
//    }
//    private void validateSecondWith(int second){
//        boolean secondIsValid = second < 0 || second >= 60;
//        if(secondIsValid) throw new IllegalArgumentException("Invalid seconds");
//
//    }
//}
//
