

package recursividad;

import java.util.Scanner;






public class Recursividad {

void visualizar(int x) {
if (x>0) {
visualizar(x-1);
 System.out.println(x);
} 
}

public static void main(String[] ar) {
Recursividad re=new Recursividad();

System.out.print("Ingrese numero para ser evaluado: ");
Scanner rd=new Scanner(System.in);
int x=rd.nextInt();
re.visualizar(x);
}
}