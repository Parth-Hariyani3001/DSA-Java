public class Interfaces {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
    }
}

//interface
interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    //need to compulsory implement the methods from interface
    //give it public as moves() is public in interface
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all direction)");
    }
}

class Rook implements chessPlayer{
    //need to compulsory implement the methods from interface
    //give it public as moves() is public in interface
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer{
    //need to compulsory implement the methods from interface
    //give it public as moves() is public in interface
    public void moves(){
        System.out.println("up, down, left, right, diagonal(by one step)");
    }
}