//Natan Kebede
//11/4/2026 
// A collection of methods that creates various patterns using loops
//primarily this is to practice the use of loops for the AP exam 
public class Pattern {

public static void stars(int rows){
//Precondition: it must be true that the rows are greater than or equal to zero in order for the method to run
//Postcondition: When executing this method you will get a pattern of stars that increases by 2 every row that you add
 int row = 1; 
 int star = 1; 
 while (row <= rows) {
    int count = 1; 
    while (count <= star) {
        System.out.print("*");
        count++;
        
    }
    System.out.println();
    star+=2; 
    row++; 

 }
}
public static void triangle(int rows){
//Precondition: In order for the method to execute the rows need to be greater than or equal to zero
//Postcondition: when running this method depending on how many rows you put you will get a pattern that on each row you will have the 
//number on the row equal to the row number and the amount of the number on the row equal to the row number 
    int row = 1; 
    int numbers = 1; 

    while (row <= rows) {
        int count = 1; 
        while (count <= numbers) {
            System.out.print(row);
            count++;
        }
        System.out.println();
        row++;
        numbers++;
        
        
    }

}
public static void odds(int start){
//Precondition: the start number must start with a positive integer that is greater than or equal to 1 
//Postcondition: The pattern will start with whatever the start number is and decrease by 2 every row 
for (int number = start; number >= 1; number-=2) {
for (int row = 0; row < number; row++) {
System.out.print(number);

}
System.out.println();
}




}
public static void eo(int maxE){
//Precondition: the max needs to be greater than or equal to 1 
//Postcondition: The method will print a pattern of O's and E's that rotate between them when a new row is added
//  and when another row is added it adds another one of the same letters. When the row number equals maxE it 
// will start going the opposite way like a triangle 
String output = "E";
if (maxE % 2 == 0) {
output = "O";
}
for (int row = 1; row <= maxE; row++) 
    {
for (int column = 0; column < row; column++) {
    System.out.print(output);


}
System.out.println();
if (output.equals("O")) {
output = "E";
}
else {
output = "O";
}
}
for (int row = maxE - 1; row >= 1; row--) {
    for (int column = 0; column < row; column++) {
        System.out.print(output);
    }
System.out.println();   
if (output.equals("E")) {
    output ="O";
} else {
    output = "E";
}
}

}
public static void pyramid(int rows){
//Precondition: the amount of rows should be greater than or equal to one and less than or equal to 9 for the method to run correctly
//Postcondition: This method will print a prymaid like pattern that in every row it will print two less of the next number 
//until it is at only one number
int number = 1;
    for (int row = 1; row <= rows; row++) {
        for (int space = 1; space < row; space++) {
            System.out.print(" ");
        }
       for (int columns = 1; columns <= 2 * (rows - row) + 1; columns++) {
            System.out.print(number);
        }
        System.out.println();
        number++;
    }
   
}
public static void main(String[] args) {
    stars(7);
    triangle(9);
    odds(9);
    eo(6);
    pyramid(5);


}

}








