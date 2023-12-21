public class PlanetGravity {
    public static double calculateSurfaceGravity(){
        double gravitationalConstant = 6.67 * Math.pow(10,-11);
        double planetMass = 4.869 * Math.pow(10,24);
        double radiusOfPlanetMeters = (12103.6 * 1000) / 2.0;
        double surfaceGravity = (gravitationalConstant*planetMass)/(radiusOfPlanetMeters*radiusOfPlanetMeters);
        return(surfaceGravity);
    }
    public static double printPlanetData(){
        double gravitationalConstant = 6.67 * Math.pow(10,-11);
        double radiusOfPlanetMeters = (12103.6 * 1000) / 2.0;
        double planetMass = 4.869 * Math.pow(10,24);
        double surfaceGravity = calculateSurfaceGravity();
        System.out.println("Planet\tDiameter(km)\tMass(kg)\tg(m/s^2)");
        System.out.println("--------------------------------------------");
        System.out.println("Venus\t"+ radiusOfPlanetMeters + "\t" + planetMass + "\t" + surfaceGravity);
        System.out.println("Universal Gravitational Constant:");
        return(gravitationalConstant);
    }
    public static void main(String [] args){
        double venusNumbers = printPlanetData();
        System.out.println(venusNumbers);
        System.out.println("Surface Gravity on Venus:");
        System.out.println(calculateSurfaceGravity());




    }
}
