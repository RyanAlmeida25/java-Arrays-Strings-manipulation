public class Main {

    public static void addStock(int[] stock, int index){
        stock[index] += 10;
        if(stock[index] > 100){
            stock[index] = 100;
        }

    }

    public static void replaceEmptyStock(int[] stock){
        for(int i = 0; i < stock.length; i++ ){
            if(stock[i] < 5){
                stock[i] = 5;
            }
        }
    }

    public static void removeStock(int[] stock){
        for(int i = 0; i < stock.length; i++){
            stock[i] -= 3;
            if(stock[i] < 0){
                stock[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] stock = {10, 25, 8, 50};

        addStock(stock, 0);
        replaceEmptyStock(stock);
        removeStock(stock);

        System.out.print("[");
        for(int i = 0; i < stock.length; i++){
            System.out.print(stock[i]);

            if (i < stock.length - 1){
                System.out.print(", ");
            }

        }

        System.out.print("]");

    }
}
