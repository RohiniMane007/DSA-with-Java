
int factorial(int n){
  // int n = 5;
  int fact = 1;

  for (int i = 1; i <= n; i++) {
      fact *= i;
  }

  return fact;
  
}

void main(){
  int result =  factorial(5);
  system.out.println(result);
}
