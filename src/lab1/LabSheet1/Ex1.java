package lab1.LabSheet1;

import java.util.Scanner;


//There are two complex numbers: 2+5i and 4-i. To create an application that calculates the summation and the product of the two numbers, to verify the result.
class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }
}
public class Ex1 {

    public static void main(String[] args) {

        double reNr1;
        double reNr2;
        double imNr1;
        double imNr2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the real part for the first number: ");
        reNr1 = keyboard.nextInt();
        System.out.println("Enter the imaginary part for the first number: ");
        imNr1 = keyboard.nextInt();
        System.out.println("Enter the real part for the second number: ");
        reNr2 = keyboard.nextInt();
        System.out.println("Enter the imaginary part for the second number: ");
        imNr2 = keyboard.nextInt();

        ComplexNumber num1 = new ComplexNumber(reNr1, imNr1);
        ComplexNumber num2 = new ComplexNumber(reNr2, imNr2);

        ComplexNumber sum = num1.add(num2);
        ComplexNumber product = num1.multiply(num2);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

    }
}
