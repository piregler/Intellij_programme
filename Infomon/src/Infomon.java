public class Infomon {
    String name;
    String type;
    int attackStat;
    int defenseStat;

    Infomon(String theName, String theType,int theAttackStat, int theDefenseStat){
        this.name = theName;
        this.type = theType;
        this.attackStat = Math.max(theAttackStat, 0);
        this.defenseStat = Math.max(theDefenseStat,0);
    }

    public boolean isStronger(Infomon enemy){
        //TODO implement isStronger
        //TODO start with comparing the types
        int realAttackStat = attackStat;

        if(type.contains("fire") && enemy.type.contains("water")){
            realAttackStat *= 0.5;
        }
        else if(type.contains("fire") && enemy.type.contains("plant")){
            realAttackStat *= 2;
        }
        else if(type.contains("water") && enemy.type.contains("fire")){
            realAttackStat *= 2;
        }
        else if(type.contains("water") && enemy.type.contains("plant")){
            realAttackStat *= 2;
        }
        else if(type.contains("plant") && enemy.type.contains("fire")){
            realAttackStat *= 0.5;
        }
        else if(type.contains("plant") && enemy.type.contains("water")){
            realAttackStat *= 2;
        }
//        System.out.println("real " + realAttackStat);
//        System.out.println(attackStat);
//        System.out.println(enemy.getDefenseStat());

        if (realAttackStat == enemy.defenseStat){
            System.out.println("H");
            //TODO transform
            enemy.transform();
            isStronger(enemy);
        }
//        System.out.println(realAttackStat);
        return (realAttackStat > enemy.defenseStat);
    }

    public boolean isWeaker(Infomon enemy){
        //TODO  the same as is stronger, why should I do it that way??
        //just negate isStronger?
        //TODO round up or down or make the enemy stronger instead of weakening your pokemon??
        int realDefenseStat = getDefenseStat();
        if(type.contains("fire") && enemy.type.contains("water")){
            realDefenseStat *= 0.5;
        }
        else if(type.contains("fire") && enemy.type.contains("plant")){
            realDefenseStat *= 2;
        }
        else if(type.contains("water") && enemy.type.contains("fire")){
            realDefenseStat *= 2;
        }
        else if(type.contains("water") && enemy.type.contains("plant")){
            realDefenseStat *= 0.5;
        }
        else if(type.contains("plant") && enemy.type.contains("fire")){
            realDefenseStat *= 0.5;
        }
        else if(type.contains("plant") && enemy.type.contains("water")){
            realDefenseStat *= 2;
        }

        if (realDefenseStat == enemy.attackStat){
            //TODO transform
            enemy.transform();
            isStronger(enemy);
        }
        return (realDefenseStat < enemy.attackStat);
    }

    public void transform(){
        System.out.println("transform!!!!!");
        //TODO implement transform
        if(type.contains("fire")){
            attackStat += 300;
            defenseStat += 100;
        }
        else if(type.contains("water")) {
            attackStat += 200;
            defenseStat += 200;
        }
        else{
            attackStat += 100;
            defenseStat += 300;
        }


    }

    public String getType() {
        return type;
    }
    public int getAttackStat(){
        return attackStat;
    }
    public int getDefenseStat(){
        return defenseStat;
    }
}
