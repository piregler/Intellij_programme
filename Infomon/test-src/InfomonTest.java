import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfomonTest {

    @Test
    void isStronger() {
        Infomon g = new Infomon("Glumanda", "fire", 100, 100);
        Infomon s = new Infomon("Schiggy", "water", 100, 100);
        boolean stronger = s.isStronger(g);
        Assert.assertTrue(stronger);
    }

    @Test
    void isWeaker() {
        Infomon g = new Infomon("Glumanda", "fire", 100, 100);
        Infomon s = new Infomon("Schiggy", "water", 100, 100);
        boolean weaker = g.isWeaker(s);
        Assert.assertTrue(weaker);
    }

    @Test
    void transform() {
        Infomon k = new Infomon("Kapardor", "water", 100, 100);
        Infomon s = new Infomon("Schiggy", "water", 100, 100);
        k.isStronger(s);
        int testAttack = s.getAttackStat();
        Assert.assertEquals("Testing if transform is functioning.", testAttack, 300);
        int testDefense = s.getDefenseStat();
        Assert.assertEquals("Testing if transform is functioning.", testDefense, 300);
    }

    @Test
    void getType() {
        Infomon v = new Infomon("Schiggy", "water", 100, 100);
        String testType = v.getType();
        Assert.assertSame("Testing if getType is functioning.", testType, "water");
    }

    @Test
    void getAttackStat() {
        Infomon v = new Infomon("Schiggy", "water", 100, 100);
        int testAttack = v.getAttackStat();
        Assert.assertEquals("Testing if getAttack is functioning.", testAttack, 100);
        Infomon b = new Infomon("Schiggy", "water", -100, 100);
        int testAttack2 = b.getAttackStat();
        Assert.assertEquals("Testing if getAttack is functioning.", testAttack2, 0);
    }

    @Test
    void getDefenseStat() {
        Infomon v = new Infomon("Schiggy", "water", 100, 100);
        int testDefense = v.getDefenseStat();
        Assert.assertEquals("Testing if getDefense is functioning.", testDefense, 100);
    }
}