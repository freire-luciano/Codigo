public class Aluno {
    public String nome; 
    public double peso; 
    public double altura; 

    
    public double calcularIMC() { 
        double imc; 
        imc = peso / (altura * altura); 
        return imc; 
    }

    public void mostrarIMC() {
        double imc; 
        imc = calcularIMC(); 

        if(imc < 18.5) {
            System.out.println("Abaixo Peso Ideal:");
        } else {
            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso Normal");
            } else { 
                if (imc >= 25 && imc <= 29.9) { 
                    System.out.println("Acima do Peso");
                } else { 
                    if( imc >= 30 && imc <= 34.9) {
                        System.out.println("Obesidade grau I ");
                    } else { 
                        if( imc >= 35 && imc <= 39.9) {
                            System.out.println("Obesidade grau II");
                        } else { 
                            System.out.println("Obesidade grau III");
                        }
                    }
                }
            }
        } 
    }

    public void imprmir() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso:" + peso);
        System.out.println("altura: " + altura);
    }
}
