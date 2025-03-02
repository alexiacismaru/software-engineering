import be.kdg.prog22.Chess;

public class Runner {
  public static void main(String[] args) {
      Chess game = Chess.WHITES_TURN; System.out.println(game);
      game = game.whiteMoves(false);System.out.println(game);
      game = game.blackMoves(false);System.out.println(game);
      game = game.whiteMoves(true);System.out.println(game);
      game = game.blackMoves(false);
  }
}
