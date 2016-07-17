public static void main(String[] args) {
        String a = "Hello world";
        int inputChar = 'l';
        int result = 0;
        int sum = -1;        
        
        while(result != -1){
        
        result = a.indexOf(inputChar, result+1);
        
        sum++;
        }
        System.out.println(sum);
    }
