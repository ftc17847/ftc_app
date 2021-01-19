package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name = "VisionTest", group = "Test")
public class VisionTest extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        Hardware r = new Hardware();

        Odometry o = new Odometry();

        r.startVision();

        waitForStart();
        runtime.reset();

        telemetry.addData("RingAmount", r.ringAmount());
        telemetry.update();



    }
}