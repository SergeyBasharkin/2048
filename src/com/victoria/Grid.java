package com.victoria;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Prog_1 on 11.12.2016.
 */
public class Grid implements IGrid{
    private Cell[][] cells=new Cell[4][4];

    public Grid() {
        for (int i = 0; i <cells.length ; i++) {
            for (int j = 0; j <cells.length; j++) {
                cells[i][j]=new Cell();
                cells[i][j].setValue(0);
            }
        }
        initRandomValues();
    }

    private void initRandomValues() {
        Random random=new Random();
        int x=random.nextInt(4);
        int y=random.nextInt(4);
        cells[x][y].setValue(RandomHelper.getValue());
        int x1=random.nextInt(4);
        int y1=random.nextInt(4);
        while (x==x1&&y==y1) {
            x1=random.nextInt(4);
            y1=random.nextInt(4);
        }
        cells[x1][y1].setValue(RandomHelper.getValue());
    }

    public Cell[][] getCells() {
        return cells;
    }

    @Override
    public void merge(int x, int y, int x1, int y1) {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }
}
