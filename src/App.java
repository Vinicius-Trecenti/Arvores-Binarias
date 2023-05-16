public class App {
    static NoA raiz = null;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        inserindoArvore(1);
        //inserindoArvore(2);
        inserindoArvore(0);
        ExibindoArvore(raiz);
    }

    public static void inserindoArvore(int valor) {
        NoA novo = new NoA(valor);
        if(raiz == null){
            raiz = novo;
        }else{

            NoA temp = raiz;
            Boolean nopai = false;

            while(!nopai){
                if(novo.valor <= temp.valor){
                    if(temp.esquerda == null){
                        nopai = !nopai;
                    }else{
                        temp = temp.esquerda;
                    }
                }else{
                    if(temp.direita == null){
                        nopai = !nopai;
                    }else{
                        temp = temp.direita;
                    }
                }
            }

            if(novo.valor <= temp.valor){
                temp.esquerda = novo;
            }else{
                temp.direita = novo;
            }
        }
    }
    
    public static void ExibindoArvore(NoA temp) {
        if(temp != null){
            System.out.println(temp.valor);
            ExibindoArvore(temp.esquerda);
            ExibindoArvore(temp.direita);
        }
    }
}
