package be.kdg.prog22;


/**
 * @author Jan de Rijke.
 */
public enum Chess {
    START,
    WHITES_TURN,
    BLACKS_TURN,
    END;

    public Chess whiteMoves(boolean checkMate) {
        if (this == START ||this == WHITES_TURN)
            return checkMate ? END : BLACKS_TURN;
        throw new IllegalStateException("whiteMoves not allowed in state " + this);
    }

    public Chess blackMoves(boolean checkMate) {
        if (this == BLACKS_TURN)
            return checkMate ? END : WHITES_TURN;
        throw new IllegalStateException("blackMoves not allowed in state " + this);
    }
}
