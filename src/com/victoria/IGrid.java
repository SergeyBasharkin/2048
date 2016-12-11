package com.victoria;

/**
 * Created by Prog_1 on 11.12.2016.
 */
public interface IGrid {
    void  merge(int x, int y, int x1, int y1);
    void  moveRight();
    void  moveLeft();
    void  moveUp();
    void  moveDown();
}
