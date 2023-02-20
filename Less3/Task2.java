/**
 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке.
 */

package Less3;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Юпитер");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Юпитер");

        ArrayList<String> uniquePlanets = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        countRepeats(planets, uniquePlanets, counts);
        printPlanetsCounts(uniquePlanets, counts);
    }

    private static void countRepeats(ArrayList<String> planets, ArrayList<String> uniquePlanets,
    ArrayList<Integer> counts){
        for (String planet : planets) {
            int pos = uniquePlanets.indexOf(planet);
            if(pos >= 0){
                counts.set(pos, counts.get(pos) + 1);
            }
            else{
                uniquePlanets.add(planet);
                counts.add(1);

            }
        }
    }

    private static void printPlanetsCounts(ArrayList<String> uniquePlanets,ArrayList<Integer> counts){
        for (int i = 0; i < uniquePlanets.size(); i++) {
            System.out.printf("%10s,%3d\n",uniquePlanets.get(i), counts.get(i));
    
            
        }
    }
}
