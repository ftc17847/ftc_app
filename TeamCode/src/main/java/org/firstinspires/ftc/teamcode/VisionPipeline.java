package org.firstinspires.ftc.teamcode;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.openftc.easyopencv.OpenCvPipeline;

class VisionPipeline extends OpenCvPipeline
{
    @Override
    public Mat processFrame(Mat input)
    {
        return input;
    }
}
