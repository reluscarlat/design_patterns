package adapter;

public class EnemyRobotAdapter implements EnemyAttacker {
    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHand();
    }

    @Override
    public void driveForward() {
        enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String driver) {
        enemyRobot.reactToHuman(driver);
    }
}
