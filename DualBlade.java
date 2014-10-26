public class DualBlade extends Character{
    int armor;
    int stamina;
    double damage;
    //methods
    public DualBlade(String n){
        name = n;
        armor = 5;
        def *= armor;
        stamina = 100;
        hp = 200;
    }
    public String toString(){
        String s = "";
        s += "Name:" + name + " " + "HP:" + hp + " " + "Strength:" + str + " "  + "Defense:" + def + " "  + "Attack rating:" + atk + " ";
        s += "Armor:" + armor + " Stamina:" + stamina;
        return s;
    }
    //attacks
    public long charge(Character c){
        System.out.println("The DualBlade will charge directly at the opponent, dealing physical damage based on str and atk stats");
        if (stamina > 5){
            damage = (str + atk)*1.5 - c.def;
            stamina -= 5;
            c.hp += damage;
            if (c.hp < 0){
                c.hp = 0;
            }
        }
        else{
            System.out.println("You don't have enough stamina for that!");
            //damage = 0;
        }
        System.out.println(damage);
        return Math.round(damage);
    }
    public long slash(Character c){
        System.out.println("The DualBlade will slash the opponent with both its swords, dealing physical damage based on str and atk stats");
        if (stamina > 10){
            damage = (str + atk)*1.75 - c.def;
            stamina -= 10;
            c.hp += damage;
            if (c.hp < 0){
                c.hp = 0;
            }
        }
        else{
            System.out.println("You don't have enough stamina for that!");
            //damage = 0;
        }
        System.out.println(damage);
        return Math.round(damage);
    }
    public long LeapStrike(Character c){
        System.out.println("The DualBlade will slash the opponent from above with a huge leap that ignores the enemy's defense, dealing physical damage based on str and atk stats");
        if (stamina > 20){
            damage = (str + atk)*2.5;
            stamina -= 10;
            c.hp += damage;
            if (c.hp < 0){
                c.hp = 0;
            }
        }
        else{
            System.out.println("You don't have enough stamina for that!");
            //damage = 0;
        }
        System.out.println(damage);
        return Math.round(damage);
    }
    public static void main(String[] args){
        DualBlade w = new DualBlade("Mickey");
        System.out.println(w);
        DualBlade d = new DualBlade("Mouse");
        System.out.println(d);
        d.charge(w);
        d.attack(w);
        System.out.println(w);
    }
}
