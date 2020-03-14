public class DecimalCalculator {

    String mainNumber="0";
    String previousNumber;
    String symbol;
    String memoryNumber = "0";

    public DecimalCalculator(){
        this("0");
    }

    public DecimalCalculator(String mainNumber){
            this.mainNumber = mainNumber;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }

    public void setPreviousNumber(String previousNumber){
        this.previousNumber = previousNumber;
    }

    public String getPreviousNumber(){
        return previousNumber;
    }

    public String getMemoryNumber() {
        return memoryNumber;
    }

    public void setMemoryNumber(String memoryNumber) {
        this.memoryNumber = memoryNumber;
    }

    public String appendToMainNumber(String toAppend) {
        mainNumber += toAppend;
        return mainNumber;
    }

    public void resetMainNumber() {
        mainNumber = "0";
    }

    public void resetPreviousNumber(){
        previousNumber = "0";
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public String addDecimal(String toAdd) {
        int mainNumberInteger = Integer.parseInt(previousNumber,10);
        int newNumberInteger = Integer.parseInt(toAdd,10);
        int result = mainNumberInteger + newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String subtractDecimal(String toSubtract) {
        int mainNumberInteger = Integer.parseInt(previousNumber, 10);
        int newNumberInteger = Integer.parseInt(toSubtract, 10);
        int result = mainNumberInteger - newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String multiplyDecimal(String toMultiply) {
        int mainNumberInteger = Integer.parseInt(previousNumber, 10);
        int newNumberInteger = Integer.parseInt(toMultiply, 10);
        int result = mainNumberInteger * newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String divideDecimal(String toDivide) {
        int mainNumberInteger = Integer.parseInt(previousNumber, 10);
        int newNumberInteger = Integer.parseInt(toDivide, 10);
        if (newNumberInteger != 0) {
            String result = Integer.toString(mainNumberInteger / newNumberInteger);
            String remainder = Integer.toString(mainNumberInteger % newNumberInteger);
            mainNumber = result + "R" + remainder;
            return mainNumber;
        }else{
            mainNumber = "Error: divide by zero";
            return mainNumber;
        }
    }

    public void storeAndResetMainNumber() {
        previousNumber = mainNumber;
        resetMainNumber();
    }

    public String addMemoryNumber(String toAdd){
        int mainNumberInteger = Integer.parseInt(memoryNumber);
        int newNumberInteger = Integer.parseInt(toAdd, 10);
        int result = mainNumberInteger + newNumberInteger;
        memoryNumber = Integer.toString(result);
        return memoryNumber;
    }

    public String subtractMemoryNumber(String toSubtract){
        int mainNumberInteger = Integer.parseInt(memoryNumber);
        int newNumberInteger = Integer.parseInt(toSubtract, 10);
        int result = mainNumberInteger - newNumberInteger;
        memoryNumber = Integer.toString(result);
        return memoryNumber;
    }

    public static void main(String[] args) {
        DecimalCalculator calc = new DecimalCalculator();

        System.out.println(calc.addMemoryNumber(Integer.toString(2)));
        System.out.println(calc.subtractMemoryNumber(Integer.toString(2)));
    }
}
