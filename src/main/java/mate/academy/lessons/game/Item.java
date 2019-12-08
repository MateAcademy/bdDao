package mate.academy.lessons.game;

import java.util.ArrayList;
import java.util.Random;

public class Item {                //предмет
    int price, weight, type;

    public Item(int price, int weight, int type) {
        this.price = price;
        this.weight = weight;
        this.type = type;
    }
}

class Enemy {                                   //враг
    int hp, damage;        // наносить ущерб, урон
    int exp;

    public Enemy(int hp, int damage, int exp) {
        this.hp = hp;
        this.damage = damage;
        this.exp = exp;
    }
}

abstract class Hero { //герой игры:

    protected String nickName;
    protected int s, a, i, exp, hp, mana; // сила ловкость интеллект опыт здоровье мана
    protected int x, y; // координаты героя на карте
    protected ArrayList<Item> items = new ArrayList<>(); // список поднятых предметов
    protected int damage; // урон

    public int getMana() {
        return mana;
    }

    public int getDamage() {
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public void goToCursor(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public abstract void attack(Enemy enemy); // этот метод должнен быть определен в классах наследниках

    //Механика метода attack - герой всегда наносит удар первым, потом ждет удара от цели и так до гибели кого
    // либо из атакующих. В случае убийства цели (здоровье цели упало до 0 или ниже) - цель удар не наносит.
    // В этом случае герой приобретает опыт цели. Каждые 500 единиц опыта герой получает новый уровень и это
    // влияет на его характеристике в соответствии с описанием ниже. Если цель убивает героя необходимо вывести
    // в консоль "Ваш герой был убит"

    //оборона, в методе defense прописывается логика получения урона (заблокировать/уклониться/поглотить)
    public abstract void defense(Enemy enemy);// этот метод должнен быть определен в классах наследниках

    public void openItem(Item item) {
        Random r = new Random();
        if (r.nextInt(100) % 2 == 0) items.add(item);
        // метод должен добавлять предмет в список с вероятностью 50 %
        // для осуществления вероятностных процессов можно использовать случайное число от 0 до 100.
    }
}

class Warrior extends Hero {  //воин
    public Warrior() {
        //базовые значение
        hp = 500;
        mana = 10;
        s = 100;
        a = 50;
        i = 1;
        exp = 0;
        damage = 150;
    }

    public void setExp(int exp1) {
        this.exp = exp1;

        if (this.exp >= 500) {
            exp = exp - 500;
            hp += 200;
            mana += 10;
            s += 10;
            a += 10;
            i += 11;
            exp += 10;
            damage += 20;
        }
    }

    @Override
    public void defense(Enemy enemy) { //оборона
        Random r = new Random();
        int rr = r.nextInt(10);

        if (rr >= 0 && rr <= 3) {
            hp = hp - enemy.damage;
        }
    }

    @Override
    public void attack(Enemy enemy) {
        for (Item i : items) {
            if (i.type == 1) {
                damage += 100;
            }
        }

        while (hp > 0 && enemy.hp > 0) {
            enemy.hp = enemy.hp - damage;
            if (enemy.hp <= 0) {
                setExp(enemy.exp);
            }

            defense(enemy);
            if (hp <= 0) System.out.println("Ваш герой был убит");
        }
    }
}
    /*
    Воин имеет больший запас здоровья при создании, больший урон с руки, возможность атаковать при помощи предмета.

    класс должен обладать всеми свойствами героя при создании воин должен обладать следующими характеристиками:
    здоровье - 500, мана - 10, сила - 100, ловкость - 50, интеллект - 1, опыт 0, урон - 150. При атаке герой наносит цели урон
    и получает урон в ответ от цели, действия повторяются пока кто то не победит. В случае победы герой получает опыт цели, каждые
    500 единиц опыта герой получает новый уровень. Новый уровень дает +10 ко всем характеристикам, +200 здоровья и +20 урона.
        Если воин имеет предмет 1 типа, к его урону добавляется 100.
    Уже мертвая цель - урона герою не наносит!!!
    */


class Archer extends Hero {  //лучник
    public Archer() {
        //базовые значение
        hp = 200;
        mana = 50;
        s = 20;
        a = 150;
        i = 30;
        exp = 0;
        damage = 200;
    }

    public void setExp(int exp1) {
        this.exp = exp1;

        if (this.exp >= 500) {
            exp = exp - 500;
            hp += 50;
            mana += 10;
            s += 10;
            a += 30;
            i += 10;
            exp += 10;
            damage += 50;
        }
    }

    @Override
    public void defense(Enemy enemy) { //оборона
        Random r = new Random();
        int rr = r.nextInt(10);

        if (rr >= 0 && rr <= 3) {
            hp = hp - enemy.damage;
        }
    }

    @Override
    public void attack(Enemy enemy) {
        for (Item i : items) {
            if (i.type == 1) {
                damage += 100;
            }
        }

        while (hp > 0 && enemy.hp > 0) {
            enemy.hp = enemy.hp - damage;
            if (enemy.hp <= 0) {
                setExp(enemy.exp);
            }

            defense(enemy);
            if (hp <= 0) System.out.println("Ваш герой был убит");
        }
    }
}
    /*
    Лучник - имеет лук при создании и способен атаковать на расстоянии. Лучник имеет возможность избежать урон при атаке и умеет открывать любые замки.

    класс должен обладать всеми свойствами героя при создании лучник должен обладать следующими характеристиками: здоровье - 200, мана - 50,
    сила - 20, ловкость - 150, интеллект - 30, опыт 0, урон - 200.
    атака по аналогии с воином, но в процессе атаки лучник имеет 30% шанс избежать урон лучник всегда открывает предмет - 100%
    Новый уровень дает +10 ко всем характеристикам, +50 здоровья и +50 урона и 30 ловкости.
    */

class Magician extends Hero {  //маг
    public Magician() {
        //базовые значение
        hp = 100;
        mana = 5000;
        s = 5;
        a = 30;
        i = 300;
        exp = 0;
        damage = 40;
    }

    private ArrayList<Item> casts = new ArrayList<>();

    /*
    Маг имеет больший запас маны при создании и способен атаковать на расстоянии. Маг имеет возможность произносить заклинания из списка. Маг имеет возможность изучать заклинания в случае нахождения свитка соответствующего заклинания.

    класс должен обладать всеми свойствами героя при создании маг должен обладать следующими характеристиками: здоровье - 100,
    мана - 5000, сила - 5, ловкость - 30, интеллект - 300, опыт 0, урон - 40.
    атака по аналогии с воином
    помимо обычной атаки, маг имеет возможность бить заклинанием в процессе атаки
    защита мага осуществляется магическим щитом, который полгащает весь урон, но вместо здоровья тратит ману. Новый уровень дает +10 ко всем характеристикам, +30 здоровья, 1000 маны и +10 урона.
    В случае возможности убить врага с руки - маг бьет с руки!!! в Первую очередь
    */
    public void makeCast(Enemy enemy) {
        // если в списке есть заклятия можно его произнести потратив 100 маны и нанеся 1000 урона цели.
        //TODO:           // после произнесения предмет из списка пропадает
        if (items.isEmpty() == false) {
            mana = mana - 100;
            enemy.hp = enemy.hp - 1000;
        }
    }

    public void eduCast(Item item) {
                /* 
                если предмет или предметы из списка имеют тип 2, это заклинания и их нужно добавить в список 
заклинаний мага
                */

        if (item.type == 2) items.add(item);
    }

    public void setExp(int exp1) {
        this.exp = exp1;

        if (this.exp >= 500) {
            exp = exp - 500;
            hp += 50;
            mana += 10;
            s += 10;
            a += 30;
            i += 10;
            exp += 10;
            damage += 50;
        }
    }

    @Override
    public void defense(Enemy enemy) { //оборона
        Random r = new Random();
        int rr = r.nextInt(10);

        if (rr >= 0 && rr <= 3) {
            hp = hp - enemy.damage;
        }
    }

    @Override
    public void attack(Enemy enemy) {
        for (Item i : items) {
            if (i.type == 1) {
                damage += 100;
            }
        }

        while (hp > 0 && enemy.hp > 0) {
            enemy.hp = enemy.hp - damage;
            if (enemy.hp <= 0) {
                setExp(enemy.exp);
            }

            defense(enemy);
            if (hp <= 0) System.out.println("Ваш герой был убит");
        }
    }
}

//class Item{
//    int price, weight, type;
//    public Item(int price, int weight, int type){
//        this.price = price;
//        this.weight = weight;
//        this.type = type;
//    }
//}
//
//class Enemy{
//    int hp, damage;
//    int exp;
//    public Enemy(int hp, int damage, int exp){
//        this.hp = hp;
//        this.damage = damage;
//        this.exp = exp;
//    }
//}
//
//abstract class Hero{
//
//    protected String nickName;
//    protected int s, a, i, exp, hp, mana; // сила ловкость интеллект опыт здоровье мана
//    protected int x, y; // координаты героя на карте
//    protected ArrayList<Item> items = new ArrayList<>(); // список поднятых предметов
//    protected int damage; // урон
//
//    public int getMana(){
//        return mana;
//    }
//    public int getDamage(){
//        return damage;
//    }
//    public int getHp(){
//        return hp;
//    }
//    public void goToCursor(int xx, int yy){
//        x = xx; y = yy;
//    }
//
//    public abstract void attack(Enemy enemy); // этот метод должнен быть определен в классах наследниках
//
//    public abstract void defense(Enemy enemy);// этот метод должнен быть определен в классах наследниках
//
//    public void openItem(Item item){
//        // метод должен добавлять предмет в список с вероятностью 50 %
//        // для осуществления вероятностных процессов можно использовать случайное число от 0 до 100.
//    }
//}
//
//class Warrior{
//    public Warrior(){
//        //базовые значение
//    }
//            /*
//класс должен обладать всеми свойствами героя при создании воин должен обладать следующими характеристиками:
// здоровье - 500, мана - 10, сила - 100, ловкость - 50, интеллект - 1, опыт 0, урон - 150. При атаке герой наносит цели урон и получает урон в ответ от цели, действия повторяются пока кто то не победит. В случае победы герой получает опыт цели, каждые 500 единиц опыта герой получает новый уровень. Новый уровень дает +10 ко всем характеристикам, +200 здоровья и +20 урона.Если воин имеет предмет 1 типа, к его урону добавляется 100.
//            Уже мертвая цель - урона герою не наносит!!!
//            */
//}
//
//class Archer{
//    public Archer(){
//        //базовые значение
//    }
//            /*
//                класс должен обладать всеми свойствами героя при создании лучник должен обладать следующими характеристиками: здоровье - 200, мана - 50, сила - 20, ловкость - 150, интеллект - 30, опыт 0, урон - 200.
//            атака по аналогии с воином, но в процессе атаки лучник имеет 30% шанс избежать урон
//            лучник всегда открывает предмет - 100%
//            Новый уровень дает +10 ко всем характеристикам, +50 здоровья и +50 урона и 30 ловкости.
//            */
//}
//
//class Magician{
//    public Magician(){
//        //базовые значение
//    }
//    private ArrayList<Item> casts = new ArrayList<>();
//    /*
//        класс должен обладать всеми свойствами героя при создании маг должен обладать следующими характеристиками: здоровье - 100, мана - 5000, сила - 5, ловкость - 30, интеллект - 300, опыт 0, урон - 40.
//    атака по аналогии с воином
//    помимо обычной атаки, маг имеет возможность бить заклинанием в процессе атаки
//    защита мага осуществляется магическим щитом, который полгащает весь урон, но вместо здоровья тратит ману. Новый уровень дает +10 ко всем характеристикам, +30 здоровья, 1000 маны и +10 урона.
//    В случае возможности убить врага с руки - маг бьет с руки!!! в Первую очередь
//    */
//    public void makeCast(Enemy enemy){
//        // если в списке есть заклятия можно его произнести потратив 100 маны и нанеся 1000 урона цели.
//        // после произнесения предмет из списка пропадает
//    }
//
//    public void eduCast(Item item){
//                /*
//                если предмет или предметы из списка имеют тип 2, это заклинания и их нужно добавить в список
//заклинаний мага
//                */
//    }
//
//}