package oops;

public class interfacess {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface chessplayer {
    void moves();
}
class Queen implements chessplayer {
    public void moves() {
        System.out.println("up,down,right,left,diagonal");
    }
}
class Rook implements chessplayer {
    public void moves() {
        System.out.println("up,down,right,left");
    }
}
class King implements chessplayer {
    public void moves() {
        System.out.println("up,down");
    }
}