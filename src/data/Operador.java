package data;

/*Hacemos la clase Operador para clarificar, que se encarga de hacer el
maximo comun divisor y de comprobar si los numeros son correctos, o de ordenarlos*/
public class Operador {
	private int num1;
	private int num2;

    public Operador(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    /*en caso de que el segundo numero sea mayor que el primero, se cambia el orden*/
    public void cambiarOrden(){
        if (num1 < num2){
            int aux = num2;
            num2 = num1;
            num1 = aux;
            
        }
    };
    
    /*verifica si se puede hacer el maximo comun divisor o no*/
    public boolean comprobarNumeros(){
        if(num1 == num2){
            System.out.println("Los numeros introducidos son iguales");
            return false;
        }
        else{
            if(sacarResultado()==1){
                System.out.println("Los numeros introducidos no tienen MCD");
                return false;
            }
        }
        return true;
    };
/*los uso ya que num1 y num2 son privados, para luego enseñarlos por el main*/
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
   
    /*se encarga de hacer el MCD, metemos los numeros introducidos por otros para
    poder modificarlos mejor, y vamos dividiendo hasta que salga el divisor comun
    con una variable auxiliar guardamos el valor de a, que sera el maximo comun divisor*/
    public int sacarResultado() {
	int a = num1;
        int b = num2;
        int aux;
        while(b !=0){
        aux = b;
        b = a % b;
        a = aux;
        } 
        return a;
    }   
   
}
