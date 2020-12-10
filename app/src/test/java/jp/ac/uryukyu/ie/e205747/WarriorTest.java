package jp.ac.uryukyu.ie.e205747;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * Warriorクラスからオブジェクトを生成する。
     * attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する。
     */
    @Test
    void attackWithWarriorSkillTest() {
        int defaultWarriorAttack = 100;
        int preEnemyHitPoint;
        Warrior demoWarrior = new Warrior("デモ戦士", 450, defaultWarriorAttack);
        Enemy demoEnemy = new Enemy("スライムもどき", 450, 100);
        for(int i = 0; i < 3; i++){
            preEnemyHitPoint = demoEnemy.getHitPoint();
            demoWarrior.attackWithWeponSkill(demoEnemy);
            demoEnemy.attack(demoWarrior);
            assertEquals(preEnemyHitPoint - demoEnemy.getHitPoint(), (int)(defaultWarriorAttack * 1.5) );

        }
    
    }
}
