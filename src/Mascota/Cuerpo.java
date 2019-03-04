package Mascota;

import GeoBasica.PoligonoGrafico;
import GeoBasica.Punto;
import GeoFiguras.MultiDibujable;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Cuerpo extends PoligonoGrafico {
    public Cuerpo() {
        super(
                new Punto[]{
                        new Punto(161.16628, 88.460391),
                        new Punto(156.861420092, 90.4226032289),
                        new Punto(152.433915304, 92.0875215809),
                        new Punto(147.902212131, 93.4453765692),
                        new Punto(143.284244793, 94.4731799935),
                        new Punto(138.600278452, 95.1312441579),
                        new Punto(133.875213736, 95.356385081),
                        new Punto(129.156459259, 95.0494289896),
                        new Punto(124.53323, 94.058892),
                        new Punto(120.413787072, 92.2978546365),
                        new Punto(116.875575563, 89.5621400205),
                        new Punto(114.344972543, 85.8782841995),
                        new Punto(113.04974, 81.597533),
                        new Punto(110.693584297, 79.4458175244),
                        new Punto(107.97824, 77.8277),
                        new Punto(103.988292093, 77.8323923776),
                        new Punto(100.01593917, 78.2777626858),
                        new Punto(96.0390540125, 78.6706957211),
                        new Punto(92.116472, 78.152872),
                        new Punto(96.0440376595, 76.4241942316),
                        new Punto(99.776905, 74.309629),
                        new Punto(101.55339, 70.25371),
                        new Punto(97.2762944449, 69.9070005039),
                        new Punto(92.939867696, 70.2988689267),
                        new Punto(88.608059, 70.19382),
                        new Punto(87.345621, 67.977997),
                        new Punto(89.778818333, 64.8131026845),
                        new Punto(93.6131959943, 63.4273715139),
                        new Punto(97.6454308426, 62.7180240279),
                        new Punto(101.688015227, 62.05585142),
                        new Punto(105.67897, 61.14513),
                        new Punto(108.453556412, 61.147444705),
                        new Punto(111.14976, 61.896424),
                        new Punto(113.167227196, 62.4171345001),
                        new Punto(114.908222076, 64.4798469474),
                        new Punto(117.618320512, 68.5239425219),
                        new Punto(121.40647, 71.473767),
                        new Punto(126.235327365, 72.5444398782),
                        new Punto(131.146388667, 73.1573847766),
                        new Punto(136.079364805, 73.55086769),
                        new Punto(141.018708598, 73.868141115),
                        new Punto(145.955990323, 74.2211959662),
                        new Punto(150.878268687, 74.725889494),
                        new Punto(155.75983, 75.538118),
                        new Punto(159.797761705, 77.3778961513),
                        new Punto(163.513418228, 79.8463392598),
                        new Punto(167.38223275, 82.0620644042),
                        new Punto(171.48639, 83.801495),
                        new Punto(176.288139019, 84.8868822965),
                        new Punto(181.192893454, 85.3851311915),
                        new Punto(186.114245286, 85.6975942204),
                        new Punto(191.025339604, 86.1297518881),
                        new Punto(195.26731, 88.069929),
                        new Punto(190.744300884, 88.1178453739),
                        new Punto(186.220050842, 88.1657748941),
                        new Punto(181.695554773, 88.2137070207),
                        new Punto(177.172711931, 88.2616216331),
                        new Punto(172.64791, 88.309557),
                        new Punto(168.820704126, 88.3598349458),
                        new Punto(164.993515583, 88.4101126639),
                        new Punto(161.16628, 88.460391),
                }, 
                // Color.decode("#009898")
//                new GradientPaint(20, 0, Color.green, // Gradiente
//                        0, 20, Color.decode("#009898"), true));
                new Color(0, 152, 152, 100) // Verde
        ); 
    }
}
