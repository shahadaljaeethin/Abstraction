package Abstract;

import java.util.Scanner;

public class MoveablePoint implements Moveable {
    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MoveablePoint(){}

    public void moveUp(){y+=ySpeed;}
        public void moveDown(){y-=ySpeed;}
        public void moveRight(){x+=xSpeed;}
        public void moveLeft(){x-=xSpeed;}
         //-
        private int x,y,xSpeed,ySpeed;





        public void showMenu(){
            Scanner r = new Scanner(System.in);
        int choice=0;
            while(choice!=5) {
                try{
                System.out.println("x moves "+xSpeed+", while y moves "+ySpeed);
                 System.out.println("choose:\n# move up (1)\n# move down (2)\n move right (3)\nmove left (4)\nchange question (5)");
                 choice=r.nextInt();
                    if(choice==1){moveUp();}
                    if(choice==2){moveDown();}
                    if(choice==3){moveRight();}
                    if(choice==4){moveLeft();}
                    System.out.println("X: "+x+"  Y:"+y);


                }catch (Exception e){}}
        }
    }


