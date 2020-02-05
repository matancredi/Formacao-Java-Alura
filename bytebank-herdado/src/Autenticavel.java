// A interface � um contrato
// Quem a implementar ter� que implementar os m�todos setSenha e autentica

//Ao passo em que s� � poss�vel fazer com que uma classe herde apenas uma outra classe, 
//podemos fazer com que sejam "assinados" tantos "contratos" quanto necess�rio, ou seja, 
//n�o h� limite para o n�mero de implementa��es.

// Interface tamb�m � polimorfismo

public abstract interface Autenticavel{

    // private int senha;

    public abstract void setSenha(int senha);
    //{
        //this.senha = senha;
    //}

    public abstract boolean autentica(int senha); 
//    {
//        if(this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
//    }
	
}
