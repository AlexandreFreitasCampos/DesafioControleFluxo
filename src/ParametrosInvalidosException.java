public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(){

    }

    // Construtor com mensagem de erro
    public String getMessage(){
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
}
