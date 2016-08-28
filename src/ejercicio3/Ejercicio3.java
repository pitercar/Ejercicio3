/*
Calcule perímetro, altura y área de de un triángulo equilátero 
 */
package ejercicio3;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio3 {
    
    private int lado;
    private double alto, area1, area2;
    
    public void cargarDatos(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite el valor de un lado del triangulo... ");
        lado=entrada.nextInt();        
    }
    
    public void perimetroTriangulo(){
        
        System.out.println("El perimetro del triangulo es "+(3*lado));
    } 
    
    public void alturaTriangulo(){
        
        alto=Math.sqrt((3*lado)/2);
        
        System.out.println("La altura del triangulo es "+alto);
    }
    
    public void areaTriangulo(){
        
        area1=Math.sqrt(3)/4;
	area2=Math.pow(lado, 2);
        
        System.out.println("El área del triangulo es "+(area1*area2));
    }  
}
