package Objetos.piezas;

public class PieceStick extends PieceBase {
    public PieceStick(){
        posiciones();
    }
    private void posiciones(){
        setValor1Matriz(1, 0);
        setValor1Matriz(1, 1);
        setValor1Matriz(1, 2);
        setValor1Matriz(1, 3);
    }
    @Override
    public void rotateLeft(){
        lado= lado+1;
        if (lado>1){
            lado=0;
        }
        lados();
    }
    @Override
    public void rotateRight(){
        lado= lado-1;
        if (lado<0){
            lado=1;
        }
        lados();
    }
    @Override
    public void lados(){
    reset();
    switch(lado){
        case 0:
            setValor1Matriz(1, 0);
            setValor1Matriz(1, 1);
            setValor1Matriz(1, 2);
            setValor1Matriz(1, 3);
            verAltura();
            break;
        case 1:
            setValor1Matriz(0, 1);
            setValor1Matriz(1, 1);
            setValor1Matriz(2, 1);
            setValor1Matriz(3, 1);
            verAltura();
            break;
        }        
    }

}