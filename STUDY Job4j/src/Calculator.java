//класс реализует калькулятор
public class Calculator {
    private int result;
    //суммирование аргументов.@param params аргументы суммирования.
    public void add(int...params) {
        for (Integer param : params) {
            this.result += param;
        }
    }
    public int getResult(){
            return this.result;
        }
        public void cleanResult(){
         this.result = 0;
        }
}
