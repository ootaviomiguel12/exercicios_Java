//public class Main {
//    public static void main(String[] args) {

    //retornando somente os numeros pares
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0)
//            {
//                System.out.print(i + " ");
//            }
//        }
    // }

    public class Main{

    public static String adicionandoEspacos(String textoOriginal)
    {
            StringBuilder resultado = new StringBuilder();


            for (int i = 0; i < textoOriginal.length(); i++) {
                char catactereAtual = textoOriginal.charAt(i);

                resultado.append(catactereAtual);
                resultado.append(" ");
            }
            return resultado.toString().trim();
        }

        public static void main (String[] args) {
        String texto = "hello world";
        String resultado = adicionandoEspacos(texto);
            System.out.print(resultado);
        }

    }
