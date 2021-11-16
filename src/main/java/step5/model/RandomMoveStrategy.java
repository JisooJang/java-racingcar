package step5.model;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy {

    private static Random randomGenerator = new Random();
    private static final int RAND_MAX = 10;
    private static final int MOVE_STANDARD = 4;

    @Override
    public Position move(Position position) {
        if (randomGenerator.nextInt(RAND_MAX) > MOVE_STANDARD) {
            return position.increase();
        }
        return position;
    }
}
