package frc.team972.robot.subsystems;

import frc.team972.robot.loops.ILooper;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class HatchIntakeSubsystem extends Subsystem {

    private static HatchIntakeSubsystem mInstance = new HatchIntakeSubsystem();
    private DoubleSolenoid mIntakeSolenoid;
    private boolean desiredSolenoidState = false;
    private int quickIntakeOuttakeTimer = 100;
    private int quickTimer2 = 100;

    public void writeToLog() {
    }

    public void slowPeriodic() {
        if(desiredSolenoidState) { // if true, we wish to set solenoid to the open position to eject
            mIntakeSolenoid.set(DoubleSolenoid.Value.kForward);
        } else { // if false, we want to retract the solenoid to retract our piston and prepare for another intake
            mIntakeSolenoid.set(DoubleSolenoid.Value.kReverse);
        }
    }

    public boolean checkSystem() {
        return true;
    }

    public void outputTelemetry() {

    }

    public void stop() {
    }

    public void zeroSensors() {
    }

    public void setIntakeReady() {
        desiredSolenoidState = false;
    }

    public void setInstanceEject() {
        desiredSolenoidState = true;
    }

    public static HatchIntakeSubsystem getInstance() {
        return mInstance;
    }
    //quick intake activated with a press of a button(alignment not included);
    public static void quickIntake(){
        if(desiredSolenoidState){
            mIntakeSolenoid.set(DoubleSolenoid.Value.kReverse);
            if(quickIntakeTimer != 0) {
                quickIntakeOuttakeTimer--;
            }
            if(quickIntakeTimer == 0){
                Drive(-1, -1);
                quickTimer --;
            }
            if(quickTimer == 0){
                quickIntakeOuttakeTimer = 100;
            }
        }
    }
    //quick intake but outtake-ized
    public static void quickOuttake(){
        if(!desiredSolenoidState){
            mIntakeSolenoid.set(DoubleSolenoid.Value.kForward);
            if(quickIntakeTimer != 0) {
                quickIntakeOuttakeTimer--;
            }
            if(quickIntakeTimer == 0){
                Drive(-1, -1);
                quickTimer --;
            }
            if(quickTimer == 0){
                quickIntakeOuttakeTimer = 100;
            }
        }
    }
}
