import java.util.Scanner;
import java.util.ArrayList;

public class MejoradaCalcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<Double> resultados = new ArrayList<>(); 
        boolean continuar = true;

        while (continuar){
            try{
                int figura, calculo;
                double total = 0;
                System.out.println("Selecciona la figura para calcular su área o perímetro:");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triángulo");
                System.out.println("4. Rectángulo");
                System.out.println("5. Pentágono");
                System.out.println("6. Potencia");
                System.out.println("7. Salir");
                figura = scanner.nextInt();

                if (figura == 7) {
                    continuar = false;
                    break;
                }

                if (figura != 6) {
                    System.out.println("Elige qué deseas calcular:");
                    System.out.println("1. Área");
                    System.out.println("2. Perímetro");
                    calculo = scanner.nextInt();
                } else {
                    calculo = 3; 
                }

                switch (figura) {
                    case 1:
                        System.out.println("Introduce el radio: (USA COMA COMO SEPARADOR DECIMAL) ");
                        double radio = scanner.nextDouble();
                        if (calculo == 1)
                            total = Math.PI * radio * radio;
                        else
                            total = 2 * Math.PI * radio;
                        break;

                    case 2:
                        System.out.println("Introduce el tamaño del lado: (USA COMA COMO SEPARADOR DECIMAL) ");
                        double lado = scanner.nextDouble();
                        if (calculo == 1)
                            total = lado * lado;
                        else
                            total = 4 * lado;
                        break;

                    case 3:
                        System.out.println("Introduce la base: (USA COMA COMO SEPARADOR DECIMAL)");
                        double base = scanner.nextDouble();
                        System.out.println("Introduce la altura: (USA COMA COMO SEPARADOR DECIMAL)");
                        double altura = scanner.nextDouble();
                        if (calculo == 1)
                            total = (base * altura) / 2;
                        else
                            total = 3 * base;
                        break;

                    case 4:
                        System.out.println("Introduce la base: (USA COMA COMO SEPARADOR DECIMAL)");
                        double baseRec = scanner.nextDouble();
                        System.out.println("Introduce la altura: (USA COMA COMO SEPARADOR DECIMAL)");
                        double alturaRec = scanner.nextDouble();
                        if (calculo == 1)
                            total = baseRec * alturaRec;
                        else
                            total = 2 * (baseRec + alturaRec);
                        break;

                    case 5:
                        System.out.println("Introduce el tamaño del lado: (USA COMA COMO SEPARADOR DECIMAL)");
                        double ladoPen = scanner.nextDouble();
                        System.out.println("Introduce el radio interno: (USA COMA COMO SEPARADOR DECIMAL) ");
                        double radioInt = scanner.nextDouble();
                        if (calculo == 1)
                            total = (5 * ladoPen * radioInt) / 2;
                        else
                            total = 5 * ladoPen;
                        break;

                    case 6:
                        System.out.println("Introduce la base: (USA COMA COMO SEPARADOR DECIMAL) ");
                        double basePot = scanner.nextDouble();
                        System.out.println("Introduce el exponente: ");
                        int exponente = scanner.nextInt();
                        total = potencia(basePot, exponente);
                        break;

                    default:
                        System.out.println("Opción no válida, intenta de nuevo.");
                        continue;
                }

                resultados.add(total);
                System.out.println("El resultado es: " + total);
                System.out.println("Quieres hacer otro caulculo (si/no) Si escogenos 'no' se mostraran los resultados anteriores: ");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("no")) {
                    continuar = false;
                }

            } catch (Exception e) {
                System.out.println("Error, por favor introduce un valor válido.");
                scanner.nextLine(); 
            }
        }

        System.out.println("Resultados anteriores:");
        for (Double resultado : resultados) {
            System.out.println(resultado);
        }
        scanner.close();
    }

    public static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1; 
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}

        
