package interfaces;

public interface IAlarm {
    default String AlarmOn(){
        return "Alarm is on";
    }
    default  String AlarmOff(){
        return "Alarm is off";
    }
}
