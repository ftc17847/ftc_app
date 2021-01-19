package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name = "DCTest", group = "Test")

public class DCTest extends LinearOpMode {

    Hardware hardware = new Hardware();
    Odometry odometry = new Odometry();
    float MP = 1; //Movement Power Multiplier
    double IP = 1; //Intake Power
    double CP = 1; //conveyor Power
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
    float LT2 = gamepad2.left_trigger;
    float RT2 = gamepad2.right_trigger;
    double p1, p2, p3, p4;

    @Override
    public void runOpMode() {

        hardware.init(hardwareMap);

        waitForStart();

        while(opModeIsActive()) {


            hardware.PowerControl(LSY1 + LT1 - RT1, RSY1 + LT1 - RT1, LSY1 - LT1 + RT1, RSY1 - LT1 + RT1);


            if (AB1) {

                odometry.moveTo(12, 12, 0);

            }

            if (RT2 > 0) {
                hardware.C.setPower(.3);
            }
            else if (AB2){
                hardware.C.setPower(0);
            }


            if (LT2 > 0) {
                hardware.L.setPower(1);
            }
            else {
                hardware.L.setPower(0);
            }

            if (AB2) {

                hardware.I.setPower(1);
                hardware.C.setPower(.3);

            }
            else if (RT2 > 0) {

                hardware.I.setPower(0);

            }

            else {

                hardware.I.setPower(0);
                hardware.C.setPower(0);

            }




        }
    }
}