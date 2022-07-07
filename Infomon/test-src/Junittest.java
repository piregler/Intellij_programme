import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Junittest {

    private static Infomon fire1;
    private static Infomon fire2;
    private static Infomon grass1;
    private static Infomon grass2;
    private static Infomon water1;
    private static Infomon water2;
    private static Trainer trainer1;
    private static Trainer trainer2;
    private static Trainer trainer3;
    private static Trainer trainer4;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception{
        fire1 = new Infomon("Glumanda", "Fire", 300, 100);
        fire2 = new Infomon("Glumanda", "Fire", 100, 100);
        grass1 = new Infomon("Bisasam", "Grass", 200, 200);
        grass2 = new Infomon("Bisasam", "Grass", 100, 100);
        water1 = new Infomon("Schiggy", "Water", 100, 300);
        water2 = new Infomon("Schiggy", "Water", 100, 100);
        trainer1 = new Trainer("Isaac");
        trainer2 = new Trainer("Jonas");
        trainer3 = new Trainer("Steve");
    }

    @Test
    void getTypeShouldReturnCorrectType() throws Exception{
        assertEquals("Fire type should be returned correctly", "Fire", fire1.getType());
        assertEquals("Water type should be returned correctly", "Water", water1.getType());
        assertEquals("Grass type should be returned correctly", "Grass", grass1.getType());
    }

    @Test
    void negativeValuesShouldGetSetToZero() throws Exception{
        Infomon zero = new Infomon("Zero", "Fire", -200, -500);
        assertEquals("Negative attackStat in the constructor should result in attackStat set to 0.", 0, zero.getAttackStat());
        assertEquals("Negative defenseStat in the constructor should result in attackStat set to 0.", 0, zero.getDefenseStat());
    }

    @Test
    void defaultFireShouldBeStrongerThanDefaultGrass() throws Exception{
        assertTrue("Default fire Infomon should be stronger than default grass Infomon", fire1.isStronger(grass1));
    }

    @Test
    void defaultFireShouldNotBeStrongerThanDefaultWater() throws Exception{
        assertTrue("Default fire Infomon should not be stronger than default water Infomon", fire1.isWeaker(water1));
    }

    @Test
    void fireInfomonWithEqualStatsShouldBeStronger() throws Exception{
        assertTrue("Fire Infomon should be stronger than grass Infomon with same stats", fire2.isStronger(grass2));
    }

    @Test
    void fireInfomonWithEqualStatsShouldBeWeaker() throws Exception{
        assertTrue("Fire Infomon should be weaker than water Infomon with same stats", fire2.isWeaker(water2));
    }

    @Test
    void grassInfomonWithEqualStatsShouldBeStronger() throws Exception{
        assertTrue("Grass Infomon should be stronger than water Infomon with same stats", grass2.isStronger(water2));
    }

    @Test
    void grassInfomonWithEqualStatsShouldBeWeaker() throws Exception{
        assertTrue("Grass Infomon should be weaker than fire Infomon with same stats", grass2.isWeaker(fire2));
    }

    @Test
    void waterInfomonWithEqualStatsShouldBeStronger() throws Exception{
        assertTrue("Water Infomon should be stronger than fire Infomon with same stats", water2.isStronger(fire2));
    }

    @Test
    void waterInfomonWithEqualStatsShouldBeWeaker() throws Exception{
        assertTrue("Water Infomon should be weaker than grass Infomon with same stats", water2.isWeaker(grass2));
    }

    @Test
    void InfomonsWithSameStrengthShouldTransformEnemyInfomon_GrassBonus() throws Exception{
        int baseAttack = 200;
        int baseDefense = 200;
        Infomon grass3 = new Infomon("Endivie", "Grass", baseAttack, baseDefense);
        assertTrue("Two grass Infomons fighting with the same strength should result in transforming the enemy Infomon", grass1.isWeaker(grass3));
        assertEquals("Attack stat should be increased by 200", grass3.getAttackStat(), baseAttack + 200);
        assertEquals("Defense stat should be increased by 200", grass3.getDefenseStat(), baseDefense + 200);
    }

    @Test
    void InfomonsWithSameStrengthShouldTransformEnemyInfomon_FireBonus() throws Exception{
        int baseAttack = 100;
        int baseDefense = 300;
        Infomon fire3 = new Infomon("Feurigel", "Fire", baseAttack, baseDefense);
        assertTrue("Two fire Infomons fighting with the same strength should result in transforming the enemy Infomon", fire1.isWeaker(fire3));
        assertEquals("Attack stat should be increased by 300", fire3.getAttackStat(), baseAttack + 300);
        assertEquals("Defense stat should be increased by 100", fire3.getDefenseStat(), baseDefense + 100);
    }

    @Test
    void InfomonsWithSameStrengthShouldTransformEnemyInfomon_WaterBonus() throws Exception{
        int baseAttack = 300;
        int baseDefense = 100;
        Infomon water3 = new Infomon("Karnimani", "Water", baseAttack, baseDefense);
        assertTrue("Two water Infomons fighting with the same strength should result in transforming the enemy Infomon", water1.isWeaker(water3));
        assertEquals("Attack stat should be increased by 100", water3.getAttackStat(), baseAttack + 100);
        assertEquals("Defense stat should be increased by 300", water3.getDefenseStat(), baseDefense + 300);
    }

    @Test
    void SameStrengthDueToTypeEfficiencyShouldTransformEnemyInfomon_FireBonus() throws Exception{
        int baseAttack = 200;
        int baseDefense = 200;
        Infomon fire4 = new Infomon("Flemmli", "Fire", baseAttack, baseDefense);
        assertTrue("Two Infomons fighting with the same strength due to type efficiency should result in transforming the enemy Infomon", water1.isWeaker(fire4));
        assertEquals("Attack stat should be increased by 300", fire4.getAttackStat(), baseAttack + 300);
        assertEquals("Defense stat should be increased by 100", fire4.getDefenseStat(), baseDefense + 100);
    }

    @Test
    void IsaacCanCatchGrassInfomonsOnly() throws Exception{
        assertTrue("Isaac should be able to catch grass Infomons", trainer1.attemptToCatch(grass1));
        assertFalse("Isaac should not be able to catch fire Infomons", trainer1.attemptToCatch(fire1));
        assertFalse("Isaac should not be able to catch water Infomons", trainer1.attemptToCatch(water1));
    }

    @Test
    void JonasCanCatchFireInfomonsOnly() throws Exception{
        assertFalse("Jonas should not be able to catch grass Infomons", trainer2.attemptToCatch(grass1));
        assertTrue("Jonas should be able to catch fire Infomons", trainer2.attemptToCatch(fire1));
        assertFalse("Jonas should not be able to catch water Infomons", trainer2.attemptToCatch(water1));
    }

    @Test
    void SteveCanCatchWaterAndGrassInfomons() throws Exception{
        assertTrue("Steve should not be able to catch grass Infomons", trainer3.attemptToCatch(grass1));
        assertFalse("Steve should not be able to catch fire Infomons", trainer3.attemptToCatch(fire1));
        assertTrue("Steve should be able to catch water Infomons", trainer3.attemptToCatch(water1));
    }

    @Test
    void calculateYearsShouldReturnCorrectAmountOfYears() throws Exception{
        Halbwertszeit hwz1 = new Halbwertszeit(20);
        Halbwertszeit hwz2 = new Halbwertszeit(30);
        assertEquals("calculateYears should return 100", 100, hwz1.calculateYears(3000));
        assertEquals("calculateYears should return 270", 270, hwz2.calculateYears(30000));
    }

    @Test
    void calculateYearsShouldReturnZeroOnNegativeParameter() throws Exception{
        Halbwertszeit hwz3 = new Halbwertszeit(40);
        assertEquals("calculateYears should return 0 on negative parameter input", 0, hwz3.calculateYears(-400));
    }

}