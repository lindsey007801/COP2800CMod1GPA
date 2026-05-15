// PalmerPenguins.java
// Lindsey Diamond
// 5/15/2026
// This program introduces the palmer penguins

public class PalmerPenguins {

    // constants to represent the species names & number of species
    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";
   
    static final int TOTAL_SPECIES = 3;
   
    public static void main(String[] args) {
   
        // outputs an introduction of the species and how many there are
        System.out.println("Introducing the Palmer Penguins: ");
        System.out.println("\t" + SP_CHINSTRAP + "!");
        System.out.println("\t" + SP_GENTOO + "!");
        System.out.println("and last but not least...");
        System.out.println("\t" + SP_ADELIE + "!");
        System.out.println("There are a total of " + TOTAL_SPECIES + 
                           " penguin species in this dataset.");
   
   }
}