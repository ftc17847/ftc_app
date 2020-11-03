package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;



public class Hardware {

    //drive motors
    public DcMotor DM1;
    public DcMotor DM2;
    public DcMotor DM3;
    public DcMotor DM4;

    //Launcher motors
    public DcMotor L1;
    public DcMotor L2;

    //Intake motor
    public DcMotor I;

    //Internal convayer motor
    public DcMotor C;

    //if we need (cr)servos
    //public CRServo ;

    //public Servo ;

    HardwareMap hardwareMap;

    public Hardware() {

    }

    public void init(HardwareMap hardwareMap) {


        DM1 = this.hardwareMap.get(DcMotor.class, "DM1");
        DM2 = this.hardwareMap.get(DcMotor.class, "DM2");
        DM3 = this.hardwareMap.get(DcMotor.class, "DM3");
        DM4 = this.hardwareMap.get(DcMotor.class, "DM4");

        L1 = this.hardwareMap.get(DcMotor.class, "L1");
        L2 = this.hardwareMap.get(DcMotor.class, "L2");

        I = this.hardwareMap.get(DcMotor.class, "I");

        C = this.hardwareMap.get(DcMotor.class, "I");

        //name = this.hardwareMap.get(CRServo.class, "name");

        //name = this.hardwareMap.get(Servo.class, "name");
        //name.setPosition(Position);

        DM1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        DM2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        DM3.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        DM4.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        DM2.setDirection(DcMotor.Direction.REVERSE);
        DM4.setDirection(DcMotor.Direction.REVERSE);


        L1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        L2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        L1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        L2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        I.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        C.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        DM1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DM2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DM3.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        DM4.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        L1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        L2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        I.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        C.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    public void PowerControl(double p1, double p2, double p3, double p4) {

        DM1.setPower(p1);
        DM2.setPower(p2);
        DM3.setPower(p3);
        DM4.setPower(p4);

    }
}