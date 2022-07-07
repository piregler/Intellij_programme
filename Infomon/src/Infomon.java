import java.util.Objects;

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
        int realAttackStat = attackStat;

        if (Objects.equals(type, "fire") && Objects.equals(enemy.type, "water")) {
            realAttackStat *= 0.5;
        } else if (Objects.equals(type, "fire") && Objects.equals(enemy.type, "grass"))  {
            realAttackStat *= 2;
        } else if (Objects.equals(type, "water") && Objects.equals(enemy.type, "fire")) {
            realAttackStat *= 2;
        } else if (Objects.equals(type, "water") && Objects.equals(enemy.type, "grass")) {
            realAttackStat *= 2;
        } else if (Objects.equals(type, "grass") && Objects.equals(enemy.type, "fire")) {
            realAttackStat *= 0.5;
        } else if (Objects.equals(type, "grass") && Objects.equals(enemy.type, "water")) {
            realAttackStat *= 2;
        }
//        System.out.println("real " + realAttackStat);
//        System.out.println(attackStat);
//        System.out.println(enemy.getDefenseStat());

        if (realAttackStat == enemy.defenseStat){
            enemy.transform();
            isStronger(enemy);
        }
//        System.out.println(realAttackStat);
        return (realAttackStat > enemy.defenseStat);
    }

    public boolean isWeaker(Infomon enemy) {
        int realAttackStat = attackStat;

        if (Objects.equals(type, "fire") && Objects.equals(enemy.type, "water")) {
            realAttackStat *= 0.5;
        } else if (Objects.equals(type, "fire") && Objects.equals(enemy.type, "grass"))  {
            realAttackStat *= 2;
        } else if (Objects.equals(type, "water") && Objects.equals(enemy.type, "fire")) {
            realAttackStat *= 2;
        } else if (Objects.equals(type, "water") && Objects.equals(enemy.type, "grass")) {
            realAttackStat *= 2;
        } else if (Objects.equals(type, "grass") && Objects.equals(enemy.type, "fire")) {
            realAttackStat *= 0.5;
        } else if (Objects.equals(type, "grass") && Objects.equals(enemy.type, "water")) {
            realAttackStat *= 2;
        }
//        System.out.println("real " + realAttackStat);
//        System.out.println(attackStat);
//        System.out.println(enemy.getDefenseStat());

        if (realAttackStat == enemy.defenseStat) {
            enemy.transform();
            isWeaker(enemy);
        }
        return (realAttackStat < enemy.defenseStat);
    }

    public void transform(){
//        System.out.println("transform!!!!!");
        if(Objects.equals(type, "fire")){
            attackStat += 300;
            defenseStat += 100;
        }
        else if(Objects.equals(type, "water")) {
            attackStat += 100;
            defenseStat += 300;
        }
        else if(Objects.equals(type, "grass")){
            attackStat += 200;
            defenseStat += 200;
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
