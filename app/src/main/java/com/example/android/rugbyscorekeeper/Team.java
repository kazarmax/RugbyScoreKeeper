package com.example.android.rugbyscorekeeper;

public class Team {

    private static final int TRY_POINTS = 5;
    private static final int CONVERSION_POINTS = 2;
    private static final int PENALTY_POINTS = 3;
    private static final int DROP_GOAL_POINTS = 3;

    private final int scoreTextViewId;
    private final int tryCountTextViewId;
    private final int conversionCountTextViewId;
    private final int penaltyCountTextViewId;
    private final int dropGoalCountTextViewId;

    private int score = 0;
    private int tryCount = 0;
    private int conversionCount = 0;
    private int penaltyCount = 0;
    private int dropGoalCount = 0;

    public Team(int scoreTextViewId, int tryCountTextViewId, int conversionCountTextViewId,
                int penaltyCountTextViewId, int dropGoalCountTextViewId) {
        this.scoreTextViewId = scoreTextViewId;
        this.tryCountTextViewId = tryCountTextViewId;
        this.conversionCountTextViewId = conversionCountTextViewId;
        this.penaltyCountTextViewId = penaltyCountTextViewId;
        this.dropGoalCountTextViewId = dropGoalCountTextViewId;
    }

    public int getScoreTextViewId() {
        return scoreTextViewId;
    }

    public int getTryCountTextViewId() {
        return tryCountTextViewId;
    }

    public int getConversionCountTextViewId() {
        return conversionCountTextViewId;
    }

    public int getPenaltyCountTextViewId() {
        return penaltyCountTextViewId;
    }

    public int getDropGoalCountTextViewId() {
        return dropGoalCountTextViewId;
    }

    public int getScore() {
        return score;
    }

    public int getTryCount() {
        return tryCount;
    }

    public int getConversionCount() {
        return conversionCount;
    }

    public int getPenaltyCount() {
        return penaltyCount;
    }

    public int getDropGoalCount() {
        return dropGoalCount;
    }

    public void incrementTryCount() {
        tryCount++;
        score += TRY_POINTS;
    }

    public void incrementConversionCount() {
        conversionCount++;
        score += CONVERSION_POINTS;
    }

    public void incrementPenaltyCount() {
        penaltyCount++;
        score += PENALTY_POINTS;
    }

    public void incrementDropGoalCount() {
        dropGoalCount++;
        score += DROP_GOAL_POINTS;
    }

    public void resetScores() {
        score = 0;
        tryCount = 0;
        conversionCount = 0;
        penaltyCount = 0;
        dropGoalCount = 0;
    }

}
