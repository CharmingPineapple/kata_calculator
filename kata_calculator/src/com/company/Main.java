package com.company;

enum numRoman{
    L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);

    private int Arabic;

    numRoman(int Arabic){
        this.Arabic = Arabic;
    }

    public int getArabic(){
        return Arabic;
    }
}

public class Main {

    public static void main(String[] args) {
        //int number = 4;
        //String roman = ArabicToRoman.convert(number);
        //System.out.println(number + " в римском формате: " + roman);

        //System.out.println(numRoman.values()[1].getArabic());

        System.out.println(ArabicToRoman(14));
    }


    // Основной метод калькулятора
    // Работает с методами-конверторами и методом ArabicCalc
    // Тесты, кажется, лучше проводить именно в нём
    public static String calc(String input){


        return "return";
    }

    // Разделение на члены
    // Проверка на возможность операции
    public String [] div_check(String input){
        String [] members = new String [3];

        return members;
    }

    // Перевод из римских чисел в арабские
    public int RomanToArabic(String Rome){
        
        return 0;
    }

    // Перевод из арабских чисел в римские
    public static String ArabicToRoman(int Arabic){
        String roman = "";
        int number = Arabic;

        for(numRoman numRoman : numRoman.values()){
            while(number >= numRoman.getArabic()){
                roman = roman + numRoman;
                number -= numRoman.getArabic();
            }
        }

        return roman;
    }

    // Операции с проверенными арабскими числами
    public int ArabicCalc(int a, int b, char op){
        switch (op){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }

        return 0;
    }


}
