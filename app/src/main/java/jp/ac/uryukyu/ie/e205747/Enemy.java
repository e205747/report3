package jp.ac.uryukyu.ie.e205747;

/**
 * 敵クラス。
 * Created by tnal on 2016/11/13.
 * Edited by e205747 on 2020/12/09.
 */
public class Enemy extends LivingThing{
    /**
     * コンストラクタ。名前、最大HP,攻撃力を指定する。
     * @param name モンスターの名前
     * @param hitPoint モンスターのHP
     * @param attack モンスターの攻撃力
     */
<<<<<<< HEAD
    public Enemy(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
=======
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        
        if (dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.name, damage);
            hero.wounded(damage);
        }
>>>>>>> c9fc302daa26acb7a042ff57e847bf51623701f2
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}
