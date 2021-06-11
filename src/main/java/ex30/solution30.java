/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex30;

public class solution30 {
    public static void main(String[] args){
        TableOutput multiplication = new TableOutput();
        String table ="";
        //inner loop prints the row and the outer loop moves it to the next one.
        for(int columns = 1; columns <= 12; columns++) {
            for (int rows = 1; rows <= 12; rows++) {//formatting ensures columns are lined up
                table = table + multiplication.formatting(rows * columns);
                table = table + rows * columns;
            }
            table = table + "\n";
        }
        System.out.println(table);
    }
}
