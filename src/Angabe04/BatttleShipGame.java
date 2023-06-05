package Angabe04;

public class BatttleShipGame {
    int[][] map = {
            {1,0,0,2,0,0,1,1,0,0},
            {3,0,-1,0,0,0,2,0,-1,0},
            {0,3,0,0,-1,0,0,2,0,0},
            {0,0,0,4,4,0,1,0,0,2},
            {0,-3,2,0,0,0,-1,0,0,0},
            {0,0,-2,0,0,-4,0,0,-1,0},
            {0,0,0,0,-3,0,0,0,0,0},
            {0,0,-2,0,-2,0,0,-2,0,0}
    };

    //Feld zeichnen
    public  void displayField(){
        for (int[] a : map) {
            for(int b : a){
                if (b >= 0){
                    System.out.print(b+"   ");
                } else {
                    System.out.print(b+"  ");
                }
            }
            System.out.println();
        }
    }

    public int battleShipStrength(char player){
        return 0; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }

    public int countBattleShips(){
        return 0; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }

    public int[] countOfShipsPerLine(){
        int[] count = {0}; //Nur pro forma damit kein Fehler angezeigt wird
        return count;
    }

    public int totalShipsA(){
        return 0; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }

    public double averageShipStrengthPlayerA(){
        return 0; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }
}
