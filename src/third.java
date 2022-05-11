public class third {

    public static void main(String[] args) {
        int [] number = new int[1];
        for(int i = 0; i <number.length; i++){
            number[i] =(int) Math.round(Math.random()*102);
            if(number[i] <= 9){
                System.out.println("Перша кількість цифр:" + number[i]);

            }else if(number[i] <= 99){
                System.out.println("Друга кількість цифр:" + number[i]);

            }else{
                System.out.println("Третя кількість цифр:" + number[i]);

            }

        }

    }

}