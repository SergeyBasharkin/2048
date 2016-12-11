package com.victoria;

/**
 * Created by Prog_1 on 11.12.2016.
 */
public class View {
    private Grid grid;

    public View() {
        grid=new Grid();
    }
    public void print(){
        for (int i = 0; i <grid.getCells().length ; i++) {
            for (int j = 0; j <grid.getCells().length ; j++) {
                System.out.print(grid.getCells()[i][j].getValue()+" ");
            }
            System.out.println();
        }
    }
}
