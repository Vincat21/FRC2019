package frc.team972.robot.teleop;

import edu.wpi.first.wpilibj.Joystick;
import frc.team972.robot.subsystems.DriveSubsystem;
import frc.team972.robot.subsystems.ElevatorSubsystem;
import frc.team972.robot.subsystems.ExampleSubsystem;

import frc.team972.robot.subsystems.WristSubsystem;
import frc.team972.robot.util.MecanumHelper;

public class TeleopManager {
    private static TeleopManager mInstance = null;

    private DriveSubsystem mDrive = DriveSubsystem.getInstance();
    private ElevatorSubsystem mElevator = ElevatorSubsystem.getInstance();
    private ExampleSubsystem mExample = ExampleSubsystem.getInstance();
  
    private ControlBoard controlBoard = ControlBoard.getInstance();
    Joystick stick = new Joystick(3);

    public static TeleopManager getInstance() {
        if (mInstance == null) {
            mInstance = new TeleopManager();
        }
        return mInstance;
    }

    public void update() {

        mDrive.setOpenLoopMecanum(
                MecanumHelper.mecanumDrive(-controlBoard.getTranslateX(), controlBoard.getTranslateY(), controlBoard.getRotate(), controlBoard.getNoFieldOrient())
        );

        //mExample.setDesiredVoltage(controlBoard.getExampleJoystickValue());

        /*
        double wrist_goal = 0;
        if(stick.getRawButton(6)) {
            wrist_goal = Math.PI;
        } else if(stick.getRawButton(5)) {
            wrist_goal = Math.PI / 2;
        }

        WristSubsystem.getInstance().setWrist_goal_pos(wrist_goal);
        */
    }
}
