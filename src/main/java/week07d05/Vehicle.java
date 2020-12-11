package week07d05;

public class Vehicle {

    public int getNumberOfGears(){
        return TransmissionType.MANUAL.getGEAR();
    }

    public TransmissionType getTransmissionType(){
        return TransmissionType.MANUAL;
    }


}
