public class Trainer {
    String name;

    Trainer(String theName){
        if(theName.length() != 5){
            System.out.println("Input string contains more or less than 5 chars");
            System.exit( 420);
        }
        for(int i = 0; i < theName.length(); i++){
            if (!((theName.charAt(i) >= 'A' && theName.charAt(i) <= 'Z') || (theName.charAt(i) >= 'a' && theName.charAt(i) <= 'z'))){
                System.out.println("Input string contains forbidden characters.");
                System.exit( 420);
            }
        }
        this.name = theName;
    }

    boolean attemptToCatch(Infomon infomon){
        int trainerPoints = 0;
        if (infomon.getType().contains("grass")){
            for(int i = 0; i < name.length(); i++){
                if (((name.charAt(i) >= 'A' && name.charAt(i) <= 'I') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'i'))){
                    trainerPoints++;
                }
            }
        }
        if (infomon.getType().contains("fire")){
            for(int i = 0; i < name.length(); i++){
                if (((name.charAt(i) >= 'J' && name.charAt(i) <= 'R') || (name.charAt(i) >= 'j' && name.charAt(i) <= 'r'))){
                    trainerPoints++;
                }
            }
        }
        if (infomon.getType().contains("water")){
            for(int i = 0; i < name.length(); i++){
                if (((name.charAt(i) >= 'S' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 's' && name.charAt(i) <= 'z'))){
                    trainerPoints++;
                }
            }
        }
        return trainerPoints >= 2;
        }
}
