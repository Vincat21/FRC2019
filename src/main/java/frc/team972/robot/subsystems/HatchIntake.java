package frc.team972.robot.subsystems;

import frc.team972.robot.loops.ILooper;

public class HatchIntake extends Subsystem {
    private static ExampleSubsystem mInstance = new ExampleSubsystem();

    public void writeToLog() {
    }

    public void readPeriodicInputs() {
    }

    public void writePeriodicOutputs() {
        //System.out.println("Test");
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

    public void registerEnabledLoops(ILooper enabledLooper) {
    }

    public static ExampleSubsystem getInstance() {
        return mInstance;
    }
}
