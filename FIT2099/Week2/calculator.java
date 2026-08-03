class Main {
    public static void main(String args[]) { //this starts the program 
        AVerySimpleCalculatorApp myCalculator = new AVerySimpleCalculatorApp(3, '-', 2);
        //this using blueprint of AverySimpleCalculatorApp and create a new class named 'myCalculator'
        //'new' mean create a new object (is a feature to create a new object from its blueprint)
        //(x,x,x) means passing in 3 input , (int,'operator',int)
        System.out.println(myCalculator.showResult());
        //this is a typical printing out message 
    }
}

//above is belong to main.java actually 

class AVerySimpleCalculatorApp {
    //oh ok this mean using the blueprint of this class and letting the new calculator named 'myCalculator' to call the method 
    private int a = 0; //creating a new private variable inside this class named a assigning it to be value 0 
    private int b = 0;
    private char operator = '+';
    //operator is a character because its not a number 
    //a char is a single character 
    //a string is a text word (storing multiple character)

    public AVerySimpleCalculatorApp(int a, char operator, int b) {
        //using the pass in value to override the initial zero 
        //this is a public method 
        this.a = a; //a is received by the method , and this.a is local 
        this.b = b; //this.x can be access within this whole class 
        this.operator = operator;

        //I feel like the missing part is : 1) did not perform calculator feature 
        // 2) did not pass the result to showResult 
    }

    public String showResult() {
        if(operator == '+'){ // in Java : '' create a car , "" create a string
            return "The result is " + (a+b); // + mean a combination 
        } 
        else if(operator == '-'){
            return "The result is " + (a-b);
        }
        //this method must return a text
        //showResult is the method name 
        return "";
    }
}