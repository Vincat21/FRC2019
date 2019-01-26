package frc.team972.robot.subsystems.controller;

import jeigen.DenseMatrix;

public class ElevatorGains {
    public static DenseMatrix first_stage_gain_A = new DenseMatrix("1.0 0.004791236347425109 5.181376400930422e-05; 0.0 0.917673229771176 0.020432962307718957; 0.0 0.0 1.0");
    public static DenseMatrix first_stage_gain_B = new DenseMatrix("5.181376400930422e-05; 0.020432962307718957; 0.0");
    public static DenseMatrix first_stage_gain_C = new DenseMatrix("1.0 0.0 0.0");
    public static DenseMatrix first_stage_gain_D = new DenseMatrix("0.0");

    public static DenseMatrix first_stage_gain_K_ = new DenseMatrix("16.41399515492959 -0.04285978261048596 1.0");
    public static DenseMatrix first_stage_gain_Kff_ = new DenseMatrix("0.0 48.94052976460639 0.0");

    public static DenseMatrix first_stage_gain_L = new DenseMatrix("0.46742789528315815; 14.840398277521956; 104.89633760328563");
}
