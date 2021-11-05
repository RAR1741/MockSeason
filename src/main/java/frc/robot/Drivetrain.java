package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class Drivetrain {

    DriveModule left, right;

    Drivetrain(DriveModule left, DriveModule right){
        this.left= left;
        this.right = right;
    }

    public void tankDrive(double leftPower, double rightPower){
        left.setPower(leftPower);
        right.setPower(rightPower);
    }
}
