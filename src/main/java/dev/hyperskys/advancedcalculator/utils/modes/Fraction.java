package dev.hyperskys.advancedcalculator.utils.modes;

import java.util.InputMismatchException;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException(Integer.toString(denominator));
        } else if(denominator < 0) {
            this.numerator *= -1;
            this.denominator = (-1) * denominator;
        } else {
            this.denominator = denominator;
        }
    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    private static int gcd(int num, int den){
        if (den == 0) {
            return num;
        }
        return gcd(den, num % den);
    }

    private static int lcm(int den1, int den2){
        int numGCD = gcd(den1, den2);
        return (den1 * den2)/ numGCD;
    }

    public Fraction add(Fraction other){
        int fractionBottom = lcm(this.denominator, other.denominator);
        int fractionTop = ((fractionBottom/ this.denominator) * this.numerator) + ((fractionBottom/ other.denominator) * other.numerator);
        return new Fraction(fractionTop, fractionBottom);
    }

    public Fraction subtract(Fraction other){
        int fractionDenominator = lcm(this.denominator, other.denominator);
        int fractionNumerator = ((fractionDenominator/ this.denominator) * this.numerator) - ((fractionDenominator/ other.denominator) * other.numerator);
        return new Fraction(fractionNumerator, fractionDenominator);
    }

    public Fraction multiply(Fraction other){
        int fractionNumerator =  this.numerator * other.numerator;
        int fractionDenominator = this.denominator * other.denominator;
        return new Fraction(fractionNumerator, fractionDenominator);
    }

    public Fraction divide(Fraction other){
        if(other.denominator == 0){
            throw new IllegalArgumentException(Integer.toString(denominator));
        }
        int fractionNumerator =  this.numerator * other.denominator;
        int fractionDenominator = this.denominator * other.numerator;
        return new Fraction(fractionNumerator, fractionDenominator);
    }

    public void toLowestTerms(){
        int numGCD = gcd(this.numerator, this.denominator);
        this.numerator /= numGCD;
        this.denominator /= numGCD;
        if(this.denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }

    public boolean equals(Object other){
        if(other instanceof Fraction){
            Fraction fraction = (Fraction)other;
            fraction.toLowestTerms();

            Fraction thisFraction = new Fraction(this.numerator, this.denominator);
            thisFraction.toLowestTerms();

            return (thisFraction.numerator == fraction.numerator) && (thisFraction.denominator == fraction.denominator);
        } else {
            throw new InputMismatchException();
        }
    }
}
