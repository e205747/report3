package jp.ac.uryukyu.ie.e205747;

/**
 * 戦士クラス。
 * Created by tnal on 2016/11/13.
 * Edited by e205747 on 2020/12/09.
 */
public class Warrior extends Hero {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 戦士名
     * @param maximumHP 戦士のHP
     * @param attack 戦士の攻撃力
     */
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("戦士%sは道半ばで力尽きてしまった。\n", getName());
        }
    }

    /**
     * 攻撃するメソッド。
     * attackの150%を固定ダメージとして与えるメソッド。
     * @param opponent 攻撃対象
     */
    public void attackWithWeponSkill(LivingThing opponent){
        if (!isDead()){
            int damage = (int)(getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}