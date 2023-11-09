package Assignment;

public class JumpingZombie extends Zombie implements Destroyable{
    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (int) (0.3 * health);
        } else if (level == 2) {
            health += (int) (0.4 * health);
        } else if (level == 3) {
            health += (int) (0.5 * health);
        }
    }
    public void destroyed() {
        health -= (int) (health * 0.1);
    }
    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \n" + super.getZombieInfo();
    }
}
