public class Boolean_Operators {

    public static void main(String[] args) {
        ///boolean result = false;
        ///System.out.println(result);
        boolean isWeekend = true;
        boolean isSunny= false;
        boolean goToBeach = isWeekend && isSunny;
        boolean goToBeach2 = isWeekend || isSunny;
        System.out.println(goToBeach);
        System.out.println(goToBeach2);
        //truth table reminder
        //Operator && (AND)
        //Operator || (OR)


        ///ternary operator
        //item ? "true" : "false";
        String message = isWeekend ? "It's weekend" : "It's not weekend";
        System.out.println(message);
    }
}