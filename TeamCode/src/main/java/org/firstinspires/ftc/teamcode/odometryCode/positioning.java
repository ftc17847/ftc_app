package org.firstinspires.ftc.teamcode.odometryCode;

public class positioning {

    public static void updateLocation(double e1, double e2, double e3, double x, double y, double a) {


        double wheelDiameter = 6; //cm
        double ticksPerRotation = 1000;
        double distancePerRotation = wheelDiameter * Math.PI;
        double de1,de2,de3;
        double d1 = 1; // Distance From Center
        double d2 = 1;
        double d3 = 1;
        double cx, cy, ca;


        //convert to distance

        de1 = distancePerRotation / (ticksPerRotation / e1);
        de2 = distancePerRotation / (ticksPerRotation / e2);
        de3 = distancePerRotation / (ticksPerRotation / e3);


        //find angle

        ca = (de1 - de2) / (d1 + d2);


        //it might happen

        if (ca == 0) {

            cx = de3;
            cy = de2;

        }

        //update global positions

        else {

            cx = 2 * Math.sin(ca / 2) * ((de3 / ca) + d3);
            cy = 2 * Math.sin(ca / 2) * ((de2 / ca) + d2);

        }

        double z = Math.hypot(cx, cy);
        a = a + Math.toDegrees(ca/2);
        x = x + (z * Math.cos(Math.toRadians(a)));
        y = y + (z * Math.sin(Math.toRadians(a)));



    }

}
