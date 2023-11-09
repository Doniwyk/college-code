package Assignment;

public class WalkingZombie extends Zombie implements Destroyable{
    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (int) (0.2 * health);
        } else if (level == 2) {
            health += (int) (0.3 * health);
        } else if (level == 3) {
            health += (int) (0.4 * health);
        }
    }
    public void destroyed() {
        health -= (int) (health * 0.2);
    }
    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \n" + super.getZombieInfo();
    }
}
