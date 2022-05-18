package arda.week08.switchcase;

public class LearningSwitchCase {
    private enum ARDA_STATE {
        IDLE,
        CODE,
        PROCRASTINATE,
        PLAY_GAMES,
    }

    private int tick;
    private ARDA_STATE currentState = ARDA_STATE.IDLE;

    public void simulateArdaDay() {
        --tick;
        switch (currentState) {
            case IDLE:
                if (tick <= 0) {
                    currentState = ARDA_STATE.PROCRASTINATE;
                    tick = 10;
                }
                System.out.println("Arda is doing nothing.");
                break;

            case CODE:
                if (tick <= 0) {
                    currentState = ARDA_STATE.IDLE;
                    tick = 3;
                }
                System.out.println("Arda is coding magnificently.");
                break;

            case PROCRASTINATE:
                if (tick <= 0) {
                    currentState = ARDA_STATE.CODE;
                    tick = 1;
                }
                System.out.println("Arda is procrastinating.");
                break;
        }
    }
}
