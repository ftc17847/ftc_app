package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Movement Test", group = "Test")

public class DCTest2 extends LinearOpMode {

    Hardware hardware = new Hardware();
    Odometry odometry = new Odometry();
    float MP = 1; //Movement Power
    float IP = 1; //Intake Power
    float CP = 1; //conveyor Power
    float LP = 1; //Launcher Power
    //I think that the x or y direction of each switch might have to be made negative
    float LSX1 = gamepad1.left_stick_x;
    float LSY1 = gamepad1.left_stick_y;
    float RSX1 = gamepad1.right_stick_x;
    float RSY1 = gamepad1.right_stick_y;
    boolean AB1 = gamepad1.a;
    boolean BB1 = gamepad1.b;
    boolean XB1 = gamepad1.x;
    boolean YB1 = gamepad1.y;
    float LT1 = gamepad1.left_trigger;
    float RT1 = gamepad1.right_trigger;
    boolean AB2 = gamepad2.a;
    boolean BB2 = gamepad2.b;
    boolean XB2 = gamepad2.x;
    boolean YB2 = gamepad2.y;
    int a = 1;
    boolean b = false;
    int c = 1;
    boolean d = false;
    int e = 1;
    boolean f = false;

    double p1, p2, p3, p4;

    @Override
    public void runOpMode() {

        hardware.init(hardwareMap);

        waitForStart();

        while(opModeIsActive()) {

            p1 = (LSY1 + LSX1 + RT1 - LT1) * MP;
            p2 = (LSY1 + LSX1 + LT1 - RT1) * MP;
            p3 = (LSY1 - LSX1 + RT1 - LT1) * MP;
            p4 = (LSY1 - LSX1 + LT1 - RT1) * MP;

            //this might not be necessary
            if (p1 > 1) {p1 = 1;}
            if (p1 < -1) {p1 = -1;}
            if (p2 > 1) {p1 = 1;}
            if (p2 < -1) {p1 = -1;}
            if (p3 > 1) {p1 = 1;}
            if (p3 < -1) {p1 = -1;}
            if (p4 > 1) {p1 = 1;}
            if (p4 < -1) {p1 = -1;}

            hardware.PowerControl(p1, p2, p3, p4);

        }


    }

}
