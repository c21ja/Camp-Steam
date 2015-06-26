import java.util.Scanner;

public class Player{

    Board board;
    int rowMove;
    int colMove;
    int valMove;

    public Player(Board board){
        this.board = board;
    }

    public int getRowMove(){
        return this.rowMove;
    }

    public int getColMove(){
        return this.colMove;
    }

    public int getValMove(){
        return this.valMove;
    }

    private void checkRow(int row,int col){
        int i=0;
        while (i<9){
          int value=board.getTileAt(row,i).getValue();
          board.getTileAt(row,col).crossOut(value);
          i=i+1;
        }
    }

    private void checkCol(int row,int col){
        int j=0;
        while (j<9){
            int value=board.getTileAt(j,col).getValue();
            board.getTileAt(row,col).crossOut(value);
            j=j+1;
        }
    }

    private void checkBox(int row,int col){
        if(row<3 && row>0 && col<3 && col>0){ /* BOX 1 */
            int r=0;
            while(r<3 && r>0){
                int c=0;
                while(c<3 && c>0){
                    int val=board.getTileAt(r,c).getValue();
                    board.getTileAt(row,col).crossOut(val);
                    c=c+1;
                }
            r=r+1;
            }  
        }
        else if(row<3 && row>0 && col>2 && col<6){ /* BOX 2 */
            int r=0;
            while(r<3){
            int c=3;
            while(c>2&&c<6){
                int val=board.getTileAt(r,c).getValue();
                board.getTileAt(row,col).crossOut(val);

            c=c+1;  
            }   
            r=r+1;
        }       

        }
        else  if(row<3 && row>0 && col>5 && col<9){/*BOX 3*/
            int r=0;
            while(r<3 && r>0){
                int c=6;
                while(c<9 && c>5){
                    int val=board.getTileAt(r,c).getValue();
                    board.getTileAt(row,col).crossOut(val);
                c=c+1;
                }
            r=r+1;
            }
        }
        else if(row>2 && row<6 && col<3 && col>0){/* BOX 4*/
            int r=3;
            while(r<6 && r>2){
                int c=0;
                while(c<3 && c>0){
                    int val=board.getTileAt(r,c).getValue();
                    board.getTileAt(row,col).crossOut(val);
                c=c+1;
                }
            r=r+1;
            }
        }
        else if(row>2 && row<6 && col<6 && col>2){/*BOX 5*/
            int r=3;
            while(r<6 && r>2){
                int c=3;
                while(c<6 && c>2){
                         int val=board.getTileAt(r,c).getValue();
                         board.getTileAt(row,col).crossOut(val);
                     c=c+1;
                }
                r=r+1;
            }
        }
        else if(row>2 && row<6 && col>5 && col<9){/*BOX 6*/
            int r=3;
            while(r<6 && r>2){
                int c=6;
                while(c<9 && c>5){
                    int val=board.getTileAt(r,c).getValue();
                    board.getTileAt(row,col).crossOut(val);
                c=c+1;
                }
            r=r+1;
            }
        }
        else if(row>5 && row<9 && col<3 && col>0){/*BOX 7 */
            int r=6;
            while(r<9 && r>5){
                int c=0;
                while(c<3 && c>0){
                    int val=board.getTileAt(r,c).getValue();
                    board.getTileAt(row,col).crossOut(val);
                c=c+1;
                }
            r=r+1;
            }
        }
        else if(row>5 && col<6 && col>2 && row<9){/* BOX 8 */
            int r=6;
            while(r<9 && r>5){
                int c=3;
                while(c<6 && c>2){
                    int val=board.getTileAt(r,c).getValue();
                    board.getTileAt(row,col).crossOut(val);
                c=c+1;
                }
            r=r+1;
            }
        }
        else if(row>5 && row<9 && col>5 && col<9){/* BOX 9*/
            int r=6;
            while(r<9 && r>5){
                int c=6;
                while(c<9 && c>5){
                    int val=board.getTileAt(r,c).getValue();
                    board.getTileAt(row,col).crossOut(val);
                    c=c+1;
                }
            r=r+1;
            }
        }
    }
    public void computeMove(){
        int r=0;
        while(r<9){
            int c=0;
            while(c<9){
                Tile t=board.getTileAt(r,c);
                if(t.getState()==State.EMPTY){
                    checkRow(r,c);
                    checkCol(r,c);
                    checkBox(r,c);
                    int[]moves=t.getAvailableMoves();
                    int numAvailable=moves.length;
                    if(numAvailable==1){/*easy puzzle means no guessing*/
                        colMove=c;
                        rowMove=r;
                        valMove=moves[0];
                    }
                }
                c++;
            }
            r++;
        } 
    
    }

    public void getMoveFromUser(){
        Scanner s1= new Scanner(System.in);
        rowMove= s1.nextInt();
        colMove= s1.nextInt();
        valMove= s1.nextInt();    



    }
    



}
