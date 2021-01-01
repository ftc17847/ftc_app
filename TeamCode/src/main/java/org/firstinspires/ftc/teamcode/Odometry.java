
package org.firstinspires.ftc.teamcode;

public class Odometry {

    public void updateLocation(double e1, double e2, double e3) {


        double wheelDiameter = 2.3622; //inches
        double ticksPerRotation = 2048; //if this doesn't work then it's probably 8192
        double distancePerRotation = wheelDiameter * Math.PI;
        double de1,de2,de3;
        double d1 = 1; // Distance From Center
        double d2 = 1;
        double d3 = 1;
        double cx, cy, ca;
        Hardware hardware = new Hardware();
        double[] gp = hardware.getGlobalPos();
        double x = gp[0];
        double y = gp[1];
        double a = gp[2];

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

        hardware.setGlobalPos(x, y, a);

    }

}
