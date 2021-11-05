package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class DriveModule {

    TalonFX motor1, motor2;

    DriveModule(TalonFX motor1, TalonFX motor2) {
        this.motor1 = motor1;
        this.motor2 = motor2;

        motor1.setNeutralMode(NeutralMode.Brake);
        motor1.setNeutralMode(NeutralMode.Brake);
    }

    public void setPower(double power){
        motor1.set(ControlMode.PercentOutput, power);
        motor2.set(ControlMode.PercentOutput, power);
    }

}
