public class Pattern {
    
    public static void main(String args[]){
        squarePattern();
        starPattern();
        characterPattern();
        squarePattern2();
        trianglePattern();
        trianglePattern1();
        trianglePattern2();
        trianglePattern3();
        trianglePattern4();
    }

    static void squarePattern(){
        int n =4;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void starPattern(){
        int n =4;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void characterPattern(){
        int n =4;
        for(int i=1; i<=n;i++){
            int ch = 65;
            for(int j=1;j<=n;j++){
                
                System.out.print((char)ch);
                ch = ch + 1;
            }
            System.out.println();
        }
    }

    static void squarePattern2(){
        int n=3,num=0;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                num = num + 1;
                System.out.print(num);
            }
            System.out.println();
        }
    }

    static void trianglePattern(){
        int n=4;
        for(int i=0; i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void trianglePattern1(){
        int n=4;
        for(int i=0; i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
                // System.out.print(j+1);
            }
            System.out.println();
        }
    }

    static void trianglePattern2(){
        int n=4;
        for(int i=0; i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void trianglePattern3(){
        int n=4;
        for(int i=1; i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i-j);
            }
            System.out.println();
        }
    }

     static void trianglePattern4(){
        int n=4, num=0;
        for(int i=1; i<=n;i++){
            for(int j=0;j<i;j++){
                num = num + 1;
                System.out.print(num);
            }
            System.out.println();
        }
    }

}
