
package pryfraccion.CapaNegocio;
//
public class ClsFraccion {
    //ATRIBUTOS DE LA CLASE
    private Integer _numerador;
    private Integer _denominador;
    
    //CONSTRUCTORES
    public ClsFraccion(){
        _numerador = 1;
        _denominador = 1;
    }
    public ClsFraccion(int num, int den){
        _numerador = num;
        _denominador = den;
    }
    public ClsFraccion(int real, int num, int den){
        _numerador = real * den + num;
        _denominador = den;
    }
    public ClsFraccion (ClsFraccion z){
        _denominador = z._denominador;
        _numerador = z._numerador;
    }
    
    //GETTERS AND SETTERS
    public int getNumerador() {
        return _numerador;
    }
    public void setNumerador(int numerador) {
        _numerador = numerador;
    }
    public int getDenominador() {
        return _denominador;
    }
    public void setDenominador(int denominador) {
        _denominador = denominador;
    }
    
    //METODOS DE LA CLASE FRACCION

    public void simplificar(){
        boolean verif1;
        boolean verif2;
        for(int i = 2; i < 30; i++){
            if(_numerador % i == 0){
                verif1 = true;
            }else {
                verif1 = false;
            }
            if (_denominador % i == 0){
                verif2 = true;
            }
            else{
                verif2 = false;
            }
            if (verif1 == true & verif2 == true ){
                _numerador = _numerador / i;
                _denominador = _denominador/ i;
                i = i - 1 ;
            }
        }
    }
    
    public String ver(){
        String ver = "Indeterminacion";
            if (_denominador != 0){
                if (_numerador > _denominador){
                    ver = String.valueOf(_numerador / _denominador) + "   " + String.valueOf(_numerador%_denominador) + " / " + String.valueOf(_denominador);
                }else {
                    ver = String.valueOf(_numerador) + " / " + String.valueOf(_denominador);
                }
            }
        return ver;
    }
    public void masmenos(){
        _numerador = -_numerador;
    }
    public double Valor(){
        double Valor = (double)_numerador / _denominador;
        return Valor;
    }
    public ClsFraccion suma(ClsFraccion nuevo){
        ClsFraccion resp;
        resp = new ClsFraccion();
        resp._numerador = _numerador * nuevo._denominador + nuevo._numerador*_denominador;
        resp._denominador = _denominador * nuevo._denominador;
        return resp;
    }
    public ClsFraccion resta(ClsFraccion nuevo){
        ClsFraccion resp;
        resp = new ClsFraccion();
        resp._numerador = _numerador * nuevo._denominador - nuevo._numerador*_denominador;
        resp._denominador = _denominador * nuevo._denominador;
        return resp;
    }
    public ClsFraccion multiplicacion(ClsFraccion nuevo){
        ClsFraccion resp;
        resp = new ClsFraccion();
        resp._numerador = _numerador * nuevo._numerador;
        resp._denominador = _denominador * nuevo._denominador;
        return resp;
    }
    public ClsFraccion division(ClsFraccion nuevo){
        ClsFraccion resp;
        resp = new ClsFraccion();
        resp._numerador = _numerador * nuevo._denominador;
        resp._denominador = nuevo._numerador * _denominador;
        return resp;
    }
    public void inverso(){
        int auxiliar;
        boolean verific = false;
        if (_numerador < 0){
            _numerador = _numerador * -1;
            verific = true;
        }
        auxiliar = _numerador;
        _numerador = _denominador;
        if (verific == true){
            _denominador = auxiliar * - 1;
        }
    }
    
    }
