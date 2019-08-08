package home.ylitvinenko;

public class HowGoodAreYouReally {
    public static void main(String[] args) {
//  int [] naMasse = {10,20,30};

    betterThanAverage(new int[] {10,20,30,40,50,60,70},19);
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {


        boolean result = false;
        int iter = 0;
        int average = 0;
           int sumOfMarks = 0;
           for (int i = 0; i<classPoints.length; i++)
           {
               sumOfMarks+= classPoints[i] ;
               iter +=1;
              // System.out.println(iter);
           }
             average = sumOfMarks/iter;
        if (average<yourPoints)

            result = true ;
        System.out.println(result);
         return  result;

    }
}
