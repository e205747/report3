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
    public Enemy(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
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
